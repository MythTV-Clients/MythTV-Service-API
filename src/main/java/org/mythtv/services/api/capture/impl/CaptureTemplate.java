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
package org.mythtv.services.api.capture.impl;

import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.Int;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.capture.CaptureCard;
import org.mythtv.services.api.capture.CaptureCardList;
import org.mythtv.services.api.capture.CaptureCardWrapper;
import org.mythtv.services.api.capture.CaptureOperations;
import org.mythtv.services.api.capture.CardInput;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 *
 */
public class CaptureTemplate extends AbstractCaptureOperations implements CaptureOperations {
	
	public enum Endpoint {
		ADD_CAPTURE_CARD( "AddCaptureCard" ),
		ADD_CARD_INPUT( "AddCardInput" ),
		GET_CAPTURE_CARD( "GetCaptureCard" ),
		GET_CAPTURE_CARD_LIST( "GetCaptureCardList" ),
		REMOVE_CAPTURE_CARD( "RemoveCaptureCard" ),
		REMOVE_CARD_INPUT( "RemoveCardInput"),
		UPDATE_CAPTURE_CARD( "UpdateCaptureCard" ),
		UPDATE_CARD_INPUT( "UpdateCardInput" );
		
		private String endpoint;
		
		private Endpoint( String endpoint ) {
			this.endpoint = endpoint;
		}
		
		public String getEndpoint() {
			return endpoint;
		}
		
	}
	
	private final RestOperations restOperations;

	public CaptureTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		this.restOperations = restOperations;
	}
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#addCaptureCard(org.mythtv.services.api.capture.CaptureCard)
	 */
	@Override
	public ResponseEntity<Int> addCaptureCard( CaptureCard captureCard ) throws MythServiceApiRuntimeException {
		return restOperations.exchange( buildUri( Endpoint.ADD_CAPTURE_CARD.getEndpoint(), convertCaptureCardToParameters( captureCard ) ), HttpMethod.GET, getRequestEntity(null), Int.class );
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#addCardInput(org.mythtv.services.api.capture.CardInput)
	 */
	@Override
	public ResponseEntity<Int> addCardInput( CardInput cardInput ) throws MythServiceApiRuntimeException {
		return restOperations.exchange( buildUri( Endpoint.ADD_CARD_INPUT.getEndpoint(), convertCardInputToParameters( cardInput ) ), HttpMethod.GET, getRequestEntity(null), Int.class );
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#getCaptureCard(int)
	 */
	@Override
	public ResponseEntity<CaptureCardWrapper> getCaptureCard( int cardId, ETagInfo etag ) throws MythServiceApiRuntimeException {
		ResponseEntity<CaptureCardWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_CAPTURE_CARD.getEndpoint(), "CardId", new String( "" + cardId ) ), HttpMethod.GET, getRequestEntity(etag), CaptureCardWrapper.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#getCaptureCardList()
	 */
	@Override
	public ResponseEntity<CaptureCardList> getCaptureCardList( ETagInfo etag ) throws MythServiceApiRuntimeException {
		ResponseEntity<CaptureCardList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_CAPTURE_CARD_LIST.getEndpoint() ), HttpMethod.GET, getRequestEntity( etag ), CaptureCardList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#getCaptureCardList(java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<CaptureCardList> getCaptureCardList( String hostName, String cardType, ETagInfo etag ) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		
		if( null != hostName && !"".equals( hostName ) ) {
			parameters.add( "HostName", hostName );
		}
		
		if( null != cardType && !"".equals( cardType ) ) {
			parameters.add( "CardType", cardType );
		}
		
		ResponseEntity<CaptureCardList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_CAPTURE_CARD_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity(etag), CaptureCardList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#removeCaptureCard(int)
	 */
	@Override
	public ResponseEntity<Bool> removeCaptureCard( int cardId, ETagInfo etag ) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "CardId", new String( "" + cardId ) );

		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( Endpoint.REMOVE_CAPTURE_CARD.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity(etag), Bool.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#removeCardInput(int)
	 */
	@Override
	public ResponseEntity<Bool> removeCardInput( int cardInputId) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "CardInputId", new String( "" + cardInputId ) );

		return restOperations.exchange( buildUri( Endpoint.REMOVE_CARD_INPUT.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( null ), Bool.class );
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#updateCaptureCard(int, java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<Bool> updateCaptureCard( int cardId, String setting, String value ) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "CardId", new String( "" + cardId ) );
		parameters.add( setting, value );
		
		return restOperations.exchange( buildUri( Endpoint.UPDATE_CAPTURE_CARD.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity(null), Bool.class );
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.capture.CaptureOperations#updateCardInput(int, java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<Bool> updateCardInput( int cardInputId, String setting, String value ) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "CardInputId", new String( "" + cardInputId ) );
		parameters.add( setting, value );
		
		return restOperations.exchange( buildUri( Endpoint.UPDATE_CARD_INPUT.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity(null), Bool.class );
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
