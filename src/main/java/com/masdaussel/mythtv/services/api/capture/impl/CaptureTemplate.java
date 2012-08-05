/**
 *  This file is part of MythTV Service API for Java
 * 
 *  MythTV Service API for Java is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV Service API for Java is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV Service API for Java.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/tafypz/MythTV-Service-API.git>
 *
 */
package com.masdaussel.mythtv.services.api.capture.impl;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.masdaussel.mythtv.services.api.capture.CaptureCard;
import com.masdaussel.mythtv.services.api.capture.CaptureCardList;
import com.masdaussel.mythtv.services.api.capture.CaptureOperations;
import com.masdaussel.mythtv.services.api.capture.CardInput;
import com.masdaussel.mythtv.services.api.utils.Bool;
import com.masdaussel.mythtv.services.api.utils.Int;

/**
 * @author sebastien
 * 
 */
public class CaptureTemplate extends AbstractCaptureOperations implements CaptureOperations {

	private final RestTemplate	restTemplate;

	public CaptureTemplate(final RestTemplate restTemplate, final String apiUrlBase) {
		super(apiUrlBase);
		this.restTemplate = restTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.capture.CaptureOperations#addCaptureCard
	 * (com.masdaussel.mythtv.services.api.capture.CaptureCard)
	 */
	@Override
	public int addCaptureCard(final CaptureCard captureCard) {
		final ResponseEntity<Int> responseEntity = restTemplate.exchange(buildUri("AddCaptureCard", convertCaptureCardToParameters(captureCard)),
				HttpMethod.GET, getRequestEntity(), Int.class);
		final Int integer = responseEntity.getBody();

		return integer.getInteger();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.capture.CaptureOperations#addCardInput
	 * (com.masdaussel.mythtv.services.api.capture.CardInput)
	 */
	@Override
	public int addCardInput(final CardInput cardInput) {
		final ResponseEntity<Int> responseEntity = restTemplate.exchange(buildUri("AddCardInput", convertCardInputToParameters(cardInput)), HttpMethod.GET,
				getRequestEntity(), Int.class);
		final Int integer = responseEntity.getBody();

		return integer.getInteger();
	}

	private LinkedMultiValueMap<String, String> convertCaptureCardToParameters(final CaptureCard captureCard) {
		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		parameters.add("VideoDevice", captureCard.getVbiDevice());
		parameters.add("CardType", captureCard.getCardType());
		parameters.add("DefaultInput", "");
		parameters.add("HostName", captureCard.getHostName());
		parameters.add("AudioDevice", captureCard.getAudioDevice());
		parameters.add("VBIDevice", captureCard.getVbiDevice());
		parameters.add("AudioRateLimit", captureCard.getAudioRateLimit().toString());
		parameters.add("SkipBTAudio", captureCard.getSkipBtAudio().toString());
		parameters.add("DVBSWFilter", captureCard.getDvbSwFilter().toString());
		parameters.add("DVBSatType", captureCard.getDvbSatType().toString());
		parameters.add("DVBWaitForSeqStart", captureCard.getDvbWaitForSeqStart().toString());
		parameters.add("DVBOnDemand", captureCard.getDvbOnDemand().toString());
		parameters.add("DVBDiSEqCType", captureCard.getDvbDiSEqCType().toString());
		parameters.add("FirewireModel", captureCard.getFirewireModel());
		parameters.add("FirewireSpeed", captureCard.getFirewireSpeed().toString());
		parameters.add("FirewireConnection", captureCard.getFirewireConnection().toString());
		parameters.add("SignalTimeout", captureCard.getSignalTimeout().toString());
		parameters.add("ChannelTimeout", captureCard.getChannelTimeout().toString());
		parameters.add("DVBTuningDelay", captureCard.getDvbTuningDelay().toString());
		parameters.add("Contrast", captureCard.getContrast().toString());
		parameters.add("Brightness", captureCard.getBrightness().toString());
		parameters.add("Colour", captureCard.getColour().toString());
		parameters.add("Hue", captureCard.getHue().toString());
		parameters.add("DiSEqCId", captureCard.getDiSEqCId().toString());
		parameters.add("DVBEITScan", captureCard.getDvbEitScan().toString());

		return parameters;
	}

	private LinkedMultiValueMap<String, String> convertCardInputToParameters(final CardInput cardInput) {
		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		parameters.add("CardId", "" + cardInput.getCardId());
		parameters.add("SourceId", "" + cardInput.getSourceId());
		parameters.add("InputName", cardInput.getInputName());
		parameters.add("ExternalCommand", cardInput.getExternalCommand());
		parameters.add("ChangerDevice", cardInput.getChangerDevice());
		parameters.add("ChangerModel", cardInput.getChangerModel());
		parameters.add("HostName", cardInput.getHosthame());
		parameters.add("TuneChan", cardInput.getTuneChannel());
		parameters.add("StartChan", cardInput.getStartChannel());
		parameters.add("DisplayName", cardInput.getDisplayName());
		parameters.add("DishnetEIT", "" + cardInput.isDishnetEIT());
		parameters.add("RecPriority", "" + cardInput.getRecordingPriority());
		parameters.add("Quicktune", "" + cardInput.getQuicktune());
		parameters.add("SchedOrder", "" + cardInput.getSchedOrder());
		parameters.add("LiveTVOrder", "" + cardInput.getLiveTVOrder());

		return parameters;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.capture.CaptureOperations#getCaptureCard
	 * (int)
	 */
	@Override
	public CaptureCard getCaptureCard(final int cardId) {
		final ResponseEntity<CaptureCard> responseEntity = restTemplate.exchange(buildUri("GetCaptureCard", "CardId", new String("" + cardId)), HttpMethod.GET,
				getRequestEntity(), CaptureCard.class);
		final CaptureCard captureCard = responseEntity.getBody();

		return captureCard;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.capture.CaptureOperations#
	 * getCaptureCardList()
	 */
	@Override
	public List<CaptureCard> getCaptureCardList() {
		final ResponseEntity<CaptureCardList> responseEntity = restTemplate.exchange(buildUri("GetCaptureCardList"), HttpMethod.GET, getRequestEntity(),
				CaptureCardList.class);
		final CaptureCardList captureCardList = responseEntity.getBody();

		return captureCardList.getCaptureCards().getCaptureCards();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.capture.CaptureOperations#
	 * getCaptureCardList(java.lang.String, java.lang.String)
	 */
	@Override
	public List<CaptureCard> getCaptureCardList(final String hostName, final String cardType) {
		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if ((null != hostName) && !"".equals(hostName))
			parameters.add("HostName", hostName);

		if ((null != cardType) && !"".equals(cardType))
			parameters.add("CardType", cardType);

		final ResponseEntity<CaptureCardList> responseEntity = restTemplate.exchange(buildUri("GetCaptureCardList", parameters), HttpMethod.GET,
				getRequestEntity(), CaptureCardList.class);
		final CaptureCardList captureCardList = responseEntity.getBody();

		return captureCardList.getCaptureCards().getCaptureCards();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.capture.CaptureOperations#
	 * removeCaptureCard(int)
	 */
	@Override
	public boolean removeCaptureCard(final int cardId) {
		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("CardId", new String("" + cardId));

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("RemoveCaptureCard", parameters), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.capture.CaptureOperations#removeCardInput
	 * (int)
	 */
	@Override
	public boolean removeCardInput(final int cardInputId) {
		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("CardInputId", new String("" + cardInputId));

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("RemoveCardInput", parameters), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	// internal helpers

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.capture.CaptureOperations#
	 * updateCaptureCard(int, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean updateCaptureCard(final int cardId, final String setting, final String value) {
		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("CardId", new String("" + cardId));
		parameters.add(setting, value);

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("UpdateCaptureCard", parameters), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.capture.CaptureOperations#updateCardInput
	 * (int, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean updateCardInput(final int cardInputId, final String setting, final String value) {
		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("CardInputId", new String("" + cardInputId));
		parameters.add(setting, value);

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("UpdateCardInput", parameters), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

}
