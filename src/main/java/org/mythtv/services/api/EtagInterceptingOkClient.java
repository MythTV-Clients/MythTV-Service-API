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

import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit.client.Header;
import retrofit.client.OkClient;
import retrofit.client.Request;
import retrofit.client.Response;

/**
 * @author Sebastien Astie
 */
public class EtagInterceptingOkClient extends OkClient {
    private static final String ETAG_REQUEST_HEADER = "If-None-Match";
    private static final String ETAG_RESPONSE_HEADER = "ETag";
    private static final String MYTH_REQUEST_ID_HEADER = "MYTH_REQUEST_ID";
    private Map<String, ETagInfo> etags = new HashMap<>();

    public EtagInterceptingOkClient() {
    }

    public EtagInterceptingOkClient(OkHttpClient client) {
        super(client);
    }

    @Override
    public Response execute(Request request) throws IOException {
        String requestId = null;
        String etag = null;
        for (Header header : request.getHeaders()) {
            switch (header.getName()) {
                case MYTH_REQUEST_ID_HEADER:
                    requestId = header.getValue();
                    break;
                case ETAG_REQUEST_HEADER:
                    etag = header.getValue();
                    break;
            }
        }
        if (requestId == null)
            return super.execute(request);

        ETagInfo eTagInfo = etags.get(requestId);
        if (eTagInfo == null) {
            eTagInfo = ETagInfo.createEmptyETag();
            etags.put(requestId, eTagInfo);
        }
        eTagInfo.setETag(etag);
        Response response = super.execute(request);
        List<Header> headers = response.getHeaders();
        for (Header h : headers) {
            if (ETAG_RESPONSE_HEADER.equalsIgnoreCase(h.getName())) {
                eTagInfo.setETag(h.getValue());
                break;
            }
        }
        return response;
    }

    public Map<String, ETagInfo> getEtags() {
        return etags;
    }
}
