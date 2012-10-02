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
package org.mythtv.services.api.frontend.impl;

import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.frontend.FrontendActionList;
import org.mythtv.services.api.frontend.FrontendOperations;
import org.mythtv.services.api.frontend.FrontendStatus;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 * 
 */
public class FrontendTemplate extends AbstractFrontendOperations implements FrontendOperations {

	private final RestOperations restOperations;

	public FrontendTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		this.restOperations = restOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.frontend.FrontendOperations#getStatus(java.lang
	 * .String)
	 */
	@Override
	public ResponseEntity<FrontendStatus> getStatus( String frontedApiUrlBase, ETagInfo etag )
			throws MythServiceApiRuntimeException {

		ResponseEntity<FrontendStatus> responseEntity = restOperations.exchange( frontedApiUrlBase
				+ "/Frontend/GetStatus", HttpMethod.GET, getRequestEntity( etag ), FrontendStatus.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.frontend.FrontendOperations#sendMessage(java.
	 * lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<Bool> sendMessage( String frontedApiUrlBase, String message ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Message", message );

		ResponseEntity<Bool> responseEntity = restOperations.exchange(
				buildUri( frontedApiUrlBase + "/Frontend/SendMessage", parameters ), HttpMethod.GET,
				getRequestEntity( null ), Bool.class );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.frontend.FrontendOperations#sendAction(java.lang
	 * .String, java.lang.String, java.lang.String, int, int)
	 */
	@Override
	public ResponseEntity<Bool> sendAction( String frontedApiUrlBase, String action, String file, int width, int height )
			throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Action", action );
		
		if( null != file ) {
			parameters.add( "File", file );
		}
		
		if( width > 0 && height > 0 ) {
			parameters.add( "Width", "" + width );
			parameters.add( "Height", "" + height );
		}

		ResponseEntity<Bool> responseEntity = restOperations.exchange(
				buildUri( frontedApiUrlBase + "/Frontend/SendAction", parameters ), HttpMethod.GET,
				getRequestEntity( null ), Bool.class );
		
		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.frontend.FrontendOperations#getActionList(java
	 * .lang.String)
	 */
	@Override
	public ResponseEntity<FrontendActionList> getActionList( String frontedApiUrlBase, ETagInfo etag )
			throws MythServiceApiRuntimeException {

		ResponseEntity<FrontendActionList> responseEntity = restOperations.exchange( buildUri( frontedApiUrlBase
				+ "/Frontend/GetActionList" ), HttpMethod.GET, getRequestEntity( etag ), FrontendActionList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

}
