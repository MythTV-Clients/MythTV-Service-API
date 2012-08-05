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
 * This software can be found at <https://github.com/MythTV-Android/mythtv-for-android/>
 *
 */
package org.mythtv.services.api.capture.impl;

import java.util.List;

import org.mythtv.services.api.Bool;
import org.mythtv.services.api.Int;
import org.mythtv.services.api.capture.CaptureCard;
import org.mythtv.services.api.capture.CaptureCardList;
import org.mythtv.services.api.capture.CaptureOperations;
import org.mythtv.services.api.capture.CardInput;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Daniel Frey
 *
 */
public class CaptureTemplate extends AbstractCaptureOperations implements CaptureOperations {
	
	private final RestTemplate restTemplate;

	public CaptureTemplate( RestTemplate restTemplate, String apiUrlBase ) {
		super( apiUrlBase );
		this.restTemplate = restTemplate;
	}
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#addCaptureCard(org.mythtv.services.api.capture.CaptureCard)
	 */
	@Override
	public int addCaptureCard( CaptureCard captureCard ) {
		ResponseEntity<Int> responseEntity = restTemplate.exchange( buildUri( "AddCaptureCard", convertCaptureCardToParameters( captureCard ) ), HttpMethod.GET, getRequestEntity(), Int.class );
		Int integer = responseEntity.getBody();
		
		return integer.getInteger();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#addCardInput(org.mythtv.services.api.capture.CardInput)
	 */
	@Override
	public int addCardInput( CardInput cardInput ) {
		ResponseEntity<Int> responseEntity = restTemplate.exchange( buildUri( "AddCardInput", convertCardInputToParameters( cardInput ) ), HttpMethod.GET, getRequestEntity(), Int.class );
		Int integer = responseEntity.getBody();
		
		return integer.getInteger();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#getCaptureCard(int)
	 */
	@Override
	public CaptureCard getCaptureCard( int cardId ) {
		ResponseEntity<CaptureCard> responseEntity = restTemplate.exchange( buildUri( "GetCaptureCard", "CardId", new String( "" + cardId ) ), HttpMethod.GET, getRequestEntity(), CaptureCard.class );
		CaptureCard captureCard = responseEntity.getBody();

		return captureCard;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#getCaptureCardList()
	 */
	@Override
	public List<CaptureCard> getCaptureCardList() {
		ResponseEntity<CaptureCardList> responseEntity = restTemplate.exchange( buildUri( "GetCaptureCardList" ), HttpMethod.GET, getRequestEntity(), CaptureCardList.class );
		CaptureCardList captureCardList = responseEntity.getBody();
		
		return captureCardList.getCaptureCards().getCaptureCards();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#getCaptureCardList(java.lang.String, java.lang.String)
	 */
	@Override
	public List<CaptureCard> getCaptureCardList( String hostName, String cardType ) {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		
		if( null != hostName && !"".equals( hostName ) ) {
			parameters.add( "HostName", hostName );
		}
		
		if( null != cardType && !"".equals( cardType ) ) {
			parameters.add( "CardType", cardType );
		}
		
		ResponseEntity<CaptureCardList> responseEntity = restTemplate.exchange( buildUri( "GetCaptureCardList", parameters ), HttpMethod.GET, getRequestEntity(), CaptureCardList.class );
		CaptureCardList captureCardList = responseEntity.getBody();
		
		return captureCardList.getCaptureCards().getCaptureCards();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#removeCaptureCard(int)
	 */
	@Override
	public boolean removeCaptureCard( int cardId ) {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "CardId", new String( "" + cardId ) );

		ResponseEntity<Bool> responseEntity = restTemplate.exchange( buildUri( "RemoveCaptureCard", parameters ), HttpMethod.GET, getRequestEntity(), Bool.class );
		Bool bool = responseEntity.getBody();
		
		return bool.getBool();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#removeCardInput(int)
	 */
	@Override
	public boolean removeCardInput( int cardInputId ) {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "CardInputId", new String( "" + cardInputId ) );

		ResponseEntity<Bool> responseEntity = restTemplate.exchange( buildUri( "RemoveCardInput", parameters ), HttpMethod.GET, getRequestEntity(), Bool.class );
		Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#updateCaptureCard(int, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean updateCaptureCard( int cardId, String setting, String value ) {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "CardId", new String( "" + cardId ) );
		parameters.add( setting, value );
		
		ResponseEntity<Bool> responseEntity = restTemplate.exchange( buildUri( "UpdateCaptureCard", parameters ), HttpMethod.GET, getRequestEntity(), Bool.class );
		Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#updateCardInput(int, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean updateCardInput( int cardInputId, String setting, String value ) {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "CardInputId", new String( "" + cardInputId ) );
		parameters.add( setting, value );
		
		ResponseEntity<Bool> responseEntity = restTemplate.exchange( buildUri( "UpdateCardInput", parameters ), HttpMethod.GET, getRequestEntity(), Bool.class );
		Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	// internal helpers
	
	private LinkedMultiValueMap<String, String> convertCaptureCardToParameters( CaptureCard captureCard ) {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		
		parameters.add( "VideoDevice", captureCard.getVbiDevice() );
		parameters.add( "CardType", captureCard.getCardType() );
		parameters.add( "DefaultInput", "" );
		parameters.add( "HostName", captureCard.getHostName() );
		parameters.add( "AudioDevice", captureCard.getAudioDevice() );
		parameters.add( "VBIDevice", captureCard.getVbiDevice() );
		parameters.add( "AudioRateLimit", captureCard.getAudioRateLimit().toString() );
		parameters.add( "SkipBTAudio", captureCard.getSkipBtAudio().toString() );
		parameters.add( "DVBSWFilter", captureCard.getDvbSwFilter().toString() );
		parameters.add( "DVBSatType", captureCard.getDvbSatType().toString() );
		parameters.add( "DVBWaitForSeqStart", captureCard.getDvbWaitForSeqStart().toString() );
		parameters.add( "DVBOnDemand", captureCard.getDvbOnDemand().toString() );
		parameters.add( "DVBDiSEqCType", captureCard.getDvbDiSEqCType().toString() );
		parameters.add( "FirewireModel", captureCard.getFirewireModel() );
		parameters.add( "FirewireSpeed", captureCard.getFirewireSpeed().toString() );
		parameters.add( "FirewireConnection", captureCard.getFirewireConnection().toString() );
		parameters.add( "SignalTimeout", captureCard.getSignalTimeout().toString() );
		parameters.add( "ChannelTimeout", captureCard.getChannelTimeout().toString() );
		parameters.add( "DVBTuningDelay", captureCard.getDvbTuningDelay().toString() );
		parameters.add( "Contrast", captureCard.getContrast().toString() );
		parameters.add( "Brightness", captureCard.getBrightness().toString() );
		parameters.add( "Colour", captureCard.getColour().toString() );
		parameters.add( "Hue", captureCard.getHue().toString() );
		parameters.add( "DiSEqCId", captureCard.getDiSEqCId().toString() );
		parameters.add( "DVBEITScan", captureCard.getDvbEitScan().toString() );

		return parameters;
	}
	
	private LinkedMultiValueMap<String, String> convertCardInputToParameters( CardInput cardInput ) {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		
		parameters.add( "CardId", "" + cardInput.getCardId() );
		parameters.add( "SourceId", "" + cardInput.getSourceId() );
		parameters.add( "InputName", cardInput.getInputName() );
		parameters.add( "ExternalCommand", cardInput.getExternalCommand() );
		parameters.add( "ChangerDevice", cardInput.getChangerDevice() );
		parameters.add( "ChangerModel", cardInput.getChangerModel() );
		parameters.add( "HostName", cardInput.getHosthame() );
		parameters.add( "TuneChan", cardInput.getTuneChannel() );
		parameters.add( "StartChan", cardInput.getStartChannel() );
		parameters.add( "DisplayName", cardInput.getDisplayName() );
		parameters.add( "DishnetEIT", "" + cardInput.isDishnetEIT() );
		parameters.add( "RecPriority", "" + cardInput.getRecordingPriority() );
		parameters.add( "Quicktune", "" + cardInput.getQuicktune() );
		parameters.add( "SchedOrder", "" + cardInput.getSchedOrder() );
		parameters.add( "LiveTVOrder", "" + cardInput.getLiveTVOrder() );

		return parameters;
	}
	
}
