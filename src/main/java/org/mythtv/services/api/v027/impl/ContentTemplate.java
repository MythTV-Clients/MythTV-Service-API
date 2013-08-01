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
import org.mythtv.services.api.v027.beans.ArtworkInfoList;
import org.mythtv.services.api.v027.beans.LiveStreamInfo;
import org.mythtv.services.api.v027.beans.LiveStreamInfoList;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class ContentTemplate extends AbstractOperations implements org.mythtv.services.api.v027.ContentOperations {

    private final RestOperations restOperations;

    public ContentTemplate( RestOperations restOperations, String apiUrlBase ) {
        super( apiUrlBase + "Content/" );
        this.restOperations = restOperations;
    }

	@Override
	public ResponseEntity<LiveStreamInfo> addLiveStream(String storageGroup, String fileName, String hostName, Integer maxSegments, Integer width, Integer height, Integer bitrate, Integer audioBitrate, Integer sampleRate, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(storageGroup != null && !storageGroup.isEmpty())
			parameters.add( "StorageGroup", storageGroup );
		if(fileName != null && !fileName.isEmpty())
			parameters.add( "FileName", fileName );
		if(hostName != null && !hostName.isEmpty())
			parameters.add( "HostName", hostName );
		if(maxSegments != null)
           		parameters.add( "MaxSegments", maxSegments.toString() );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		if(bitrate != null)
           		parameters.add( "Bitrate", bitrate.toString() );
		if(audioBitrate != null)
           		parameters.add( "AudioBitrate", audioBitrate.toString() );
		if(sampleRate != null)
           		parameters.add( "SampleRate", sampleRate.toString() );
		
		ResponseEntity<LiveStreamInfo> responseEntity = restOperations.exchange( buildUri( "AddLiveStream", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), LiveStreamInfo.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<LiveStreamInfo> addRecordingLiveStream(Integer chanId, org.joda.time.DateTime startTime, Integer maxSegments, Integer width, Integer height, Integer bitrate, Integer audioBitrate, Integer sampleRate, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanId != null)
           		parameters.add( "ChanId", chanId.toString() );
		if(startTime != null)
           		parameters.add( "StartTime", startTime.toString() );
		if(maxSegments != null)
           		parameters.add( "MaxSegments", maxSegments.toString() );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		if(bitrate != null)
           		parameters.add( "Bitrate", bitrate.toString() );
		if(audioBitrate != null)
           		parameters.add( "AudioBitrate", audioBitrate.toString() );
		if(sampleRate != null)
           		parameters.add( "SampleRate", sampleRate.toString() );
		
		ResponseEntity<LiveStreamInfo> responseEntity = restOperations.exchange( buildUri( "AddRecordingLiveStream", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), LiveStreamInfo.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<LiveStreamInfo> addVideoLiveStream(Integer id, Integer maxSegments, Integer width, Integer height, Integer bitrate, Integer audioBitrate, Integer sampleRate, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null)
           		parameters.add( "Id", id.toString() );
		if(maxSegments != null)
           		parameters.add( "MaxSegments", maxSegments.toString() );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		if(bitrate != null)
           		parameters.add( "Bitrate", bitrate.toString() );
		if(audioBitrate != null)
           		parameters.add( "AudioBitrate", audioBitrate.toString() );
		if(sampleRate != null)
           		parameters.add( "SampleRate", sampleRate.toString() );
		
		ResponseEntity<LiveStreamInfo> responseEntity = restOperations.exchange( buildUri( "AddVideoLiveStream", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), LiveStreamInfo.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Boolean> downloadFile(String uRL, String storageGroup) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(uRL != null && !uRL.isEmpty())
			parameters.add( "URL", uRL );
		if(storageGroup != null && !storageGroup.isEmpty())
			parameters.add( "StorageGroup", storageGroup );
		
		ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "DownloadFile", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getAlbumArt(Integer id, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null)
           		parameters.add( "Id", id.toString() );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetAlbumArt", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getFile(String storageGroup, String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(storageGroup != null && !storageGroup.isEmpty())
			parameters.add( "StorageGroup", storageGroup );
		if(fileName != null && !fileName.isEmpty())
			parameters.add( "FileName", fileName );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetFile", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String[]> getFileList(String storageGroup, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(storageGroup != null && !storageGroup.isEmpty())
			parameters.add( "StorageGroup", storageGroup );
		
		ResponseEntity<String[]> responseEntity = restOperations.exchange( buildUri( "GetFileList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String[].class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getHash(String storageGroup, String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(storageGroup != null && !storageGroup.isEmpty())
			parameters.add( "StorageGroup", storageGroup );
		if(fileName != null && !fileName.isEmpty())
			parameters.add( "FileName", fileName );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetHash", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getImageFile(String storageGroup, String fileName, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(storageGroup != null && !storageGroup.isEmpty())
			parameters.add( "StorageGroup", storageGroup );
		if(fileName != null && !fileName.isEmpty())
			parameters.add( "FileName", fileName );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetImageFile", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<LiveStreamInfo> getLiveStream(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null)
           		parameters.add( "Id", id.toString() );
		
		ResponseEntity<LiveStreamInfo> responseEntity = restOperations.exchange( buildUri( "GetLiveStream", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), LiveStreamInfo.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<LiveStreamInfoList> getLiveStreamList(String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(fileName != null && !fileName.isEmpty())
			parameters.add( "FileName", fileName );
		
		ResponseEntity<LiveStreamInfoList> responseEntity = restOperations.exchange( buildUri( "GetLiveStreamList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), LiveStreamInfoList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getMusic(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null)
           		parameters.add( "Id", id.toString() );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetMusic", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getPreviewImage(Integer chanId, org.joda.time.DateTime startTime, Integer width, Integer height, Integer secsIn, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanId != null)
           		parameters.add( "ChanId", chanId.toString() );
		if(startTime != null)
           		parameters.add( "StartTime", startTime.toString() );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		if(secsIn != null)
           		parameters.add( "SecsIn", secsIn.toString() );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetPreviewImage", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ArtworkInfoList> getProgramArtworkList(String inetref, Integer season, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(inetref != null && !inetref.isEmpty())
			parameters.add( "Inetref", inetref );
		if(season != null)
           		parameters.add( "Season", season.toString() );
		
		ResponseEntity<ArtworkInfoList> responseEntity = restOperations.exchange( buildUri( "GetProgramArtworkList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ArtworkInfoList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getRecording(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanId != null)
           		parameters.add( "ChanId", chanId.toString() );
		if(startTime != null)
           		parameters.add( "StartTime", startTime.toString() );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetRecording", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getRecordingArtwork(String type, String inetref, Integer season, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(type != null && !type.isEmpty())
			parameters.add( "Type", type );
		if(inetref != null && !inetref.isEmpty())
			parameters.add( "Inetref", inetref );
		if(season != null)
           		parameters.add( "Season", season.toString() );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetRecordingArtwork", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ArtworkInfoList> getRecordingArtworkList(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanId != null)
           		parameters.add( "ChanId", chanId.toString() );
		if(startTime != null)
           		parameters.add( "StartTime", startTime.toString() );
		
		ResponseEntity<ArtworkInfoList> responseEntity = restOperations.exchange( buildUri( "GetRecordingArtworkList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ArtworkInfoList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getVideo(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null)
           		parameters.add( "Id", id.toString() );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetVideo", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<String> getVideoArtwork(String type, Integer id, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(type != null && !type.isEmpty())
			parameters.add( "Type", type );
		if(id != null)
           		parameters.add( "Id", id.toString() );
		if(width != null)
           		parameters.add( "Width", width.toString() );
		if(height != null)
           		parameters.add( "Height", height.toString() );
		
		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetVideoArtwork", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Boolean> removeLiveStream(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null)
           		parameters.add( "Id", id.toString() );
		
		ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "RemoveLiveStream", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Boolean.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<LiveStreamInfo> stopLiveStream(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(id != null)
           		parameters.add( "Id", id.toString() );
		
		ResponseEntity<LiveStreamInfo> responseEntity = restOperations.exchange( buildUri( "StopLiveStream", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), LiveStreamInfo.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}


}