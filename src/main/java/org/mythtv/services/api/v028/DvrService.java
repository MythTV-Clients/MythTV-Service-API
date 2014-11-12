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
package org.mythtv.services.api.v028;

import org.mythtv.services.api.ArrayOfString;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.Int;
import org.mythtv.services.api.v028.beans.EncoderList;
import org.mythtv.services.api.v028.beans.InputList;
import org.mythtv.services.api.v028.beans.Program;
import org.mythtv.services.api.v028.beans.ProgramList;
import org.mythtv.services.api.v028.beans.RecRule;
import org.mythtv.services.api.v028.beans.RecRuleFilterList;
import org.mythtv.services.api.v028.beans.RecRuleList;
import org.mythtv.services.api.v028.beans.TitleInfoList;
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
public interface DvrService {

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param neverRecord
	 * @param etagInfo
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/AddDontRecordSchedule")
	Bool addDontRecordSchedule(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("NeverRecord") Boolean neverRecord, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param chanId
	 * @param startTime
	 * @param neverRecord
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/AddDontRecordSchedule")
    void addDontRecordSchedule(@Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("NeverRecord") Boolean neverRecord, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param title
	 * @param subtitle
	 * @param description
	 * @param category
	 * @param startTime
	 * @param endTime
	 * @param seriesId
	 * @param programId
	 * @param chanId
	 * @param station
	 * @param findDay
	 * @param findTime
	 * @param parentId
	 * @param inactive
	 * @param season
	 * @param episode
	 * @param inetref
	 * @param type
	 * @param searchType
	 * @param recPriority
	 * @param preferredInput
	 * @param startOffset
	 * @param endOffset
	 * @param dupMethod
	 * @param dupIn
	 * @param filter
	 * @param recProfile
	 * @param recGroup
	 * @param storageGroup
	 * @param playGroup
	 * @param autoExpire
	 * @param maxEpisodes
	 * @param maxNewest
	 * @param autoCommflag
	 * @param autoTranscode
	 * @param autoMetaLookup
	 * @param autoUserJob1
	 * @param autoUserJob2
	 * @param autoUserJob3
	 * @param autoUserJob4
	 * @param transcoder
	 * @return Int
	 */
	@Headers({"Accept: application/json"})
    @POST("/Dvr/AddRecordSchedule")
	Int addRecordSchedule(@Query("Title") String title, @Query("Subtitle") String subtitle, @Query("Description") String description, @Query("Category") String category, @Query("StartTime") org.joda.time.DateTime startTime, @Query("EndTime") org.joda.time.DateTime endTime, @Query("SeriesId") String seriesId, @Query("ProgramId") String programId, @Query("ChanId") Integer chanId, @Query("Station") String station, @Query("FindDay") Integer findDay, @Query("FindTime") org.joda.time.LocalTime findTime, @Query("ParentId") Integer parentId, @Query("Inactive") Boolean inactive, @Query("Season") Integer season, @Query("Episode") Integer episode, @Query("Inetref") String inetref, @Query("Type") String type, @Query("SearchType") String searchType, @Query("RecPriority") Integer recPriority, @Query("PreferredInput") Integer preferredInput, @Query("StartOffset") Integer startOffset, @Query("EndOffset") Integer endOffset, @Query("DupMethod") String dupMethod, @Query("DupIn") String dupIn, @Query("Filter") Integer filter, @Query("RecProfile") String recProfile, @Query("RecGroup") String recGroup, @Query("StorageGroup") String storageGroup, @Query("PlayGroup") String playGroup, @Query("AutoExpire") Boolean autoExpire, @Query("MaxEpisodes") Integer maxEpisodes, @Query("MaxNewest") Boolean maxNewest, @Query("AutoCommflag") Boolean autoCommflag, @Query("AutoTranscode") Boolean autoTranscode, @Query("AutoMetaLookup") Boolean autoMetaLookup, @Query("AutoUserJob1") Boolean autoUserJob1, @Query("AutoUserJob2") Boolean autoUserJob2, @Query("AutoUserJob3") Boolean autoUserJob3, @Query("AutoUserJob4") Boolean autoUserJob4, @Query("Transcoder") Integer transcoder);

	/*
     * POST method (asynchronous)
     *
	 * @param title
	 * @param subtitle
	 * @param description
	 * @param category
	 * @param startTime
	 * @param endTime
	 * @param seriesId
	 * @param programId
	 * @param chanId
	 * @param station
	 * @param findDay
	 * @param findTime
	 * @param parentId
	 * @param inactive
	 * @param season
	 * @param episode
	 * @param inetref
	 * @param type
	 * @param searchType
	 * @param recPriority
	 * @param preferredInput
	 * @param startOffset
	 * @param endOffset
	 * @param dupMethod
	 * @param dupIn
	 * @param filter
	 * @param recProfile
	 * @param recGroup
	 * @param storageGroup
	 * @param playGroup
	 * @param autoExpire
	 * @param maxEpisodes
	 * @param maxNewest
	 * @param autoCommflag
	 * @param autoTranscode
	 * @param autoMetaLookup
	 * @param autoUserJob1
	 * @param autoUserJob2
	 * @param autoUserJob3
	 * @param autoUserJob4
	 * @param transcoder
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Dvr/AddRecordSchedule")
    void addRecordSchedule(@Query("Title") String title, @Query("Subtitle") String subtitle, @Query("Description") String description, @Query("Category") String category, @Query("StartTime") org.joda.time.DateTime startTime, @Query("EndTime") org.joda.time.DateTime endTime, @Query("SeriesId") String seriesId, @Query("ProgramId") String programId, @Query("ChanId") Integer chanId, @Query("Station") String station, @Query("FindDay") Integer findDay, @Query("FindTime") org.joda.time.LocalTime findTime, @Query("ParentId") Integer parentId, @Query("Inactive") Boolean inactive, @Query("Season") Integer season, @Query("Episode") Integer episode, @Query("Inetref") String inetref, @Query("Type") String type, @Query("SearchType") String searchType, @Query("RecPriority") Integer recPriority, @Query("PreferredInput") Integer preferredInput, @Query("StartOffset") Integer startOffset, @Query("EndOffset") Integer endOffset, @Query("DupMethod") String dupMethod, @Query("DupIn") String dupIn, @Query("Filter") Integer filter, @Query("RecProfile") String recProfile, @Query("RecGroup") String recGroup, @Query("StorageGroup") String storageGroup, @Query("PlayGroup") String playGroup, @Query("AutoExpire") Boolean autoExpire, @Query("MaxEpisodes") Integer maxEpisodes, @Query("MaxNewest") Boolean maxNewest, @Query("AutoCommflag") Boolean autoCommflag, @Query("AutoTranscode") Boolean autoTranscode, @Query("AutoMetaLookup") Boolean autoMetaLookup, @Query("AutoUserJob1") Boolean autoUserJob1, @Query("AutoUserJob2") Boolean autoUserJob2, @Query("AutoUserJob3") Boolean autoUserJob3, @Query("AutoUserJob4") Boolean autoUserJob4, @Query("Transcoder") Integer transcoder, Callback<Int> callback);


	/*
	 * POST method
	 *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param forceDelete
	 * @param allowRerecord
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Dvr/DeleteRecording")
	Bool deleteRecording(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("ForceDelete") Boolean forceDelete, @Query("AllowRerecord") Boolean allowRerecord);

	/*
     * POST method (asynchronous)
     *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param forceDelete
	 * @param allowRerecord
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Dvr/DeleteRecording")
    void deleteRecording(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("ForceDelete") Boolean forceDelete, @Query("AllowRerecord") Boolean allowRerecord, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param recordId
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Dvr/DisableRecordSchedule")
	Bool disableRecordSchedule(@Query("RecordId") Integer recordId);

	/*
     * POST method (asynchronous)
     *
	 * @param recordId
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Dvr/DisableRecordSchedule")
    void disableRecordSchedule(@Query("RecordId") Integer recordId, Callback<Bool> callback);


	/*
	 * GET method
	 *
	 * @param dupIn
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/DupInToDescription")
	String dupInToDescription(@Query("DupIn") String dupIn, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param dupIn
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/DupInToDescription")
    void dupInToDescription(@Query("DupIn") String dupIn, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param dupIn
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/DupInToString")
	String dupInToString(@Query("DupIn") String dupIn, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param dupIn
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/DupInToString")
    void dupInToString(@Query("DupIn") String dupIn, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param dupMethod
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/DupMethodToDescription")
	String dupMethodToDescription(@Query("DupMethod") String dupMethod, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param dupMethod
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/DupMethodToDescription")
    void dupMethodToDescription(@Query("DupMethod") String dupMethod, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param dupMethod
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/DupMethodToString")
	String dupMethodToString(@Query("DupMethod") String dupMethod, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param dupMethod
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/DupMethodToString")
    void dupMethodToString(@Query("DupMethod") String dupMethod, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * POST method
	 *
	 * @param recordId
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Dvr/EnableRecordSchedule")
	Bool enableRecordSchedule(@Query("RecordId") Integer recordId);

	/*
     * POST method (asynchronous)
     *
	 * @param recordId
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Dvr/EnableRecordSchedule")
    void enableRecordSchedule(@Query("RecordId") Integer recordId, Callback<Bool> callback);


	/*
	 * GET method
	 *
	 * @param startIndex
	 * @param count
	 * @param recordId
	 * @param etagInfo
	 * @return ProgramList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetConflictList")
	ProgramList getConflictList(@Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Query("RecordId") Integer recordId, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param startIndex
	 * @param count
	 * @param recordId
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetConflictList")
    void getConflictList(@Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Query("RecordId") Integer recordId, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ProgramList> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return EncoderList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetEncoderList")
	EncoderList getEncoderList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetEncoderList")
    void getEncoderList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<EncoderList> callback);


	/*
	 * GET method
	 *
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @return ProgramList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetExpiringList")
	ProgramList getExpiringList(@Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetExpiringList")
    void getExpiringList(@Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ProgramList> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return InputList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetInputList")
	InputList getInputList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetInputList")
    void getInputList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<InputList> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ArrayOfString
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetPlayGroupList")
	ArrayOfString getPlayGroupList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetPlayGroupList")
    void getPlayGroupList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArrayOfString> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ArrayOfString
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecGroupList")
	ArrayOfString getRecGroupList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecGroupList")
    void getRecGroupList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArrayOfString> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return RecRuleFilterList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecRuleFilterList")
	RecRuleFilterList getRecRuleFilterList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecRuleFilterList")
    void getRecRuleFilterList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<RecRuleFilterList> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ArrayOfString
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecStorageGroupList")
	ArrayOfString getRecStorageGroupList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecStorageGroupList")
    void getRecStorageGroupList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArrayOfString> callback);


	/*
	 * GET method
	 *
	 * @param recordId
	 * @param template
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param makeOverride
	 * @param etagInfo
	 * @return RecRule
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecordSchedule")
	RecRule getRecordSchedule(@Query("RecordId") Integer recordId, @Query("Template") String template, @Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("MakeOverride") Boolean makeOverride, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param recordId
	 * @param template
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param makeOverride
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecordSchedule")
    void getRecordSchedule(@Query("RecordId") Integer recordId, @Query("Template") String template, @Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("MakeOverride") Boolean makeOverride, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<RecRule> callback);


	/*
	 * GET method
	 *
	 * @param startIndex
	 * @param count
	 * @param sort
	 * @param descending
	 * @param etagInfo
	 * @return RecRuleList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecordScheduleList")
	RecRuleList getRecordScheduleList(@Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Query("Sort") String sort, @Query("Descending") Boolean descending, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param startIndex
	 * @param count
	 * @param sort
	 * @param descending
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecordScheduleList")
    void getRecordScheduleList(@Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Query("Sort") String sort, @Query("Descending") Boolean descending, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<RecRuleList> callback);


	/*
	 * GET method
	 *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return Program
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecorded")
	Program getRecorded(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecorded")
    void getRecorded(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<Program> callback);


	/*
	 * GET method
	 *
	 * @param descending
	 * @param startIndex
	 * @param count
	 * @param titleRegEx
	 * @param recGroup
	 * @param storageGroup
	 * @param etagInfo
	 * @return ProgramList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecordedList")
	ProgramList getRecordedList(@Query("Descending") Boolean descending, @Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Query("TitleRegEx") String titleRegEx, @Query("RecGroup") String recGroup, @Query("StorageGroup") String storageGroup, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param descending
	 * @param startIndex
	 * @param count
	 * @param titleRegEx
	 * @param recGroup
	 * @param storageGroup
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetRecordedList")
    void getRecordedList(@Query("Descending") Boolean descending, @Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Query("TitleRegEx") String titleRegEx, @Query("RecGroup") String recGroup, @Query("StorageGroup") String storageGroup, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ProgramList> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return TitleInfoList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetTitleInfoList")
	TitleInfoList getTitleInfoList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetTitleInfoList")
    void getTitleInfoList(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<TitleInfoList> callback);


	/*
	 * GET method
	 *
	 * @param recGroup
	 * @param etagInfo
	 * @return ArrayOfString
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetTitleList")
	ArrayOfString getTitleList(@Query("RecGroup") String recGroup, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param recGroup
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetTitleList")
    void getTitleList(@Query("RecGroup") String recGroup, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArrayOfString> callback);


	/*
	 * GET method
	 *
	 * @param startIndex
	 * @param count
	 * @param showAll
	 * @param recordId
	 * @param recStatus
	 * @param etagInfo
	 * @return ProgramList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/GetUpcomingList")
	ProgramList getUpcomingList(@Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Query("ShowAll") Boolean showAll, @Query("RecordId") Integer recordId, @Query("RecStatus") Integer recStatus, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param startIndex
	 * @param count
	 * @param showAll
	 * @param recordId
	 * @param recStatus
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/GetUpcomingList")
    void getUpcomingList(@Query("StartIndex") Integer startIndex, @Query("Count") Integer count, @Query("ShowAll") Boolean showAll, @Query("RecordId") Integer recordId, @Query("RecStatus") Integer recStatus, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ProgramList> callback);


	/*
	 * GET method
	 *
	 * @param recStatus
	 * @param recType
	 * @param startTime
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/RecStatusToDescription")
	String recStatusToDescription(@Query("RecStatus") Integer recStatus, @Query("RecType") Integer recType, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param recStatus
	 * @param recType
	 * @param startTime
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/RecStatusToDescription")
    void recStatusToDescription(@Query("RecStatus") Integer recStatus, @Query("RecType") Integer recType, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param recStatus
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/RecStatusToString")
	String recStatusToString(@Query("RecStatus") Integer recStatus, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param recStatus
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/RecStatusToString")
    void recStatusToString(@Query("RecStatus") Integer recStatus, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param recType
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/RecTypeToDescription")
	String recTypeToDescription(@Query("RecType") String recType, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param recType
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/RecTypeToDescription")
    void recTypeToDescription(@Query("RecType") String recType, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param recType
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/RecTypeToString")
	String recTypeToString(@Query("RecType") String recType, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param recType
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/RecTypeToString")
    void recTypeToString(@Query("RecType") String recType, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * POST method
	 *
	 * @param recordId
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Dvr/RemoveRecordSchedule")
	Bool removeRecordSchedule(@Query("RecordId") Integer recordId);

	/*
     * POST method (asynchronous)
     *
	 * @param recordId
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Dvr/RemoveRecordSchedule")
    void removeRecordSchedule(@Query("RecordId") Integer recordId, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param forceDelete
	 * @param allowRerecord
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Dvr/RemoveRecorded")
	Bool removeRecorded(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("ForceDelete") Boolean forceDelete, @Query("AllowRerecord") Boolean allowRerecord);

	/*
     * POST method (asynchronous)
     *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param forceDelete
	 * @param allowRerecord
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Dvr/RemoveRecorded")
    void removeRecorded(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("ForceDelete") Boolean forceDelete, @Query("AllowRerecord") Boolean allowRerecord, Callback<Bool> callback);


	/*
	 * GET method
	 *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @GET("/Dvr/UnDeleteRecording")
	Bool unDeleteRecording(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Dvr/UnDeleteRecording")
    void unDeleteRecording(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param recordId
	 * @param title
	 * @param subtitle
	 * @param description
	 * @param category
	 * @param startTime
	 * @param endTime
	 * @param seriesId
	 * @param programId
	 * @param chanId
	 * @param station
	 * @param findDay
	 * @param findTime
	 * @param inactive
	 * @param season
	 * @param episode
	 * @param inetref
	 * @param type
	 * @param searchType
	 * @param recPriority
	 * @param preferredInput
	 * @param startOffset
	 * @param endOffset
	 * @param dupMethod
	 * @param dupIn
	 * @param filter
	 * @param recProfile
	 * @param recGroup
	 * @param storageGroup
	 * @param playGroup
	 * @param autoExpire
	 * @param maxEpisodes
	 * @param maxNewest
	 * @param autoCommflag
	 * @param autoTranscode
	 * @param autoMetaLookup
	 * @param autoUserJob1
	 * @param autoUserJob2
	 * @param autoUserJob3
	 * @param autoUserJob4
	 * @param transcoder
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Dvr/UpdateRecordSchedule")
	Bool updateRecordSchedule(@Query("RecordId") Integer recordId, @Query("Title") String title, @Query("Subtitle") String subtitle, @Query("Description") String description, @Query("Category") String category, @Query("StartTime") org.joda.time.DateTime startTime, @Query("EndTime") org.joda.time.DateTime endTime, @Query("SeriesId") String seriesId, @Query("ProgramId") String programId, @Query("ChanId") Integer chanId, @Query("Station") String station, @Query("FindDay") Integer findDay, @Query("FindTime") org.joda.time.LocalTime findTime, @Query("Inactive") Boolean inactive, @Query("Season") Integer season, @Query("Episode") Integer episode, @Query("Inetref") String inetref, @Query("Type") String type, @Query("SearchType") String searchType, @Query("RecPriority") Integer recPriority, @Query("PreferredInput") Integer preferredInput, @Query("StartOffset") Integer startOffset, @Query("EndOffset") Integer endOffset, @Query("DupMethod") String dupMethod, @Query("DupIn") String dupIn, @Query("Filter") Integer filter, @Query("RecProfile") String recProfile, @Query("RecGroup") String recGroup, @Query("StorageGroup") String storageGroup, @Query("PlayGroup") String playGroup, @Query("AutoExpire") Boolean autoExpire, @Query("MaxEpisodes") Integer maxEpisodes, @Query("MaxNewest") Boolean maxNewest, @Query("AutoCommflag") Boolean autoCommflag, @Query("AutoTranscode") Boolean autoTranscode, @Query("AutoMetaLookup") Boolean autoMetaLookup, @Query("AutoUserJob1") Boolean autoUserJob1, @Query("AutoUserJob2") Boolean autoUserJob2, @Query("AutoUserJob3") Boolean autoUserJob3, @Query("AutoUserJob4") Boolean autoUserJob4, @Query("Transcoder") Integer transcoder);

	/*
     * POST method (asynchronous)
     *
	 * @param recordId
	 * @param title
	 * @param subtitle
	 * @param description
	 * @param category
	 * @param startTime
	 * @param endTime
	 * @param seriesId
	 * @param programId
	 * @param chanId
	 * @param station
	 * @param findDay
	 * @param findTime
	 * @param inactive
	 * @param season
	 * @param episode
	 * @param inetref
	 * @param type
	 * @param searchType
	 * @param recPriority
	 * @param preferredInput
	 * @param startOffset
	 * @param endOffset
	 * @param dupMethod
	 * @param dupIn
	 * @param filter
	 * @param recProfile
	 * @param recGroup
	 * @param storageGroup
	 * @param playGroup
	 * @param autoExpire
	 * @param maxEpisodes
	 * @param maxNewest
	 * @param autoCommflag
	 * @param autoTranscode
	 * @param autoMetaLookup
	 * @param autoUserJob1
	 * @param autoUserJob2
	 * @param autoUserJob3
	 * @param autoUserJob4
	 * @param transcoder
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Dvr/UpdateRecordSchedule")
    void updateRecordSchedule(@Query("RecordId") Integer recordId, @Query("Title") String title, @Query("Subtitle") String subtitle, @Query("Description") String description, @Query("Category") String category, @Query("StartTime") org.joda.time.DateTime startTime, @Query("EndTime") org.joda.time.DateTime endTime, @Query("SeriesId") String seriesId, @Query("ProgramId") String programId, @Query("ChanId") Integer chanId, @Query("Station") String station, @Query("FindDay") Integer findDay, @Query("FindTime") org.joda.time.LocalTime findTime, @Query("Inactive") Boolean inactive, @Query("Season") Integer season, @Query("Episode") Integer episode, @Query("Inetref") String inetref, @Query("Type") String type, @Query("SearchType") String searchType, @Query("RecPriority") Integer recPriority, @Query("PreferredInput") Integer preferredInput, @Query("StartOffset") Integer startOffset, @Query("EndOffset") Integer endOffset, @Query("DupMethod") String dupMethod, @Query("DupIn") String dupIn, @Query("Filter") Integer filter, @Query("RecProfile") String recProfile, @Query("RecGroup") String recGroup, @Query("StorageGroup") String storageGroup, @Query("PlayGroup") String playGroup, @Query("AutoExpire") Boolean autoExpire, @Query("MaxEpisodes") Integer maxEpisodes, @Query("MaxNewest") Boolean maxNewest, @Query("AutoCommflag") Boolean autoCommflag, @Query("AutoTranscode") Boolean autoTranscode, @Query("AutoMetaLookup") Boolean autoMetaLookup, @Query("AutoUserJob1") Boolean autoUserJob1, @Query("AutoUserJob2") Boolean autoUserJob2, @Query("AutoUserJob3") Boolean autoUserJob3, @Query("AutoUserJob4") Boolean autoUserJob4, @Query("Transcoder") Integer transcoder, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param watched
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Dvr/UpdateRecordedWatchedStatus")
	Bool updateRecordedWatchedStatus(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("Watched") Boolean watched);

	/*
     * POST method (asynchronous)
     *
	 * @param recordedId
	 * @param chanId
	 * @param startTime
	 * @param watched
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Dvr/UpdateRecordedWatchedStatus")
    void updateRecordedWatchedStatus(@Query("RecordedId") Integer recordedId, @Query("ChanId") Integer chanId, @Query("StartTime") org.joda.time.DateTime startTime, @Query("Watched") Boolean watched, Callback<Bool> callback);


}