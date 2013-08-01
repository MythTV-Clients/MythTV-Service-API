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
import org.mythtv.services.api.v027.beans.BlurayInfo;
import org.mythtv.services.api.v027.beans.VideoLookupList;
import org.mythtv.services.api.v027.beans.VideoMetadataInfo;
import org.mythtv.services.api.v027.beans.VideoMetadataInfoList;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class VideoTemplate extends AbstractOperations implements org.mythtv.services.api.v027.VideoOperations {

    private final RestOperations restOperations;

    public VideoTemplate( RestOperations restOperations, String apiUrlBase ) {
        super( apiUrlBase + "Video/" );
        this.restOperations = restOperations;
    }

	@Override
	public ResponseEntity<Boolean> addVideo(String fileName, String hostName) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(fileName != null && !fileName.isEmpty())
			parameters.add( "FileName", fileName );
		if(hostName != null && !hostName.isEmpty())
			parameters.add( "HostName", hostName );
		
		ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "AddVideo", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<BlurayInfo> getBluray(String path, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(path != null && !path.isEmpty())
			parameters.add( "Path", path );
		
		ResponseEntity<BlurayInfo> responseEntity = restOperations.exchange( buildUri( "GetBluray", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), BlurayInfo.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<VideoMetadataInfo> getVideo(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null)
           		parameters.add( "Id", id.toString() );
		
		ResponseEntity<VideoMetadataInfo> responseEntity = restOperations.exchange( buildUri( "GetVideo", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), VideoMetadataInfo.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<VideoMetadataInfo> getVideoByFileName(String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(fileName != null && !fileName.isEmpty())
			parameters.add( "FileName", fileName );
		
		ResponseEntity<VideoMetadataInfo> responseEntity = restOperations.exchange( buildUri( "GetVideoByFileName", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), VideoMetadataInfo.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<VideoMetadataInfoList> getVideoList(Boolean descending, Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(descending != null)
           		parameters.add( "Descending", descending.toString() );
		if(startIndex != null)
           		parameters.add( "StartIndex", startIndex.toString() );
		if(count != null)
           		parameters.add( "Count", count.toString() );
		
		ResponseEntity<VideoMetadataInfoList> responseEntity = restOperations.exchange( buildUri( "GetVideoList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), VideoMetadataInfoList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<VideoLookupList> lookupVideo(String title, String subtitle, String inetref, Integer season, Integer episode, String grabberType, Boolean allowGeneric, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(title != null && !title.isEmpty())
			parameters.add( "Title", title );
		if(subtitle != null && !subtitle.isEmpty())
			parameters.add( "Subtitle", subtitle );
		if(inetref != null && !inetref.isEmpty())
			parameters.add( "Inetref", inetref );
		if(season != null)
           		parameters.add( "Season", season.toString() );
		if(episode != null)
           		parameters.add( "Episode", episode.toString() );
		if(grabberType != null && !grabberType.isEmpty())
			parameters.add( "GrabberType", grabberType );
		if(allowGeneric != null)
           		parameters.add( "AllowGeneric", allowGeneric.toString() );
		
		ResponseEntity<VideoLookupList> responseEntity = restOperations.exchange( buildUri( "LookupVideo", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), VideoLookupList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Boolean> removeVideoFromDB(Integer id) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null)
           		parameters.add( "Id", id.toString() );
		
		ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "RemoveVideoFromDB", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
		  
		return responseEntity;
	}


}