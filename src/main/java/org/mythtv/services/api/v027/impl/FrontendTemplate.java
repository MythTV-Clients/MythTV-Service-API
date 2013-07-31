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
import org.mythtv.services.api.v027.beans.FrontendActionList;
import org.mythtv.services.api.v027.beans.FrontendStatus;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class FrontendTemplate extends AbstractOperations implements org.mythtv.services.api.v027.FrontendOperations {

    private final RestOperations restOperations;

    public FrontendTemplate( RestOperations restOperations, String apiUrlBase ) {
        super( apiUrlBase + "Frontend/" );
        this.restOperations = restOperations;
    }


    @Override
    public ResponseEntity<FrontendActionList> getActionList(String context, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(context != null && !context.isEmpty())
            parameters.add( "Context", context );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<FrontendActionList> responseEntity = restOperations.exchange( buildUri( "GetActionList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), FrontendActionList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<String[]> getContextList(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<String[]> responseEntity = restOperations.exchange( buildUri( "GetContextList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String[].class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<FrontendStatus> getStatus(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<FrontendStatus> responseEntity = restOperations.exchange( buildUri( "GetStatus", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), FrontendStatus.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> playRecording(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(chanId != null)
            parameters.add( "ChanId", chanId.toString() );
        if(startTime != null)
            parameters.add( "StartTime", startTime.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "PlayRecording", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Boolean.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> playVideo(String id, Boolean useBookmark, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(id != null && !id.isEmpty())
            parameters.add( "Id", id );
        if(useBookmark != null)
            parameters.add( "UseBookmark", useBookmark.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "PlayVideo", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Boolean.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> sendAction(String action, String value, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(action != null && !action.isEmpty())
            parameters.add( "Action", action );
        if(value != null && !value.isEmpty())
            parameters.add( "Value", value );
        if(width != null)
            parameters.add( "Width", width.toString() );
        if(height != null)
            parameters.add( "Height", height.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "SendAction", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Boolean.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> sendMessage(String message, Integer timeout, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(message != null && !message.isEmpty())
            parameters.add( "Message", message );
        if(timeout != null)
            parameters.add( "Timeout", timeout.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "SendMessage", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Boolean.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> sendNotification(Boolean error, String type, String message, String origin, String description, String image, String extra, String progressText, Float progress, Integer timeout, Boolean fullscreen, Integer visibility, Integer priority, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(error != null)
            parameters.add( "Error", error.toString() );
        if(type != null && !type.isEmpty())
            parameters.add( "Type", type );
        if(message != null && !message.isEmpty())
            parameters.add( "Message", message );
        if(origin != null && !origin.isEmpty())
            parameters.add( "Origin", origin );
        if(description != null && !description.isEmpty())
            parameters.add( "Description", description );
        if(image != null && !image.isEmpty())
            parameters.add( "Image", image );
        if(extra != null && !extra.isEmpty())
            parameters.add( "Extra", extra );
        if(progressText != null && !progressText.isEmpty())
            parameters.add( "ProgressText", progressText );
        if(progress != null)
            parameters.add( "Progress", progress.toString() );
        if(timeout != null)
            parameters.add( "Timeout", timeout.toString() );
        if(fullscreen != null)
            parameters.add( "Fullscreen", fullscreen.toString() );
        if(visibility != null)
            parameters.add( "Visibility", visibility.toString() );
        if(priority != null)
            parameters.add( "Priority", priority.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "SendNotification", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Boolean.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}

}