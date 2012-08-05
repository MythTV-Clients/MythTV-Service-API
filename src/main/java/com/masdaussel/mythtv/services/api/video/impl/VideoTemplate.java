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
package com.masdaussel.mythtv.services.api.video.impl;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.masdaussel.mythtv.services.api.utils.Bool;
import com.masdaussel.mythtv.services.api.video.BlurayInfo;
import com.masdaussel.mythtv.services.api.video.VideoLookup;
import com.masdaussel.mythtv.services.api.video.VideoLookupList;
import com.masdaussel.mythtv.services.api.video.VideoMetadataInfo;
import com.masdaussel.mythtv.services.api.video.VideoMetadataInfoList;
import com.masdaussel.mythtv.services.api.video.VideoOperations;

/**
 * @author sebastien
 * 
 */
public class VideoTemplate extends AbstractVideoOperations implements VideoOperations {

	private final RestTemplate	restTemplate;

	public VideoTemplate(final RestTemplate restTemplate, final String apiUrlBase) {
		super(apiUrlBase);
		this.restTemplate = restTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.video.VideoOperations#addVideo(java
	 * .lang.String, java.lang.String)
	 */
	@Override
	public boolean addVideo(final String filename, final String hostname) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("FileName", filename);
		parameters.add("HostName", hostname);

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("AddVideo", parameters), HttpMethod.GET, getRequestEntity(), Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.video.VideoOperations#getBluray(java
	 * .lang.String)
	 */
	@Override
	public BlurayInfo getBluray(final String path) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Path", path);

		final ResponseEntity<BlurayInfo> responseEntity = restTemplate.exchange(buildUri("GetBluray", parameters), HttpMethod.GET, getRequestEntity(),
				BlurayInfo.class);
		final BlurayInfo blurayInfo = responseEntity.getBody();

		return blurayInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.video.VideoOperations#getVideByFilename
	 * (java.lang.String)
	 */
	@Override
	public VideoMetadataInfo getVideByFilename(final String filename) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("FileName", filename);

		final ResponseEntity<VideoMetadataInfo> responseEntity = restTemplate.exchange(buildUri("GetVideoByFileName", parameters), HttpMethod.GET,
				getRequestEntity(), VideoMetadataInfo.class);
		final VideoMetadataInfo videoMetadataInfo = responseEntity.getBody();

		return videoMetadataInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.video.VideoOperations#getVideo(int)
	 */
	@Override
	public VideoMetadataInfo getVideo(final int id) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Id", "" + id);

		final ResponseEntity<VideoMetadataInfo> responseEntity = restTemplate.exchange(buildUri("GetVideoList", parameters), HttpMethod.GET,
				getRequestEntity(), VideoMetadataInfo.class);
		final VideoMetadataInfo videoMetadataInfo = responseEntity.getBody();

		return videoMetadataInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.video.VideoOperations#getVideoList
	 * (boolean, int, int)
	 */
	@Override
	public List<VideoMetadataInfo> getVideoList(final boolean descending, final int startIndex, final int count) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Descending", Boolean.toString(descending));

		if (startIndex > 0)
			parameters.add("StartIndex", "" + startIndex);

		if (count > 0)
			parameters.add("Count", "" + count);

		final ResponseEntity<VideoMetadataInfoList> responseEntity = restTemplate.exchange(buildUri("GetVideoList", parameters), HttpMethod.GET,
				getRequestEntity(), VideoMetadataInfoList.class);
		final VideoMetadataInfoList videoMetadataInfoList = responseEntity.getBody();

		return videoMetadataInfoList.getVideoMetadataInfos().getVideoMetadataInfos();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.video.VideoOperations#lookupVideo(
	 * java.lang.String, java.lang.String, java.lang.String, int, int,
	 * java.lang.String, boolean)
	 */
	@Override
	public List<VideoLookup> lookupVideo(final String title, final String subtitle, final String inetRef, final int season, final int episode,
			final String grabberType, final boolean allowGeneric) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Title", title);

		if ((null != subtitle) && !"".equals(subtitle))
			parameters.add("Subtitle", subtitle);

		if ((null != inetRef) && !"".equals(inetRef))
			parameters.add("Inetref", inetRef);

		if (season > 0)
			parameters.add("Season", "" + season);

		if (episode > 0)
			parameters.add("Episode", "" + episode);

		final ResponseEntity<VideoLookupList> responseEntity = restTemplate.exchange(buildUri("LookupVideo", parameters), HttpMethod.GET, getRequestEntity(),
				VideoLookupList.class);
		final VideoLookupList videoLookupList = responseEntity.getBody();

		return videoLookupList.getVideoLookups().getVideoLookups();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.video.VideoOperations#
	 * removeVideoFromDatabase(int)
	 */
	@Override
	public boolean removeVideoFromDatabase(final int id) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Id", "" + id);

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("RemoveVideoFromDB", parameters), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

}
