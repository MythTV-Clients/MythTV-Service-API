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
import org.mythtv.services.api.Int;
import org.mythtv.services.api.v027.beans.CaptureCard;
import org.mythtv.services.api.v027.beans.CaptureCardList;
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
public interface CaptureService {

	/*
	 * POST method
	 *
	 * @param videoDevice
	 * @param audioDevice
	 * @param vBIDevice
	 * @param cardType
	 * @param audioRateLimit
	 * @param hostName
	 * @param dVBSWFilter
	 * @param dVBSatType
	 * @param dVBWaitForSeqStart
	 * @param skipBTAudio
	 * @param dVBOnDemand
	 * @param dVBDiSEqCType
	 * @param firewireSpeed
	 * @param firewireModel
	 * @param firewireConnection
	 * @param signalTimeout
	 * @param channelTimeout
	 * @param dVBTuningDelay
	 * @param contrast
	 * @param brightness
	 * @param colour
	 * @param hue
	 * @param diSEqCId
	 * @param dVBEITScan
	 * @return Int
	 */
	@Headers({"Accept: application/json"})
    @POST("/Capture/AddCaptureCard")
    Int addCaptureCard(@Query("VideoDevice") String videoDevice, @Query("AudioDevice") String audioDevice, @Query("VBIDevice") String vBIDevice, @Query("CardType") String cardType, @Query("AudioRateLimit") Integer audioRateLimit, @Query("HostName") String hostName, @Query("DVBSWFilter") Integer dVBSWFilter, @Query("DVBSatType") Integer dVBSatType, @Query("DVBWaitForSeqStart") Boolean dVBWaitForSeqStart, @Query("SkipBTAudio") Boolean skipBTAudio, @Query("DVBOnDemand") Boolean dVBOnDemand, @Query("DVBDiSEqCType") Integer dVBDiSEqCType, @Query("FirewireSpeed") Integer firewireSpeed, @Query("FirewireModel") String firewireModel, @Query("FirewireConnection") Integer firewireConnection, @Query("SignalTimeout") Integer signalTimeout, @Query("ChannelTimeout") Integer channelTimeout, @Query("DVBTuningDelay") Integer dVBTuningDelay, @Query("Contrast") Integer contrast, @Query("Brightness") Integer brightness, @Query("Colour") Integer colour, @Query("Hue") Integer hue, @Query("DiSEqCId") Integer diSEqCId, @Query("DVBEITScan") Boolean dVBEITScan);

	/*
     * POST method (asynchronous)
     *
	 * @param videoDevice
	 * @param audioDevice
	 * @param vBIDevice
	 * @param cardType
	 * @param audioRateLimit
	 * @param hostName
	 * @param dVBSWFilter
	 * @param dVBSatType
	 * @param dVBWaitForSeqStart
	 * @param skipBTAudio
	 * @param dVBOnDemand
	 * @param dVBDiSEqCType
	 * @param firewireSpeed
	 * @param firewireModel
	 * @param firewireConnection
	 * @param signalTimeout
	 * @param channelTimeout
	 * @param dVBTuningDelay
	 * @param contrast
	 * @param brightness
	 * @param colour
	 * @param hue
	 * @param diSEqCId
	 * @param dVBEITScan
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Capture/AddCaptureCard")
    void addCaptureCard(@Query("VideoDevice") String videoDevice, @Query("AudioDevice") String audioDevice, @Query("VBIDevice") String vBIDevice, @Query("CardType") String cardType, @Query("AudioRateLimit") Integer audioRateLimit, @Query("HostName") String hostName, @Query("DVBSWFilter") Integer dVBSWFilter, @Query("DVBSatType") Integer dVBSatType, @Query("DVBWaitForSeqStart") Boolean dVBWaitForSeqStart, @Query("SkipBTAudio") Boolean skipBTAudio, @Query("DVBOnDemand") Boolean dVBOnDemand, @Query("DVBDiSEqCType") Integer dVBDiSEqCType, @Query("FirewireSpeed") Integer firewireSpeed, @Query("FirewireModel") String firewireModel, @Query("FirewireConnection") Integer firewireConnection, @Query("SignalTimeout") Integer signalTimeout, @Query("ChannelTimeout") Integer channelTimeout, @Query("DVBTuningDelay") Integer dVBTuningDelay, @Query("Contrast") Integer contrast, @Query("Brightness") Integer brightness, @Query("Colour") Integer colour, @Query("Hue") Integer hue, @Query("DiSEqCId") Integer diSEqCId, @Query("DVBEITScan") Boolean dVBEITScan, Callback<Int> callback);


	/*
	 * POST method
	 *
	 * @param cardId
	 * @param sourceId
	 * @param inputName
	 * @param externalCommand
	 * @param changerDevice
	 * @param changerModel
	 * @param hostName
	 * @param tuneChan
	 * @param startChan
	 * @param displayName
	 * @param dishnetEIT
	 * @param recPriority
	 * @param quicktune
	 * @param schedOrder
	 * @param liveTVOrder
	 * @return Int
	 */
	@Headers({"Accept: application/json"})
    @POST("/Capture/AddCardInput")
	Int addCardInput(@Query("CardId") Integer cardId, @Query("SourceId") Integer sourceId, @Query("InputName") String inputName, @Query("ExternalCommand") String externalCommand, @Query("ChangerDevice") String changerDevice, @Query("ChangerModel") String changerModel, @Query("HostName") String hostName, @Query("TuneChan") String tuneChan, @Query("StartChan") String startChan, @Query("DisplayName") String displayName, @Query("DishnetEIT") Boolean dishnetEIT, @Query("RecPriority") Integer recPriority, @Query("Quicktune") Integer quicktune, @Query("SchedOrder") Integer schedOrder, @Query("LiveTVOrder") Integer liveTVOrder);

	/*
     * POST method (asynchronous)
     *
	 * @param cardId
	 * @param sourceId
	 * @param inputName
	 * @param externalCommand
	 * @param changerDevice
	 * @param changerModel
	 * @param hostName
	 * @param tuneChan
	 * @param startChan
	 * @param displayName
	 * @param dishnetEIT
	 * @param recPriority
	 * @param quicktune
	 * @param schedOrder

	 * @param liveTVOrder
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Capture/AddCardInput")
    void addCardInput(@Query("CardId") Integer cardId, @Query("SourceId") Integer sourceId, @Query("InputName") String inputName, @Query("ExternalCommand") String externalCommand, @Query("ChangerDevice") String changerDevice, @Query("ChangerModel") String changerModel, @Query("HostName") String hostName, @Query("TuneChan") String tuneChan, @Query("StartChan") String startChan, @Query("DisplayName") String displayName, @Query("DishnetEIT") Boolean dishnetEIT, @Query("RecPriority") Integer recPriority, @Query("Quicktune") Integer quicktune, @Query("SchedOrder") Integer schedOrder, @Query("LiveTVOrder") Integer liveTVOrder, Callback<Int> callback);


	/*
	 * GET method
	 *
	 * @param cardId
	 * @param etagInfo
	 * @return CaptureCard
	 */
	@Headers({"Accept: application/json"})
    @GET("/Capture/GetCaptureCard")
    CaptureCard getCaptureCard(@Query("CardId") Integer cardId, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param cardId
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Capture/GetCaptureCard")
    void getCaptureCard(@Query("CardId") Integer cardId, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<CaptureCard> callback);


	/*
	 * GET method
	 *
	 * @param hostName
	 * @param cardType
	 * @param etagInfo
	 * @return CaptureCardList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Capture/GetCaptureCardList")
    CaptureCardList getCaptureCardList(@Query("HostName") String hostName, @Query("CardType") String cardType, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param hostName
	 * @param cardType
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Capture/GetCaptureCardList")
    void getCaptureCardList(@Query("HostName") String hostName, @Query("CardType") String cardType, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<CaptureCardList> callback);


	/*
	 * POST method
	 *
	 * @param cardId
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Capture/RemoveCaptureCard")
    Bool removeCaptureCard(@Query("CardId") Integer cardId);

	/*
     * POST method (asynchronous)
     *
	 * @param cardId
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Capture/RemoveCaptureCard")
    void removeCaptureCard(@Query("CardId") Integer cardId, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param cardInputId
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Capture/RemoveCardInput")
	Bool removeCardInput(@Query("CardInputId") Integer cardInputId);

	/*
     * POST method (asynchronous)
     *
	 * @param cardInputId
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Capture/RemoveCardInput")
    void removeCardInput(@Query("CardInputId") Integer cardInputId, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param cardId
	 * @param setting
	 * @param value
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Capture/UpdateCaptureCard")
	Bool updateCaptureCard(@Query("CardId") Integer cardId, @Query("Setting") String setting, @Query("Value") String value);

	/*
     * POST method (asynchronous)
     *
	 * @param cardId
	 * @param setting
	 * @param value
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Capture/UpdateCaptureCard")
    void updateCaptureCard(@Query("CardId") Integer cardId, @Query("Setting") String setting, @Query("Value") String value, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param cardInputId
	 * @param setting
	 * @param value
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Capture/UpdateCardInput")
	Bool updateCardInput(@Query("CardInputId") Integer cardInputId, @Query("Setting") String setting, @Query("Value") String value);

	/*
     * POST method (asynchronous)
     *
	 * @param cardInputId
	 * @param setting
	 * @param value
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Capture/UpdateCardInput")
    void updateCardInput(@Query("CardInputId") Integer cardInputId, @Query("Setting") String setting, @Query("Value") String value, Callback<Bool> callback);


}