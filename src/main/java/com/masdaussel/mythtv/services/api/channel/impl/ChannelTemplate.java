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
package com.masdaussel.mythtv.services.api.channel.impl;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.masdaussel.mythtv.services.api.channel.ChannelInfo;
import com.masdaussel.mythtv.services.api.channel.ChannelInfoList;
import com.masdaussel.mythtv.services.api.channel.ChannelOperations;
import com.masdaussel.mythtv.services.api.channel.LineupList;
import com.masdaussel.mythtv.services.api.channel.VideoMultiplex;
import com.masdaussel.mythtv.services.api.channel.VideoSource;

/**
 * @author sebastien
 * 
 */
public class ChannelTemplate extends AbstractChannelOperations implements ChannelOperations {

	private final RestTemplate	restTemplate;

	public ChannelTemplate(final RestTemplate restTemplate, final String apiUrlBase) {
		super(apiUrlBase);
		this.restTemplate = restTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.channel.ChannelOperations#addDBChannel
	 * (int, int, int, java.lang.String, java.lang.String, java.lang.String,
	 * int, int, int, boolean, boolean, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addDBChannel(final int multiplexId, final int sourceId, final int channelId, final String callSign, final String channelName,
			final String channelNumber, final int serviceId, final int atscMajorChannel, final int atscMinorChannel, final boolean userEIT,
			final boolean visible, final String frequencyId, final String icon, final String format, final String xmltvId, final String defaultAuthority) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.channel.ChannelOperations#addVideoSource
	 * (java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, boolean, java.lang.String, int)
	 */
	@Override
	public int addVideoSource(final String sourceName, final String grabber, final String userId, final String frequencyTable, final String lineupId,
			final String password, final boolean useEit, final String configPath, final int nitId) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * fetchChannelsFromSource(int, int, boolean)
	 */
	@Override
	public int fetchChannelsFromSource(final int sourceId, final int cardId, final boolean waitForFinish) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.channel.ChannelOperations#getChannelInfo
	 * (int)
	 */
	@Override
	public ChannelInfo getChannelInfo(final int channelId) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);

		final ResponseEntity<ChannelInfo> responseEntity = restTemplate.exchange(buildUri("GetChannelInfo", parameters), HttpMethod.GET, getRequestEntity(),
				ChannelInfo.class);
		final ChannelInfo channelInfo = responseEntity.getBody();

		return channelInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * getChannelInfoList()
	 */
	@Override
	public List<ChannelInfo> getChannelInfoList() {

		final ResponseEntity<ChannelInfoList> responseEntity = getChannelInfoListResponseEntity();
		final ChannelInfoList channelInfoList = responseEntity.getBody();

		return channelInfoList.getChannelInfos().getChannelInfos();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * getChannelInfoList(int, int, int)
	 */
	@Override
	public List<ChannelInfo> getChannelInfoList(final int sourceId, final int startIndex, final int count) {

		final ResponseEntity<ChannelInfoList> responseEntity = getChannelInfoListResponseEntity(sourceId, startIndex, count);
		final ChannelInfoList channelInfoList = responseEntity.getBody();

		return channelInfoList.getChannelInfos().getChannelInfos();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * getChannelInfoListResponseEntity()
	 */
	@Override
	public ResponseEntity<ChannelInfoList> getChannelInfoListResponseEntity() {
		return restTemplate.exchange(buildUri("GetChannelInfoList"), HttpMethod.GET, getRequestEntity(), ChannelInfoList.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * getChannelInfoListResponseEntity(int, int, int)
	 */
	@Override
	public ResponseEntity<ChannelInfoList> getChannelInfoListResponseEntity(final int sourceId, final int startIndex, final int count) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (sourceId > 0)
			parameters.add("SourceId", "" + sourceId);

		if (startIndex > 0)
			parameters.add("StartIndex", "" + startIndex);

		if (count > 0)
			parameters.add("Count", "" + count);

		return restTemplate.exchange(buildUri("GetChannelInfoList", parameters), HttpMethod.GET, getRequestEntity(), ChannelInfoList.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.channel.ChannelOperations#getDDLineupList
	 * (java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<LineupList> getDDLineupList(final String source, final String userId, final String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * getVideoMultiplex(int)
	 */
	@Override
	public VideoMultiplex getVideoMultiplex(final int multiplexId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * getVideoMultiplexList(int, int, int)
	 */
	@Override
	public List<VideoMultiplex> getVideoMultiplexList(final int sourceId, final int startIndex, final int count) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.channel.ChannelOperations#getVideoSource
	 * (int)
	 */
	@Override
	public VideoSource getVideoSource(final int sourceId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * getVideoSourceList()
	 */
	@Override
	public List<VideoSource> getVideoSourceList() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.channel.ChannelOperations#getXmltvIdList
	 * (int)
	 */
	@Override
	public List<String> getXmltvIdList(final int sourceId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * removeVideoSource(int)
	 */
	@Override
	public boolean removeVideoSource(final int sourceId) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.channel.ChannelOperations#reomveDBChannel
	 * (int)
	 */
	@Override
	public boolean reomveDBChannel(final int channelId) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.channel.ChannelOperations#updateDBChannel
	 * (int, int, int, java.lang.String, java.lang.String, java.lang.String,
	 * int, int, int, boolean, boolean, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean updateDBChannel(final int multiplexId, final int sourceId, final int channelId, final String callSign, final String channelName,
			final String channelNumber, final int serviceId, final int atscMajorChannel, final int atscMinorChannel, final boolean useEIT,
			final boolean visible, final String frequencyId, final String icon, final String format, final String xmltvId, final String defaultAuthority) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.channel.ChannelOperations#
	 * updateVideoSource(int, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * boolean, java.lang.String, int)
	 */
	@Override
	public boolean updateVideoSource(final int sourceId, final String sourceName, final String grabber, final String userId, final String frequencyTable,
			final String lineupId, final String password, final boolean userEIT, final String configPath, final int nitId) {
		// TODO Auto-generated method stub
		return false;
	}

}
