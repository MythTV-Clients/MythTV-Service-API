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
package org.mythtv.services.api.v027.impl;

import org.mythtv.services.api.AbstractOperations;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.CaptureCard;
import org.mythtv.services.api.v027.beans.CaptureCardList;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class CaptureTemplate extends AbstractOperations implements org.mythtv.services.api.v027.CaptureOperations {

    private final RestOperations restOperations;

    public CaptureTemplate( RestOperations restOperations, String apiUrlBase ) {
        super( apiUrlBase + "Capture/" );
        this.restOperations = restOperations;
    }


    @Override
    public ResponseEntity<Integer> addCaptureCard(String videoDevice, String audioDevice, String vBIDevice, String cardType, Integer audioRateLimit, String hostName, Integer dVBSWFilter, Integer dVBSatType, Boolean dVBWaitForSeqStart, Boolean skipBTAudio, Boolean dVBOnDemand, Integer dVBDiSEqCType, Integer firewireSpeed, String firewireModel, Integer firewireConnection, Integer signalTimeout, Integer channelTimeout, Integer dVBTuningDelay, Integer contrast, Integer brightness, Integer colour, Integer hue, Integer diSEqCId, Boolean dVBEITScan) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(videoDevice != null && !videoDevice.isEmpty())
            parameters.add( "VideoDevice", videoDevice );
        if(audioDevice != null && !audioDevice.isEmpty())
            parameters.add( "AudioDevice", audioDevice );
        if(vBIDevice != null && !vBIDevice.isEmpty())
            parameters.add( "VBIDevice", vBIDevice );
        if(cardType != null && !cardType.isEmpty())
            parameters.add( "CardType", cardType );
        if(audioRateLimit != null)
            parameters.add( "AudioRateLimit", audioRateLimit.toString() );
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );
        if(dVBSWFilter != null)
            parameters.add( "DVBSWFilter", dVBSWFilter.toString() );
        if(dVBSatType != null)
            parameters.add( "DVBSatType", dVBSatType.toString() );
        if(dVBWaitForSeqStart != null)
            parameters.add( "DVBWaitForSeqStart", dVBWaitForSeqStart.toString() );
        if(skipBTAudio != null)
            parameters.add( "SkipBTAudio", skipBTAudio.toString() );
        if(dVBOnDemand != null)
            parameters.add( "DVBOnDemand", dVBOnDemand.toString() );
        if(dVBDiSEqCType != null)
            parameters.add( "DVBDiSEqCType", dVBDiSEqCType.toString() );
        if(firewireSpeed != null)
            parameters.add( "FirewireSpeed", firewireSpeed.toString() );
        if(firewireModel != null && !firewireModel.isEmpty())
            parameters.add( "FirewireModel", firewireModel );
        if(firewireConnection != null)
            parameters.add( "FirewireConnection", firewireConnection.toString() );
        if(signalTimeout != null)
            parameters.add( "SignalTimeout", signalTimeout.toString() );
        if(channelTimeout != null)
            parameters.add( "ChannelTimeout", channelTimeout.toString() );
        if(dVBTuningDelay != null)
            parameters.add( "DVBTuningDelay", dVBTuningDelay.toString() );
        if(contrast != null)
            parameters.add( "Contrast", contrast.toString() );
        if(brightness != null)
            parameters.add( "Brightness", brightness.toString() );
        if(colour != null)
            parameters.add( "Colour", colour.toString() );
        if(hue != null)
            parameters.add( "Hue", hue.toString() );
        if(diSEqCId != null)
            parameters.add( "DiSEqCId", diSEqCId.toString() );
        if(dVBEITScan != null)
            parameters.add( "DVBEITScan", dVBEITScan.toString() );

        ResponseEntity<Integer> responseEntity = restOperations.exchange( buildUri( "AddCaptureCard", parameters ), HttpMethod.POST, getRequestEntity(null), Integer.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Integer> addCardInput(Integer cardId, Integer sourceId, String inputName, String externalCommand, String changerDevice, String changerModel, String hostName, String tuneChan, String startChan, String displayName, Boolean dishnetEIT, Integer recPriority, Integer quicktune, Integer schedOrder, Integer liveTVOrder) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(cardId != null)
            parameters.add( "CardId", cardId.toString() );
        if(sourceId != null)
            parameters.add( "SourceId", sourceId.toString() );
        if(inputName != null && !inputName.isEmpty())
            parameters.add( "InputName", inputName );
        if(externalCommand != null && !externalCommand.isEmpty())
            parameters.add( "ExternalCommand", externalCommand );
        if(changerDevice != null && !changerDevice.isEmpty())
            parameters.add( "ChangerDevice", changerDevice );
        if(changerModel != null && !changerModel.isEmpty())
            parameters.add( "ChangerModel", changerModel );
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );
        if(tuneChan != null && !tuneChan.isEmpty())
            parameters.add( "TuneChan", tuneChan );
        if(startChan != null && !startChan.isEmpty())
            parameters.add( "StartChan", startChan );
        if(displayName != null && !displayName.isEmpty())
            parameters.add( "DisplayName", displayName );
        if(dishnetEIT != null)
            parameters.add( "DishnetEIT", dishnetEIT.toString() );
        if(recPriority != null)
            parameters.add( "RecPriority", recPriority.toString() );
        if(quicktune != null)
            parameters.add( "Quicktune", quicktune.toString() );
        if(schedOrder != null)
            parameters.add( "SchedOrder", schedOrder.toString() );
        if(liveTVOrder != null)
            parameters.add( "LiveTVOrder", liveTVOrder.toString() );

        ResponseEntity<Integer> responseEntity = restOperations.exchange( buildUri( "AddCardInput", parameters ), HttpMethod.POST, getRequestEntity(null), Integer.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<CaptureCard> getCaptureCard(Integer cardId, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(cardId != null)
            parameters.add( "CardId", cardId.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<CaptureCard> responseEntity = restOperations.exchange( buildUri( "GetCaptureCard", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), CaptureCard.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<CaptureCardList> getCaptureCardList(String hostName, String cardType, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );
        if(cardType != null && !cardType.isEmpty())
            parameters.add( "CardType", cardType );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<CaptureCardList> responseEntity = restOperations.exchange( buildUri( "GetCaptureCardList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), CaptureCardList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> removeCaptureCard(Integer cardId) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(cardId != null)
            parameters.add( "CardId", cardId.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "RemoveCaptureCard", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> removeCardInput(Integer cardInputId) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(cardInputId != null)
            parameters.add( "CardInputId", cardInputId.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "RemoveCardInput", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> updateCaptureCard(Integer cardId, String setting, String value) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(cardId != null)
            parameters.add( "CardId", cardId.toString() );
        if(setting != null && !setting.isEmpty())
            parameters.add( "Setting", setting );
        if(value != null && !value.isEmpty())
            parameters.add( "Value", value );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "UpdateCaptureCard", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> updateCardInput(Integer cardInputId, String setting, String value) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(cardInputId != null)
            parameters.add( "CardInputId", cardInputId.toString() );
        if(setting != null && !setting.isEmpty())
            parameters.add( "Setting", setting );
        if(value != null && !value.isEmpty())
            parameters.add( "Value", value );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "UpdateCardInput", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}

}