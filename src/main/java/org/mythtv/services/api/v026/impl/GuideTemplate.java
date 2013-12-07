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

import org.mythtv.services.api.AbstractOperations;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.beans.Program;
import org.mythtv.services.api.v026.beans.ProgramGuide;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class GuideTemplate extends AbstractOperations implements org.mythtv.services.api.v026.GuideOperations {

    private final RestOperations restOperations;

    public GuideTemplate( RestOperations restOperations, String apiUrlBase ) {
        super( apiUrlBase + "Guide/" );
        this.restOperations = restOperations;
    }

	@Override
	public ResponseEntity<String> getChannelIcon(Integer chanId, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanId != null)
           		parameters.add( "ChanId", chanId.toString() );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetChannelIcon", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Program> getProgramDetails(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanId != null)
           		parameters.add( "ChanId", chanId.toString() );
		if(startTime != null)
           		parameters.add( "StartTime",  convertUtcAndFormat( startTime )  );
		
		ResponseEntity<Program> responseEntity = restOperations.exchange( buildUri( "GetProgramDetails", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Program.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ProgramGuide> getProgramGuide(org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, Integer startChanId, Integer numChannels, Boolean details, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(startTime != null)
           		parameters.add( "StartTime",  convertUtcAndFormat( startTime )  );
		if(endTime != null)
           		parameters.add( "EndTime",  convertUtcAndFormat( endTime )  );
		if(startChanId != null)
           		parameters.add( "StartChanId", startChanId.toString() );
		if(numChannels != null)
           		parameters.add( "NumChannels", numChannels.toString() );
		if(details != null)
           		parameters.add( "Details", details.toString() );
		
		ResponseEntity<ProgramGuide> responseEntity = restOperations.exchange( buildUri( "GetProgramGuide", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramGuide.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}


}