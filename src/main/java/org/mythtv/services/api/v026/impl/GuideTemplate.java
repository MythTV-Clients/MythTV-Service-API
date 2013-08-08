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
package org.mythtv.services.api.v026.impl;

import org.joda.time.DateTime;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.GuideOperations;
import org.mythtv.services.api.v026.beans.ProgramGuideWrapper;
import org.mythtv.services.api.v026.beans.ProgramWrapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 * 
 */
public class GuideTemplate extends AbstractGuideOperations implements GuideOperations {

	public enum Endpoint {
		GET_CHANNEL_ICON( "GetChannelIcon" ),
		GET_PROGRAM_DETAILS( "GetProgramDetails" ),
		GET_PROGRAM_GUIDE( "GetProgramGuide" );
		
		private String endpoint;
		
		private Endpoint( String endpoint ) {
			this.endpoint = endpoint;
		}
		
		public String getEndpoint() {
			return endpoint;
		}
		
	}
	
	private final RestOperations restOperations;

	public GuideTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		this.restOperations = restOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.guide.GuideOperations#getChannelIcon(int,
	 * int, int)
	 */
	@Override
	public ResponseEntity<String> getChannelIcon( int channelId, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", String.valueOf( channelId ) );

		if( width > 0 ) {
			parameters.add( "Width", String.valueOf( width ) );
		}

		if( height > 0 ) {
			parameters.add( "Height", String.valueOf( height ) );
		}

		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_CHANNEL_ICON.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), String.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.guide.GuideOperations#getProgramResponseEntity
	 * (int, java.util.Date)
	 */
	@Override
	public ResponseEntity<ProgramWrapper> getProgramDetails( int channelId, DateTime startTime, ETagInfo etag ) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", String.valueOf( channelId ) );

		if( null != startTime ) {
			parameters.add( "StartTime", convertUtcAndFormat( startTime ) );
		}

		ResponseEntity<ProgramWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_PROGRAM_DETAILS.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), ProgramWrapper.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.guide.GuideOperations#getProgramGuide(java.util
	 * .Date, java.util.Date, int, int, boolean)
	 */
	@Override
	public ResponseEntity<ProgramGuideWrapper> getProgramGuide( DateTime start, DateTime end, int startChannelId, int numberOfChannels, boolean details, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "StartTime", convertUtcAndFormat( start ) );
		parameters.add( "EndTime", convertUtcAndFormat( end ) );

		if( startChannelId > 0 ) {
			parameters.add( "StartChanId", String.valueOf( startChannelId ) );
		}

		if( numberOfChannels > 0 ) {
			parameters.add( "NumChannels", String.valueOf( numberOfChannels ) );
		}

		if( details ) {
			parameters.add( "Details", Boolean.toString( details ) );
		}

		try {
			ResponseEntity<ProgramGuideWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_PROGRAM_GUIDE.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), ProgramGuideWrapper.class );
			handleResponseEtag( etag, responseEntity.getHeaders() );
		
			return responseEntity;
		} catch( Exception e ) {
			throw new MythServiceApiRuntimeException( e );
		}
	}

}
