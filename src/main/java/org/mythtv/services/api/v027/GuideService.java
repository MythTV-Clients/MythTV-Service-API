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
package org.mythtv.services.api.v027;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v027.beans.Program;
import org.mythtv.services.api.v027.beans.ProgramGuide;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface GuideService {

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Guide/GetChannelIcon")
	String getChannelIcon(@Query("ChanId") Integer chanId, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param chanId
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Guide/GetChannelIcon")
    void getChannelIcon(@Query("ChanId") Integer chanId, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return Program
	 */
	@Headers({"Accept: application/json"})
    @GET("/Guide/GetProgramDetails")
	Program getProgramDetails(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Guide/GetProgramDetails")
    void getProgramDetails(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<Program> callback);


	/*
	 * GET method
	 *
	 * @param startTime
	 * @param endTime
	 * @param startChanId
	 * @param numChannels
	 * @param details
	 * @param etagInfo
	 * @return ProgramGuide
	 */
	@Headers({"Accept: application/json"})
    @GET("/Guide/GetProgramGuide")
	ProgramGuide getProgramGuide(@Query("StartTime") org.joda.time.DateTime startTime, @Query("EndTime") org.joda.time.DateTime endTime, @Query("StartChanId") Integer startChanId, @Query("NumChannels") Integer numChannels, @Query("Details") Boolean details, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param startTime
	 * @param endTime
	 * @param startChanId
	 * @param numChannels
	 * @param details
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Guide/GetProgramGuide")
    void getProgramGuide(@Query("StartTime") org.joda.time.DateTime startTime, @Query("EndTime") org.joda.time.DateTime endTime, @Query("StartChanId") Integer startChanId, @Query("NumChannels") Integer numChannels, @Query("Details") Boolean details, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ProgramGuide> callback);


}