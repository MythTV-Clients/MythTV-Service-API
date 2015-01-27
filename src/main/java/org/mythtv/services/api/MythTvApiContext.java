/*
 * Copyright (c) 2014 TIKINOU LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mythtv.services.api;

import com.google.common.base.Strings;
import com.squareup.okhttp.OkHttpClient;

import java.util.Map;

import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;
import retrofit.converter.JacksonConverter;

/**
 * @author Sebastien Astie
 */
public abstract class MythTvApiContext {
    public static final int DEFAULT_API_PORT = 6544;
    public static final int ETAG_MATCH_HTTP_RESPONSE_CODE = 304;
    private static JacksonConverter CONVERTER = new JacksonConverter(JacksonUtils.initObjectMapper());

    protected String backendHost;
    protected int backendPort;
    protected LogLevel logLevel = LogLevel.NONE;
    protected EtagInterceptingOkClient client;
    protected RestAdapter restAdapter;

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getBackendPort() {
        return backendPort;
    }

    public String getBackendHost() {
        return backendHost;
    }

    public LogLevel getLogLevel() { return logLevel; }

    public ETagInfo getEtag(String requestId, boolean createIfMissing) {
        ETagInfo eTagInfo = client.getEtags().get(requestId);
        if (!createIfMissing)
            return eTagInfo;
        if (eTagInfo == null) {
            eTagInfo = ETagInfo.createEmptyETag();
            client.getEtags().put(requestId, eTagInfo);
        }
        return eTagInfo;
    }

    public Map<String, ETagInfo> getEtags() {
        return client.getEtags();
    }

    protected void initialize() {
        StringBuilder builder = new StringBuilder("http://");
        builder.append(backendHost).append(":").append(backendPort);
        client = new EtagInterceptingOkClient(new OkHttpClient());
        restAdapter = new RestAdapter.Builder()
                .setClient(client)
                .setEndpoint(builder.toString())
                .setLogLevel(logLevel)
                .setConverter(CONVERTER)
                .build();
    }

    public static class Builder {
        private ApiVersion apiVersion;
        private String hostName;
        private LogLevel logLevel;
        private Builder() {
        }        private int port = DEFAULT_API_PORT;

        public MythTvApiContext build() throws MythTvServiceApiException {
            if (Strings.isNullOrEmpty(hostName))
                throw new MythTvServiceApiException("hostname must be set and cannot be null or empty");
            if (apiVersion == null)
                throw new MythTvServiceApiException("apiVersion must be set and cannot be null");
            switch (apiVersion){
                case v027:
                case v028:
                    break;
                default:
                    throw new MythTvServiceApiException("apiVersion " + apiVersion + "is not supported");
            }
            if (port <= 0)
                throw new MythTvServiceApiException("port " + port + " is invalid");
            MythTvApiContext context;
            switch (apiVersion) {
                case v027:
                    context = new MythTvApi027Context();
                    context.backendHost = this.hostName;
                    context.backendPort = this.port;
                    context.logLevel = this.logLevel;
                    context.initialize();
                    return context;
                case v028:
                    context = new MythTvApi028Context();
                    context.backendHost = this.hostName;
                    context.backendPort = this.port;
                    context.logLevel = this.logLevel;
                    context.initialize();
                    return context;
            }
            return null;
        }

        public Builder setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setVersion(ApiVersion apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setLogLevel(LogLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }

    }

}
