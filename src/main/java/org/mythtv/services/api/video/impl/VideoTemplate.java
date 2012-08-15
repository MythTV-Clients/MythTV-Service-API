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
package org.mythtv.services.api.video.impl;

import java.util.List;

import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.video.BlurayInfoWrapper;
import org.mythtv.services.api.video.VideoLookup;
import org.mythtv.services.api.video.VideoLookupList;
import org.mythtv.services.api.video.VideoMetaDataInfoWrapper;
import org.mythtv.services.api.video.VideoMetadataInfo;
import org.mythtv.services.api.video.VideoMetadataInfoList;
import org.mythtv.services.api.video.VideoOperations;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 *
 */
public class VideoTemplate extends AbstractVideoOperations implements VideoOperations {

	private final RestOperations restOperations;

	public VideoTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		this.restOperations = restOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.video.VideoOperations#addVideo(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addVideo( String filename, String hostname ) throws MythServiceApiRuntimeException{

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "FileName", filename );
		parameters.add( "HostName", hostname );

		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "AddVideo", parameters ), HttpMethod.GET, getRequestEntity(null), Bool.class );
		Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.video.VideoOperations#getBluray(java.lang.String)
	 */
	@Override
	public BlurayInfoWrapper getBluray( String path, ETagInfo etag ) throws MythServiceApiRuntimeException{

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Path", path );

		ResponseEntity<BlurayInfoWrapper> responseEntity = restOperations.exchange( buildUri( "GetBluray", parameters ), HttpMethod.GET, getRequestEntity(etag), BlurayInfoWrapper.class );
		BlurayInfoWrapper blurayInfo = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return blurayInfo;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.video.VideoOperations#getVideo(int)
	 */
	@Override
	public VideoMetaDataInfoWrapper getVideo( int id, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", "" + id );

		ResponseEntity<VideoMetaDataInfoWrapper> responseEntity = restOperations.exchange( buildUri( "GetVideo", parameters ), HttpMethod.GET, getRequestEntity(etag), VideoMetaDataInfoWrapper.class );
		VideoMetaDataInfoWrapper videoMetadataInfo = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return videoMetadataInfo;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.video.VideoOperations#getVideByFilename(java.lang.String)
	 */
	@Override
	public VideoMetaDataInfoWrapper getVideoByFilename( String filename, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "FileName", filename );

		ResponseEntity<VideoMetaDataInfoWrapper> responseEntity = restOperations.exchange( buildUri( "GetVideoByFileName", parameters ), HttpMethod.GET, getRequestEntity(etag), VideoMetaDataInfoWrapper.class );
		VideoMetaDataInfoWrapper videoMetadataInfo = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return videoMetadataInfo;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.video.VideoOperations#getVideoList(boolean, int, int)
	 */
	@Override
	public List<VideoMetadataInfo> getVideoList( boolean descending, int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Descending", Boolean.toString( descending ) );
		
		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}

		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		ResponseEntity<VideoMetadataInfoList> responseEntity = restOperations.exchange( buildUri( "GetVideoList", parameters ), HttpMethod.GET, getRequestEntity(etag), VideoMetadataInfoList.class );
		VideoMetadataInfoList videoMetadataInfoList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return videoMetadataInfoList.getVideoMetadataInfos().getVideoMetadataInfos();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.video.VideoOperations#lookupVideo(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, boolean)
	 */
	@Override
	public List<VideoLookup> lookupVideo( String title, String subtitle, String inetRef, int season, int episode, String grabberType, boolean allowGeneric, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Title", title );
		
		if( null != subtitle && !"".equals( subtitle ) ) {
			parameters.add( "Subtitle", subtitle );
		}

		if( null != inetRef && !"".equals( inetRef ) ) {
			parameters.add( "Inetref", inetRef );
		}

		if( season > 0 ) {
			parameters.add( "Season", "" + season );
		}

		if( episode > 0 ) {
			parameters.add( "Episode", "" + episode );
		}

		ResponseEntity<VideoLookupList> responseEntity = restOperations.exchange( buildUri( "LookupVideo", parameters ), HttpMethod.GET, getRequestEntity(etag), VideoLookupList.class );
		VideoLookupList videoLookupList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return videoLookupList.getVideoLookups().getVideoLookups();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.video.VideoOperations#removeVideoFromDatabase(int)
	 */
	@Override
	public boolean removeVideoFromDatabase( int id ) {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", "" + id );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "RemoveVideoFromDB", parameters ), HttpMethod.GET, getRequestEntity(null), Bool.class );
		Bool bool = responseEntity.getBody();

		return bool.getBool();
	}
	
}
