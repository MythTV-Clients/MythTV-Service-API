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
package org.mythtv.services.api.content.impl;

import org.joda.time.DateTime;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.StringList;
import org.mythtv.services.api.content.ArtworkInfoList;
import org.mythtv.services.api.content.ArtworkInfos;
import org.mythtv.services.api.content.ContentOperations;
import org.mythtv.services.api.content.LiveStreamInfo;
import org.mythtv.services.api.content.LiveStreamInfoWrapper;
import org.mythtv.services.api.content.LiveStreamInfos;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 * @author John Baab
 *
 */
public class ContentTemplate extends AbstractContentOperations implements ContentOperations {

	public enum Endpoint {
		ADD_LIVE_STREAM( "AddLiveStream" ),
		ADD_RECORDING_LIVE_STREAM( "AddRecordingLiveStream" ),
		ADD_VIDEO_LIVE_STREAM( "AddVideoLiveStream" ),
		DOWNLOAD_FILE( "DownloadFile" ),
		GET_ALBUM_ART( "GetAlbumArt" ),
		GET_FILE( "GetFile"),
		GET_FILE_LIST( "GetFileList" ),
		GET_FILTERED_LIVE_STREAM_LIST( "GetFilteredLiveStreamList" ),
		GET_HASH( "GetHash" ),
		GET_IMAGE_FILE( "GetImageFile" ),
		GET_LIVE_STREAM( "GetLiveStream" ),
		GET_LIVE_STREAM_LIST( "GetLiveStreamList" ),
		GET_MUSIC( "GetMusic" ),
		GET_PREVIEW_IMAGE( "GetPreviewImage" ),
		GET_PROGRAM_ARTWORK_LIST( "GetProgramArtworkList" ),
		GET_RECORDING( "GetRecording" ),
		GET_RECORDING_ARTWORK( "GetRecordingArtwork" ),
		GET_RECORDING_ARTWORK_LIST( "GetRecordingArtworkList" ),
		GET_VIDEO( "GetVideo" ),
		GET_VIDEO_ARTWORK( "GetVideoArtwork"),
		REMOVE_LIVE_STREAM( "RemoveLiveStream" ),
		STOP_LIVE_STREAM( "StopLiveStream" );
		
		private String endpoint;
		
		private Endpoint( String endpoint ) {
			this.endpoint = endpoint;
		}
		
		public String getEndpoint() {
			return endpoint;
		}
		
	}

	private final RestOperations restOperations;
	
	public ContentTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		this.restOperations = restOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#addLiveStream(java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, int)
	 */
	@Override
	public ResponseEntity<LiveStreamInfoWrapper> addLiveStream( String storageGroup, String filename, String hostname, int maxSegments, int width, int height, int bitrate, int audioBitrate, int sampleRate ) throws MythServiceApiRuntimeException {
		
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "FileName", "" + filename );
		
		if( storageGroup != null ) {
			parameters.add( "StorageGroup", "" + storageGroup );
		}
		
		if( hostname != null ) {
			parameters.add( "HostName", "" + hostname );
		}
		
		if( maxSegments > 0 ) {
			parameters.add( "MaxSegments", "" + maxSegments );
		}
		
		if( width > 0 ) {
			parameters.add( "Width", "" + width );
		}

		if( height > 0 ) {
			parameters.add( "Height", "" + height );
		}

		if( bitrate > 0 ) {
			parameters.add( "Bitrate", "" + bitrate );
		}

		if( audioBitrate > 0 ) {
			parameters.add( "AudioBitrate", "" + audioBitrate );
		}

		if( sampleRate > 0 ) {
			parameters.add( "SampleRate", "" + sampleRate );
		}

		ResponseEntity<LiveStreamInfoWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.ADD_LIVE_STREAM.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( null ), LiveStreamInfoWrapper.class );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#addRecordingLiveStream(int, java.util.Date, int, int, int, int, int, int)
	 */
	@Override
	public ResponseEntity<LiveStreamInfoWrapper> addRecordingLiveStream( int channelId, DateTime startTime, int maxSegments, int width, int height, int bitrate, int audioBitrate, int sampleRate ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		parameters.add( "StartTime", convertUtcAndFormat( startTime ) );
		
		if( maxSegments > 0 ) {
			parameters.add( "MaxSegments", "" + maxSegments );
		}
		
		if( width > 0 ) {
			parameters.add( "Width", "" + width );
		}

		if( height > 0 ) {
			parameters.add( "Height", "" + height );
		}

		if( bitrate > 0 ) {
			parameters.add( "Bitrate", "" + bitrate );
		}

		if( audioBitrate > 0 ) {
			parameters.add( "AudioBitrate", "" + audioBitrate );
		}

		if( sampleRate > 0 ) {
			parameters.add( "SampleRate", "" + sampleRate );
		}

		ResponseEntity<LiveStreamInfoWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.ADD_RECORDING_LIVE_STREAM.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( null ), LiveStreamInfoWrapper.class );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#addVideoLiveStream(int, int, int, int, int, int, int)
	 */
	@Override
	public ResponseEntity<LiveStreamInfoWrapper> addVideoLiveStream( int id, int maxSegments, int width, int height, int bitrate, int audioBitrate, int sampleRate ) throws MythServiceApiRuntimeException {
		
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", "" + id );
		
		if( maxSegments > 0 ) {
			parameters.add( "MaxSegments", "" + maxSegments );
		}

		if( width > 0 ) {
			parameters.add( "Width", "" + width );
		}

		if( height > 0 ) {
			parameters.add( "Height", "" + height );
		}

		if( bitrate > 0 ) {
			parameters.add( "Bitrate", "" + bitrate );
		}

		if( audioBitrate > 0 ) {
			parameters.add( "AudioBitrate", "" + audioBitrate );
		}

		if( sampleRate > 0 ) {
			parameters.add( "SampleRate", "" + sampleRate );
		}

		ResponseEntity<LiveStreamInfoWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.ADD_VIDEO_LIVE_STREAM.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( null ), LiveStreamInfoWrapper.class );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#downloadFile(java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<Bool> downloadFile( String url, String storageGroup, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "StorageGroup", storageGroup );
		parameters.add( "URL", url );

		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( Endpoint.DOWNLOAD_FILE.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), Bool.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getAlbumArt(int, int, int)
	 */
	@Override
	public ResponseEntity<byte[]> getAlbumArt( int id, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", "" + id );
		
		if( width > 0 ) {
			parameters.add( "Width", "" + width );
		}

		if( height > 0 ) {
			parameters.add( "Height", "" + height );
		}

		ResponseEntity<byte[]> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_ALBUM_ART.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), byte[].class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getFile(java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<byte[]> getFile( String storageGroup, String filename, ETagInfo etag ) throws MythServiceApiRuntimeException {
		
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "StorageGroup", storageGroup );
		
		if( null != filename && !"".equals( filename ) ) {
			parameters.add( "FileName", filename );
		}

		ResponseEntity<byte[]> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_FILE.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), byte[].class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getFileList(java.lang.String)
	 */
	@Override
	public ResponseEntity<StringList> getFileList( String storageGroup, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "StorageGroup", storageGroup );
		
		ResponseEntity<StringList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_FILE_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), StringList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getFilteredLiveStreamList(java.lang.String)
	 */
	@Override
	public ResponseEntity<LiveStreamInfos> getFilteredLiveStreamList( String filename, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "FileName", filename );
		
		ResponseEntity<LiveStreamInfos> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_FILTERED_LIVE_STREAM_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), LiveStreamInfos.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getHash(java.lang.String, java.lang.String)
	 */
	@Override
 	public ResponseEntity<String> getHash( String storageGroup, String filename, ETagInfo etag ) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "StorageGroup", storageGroup );
		parameters.add( "FileName", filename );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_HASH.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), String.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getImageFile(java.lang.String, java.lang.String, int, int)
	 */
	@Override
	public ResponseEntity<byte[]> getImageFile( String storageGroup, String filename, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "StorageGroup", storageGroup );
		parameters.add( "FileName", filename );
		
		if( width > 0 ) {
			parameters.add( "Width", "" + width );
		}

		if( height > 0 ) {
			parameters.add( "Height", "" + height );
		}

		ResponseEntity<byte[]> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_IMAGE_FILE.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), byte[].class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getLiveStream(int)
	 */
	@Override
	public ResponseEntity<LiveStreamInfoWrapper> getLiveStream( int id, ETagInfo etag ) throws MythServiceApiRuntimeException {
	
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", "" + id );

		ResponseEntity<LiveStreamInfoWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_LIVE_STREAM.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), LiveStreamInfoWrapper.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getLiveStreamList()
	 */
	@Override
	public ResponseEntity<LiveStreamInfos> getLiveStreamList( ETagInfo etag ) throws MythServiceApiRuntimeException {

		ResponseEntity<LiveStreamInfos> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_LIVE_STREAM_LIST.getEndpoint() ), HttpMethod.GET, getRequestEntity( etag ), LiveStreamInfos.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getMusic(int)
	 */
	@Override
	public ResponseEntity<byte[]> getMusic( int id, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", "" + id );

		ResponseEntity<byte[]> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_MUSIC.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), byte[].class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getPreviewImage(int, java.util.Date, int, int, int)
	 */
	@Override
	public ResponseEntity<byte[]> getPreviewImage( int channelId, DateTime startTime, int width, int height, int secondsIn, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		parameters.add( "StartTime", convertUtcAndFormat( startTime ) );
		
		if( width > 0 ) {
			parameters.add( "Width", "" + width );
		}

		if( height > 0 ) {
			parameters.add( "Height", "" + height );
		}

		if( secondsIn > 0 ) {
			parameters.add( "SecsIn", "" + secondsIn );
		}

		ResponseEntity<byte[]> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_PREVIEW_IMAGE.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), byte[].class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getProgramArtworkList(java.lang.String, int)
	 */
	@Override
	public ResponseEntity<ArtworkInfos> getProgramArtworkList( String inetRef, int season, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Inetref", inetRef );
		
		if( season > 0 ) {
			parameters.add( "Season", "" + season );
		}

		ResponseEntity<ArtworkInfos> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_PROGRAM_ARTWORK_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), ArtworkInfos.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getRecording(int, java.util.Date)
	 */
	@Override
	public ResponseEntity<byte[]> getRecording( int channelId, DateTime startTime, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		parameters.add( "StartTime", convertUtcAndFormat( startTime ) );

		ResponseEntity<byte[]> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_RECORDING.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), byte[].class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getRecordingArtwork(java.lang.String, java.lang.String, int, int, int)
	 */
	@Override
	public ResponseEntity<byte[]> getRecordingArtwork( String type, String inetRef, int season, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Inetref", inetRef );
		
		if( null != type && !"".equals( type ) ) {
			parameters.add( "Type", type );
		}

		if( season > 0 ) {
			parameters.add( "Season", "" + season );
		}

		if( width > 0 ) {
			parameters.add( "Width", "" + width );
		}

		if( height > 0 ) {
			parameters.add( "Height", "" + height );
		}

		ResponseEntity<byte[]> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_RECORDING_ARTWORK.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), byte[].class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getRecordingArtworkList(int, java.util.Date)
	 */
	@Override
	public ResponseEntity<ArtworkInfoList> getRecordingArtworkList( int channelId, DateTime startTime, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		parameters.add( "StartTime", convertUtcAndFormat( startTime ) );
		
		ResponseEntity<ArtworkInfoList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_RECORDING_ARTWORK_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), ArtworkInfoList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getVideo(int)
	 */
	@Override
	public ResponseEntity<byte[]> getVideo( int id, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", "" + id );
		
		ResponseEntity<byte[]> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_VIDEO.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), byte[].class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#getVideoArtwork(java.lang.String, int, int, int)
	 */
	@Override
	public ResponseEntity<byte[]> getVideoArtwork( String type, int id, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Id", "" + id );
		
		if( null != type && !"".equals( type ) ) {
			parameters.add( "Type", type );
		}

		if( width > 0 ) {
			parameters.add( "Width", "" + width );
		}

		if( height > 0 ) {
			parameters.add( "Height", "" + height );
		}

		ResponseEntity<byte[]> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_VIDEO_ARTWORK.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), byte[].class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#removeLiveStream(int)
	 */
	@Override
	public ResponseEntity<Bool> removeLiveStream( int id ) throws MythServiceApiRuntimeException {
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( Endpoint.REMOVE_LIVE_STREAM.getEndpoint(), "Id", "" + id ), HttpMethod.GET, getRequestEntity( null ), Bool.class );
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.content.ContentOperations#stopLiveStream(int)
	 */
	@Override
	public ResponseEntity<LiveStreamInfo> stopLiveStream( int id ) throws MythServiceApiRuntimeException {

		ResponseEntity<LiveStreamInfo> responseEntity = restOperations.exchange( buildUri( Endpoint.STOP_LIVE_STREAM.getEndpoint(), "Id", "" + id ), HttpMethod.GET, getRequestEntity( null ), LiveStreamInfo.class );
		
		return responseEntity;
	}
	
}
