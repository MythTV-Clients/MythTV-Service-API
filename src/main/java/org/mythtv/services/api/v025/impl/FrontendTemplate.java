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
package org.mythtv.services.api.v025.impl;

import org.mythtv.services.api.AbstractOperations;
import org.mythtv.services.api.ArrayOfString;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v025.beans.FrontendActionList;
import org.mythtv.services.api.v025.beans.FrontendStatus;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class FrontendTemplate extends AbstractOperations implements org.mythtv.services.api.v025.FrontendOperations {

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
		
		ResponseEntity<FrontendActionList> responseEntity = restOperations.exchange( buildUri( "GetActionList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), FrontendActionList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ArrayOfString> getContextList(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		
		ResponseEntity<ArrayOfString> responseEntity = restOperations.exchange( buildUri( "GetContextList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ArrayOfString.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<FrontendStatus> getStatus(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		
		ResponseEntity<FrontendStatus> responseEntity = restOperations.exchange( buildUri( "GetStatus", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), FrontendStatus.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> playRecording(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanId != null)
           		parameters.add( "ChanId", chanId.toString() );
		if(startTime != null)
           		parameters.add( "StartTime",  convertUtcAndFormat( startTime )  );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "PlayRecording", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Bool.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> playVideo(String id, Boolean useBookmark, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null && !id.isEmpty())
			parameters.add( "Id", id );
		if(useBookmark != null)
           		parameters.add( "UseBookmark", useBookmark.toString() );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "PlayVideo", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Bool.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> sendAction(String action, String value, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(action != null && !action.isEmpty())
			parameters.add( "Action", action );
		if(value != null && !value.isEmpty())
			parameters.add( "Value", value );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "SendAction", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Bool.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> sendMessage(String message, Integer timeout, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(message != null && !message.isEmpty())
			parameters.add( "Message", message );
		if(timeout != null)
           		parameters.add( "Timeout", timeout.toString() );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "SendMessage", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Bool.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}


}