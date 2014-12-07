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
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author Sebastien Astie
 */
public class ServerVersionQuery {
    private static final String MYTHTV_SERVER_HEADER = "Server";
    private static final String MYTHTV_SERVER_MYTHVERSION = "MythTV";

    /**
     * Gets the api version of the given backend
     *
     * @param baseUri the backend services api url
     * @param connectTimeout connection timeout
     * @param timeUnit connection timeout unit
     * @return the Api version
     * @throws IOException if an error occurs
     */
    public static ApiVersion getMythVersion(String baseUri, long connectTimeout, TimeUnit timeUnit) throws IOException {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(connectTimeout, timeUnit);
        return getMythVersion(baseUri, client);
    }

    /**
     * Gets the api version of the given backend
     *
     * @param baseUri the backend services api url
     * @return the Api version
     * @throws IOException if an error occurs
     */
    public static ApiVersion getMythVersion(String baseUri) throws IOException {
        return getMythVersion(baseUri, new OkHttpClient());
    }

    private static ApiVersion getMythVersion(String baseUri, OkHttpClient client) throws IOException {
        StringBuilder urlBuilder = new StringBuilder(baseUri);
        if (!baseUri.endsWith("/"))
            urlBuilder.append("/");
        urlBuilder.append("Myth/GetHostName");
        Request request = new Request.Builder()
                .url(urlBuilder.toString())
                .addHeader("User-Agent", "MythTv Service API")
                .addHeader("Connection", "Close")
                .build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            String serverHeader = response.header(MYTHTV_SERVER_HEADER);
            if (!Strings.isNullOrEmpty(serverHeader)) {
                // we have our header get the version.
                int idx = serverHeader.indexOf(MYTHTV_SERVER_MYTHVERSION);
                if (idx >= 0) {
                    idx += MYTHTV_SERVER_MYTHVERSION.length();
                    String version = serverHeader.substring(idx);
                    if (version.contains("0.27"))
                        return ApiVersion.v027;
                    if (version.contains("0.28"))
                        return ApiVersion.v028;
                }
            }
        }
        return ApiVersion.NotSupported;
    }


    /**
     * Check if the server is reachable
     *
     * @param baseUrl The url of the server to test
     * @return true if reachable otherwise false.
     * @throws IOException if an error occurs
     */
    public static boolean isServerReachable(String baseUrl) throws IOException {
        return isServerReachable(baseUrl, new OkHttpClient());
    }

    /**
     * Check if the server is reachable
     *
     * @param baseUrl The url of the server to test
     * @param connectTimeout connection timeout
     * @param timeUnit connection timeout unit
     * @return true if reachable otherwise false.
     * @throws IOException if an error occurs
     */
    public static boolean isServerReachable(String baseUrl, long connectTimeout, TimeUnit timeUnit) throws IOException {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(connectTimeout, timeUnit);
        return isServerReachable(baseUrl, client);
    }

    private static boolean isServerReachable(String baseUrl, OkHttpClient client) throws IOException {
        Request request = new Request.Builder()
                .url(baseUrl)
                .addHeader("User-Agent", "MythTv Service API Server Reaching")
                .addHeader("Connection", "Close")
                .build();
        Response response = client.newCall(request).execute();
        return response.isSuccessful();
    }
}
