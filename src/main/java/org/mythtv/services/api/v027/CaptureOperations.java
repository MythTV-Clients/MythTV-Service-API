/**
 *  This file is part of MythTV for Android
 * 
 *  MythTV for Android is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV for Android is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV for Android.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/MythTV-Android/MythTV-Service-API/>
 *
 */
package org.mythtv.services.api.v027;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.CaptureCard;
import org.mythtv.services.api.v027.beans.CaptureCardList;
import org.springframework.http.ResponseEntity;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface CaptureOperations {

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
	 * @return ResponseEntity<Integer>
	 */
	ResponseEntity<Integer> addCaptureCard(String videoDevice, String audioDevice, String vBIDevice, String cardType, Integer audioRateLimit, String hostName, Integer dVBSWFilter, Integer dVBSatType, Boolean dVBWaitForSeqStart, Boolean skipBTAudio, Boolean dVBOnDemand, Integer dVBDiSEqCType, Integer firewireSpeed, String firewireModel, Integer firewireConnection, Integer signalTimeout, Integer channelTimeout, Integer dVBTuningDelay, Integer contrast, Integer brightness, Integer colour, Integer hue, Integer diSEqCId, Boolean dVBEITScan) throws MythServiceApiRuntimeException;

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
	 * @return ResponseEntity<Integer>
	 */
	ResponseEntity<Integer> addCardInput(Integer cardId, Integer sourceId, String inputName, String externalCommand, String changerDevice, String changerModel, String hostName, String tuneChan, String startChan, String displayName, Boolean dishnetEIT, Integer recPriority, Integer quicktune, Integer schedOrder, Integer liveTVOrder) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param cardId
	 * @param etagInfo
	 * @return ResponseEntity<CaptureCard>
	 */
	ResponseEntity<CaptureCard> getCaptureCard(Integer cardId, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param hostName
	 * @param cardType
	 * @param etagInfo
	 * @return ResponseEntity<CaptureCardList>
	 */
	ResponseEntity<CaptureCardList> getCaptureCardList(String hostName, String cardType, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param cardId
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> removeCaptureCard(Integer cardId) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param cardInputId
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> removeCardInput(Integer cardInputId) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param cardId
	 * @param setting
	 * @param value
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> updateCaptureCard(Integer cardId, String setting, String value) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param cardInputId
	 * @param setting
	 * @param value
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> updateCardInput(Integer cardInputId, String setting, String value) throws MythServiceApiRuntimeException;

}