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

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.Bool;
import org.mythtv.services.api.v026.VideoOperations;
import org.mythtv.services.api.v026.beans.BlurayInfoWrapper;
import org.mythtv.services.api.v026.beans.VideoLookupList;
import org.mythtv.services.api.v026.beans.VideoMetaDataInfoWrapper;
import org.mythtv.services.api.v026.beans.VideoMetadataInfoList;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 * 
 */
public class VideoTemplate extends AbstractVideoOperations implements VideoOperations {

	public enum Endpoint {
		ADD_VIDEO( "AddVideo" ),
		GET_BLURAY( "GetBluray" ),
		GET_VIDEO( "GetVideo" ),
		GET_VIDEO_BY_FILENAME( "GetVideoByFileName" ),
		GET_VIDEO_LIST( "GetVideoList" ),
		LOOKUP_VIDEO( "LookupVideo"),
		REMOVE_VIDEO_FROM_DB( "RemoveVideoFromDB" );
		
		private String endpoint;
		
		private Endpoint( String endpoint ) {
			this.endpoint = endpoint;
		}
		
		public String getEndpoint() {
			return endpoint;
		}
		
	}
	
	private final RestOperations restOperations;

	public VideoTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		this.restOperations = restOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.video.VideoOperations#addVideo(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public ResponseEntity<Bool> addVideo( String filename, String hostname ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "FileName", filename );
		parameters.add( "HostName", hostname );

		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( Endpoint.ADD_VIDEO.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( null ), Bool.class );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.video.VideoOperations#getBluray(java.lang.String)
	 */
	@Override
	public ResponseEntity<BlurayInfoWrapper> getBluray( String path, ETagInfo etag )
			throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Path", path );

		ResponseEntity<BlurayInfoWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_BLURAY.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), BlurayInfoWrapper.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.video.VideoOperations#getVideo(int)
	 */
	@Override
	public ResponseEntity<VideoMetaDataInfoWrapper> getVideo( int id, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", String.valueOf( id ) );

		ResponseEntity<VideoMetaDataInfoWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_VIDEO.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), VideoMetaDataInfoWrapper.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.video.VideoOperations#getVideByFilename(java.
	 * lang.String)
	 */
	@Override
	public ResponseEntity<VideoMetaDataInfoWrapper> getVideoByFilename( String filename, ETagInfo etag )
			throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "FileName", filename );

		ResponseEntity<VideoMetaDataInfoWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_VIDEO_BY_FILENAME.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ),	VideoMetaDataInfoWrapper.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.video.VideoOperations#getVideoList(boolean,
	 * int, int)
	 */
	@Override
	public ResponseEntity<VideoMetadataInfoList> getVideoList( boolean descending, int startIndex, int count, ETagInfo etag )
			throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Descending", Boolean.toString( descending ) );

		if( startIndex > 0 ) {
			parameters.add( "StartIndex", String.valueOf( startIndex ) );
		}

		if( count > 0 ) {
			parameters.add( "Count", String.valueOf( count ) );
		}

		ResponseEntity<VideoMetadataInfoList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_VIDEO_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), VideoMetadataInfoList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.video.VideoOperations#lookupVideo(java.lang.String
	 * , java.lang.String, java.lang.String, int, int, java.lang.String,
	 * boolean)
	 */
	@Override
	public ResponseEntity<VideoLookupList> lookupVideo( String title, String subtitle, String inetRef, int season, int episode,
			String grabberType, boolean allowGeneric, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Title", title );

		if( null != subtitle && !"".equals( subtitle ) ) {
			parameters.add( "Subtitle", subtitle );
		}

		if( null != inetRef && !"".equals( inetRef ) ) {
			parameters.add( "Inetref", inetRef );
		}

		if( season > 0 ) {
			parameters.add( "Season", String.valueOf( season ) );
		}

		if( episode > 0 ) {
			parameters.add( "Episode", String.valueOf( episode ) );
		}

		ResponseEntity<VideoLookupList> responseEntity = restOperations.exchange( buildUri( Endpoint.LOOKUP_VIDEO.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), VideoLookupList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.video.VideoOperations#removeVideoFromDatabase
	 * (int)
	 */
	@Override
	public ResponseEntity<Bool> removeVideoFromDatabase( int id ) {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", String.valueOf( id ) );

		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( Endpoint.REMOVE_VIDEO_FROM_DB.getEndpoint(), parameters ), HttpMethod.POST, getRequestEntity( null ), Bool.class );

		return responseEntity;
	}

}
