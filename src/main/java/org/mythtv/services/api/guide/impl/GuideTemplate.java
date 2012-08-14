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
package org.mythtv.services.api.guide.impl;

import org.joda.time.DateTime;
import org.mythtv.services.api.guide.GuideOperations;
import org.mythtv.services.api.guide.ProgramGuideWrapper;
import org.mythtv.services.api.guide.ProgramWrapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 *
 */
public class GuideTemplate extends AbstractGuideOperations implements GuideOperations {

	private final RestOperations restOperations;

	public GuideTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		this.restOperations = restOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.guide.GuideOperations#getChannelIcon(int, int, int)
	 */
	@Override
	public String getChannelIcon( int channelId, int width, int height ) {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		
		if( width > 0 ) {
			parameters.add( "Width", "" + width );
		}
		
		if( height > 0 ) {
			parameters.add( "Height", "" + height );
		}
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetChannelIcon", parameters ), HttpMethod.GET, getRequestEntity(), String.class );
		String icon = responseEntity.getBody();

		return icon;
	}
	
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.guide.GuideOperations#getProgramResponseEntity(int, java.util.Date)
	 */
	@Override
	public ResponseEntity<ProgramWrapper> getProgramResponseEntity(
			int channelId, DateTime startTime) {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		
		if( null != startTime ) {
			parameters.add( "StartTime", convertUtcAndFormat( startTime ) );
		}

		return restOperations.exchange( buildUri( "GetProgramDetails", parameters ), HttpMethod.GET, getRequestEntity(), ProgramWrapper.class );
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.guide.GuideOperations#getProgramDetails(int, java.util.Date)
	 */
	@Override
	public ProgramWrapper getProgramDetails( int channelId, DateTime startTime ) {		
		ResponseEntity<ProgramWrapper> responseEntity = getProgramResponseEntity(channelId, startTime);
		return responseEntity.getBody();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.guide.GuideOperations#getProgramGuide(java.util.Date, java.util.Date, int, int, boolean)
	 */
	@Override
	public ProgramGuideWrapper getProgramGuide( DateTime start, DateTime end, int startChannelId, int numberOfChannels, boolean details ) {

		ResponseEntity<ProgramGuideWrapper> responseEntity = getProgramGuideResponseEntity( start, end, startChannelId, numberOfChannels, details );
		ProgramGuideWrapper programGuide = responseEntity.getBody();

		return programGuide;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.guide.GuideOperations#getProgramGuideResponseEntity(java.util.Date, java.util.Date, int, int, boolean)
	 */
	@Override
	public ResponseEntity<ProgramGuideWrapper> getProgramGuideResponseEntity( DateTime start, DateTime end, int startChannelId, int numberOfChannels, boolean details ) {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "StartTime", convertUtcAndFormat( start ) );
		parameters.add( "EndTime", convertUtcAndFormat( end ) );
		
		if( startChannelId > 0 ) {
			parameters.add( "StartChanId", "" + startChannelId );
		}

		if( numberOfChannels > 0 ) {
			parameters.add( "NumChannels", "" + numberOfChannels );
		}

		if( details ) {
			parameters.add( "Details", Boolean.toString( details ) );
		}

		try {
			return restOperations.exchange( buildUri( "GetProgramGuide", parameters ), HttpMethod.GET, getRequestEntity(), ProgramGuideWrapper.class );
		} catch( Exception e ) {
			e.printStackTrace();
		}
		return null;
	}
	
}
