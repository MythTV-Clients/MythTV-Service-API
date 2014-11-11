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
import org.mythtv.services.api.Int;
import org.mythtv.services.api.v027.beans.*;
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
public interface ChannelService {

	/*
	 * POST method
	 *
	 * @param mplexID
	 * @param sourceID
	 * @param channelID
	 * @param callSign
	 * @param channelName
	 * @param channelNumber
	 * @param serviceID
	 * @param aTSCMajorChannel
	 * @param aTSCMinorChannel
	 * @param useEIT
	 * @param visible
	 * @param frequencyID
	 * @param icon
	 * @param format
	 * @param xMLTVID
	 * @param defaultAuthority
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Channel/AddDBChannel")
    Bool addDBChannel(@Query("MplexID") Integer mplexID, @Query("SourceID") Integer sourceID, @Query("ChannelID") Integer channelID, @Query("CallSign") String callSign, @Query("ChannelName") String channelName, @Query("ChannelNumber") String channelNumber, @Query("ServiceID") Integer serviceID, @Query("ATSCMajorChannel") Integer aTSCMajorChannel, @Query("ATSCMinorChannel") Integer aTSCMinorChannel, @Query("UseEIT") Boolean useEIT, @Query("visible") Boolean visible, @Query("FrequencyID") String frequencyID, @Query("Icon") String icon, @Query("Format") String format, @Query("XMLTVID") String xMLTVID, @Query("DefaultAuthority") String defaultAuthority);

	/*
     * POST method (asynchronous)
     *
	 * @param mplexID
	 * @param sourceID
	 * @param channelID
	 * @param callSign
	 * @param channelName
	 * @param channelNumber
	 * @param serviceID
	 * @param aTSCMajorChannel
	 * @param aTSCMinorChannel
	 * @param useEIT
	 * @param visible
	 * @param frequencyID
	 * @param icon
	 * @param format
	 * @param xMLTVID
	 * @param defaultAuthority
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Channel/AddDBChannel")
    void addDBChannel(@Query("MplexID") Integer mplexID, @Query("SourceID") Integer sourceID, @Query("ChannelID") Integer channelID, @Query("CallSign") String callSign, @Query("ChannelName") String channelName, @Query("ChannelNumber") String channelNumber, @Query("ServiceID") Integer serviceID, @Query("ATSCMajorChannel") Integer aTSCMajorChannel, @Query("ATSCMinorChannel") Integer aTSCMinorChannel, @Query("UseEIT") Boolean useEIT, @Query("visible") Boolean visible, @Query("FrequencyID") String frequencyID, @Query("Icon") String icon, @Query("Format") String format, @Query("XMLTVID") String xMLTVID, @Query("DefaultAuthority") String defaultAuthority, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param sourceName
	 * @param grabber
	 * @param userId
	 * @param freqTable
	 * @param lineupId
	 * @param password
	 * @param useEIT
	 * @param configPath
	 * @param nITId
	 * @return Int
	 */
	@Headers({"Accept: application/json"})
    @POST("/Channel/AddVideoSource")
	Int addVideoSource(@Query("SourceName") String sourceName, @Query("Grabber") String grabber, @Query("UserId") String userId, @Query("FreqTable") String freqTable, @Query("LineupId") String lineupId, @Query("Password") String password, @Query("UseEIT") Boolean useEIT, @Query("ConfigPath") String configPath, @Query("NITId") Integer nITId);

	/*
     * POST method (asynchronous)
     *
	 * @param sourceName
	 * @param grabber
	 * @param userId
	 * @param freqTable
	 * @param lineupId
	 * @param password
	 * @param useEIT
	 * @param configPath
	 * @param nITId
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Channel/AddVideoSource")
    void addVideoSource(@Query("SourceName") String sourceName, @Query("Grabber") String grabber, @Query("UserId") String userId, @Query("FreqTable") String freqTable, @Query("LineupId") String lineupId, @Query("Password") String password, @Query("UseEIT") Boolean useEIT, @Query("ConfigPath") String configPath, @Query("NITId") Integer nITId, Callback<Int> callback);


	/*
	 * GET method
	 *
	 * @param sourceId
	 * @param cardId
	 * @param waitForFinish
	 * @param etagInfo
	 * @return Int
	 */
	@Headers({"Accept: application/json"})
    @GET("/Channel/FetchChannelsFromSource")
	Int fetchChannelsFromSource(@Query("SourceId") Integer sourceId, @Query("CardId") Integer cardId, @Query("WaitForFinish") Boolean waitForFinish, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param sourceId
	 * @param cardId
	 * @param waitForFinish
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Channel/FetchChannelsFromSource")
    void fetchChannelsFromSource(@Query("SourceId") Integer sourceId, @Query("CardId") Integer cardId, @Query("WaitForFinish") Boolean waitForFinish, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<Int> callback);


	/*
	 * GET method
	 *
	 * @param chanID
	 * @param etagInfo
	 * @return ChannelInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Channel/GetChannelInfo")
	ChannelInfo getChannelInfo(@Query("ChanID") Integer chanID, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param chanID
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Channel/GetChannelInfo")
    void getChannelInfo(@Query("ChanID") Integer chanID, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ChannelInfo> callback);


	/*
	 * GET method
	 *
	 * @param sourceID
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @return ChannelInfoList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Channel/GetChannelInfoList")
	ChannelInfoList getChannelInfoList(@Query("SourceID") Integer sourceID, @Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param sourceID
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Channel/GetChannelInfoList")
    void getChannelInfoList(@Query("SourceID") Integer sourceID, @Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ChannelInfoList> callback);


	/*
	 * GET method
	 *
	 * @param source
	 * @param userId
	 * @param password
	 * @param etagInfo
	 * @return LineupList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Channel/GetDDLineupList")
	LineupList getDDLineupList(@Query("Source") String source, @Query("UserId") String userId, @Query("Password") String password, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param source
	 * @param userId
	 * @param password
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Channel/GetDDLineupList")
    void getDDLineupList(@Query("Source") String source, @Query("UserId") String userId, @Query("Password") String password, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<LineupList> callback);


	/*
	 * GET method
	 *
	 * @param mplexID
	 * @param etagInfo
	 * @return VideoMultiplex
	 */
	@Headers({"Accept: application/json"})
    @GET("/Channel/GetVideoMultiplex")
	VideoMultiplex getVideoMultiplex(@Query("MplexID") Integer mplexID, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param mplexID
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Channel/GetVideoMultiplex")
    void getVideoMultiplex(@Query("MplexID") Integer mplexID, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<VideoMultiplex> callback);


	/*
	 * GET method
	 *
	 * @param sourceID
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @return VideoMultiplexList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Channel/GetVideoMultiplexList")
    VideoMultiplexList getVideoMultiplexList(@Query("SourceID") Integer sourceID, @Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param sourceID
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Channel/GetVideoMultiplexList")
    void getVideoMultiplexList(@Query("SourceID") Integer sourceID, @Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<VideoMultiplexList> callback);


	/*
	 * GET method
	 *
	 * @param sourceID
	 * @param etagInfo
	 * @return VideoSource
	 */
	@Headers({"Accept: application/json"})
    @GET("/Channel/GetVideoSource")
	VideoSource getVideoSource(@Query("SourceID") Integer sourceID, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param sourceID
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Channel/GetVideoSource")
    void getVideoSource(@Query("SourceID") Integer sourceID, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<VideoSource> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return VideoSourceList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Channel/GetVideoSourceList")
	VideoSourceList getVideoSourceList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Channel/GetVideoSourceList")
    void getVideoSourceList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<VideoSourceList> callback);


	/*
	 * GET method
	 *
	 * @param sourceID
	 * @param etagInfo
	 * @return ArrayOfString
	 */
	@Headers({"Accept: application/json"})
    @GET("/Channel/GetXMLTVIdList")
    ArrayOfString getXMLTVIdList(@Query("SourceID") Integer sourceID, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param sourceID
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Channel/GetXMLTVIdList")
    void getXMLTVIdList(@Query("SourceID") Integer sourceID, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArrayOfString> callback);


	/*
	 * POST method
	 *
	 * @param channelID
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Channel/RemoveDBChannel")
	Bool removeDBChannel(@Query("ChannelID") Integer channelID);

	/*
     * POST method (asynchronous)
     *
	 * @param channelID
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Channel/RemoveDBChannel")
    void removeDBChannel(@Query("ChannelID") Integer channelID, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param sourceID
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Channel/RemoveVideoSource")
	Bool removeVideoSource(@Query("SourceID") Integer sourceID);

	/*
     * POST method (asynchronous)
     *
	 * @param sourceID
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Channel/RemoveVideoSource")
    void removeVideoSource(@Query("SourceID") Integer sourceID, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param mplexID
	 * @param sourceID
	 * @param channelID
	 * @param callSign
	 * @param channelName
	 * @param channelNumber
	 * @param serviceID
	 * @param aTSCMajorChannel
	 * @param aTSCMinorChannel
	 * @param useEIT
	 * @param visible
	 * @param frequencyID
	 * @param icon
	 * @param format
	 * @param xMLTVID
	 * @param defaultAuthority
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Channel/UpdateDBChannel")
	Bool updateDBChannel(@Query("MplexID") Integer mplexID, @Query("SourceID") Integer sourceID, @Query("ChannelID") Integer channelID, @Query("CallSign") String callSign, @Query("ChannelName") String channelName, @Query("ChannelNumber") String channelNumber, @Query("ServiceID") Integer serviceID, @Query("ATSCMajorChannel") Integer aTSCMajorChannel, @Query("ATSCMinorChannel") Integer aTSCMinorChannel, @Query("UseEIT") Boolean useEIT, @Query("visible") Boolean visible, @Query("FrequencyID") String frequencyID, @Query("Icon") String icon, @Query("Format") String format, @Query("XMLTVID") String xMLTVID, @Query("DefaultAuthority") String defaultAuthority);

	/*
     * POST method (asynchronous)
     *
	 * @param mplexID
	 * @param sourceID
	 * @param channelID
	 * @param callSign
	 * @param channelName
	 * @param channelNumber
	 * @param serviceID
	 * @param aTSCMajorChannel
	 * @param aTSCMinorChannel
	 * @param useEIT
	 * @param visible
	 * @param frequencyID
	 * @param icon
	 * @param format
	 * @param xMLTVID
	 * @param defaultAuthority
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Channel/UpdateDBChannel")
    void updateDBChannel(@Query("MplexID") Integer mplexID, @Query("SourceID") Integer sourceID, @Query("ChannelID") Integer channelID, @Query("CallSign") String callSign, @Query("ChannelName") String channelName, @Query("ChannelNumber") String channelNumber, @Query("ServiceID") Integer serviceID, @Query("ATSCMajorChannel") Integer aTSCMajorChannel, @Query("ATSCMinorChannel") Integer aTSCMinorChannel, @Query("UseEIT") Boolean useEIT, @Query("visible") Boolean visible, @Query("FrequencyID") String frequencyID, @Query("Icon") String icon, @Query("Format") String format, @Query("XMLTVID") String xMLTVID, @Query("DefaultAuthority") String defaultAuthority, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param sourceID
	 * @param sourceName
	 * @param grabber
	 * @param userId
	 * @param freqTable
	 * @param lineupId
	 * @param password
	 * @param useEIT
	 * @param configPath
	 * @param nITId
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Channel/UpdateVideoSource")
	Bool updateVideoSource(@Query("SourceID") Integer sourceID, @Query("SourceName") String sourceName, @Query("Grabber") String grabber, @Query("UserId") String userId, @Query("FreqTable") String freqTable, @Query("LineupId") String lineupId, @Query("Password") String password, @Query("UseEIT") Boolean useEIT, @Query("ConfigPath") String configPath, @Query("NITId") Integer nITId);

	/*
     * POST method (asynchronous)
     *
	 * @param sourceID
	 * @param sourceName
	 * @param grabber
	 * @param userId
	 * @param freqTable
	 * @param lineupId
	 * @param password
	 * @param useEIT
	 * @param configPath
	 * @param nITId
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Channel/UpdateVideoSource")
    void updateVideoSource(@Query("SourceID") Integer sourceID, @Query("SourceName") String sourceName, @Query("Grabber") String grabber, @Query("UserId") String userId, @Query("FreqTable") String freqTable, @Query("LineupId") String lineupId, @Query("Password") String password, @Query("UseEIT") Boolean useEIT, @Query("ConfigPath") String configPath, @Query("NITId") Integer nITId, Callback<Bool> callback);


}