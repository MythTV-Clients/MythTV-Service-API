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

import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v027.beans.BlurayInfo;
import org.mythtv.services.api.v027.beans.VideoLookupList;
import org.mythtv.services.api.v027.beans.VideoMetadataInfo;
import org.mythtv.services.api.v027.beans.VideoMetadataInfoList;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface VideoService {

	/*
	 * POST method
	 *
	 * @param fileName
	 * @param hostName
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Video/AddVideo")
	Bool addVideo(@Query("FileName") String fileName, @Query("HostName") String hostName);

	/*
     * POST method (asynchronous)
     *
	 * @param fileName
	 * @param hostName
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Video/AddVideo")
    void addVideo(@Query("FileName") String fileName, @Query("HostName") String hostName, Callback<Bool> callback);


	/*
	 * GET method
	 *
	 * @param path
	 * @param etagInfo
	 * @return BlurayInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Video/GetBluray")
	BlurayInfo getBluray(@Query("Path") String path, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param path
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Video/GetBluray")
    void getBluray(@Query("Path") String path, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<BlurayInfo> callback);


	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return VideoMetadataInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Video/GetVideo")
	VideoMetadataInfo getVideo(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param id
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Video/GetVideo")
    void getVideo(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<VideoMetadataInfo> callback);


	/*
	 * GET method
	 *
	 * @param fileName
	 * @param etagInfo
	 * @return VideoMetadataInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Video/GetVideoByFileName")
	VideoMetadataInfo getVideoByFileName(@Query("FileName") String fileName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param fileName
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Video/GetVideoByFileName")
    void getVideoByFileName(@Query("FileName") String fileName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<VideoMetadataInfo> callback);


	/*
	 * GET method
	 *
	 * @param descending
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @return VideoMetadataInfoList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Video/GetVideoList")
	VideoMetadataInfoList getVideoList(@Query("Descending") Boolean descending, @Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param descending
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Video/GetVideoList")
    void getVideoList(@Query("Descending") Boolean descending, @Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<VideoMetadataInfoList> callback);


	/*
	 * GET method
	 *
	 * @param title
	 * @param subtitle
	 * @param inetref
	 * @param season
	 * @param episode
	 * @param grabberType
	 * @param allowGeneric
	 * @param etagInfo
	 * @return VideoLookupList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Video/LookupVideo")
	VideoLookupList lookupVideo(@Query("Title") String title, @Query("Subtitle") String subtitle, @Query("Inetref") String inetref, @Query("Season") Integer season, @Query("Episode") Integer episode, @Query("GrabberType") String grabberType, @Query("AllowGeneric") Boolean allowGeneric, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param title
	 * @param subtitle
	 * @param inetref
	 * @param season
	 * @param episode
	 * @param grabberType
	 * @param allowGeneric
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Video/LookupVideo")
    void lookupVideo(@Query("Title") String title, @Query("Subtitle") String subtitle, @Query("Inetref") String inetref, @Query("Season") Integer season, @Query("Episode") Integer episode, @Query("GrabberType") String grabberType, @Query("AllowGeneric") Boolean allowGeneric, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<VideoLookupList> callback);


	/*
	 * POST method
	 *
	 * @param id
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Video/RemoveVideoFromDB")
	Bool removeVideoFromDB(@Query("Id") Integer id);

	/*
     * POST method (asynchronous)
     *
	 * @param id
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Video/RemoveVideoFromDB")
    void removeVideoFromDB(@Query("Id") Integer id, Callback<Bool> callback);


}