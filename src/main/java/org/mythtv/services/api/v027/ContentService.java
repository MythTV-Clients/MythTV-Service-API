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

import org.mythtv.services.api.ArrayOfString;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v027.beans.ArtworkInfoList;
import org.mythtv.services.api.v027.beans.LiveStreamInfo;
import org.mythtv.services.api.v027.beans.LiveStreamInfoList;
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
public interface ContentService {

	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param fileName
	 * @param hostName
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @param etagInfo
	 * @return LiveStreamInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/AddLiveStream")
	LiveStreamInfo addLiveStream(@Query("StorageGroup") String storageGroup, @Query("FileName") String fileName, @Query("HostName") String hostName, @Query("MaxSegments") Integer maxSegments, @Query("Width") Integer width, @Query("Height") Integer height, @Query("Bitrate") Integer bitrate, @Query("AudioBitrate") Integer audioBitrate, @Query("SampleRate") Integer sampleRate, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param storageGroup
	 * @param fileName
	 * @param hostName
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/AddLiveStream")
    void addLiveStream(@Query("StorageGroup") String storageGroup, @Query("FileName") String fileName, @Query("HostName") String hostName, @Query("MaxSegments") Integer maxSegments, @Query("Width") Integer width, @Query("Height") Integer height, @Query("Bitrate") Integer bitrate, @Query("AudioBitrate") Integer audioBitrate, @Query("SampleRate") Integer sampleRate, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<LiveStreamInfo> callback);


	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @param etagInfo
	 * @return LiveStreamInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/AddRecordingLiveStream")
	LiveStreamInfo addRecordingLiveStream(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("MaxSegments") Integer maxSegments, @Query("Width") Integer width, @Query("Height") Integer height, @Query("Bitrate") Integer bitrate, @Query("AudioBitrate") Integer audioBitrate, @Query("SampleRate") Integer sampleRate, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param chanId
	 * @param startTime
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/AddRecordingLiveStream")
    void addRecordingLiveStream(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("MaxSegments") Integer maxSegments, @Query("Width") Integer width, @Query("Height") Integer height, @Query("Bitrate") Integer bitrate, @Query("AudioBitrate") Integer audioBitrate, @Query("SampleRate") Integer sampleRate, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<LiveStreamInfo> callback);


	/*
	 * GET method
	 *
	 * @param id
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @param etagInfo
	 * @return LiveStreamInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/AddVideoLiveStream")
	LiveStreamInfo addVideoLiveStream(@Query("Id") Integer id, @Query("MaxSegments") Integer maxSegments, @Query("Width") Integer width, @Query("Height") Integer height, @Query("Bitrate") Integer bitrate, @Query("AudioBitrate") Integer audioBitrate, @Query("SampleRate") Integer sampleRate, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param id
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/AddVideoLiveStream")
    void addVideoLiveStream(@Query("Id") Integer id, @Query("MaxSegments") Integer maxSegments, @Query("Width") Integer width, @Query("Height") Integer height, @Query("Bitrate") Integer bitrate, @Query("AudioBitrate") Integer audioBitrate, @Query("SampleRate") Integer sampleRate, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<LiveStreamInfo> callback);


	/*
	 * POST method
	 *
	 * @param uRL
	 * @param storageGroup
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Content/DownloadFile")
	Bool downloadFile(@Query("URL") String uRL, @Query("StorageGroup") String storageGroup);

	/*
     * POST method (asynchronous)
     *
	 * @param uRL
	 * @param storageGroup
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Content/DownloadFile")
    void downloadFile(@Query("URL") String uRL, @Query("StorageGroup") String storageGroup, Callback<Bool> callback);


	/*
	 * GET method
	 *
	 * @param id
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetAlbumArt")
	String getAlbumArt(@Query("Id") Integer id, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param id
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetAlbumArt")
    void getAlbumArt(@Query("Id") Integer id, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param fileName
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetFile")
	String getFile(@Query("StorageGroup") String storageGroup, @Query("FileName") String fileName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param storageGroup
	 * @param fileName
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetFile")
    void getFile(@Query("StorageGroup") String storageGroup, @Query("FileName") String fileName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param etagInfo
	 * @return ArrayOfString
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetFileList")
	ArrayOfString getFileList(@Query("StorageGroup") String storageGroup, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param storageGroup
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetFileList")
    void getFileList(@Query("StorageGroup") String storageGroup, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArrayOfString> callback);


	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param fileName
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetHash")
	String getHash(@Query("StorageGroup") String storageGroup, @Query("FileName") String fileName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param storageGroup
	 * @param fileName
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetHash")
    void getHash(@Query("StorageGroup") String storageGroup, @Query("FileName") String fileName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param fileName
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetImageFile")
	String getImageFile(@Query("StorageGroup") String storageGroup, @Query("FileName") String fileName, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param storageGroup
	 * @param fileName
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetImageFile")
    void getImageFile(@Query("StorageGroup") String storageGroup, @Query("FileName") String fileName, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return LiveStreamInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetLiveStream")
	LiveStreamInfo getLiveStream(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param id
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetLiveStream")
    void getLiveStream(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<LiveStreamInfo> callback);


	/*
	 * GET method
	 *
	 * @param fileName
	 * @param etagInfo
	 * @return LiveStreamInfoList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetLiveStreamList")
	LiveStreamInfoList getLiveStreamList(@Query("FileName") String fileName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param fileName
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetLiveStreamList")
    void getLiveStreamList(@Query("FileName") String fileName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<LiveStreamInfoList> callback);


	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetMusic")
	String getMusic(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param id
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetMusic")
    void getMusic(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param width
	 * @param height
	 * @param secsIn
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetPreviewImage")
	String getPreviewImage(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("Width") Integer width, @Query("Height") Integer height, @Query("SecsIn") Integer secsIn, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param chanId
	 * @param startTime
	 * @param width
	 * @param height
	 * @param secsIn
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetPreviewImage")
    void getPreviewImage(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("Width") Integer width, @Query("Height") Integer height, @Query("SecsIn") Integer secsIn, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param inetref
	 * @param season
	 * @param etagInfo
	 * @return ArtworkInfoList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetProgramArtworkList")
	ArtworkInfoList getProgramArtworkList(@Query("Inetref") String inetref, @Query("Season") Integer season, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param inetref
	 * @param season
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetProgramArtworkList")
    void getProgramArtworkList(@Query("Inetref") String inetref, @Query("Season") Integer season, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArtworkInfoList> callback);


	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetRecording")
	String getRecording(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetRecording")
    void getRecording(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param type
	 * @param inetref
	 * @param season
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetRecordingArtwork")
	String getRecordingArtwork(@Query("Type") String type, @Query("Inetref") String inetref, @Query("Season") Integer season, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param type
	 * @param inetref
	 * @param season
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetRecordingArtwork")
    void getRecordingArtwork(@Query("Type") String type, @Query("Inetref") String inetref, @Query("Season") Integer season, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return ArtworkInfoList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetRecordingArtworkList")
	ArtworkInfoList getRecordingArtworkList(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetRecordingArtworkList")
    void getRecordingArtworkList(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArtworkInfoList> callback);


	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetVideo")
	String getVideo(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param id
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetVideo")
    void getVideo(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param type
	 * @param id
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/GetVideoArtwork")
	String getVideoArtwork(@Query("Type") String type, @Query("Id") Integer id, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param type
	 * @param id
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/GetVideoArtwork")
    void getVideoArtwork(@Query("Type") String type, @Query("Id") Integer id, @Query("Width") Integer width, @Query("Height") Integer height, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/RemoveLiveStream")
	Bool removeLiveStream(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param id
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/RemoveLiveStream")
    void removeLiveStream(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<Bool> callback);


	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return LiveStreamInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Content/StopLiveStream")
	LiveStreamInfo stopLiveStream(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param id
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Content/StopLiveStream")
    void stopLiveStream(@Query("Id") Integer id, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<LiveStreamInfo> callback);


}