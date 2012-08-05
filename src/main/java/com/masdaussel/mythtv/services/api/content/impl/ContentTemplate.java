/**
 *  This file is part of MythTV Service API for Java
 * 
 *  MythTV Service API for Java is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV Service API for Java is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV Service API for Java.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/tafypz/MythTV-Service-API.git>
 *
 */
package com.masdaussel.mythtv.services.api.content.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.masdaussel.mythtv.services.api.AbstractMythApiOperations;
import com.masdaussel.mythtv.services.api.content.ArtworkInfo;
import com.masdaussel.mythtv.services.api.content.ArtworkInfos;
import com.masdaussel.mythtv.services.api.content.ContentOperations;
import com.masdaussel.mythtv.services.api.content.LiveStreamInfo;
import com.masdaussel.mythtv.services.api.content.LiveStreamInfoWrapper;
import com.masdaussel.mythtv.services.api.content.LiveStreamInfos;
import com.masdaussel.mythtv.services.api.utils.Bool;

/**
 * @author sebastien
 * @author John Baab
 * 
 */
public class ContentTemplate extends AbstractContentOperations implements ContentOperations {

	private final RestTemplate	restTemplate;

	public ContentTemplate(final RestTemplate restTemplate, final String apiUrlBase) {
		super(apiUrlBase);
		this.restTemplate = restTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#addLiveStream
	 * (java.lang.String, java.lang.String, java.lang.String, int, int, int,
	 * int, int, int)
	 */
	@Override
	public LiveStreamInfo addLiveStream(final String storageGroup, final String filename, final String hostname, final int maxSegments, final int width,
			final int height, final int bitrate, final int audioBitrate, final int sampleRate) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("FileName", "" + filename);

		if (storageGroup != null)
			parameters.add("StorageGroup", "" + storageGroup);

		if (hostname != null)
			parameters.add("HostName", "" + hostname);

		if (maxSegments > 0)
			parameters.add("MaxSegments", "" + maxSegments);

		if (width > 0)
			parameters.add("Width", "" + width);

		if (height > 0)
			parameters.add("Height", "" + height);

		if (bitrate > 0)
			parameters.add("Bitrate", "" + bitrate);

		if (audioBitrate > 0)
			parameters.add("AudioBitrate", "" + audioBitrate);

		if (sampleRate > 0)
			parameters.add("SampleRate", "" + sampleRate);

		final ResponseEntity<LiveStreamInfoWrapper> responseEntity = restTemplate.exchange(buildUri("AddLiveStream", parameters), HttpMethod.GET,
				getRequestEntity(), LiveStreamInfoWrapper.class);
		final LiveStreamInfoWrapper wrapper = responseEntity.getBody();

		return wrapper.getLiveStreamInfo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.content.ContentOperations#
	 * addRecordingLiveStream(int, java.util.Date, int, int, int, int, int, int)
	 */
	@Override
	public LiveStreamInfo addRecordingLiveStream(final int channelId, final Date startTime, final int maxSegments, final int width, final int height,
			final int bitrate, final int audioBitrate, final int sampleRate) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);
		parameters.add("StartTime", AbstractMythApiOperations.sdf.format(startTime));

		if (maxSegments > 0)
			parameters.add("MaxSegments", "" + maxSegments);

		if (width > 0)
			parameters.add("Width", "" + width);

		if (height > 0)
			parameters.add("Height", "" + height);

		if (bitrate > 0)
			parameters.add("Bitrate", "" + bitrate);

		if (audioBitrate > 0)
			parameters.add("AudioBitrate", "" + audioBitrate);

		if (sampleRate > 0)
			parameters.add("SampleRate", "" + sampleRate);

		final ResponseEntity<LiveStreamInfoWrapper> responseEntity = restTemplate.exchange(buildUri("AddRecordingLiveStream", parameters), HttpMethod.GET,
				getRequestEntity(), LiveStreamInfoWrapper.class);
		final LiveStreamInfoWrapper wrapper = responseEntity.getBody();

		return wrapper.getLiveStreamInfo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.content.ContentOperations#
	 * addVideoLiveStream(int, int, int, int, int, int, int)
	 */
	@Override
	public LiveStreamInfo addVideoLiveStream(final int id, final int maxSegments, final int width, final int height, final int bitrate, final int audioBitrate,
			final int sampleRate) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Id", "" + id);

		if (maxSegments > 0)
			parameters.add("MaxSegments", "" + maxSegments);

		if (width > 0)
			parameters.add("Width", "" + width);

		if (height > 0)
			parameters.add("Height", "" + height);

		if (bitrate > 0)
			parameters.add("Bitrate", "" + bitrate);

		if (audioBitrate > 0)
			parameters.add("AudioBitrate", "" + audioBitrate);

		if (sampleRate > 0)
			parameters.add("SampleRate", "" + sampleRate);

		final ResponseEntity<LiveStreamInfoWrapper> responseEntity = restTemplate.exchange(buildUri("AddVideoLiveStream", parameters), HttpMethod.GET,
				getRequestEntity(), LiveStreamInfoWrapper.class);
		final LiveStreamInfoWrapper wrapper = responseEntity.getBody();

		return wrapper.getLiveStreamInfo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#downloadFile
	 * (java.lang.String, java.lang.String)
	 */
	@Override
	public boolean downloadFile(final String url, final String storageGroup) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("StorageGroup", storageGroup);
		parameters.add("URL", url);

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("DownloadFile", parameters), HttpMethod.GET, getRequestEntity(), Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getAlbumArt
	 * (int, int, int)
	 */
	@Override
	public byte[] getAlbumArt(final int id, final int width, final int height) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Id", "" + id);

		if (width > 0)
			parameters.add("Width", "" + width);

		if (height > 0)
			parameters.add("Height", "" + height);

		final ResponseEntity<byte[]> responseEntity = restTemplate.exchange(buildUri("GetAlbumArt", parameters), HttpMethod.GET, getRequestEntity(),
				byte[].class);
		final byte[] bytes = responseEntity.getBody();

		return bytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getFile(
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public byte[] getFile(final String storageGroup, final String filename) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("StorageGroup", storageGroup);

		if ((null != filename) && !"".equals(filename))
			parameters.add("FileName", filename);

		final ResponseEntity<byte[]> responseEntity = restTemplate.exchange(buildUri("GetFile", parameters), HttpMethod.GET, getRequestEntity(), byte[].class);
		final byte[] bytes = responseEntity.getBody();

		return bytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getFileList
	 * (java.lang.String)
	 */
	@Override
	public List<String> getFileList(final String storageGroup) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("StorageGroup", storageGroup);

		final ResponseEntity<String[]> responseEntity = restTemplate.exchange(buildUri("GetFileList", parameters), HttpMethod.GET, getRequestEntity(),
				String[].class);
		final List<String> urls = Arrays.asList(responseEntity.getBody());

		return urls;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.content.ContentOperations#
	 * getFilteredLiveStreamList(java.lang.String)
	 */
	@Override
	public List<LiveStreamInfo> getFilteredLiveStreamList(final String filename) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("FileName", filename);

		final ResponseEntity<LiveStreamInfos> responseEntity = restTemplate.exchange(buildUri("GetFilteredLiveStreamList", parameters), HttpMethod.GET,
				getRequestEntity(), LiveStreamInfos.class);
		final LiveStreamInfos liveStreamInfos = responseEntity.getBody();

		return liveStreamInfos.getLiveStreamInfos();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getHash(
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public String getHash(final String storageGroup, final String filename) {
		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("StorageGroup", storageGroup);
		parameters.add("FileName", filename);

		final ResponseEntity<String> responseEntity = restTemplate.exchange(buildUri("GetHash", parameters), HttpMethod.GET, getRequestEntity(), String.class);
		final String hash = responseEntity.getBody();

		return hash;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getImageFile
	 * (java.lang.String, java.lang.String, int, int)
	 */
	@Override
	public byte[] getImageFile(final String storageGroup, final String filename, final int width, final int height) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("StorageGroup", storageGroup);
		parameters.add("FileName", filename);

		if (width > 0)
			parameters.add("Width", "" + width);

		if (height > 0)
			parameters.add("Height", "" + height);

		final ResponseEntity<byte[]> responseEntity = restTemplate.exchange(buildUri("GetImageFile", parameters), HttpMethod.GET, getRequestEntity(),
				byte[].class);
		final byte[] bytes = responseEntity.getBody();

		return bytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getLiveStream
	 * (int)
	 */
	@Override
	public LiveStreamInfo getLiveStream(final int id) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Id", "" + id);

		final ResponseEntity<LiveStreamInfoWrapper> responseEntity = restTemplate.exchange(buildUri("GetLiveStream", parameters), HttpMethod.GET,
				getRequestEntity(), LiveStreamInfoWrapper.class);
		final LiveStreamInfoWrapper wrapper = responseEntity.getBody();

		return wrapper.getLiveStreamInfo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.content.ContentOperations#
	 * getLiveStreamList()
	 */
	@Override
	public List<LiveStreamInfo> getLiveStreamList() {

		final ResponseEntity<LiveStreamInfos> responseEntity = restTemplate.exchange(buildUri("GetLiveStreamList"), HttpMethod.GET, getRequestEntity(),
				LiveStreamInfos.class);
		final LiveStreamInfos liveStreamInfos = responseEntity.getBody();

		return liveStreamInfos.getLiveStreamInfos();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getMusic
	 * (int)
	 */
	@Override
	public byte[] getMusic(final int id) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Id", "" + id);

		final ResponseEntity<byte[]> responseEntity = restTemplate.exchange(buildUri("GetMusic", parameters), HttpMethod.GET, getRequestEntity(), byte[].class);
		final byte[] bytes = responseEntity.getBody();

		return bytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getPreviewImage
	 * (int, java.util.Date, int, int, int)
	 */
	@Override
	public byte[] getPreviewImage(final int channelId, final Date startTime, final int width, final int height, final int secondsIn) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);
		parameters.add("StartTime", AbstractMythApiOperations.sdf.format(startTime));

		if (width > 0)
			parameters.add("Width", "" + width);

		if (height > 0)
			parameters.add("Height", "" + height);

		if (secondsIn > 0)
			parameters.add("SecsIn", "" + secondsIn);

		final ResponseEntity<byte[]> responseEntity = restTemplate.exchange(buildUri("GetPreviewImage", parameters), HttpMethod.GET, getRequestEntity(),
				byte[].class);
		final byte[] bytes = responseEntity.getBody();

		return bytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.content.ContentOperations#
	 * getProgramArtworkList(java.lang.String, int)
	 */
	@Override
	public List<ArtworkInfo> getProgramArtworkList(final String inetRef, final int season) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Inetref", inetRef);

		if (season > 0)
			parameters.add("Season", "" + season);

		final ResponseEntity<ArtworkInfos> responseEntity = restTemplate.exchange(buildUri("GetProgramArtwork", parameters), HttpMethod.GET,
				getRequestEntity(), ArtworkInfos.class);
		final ArtworkInfos artworkInfos = responseEntity.getBody();

		return artworkInfos.getArtworkInfos();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getRecording
	 * (int, java.util.Date)
	 */
	@Override
	public byte[] getRecording(final int channelId, final Date startTime) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);
		parameters.add("StartTime", AbstractMythApiOperations.sdf.format(startTime));

		final ResponseEntity<byte[]> responseEntity = restTemplate.exchange(buildUri("GetRecording", parameters), HttpMethod.GET, getRequestEntity(),
				byte[].class);
		final byte[] bytes = responseEntity.getBody();

		return bytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.content.ContentOperations#
	 * getRecordingArtwork(java.lang.String, java.lang.String, int, int, int)
	 */
	@Override
	public byte[] getRecordingArtwork(final String type, final String inetRef, final int season, final int width, final int height) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Inetref", inetRef);

		if ((null != type) && !"".equals(type))
			parameters.add("Type", type);

		if (season > 0)
			parameters.add("Season", "" + season);

		if (width > 0)
			parameters.add("Width", "" + width);

		if (height > 0)
			parameters.add("Height", "" + height);

		final ResponseEntity<byte[]> responseEntity = restTemplate.exchange(buildUri("GetRecordingArtwork", parameters), HttpMethod.GET, getRequestEntity(),
				byte[].class);
		final byte[] bytes = responseEntity.getBody();

		return bytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.content.ContentOperations#
	 * getRecordingArtworkList(int, java.util.Date)
	 */
	@Override
	public List<ArtworkInfo> getRecordingArtworkList(final int channelId, final Date startTime) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);
		parameters.add("StartTime", AbstractMythApiOperations.sdf.format(startTime));

		final ResponseEntity<ArtworkInfos> responseEntity = restTemplate.exchange(buildUri("GetRecordingArtworkList", parameters), HttpMethod.GET,
				getRequestEntity(), ArtworkInfos.class);
		final ArtworkInfos artworkInfos = responseEntity.getBody();

		return artworkInfos.getArtworkInfos();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getVideo
	 * (int)
	 */
	@Override
	public byte[] getVideo(final int id) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Id", "" + id);

		final ResponseEntity<byte[]> responseEntity = restTemplate.exchange(buildUri("GetVideo", parameters), HttpMethod.GET, getRequestEntity(), byte[].class);
		final byte[] bytes = responseEntity.getBody();

		return bytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#getVideoArtwork
	 * (java.lang.String, int, int, int)
	 */
	@Override
	public byte[] getVideoArtwork(final String type, final int id, final int width, final int height) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Id", "" + id);

		if ((null != type) && !"".equals(type))
			parameters.add("Type", type);

		if (width > 0)
			parameters.add("Width", "" + width);

		if (height > 0)
			parameters.add("Height", "" + height);

		final ResponseEntity<byte[]> responseEntity = restTemplate.exchange(buildUri("GetVideoArtwork", parameters), HttpMethod.GET, getRequestEntity(),
				byte[].class);
		final byte[] bytes = responseEntity.getBody();

		return bytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#removeLiveStream
	 * (int)
	 */
	@Override
	public boolean removeLiveStream(final int id) {

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("RemoveLiveStream", "Id", "" + id), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.content.ContentOperations#stopLiveStream
	 * (int)
	 */
	@Override
	public LiveStreamInfo stopLiveStream(final int id) {

		final ResponseEntity<LiveStreamInfo> responseEntity = restTemplate.exchange(buildUri("StopLiveStream", "Id", "" + id), HttpMethod.GET,
				getRequestEntity(), LiveStreamInfo.class);
		final LiveStreamInfo liveStreamInfo = responseEntity.getBody();

		return liveStreamInfo;
	}

}
