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
package org.mythtv.services.api.channel;

import java.util.List;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.springframework.http.ResponseEntity;

/**
 * @author Daniel Frey
 *
 */
public interface ChannelOperations {

	/** 
	 * - POST
	 * 
	 * @param multiplexId
	 * @param sourceId
	 * @param channelId
	 * @param callSign
	 * @param channelName
	 * @param channelNumber
	 * @param serviceId
	 * @param atscMajorChannel
	 * @param atscMinorChannel
	 * @param userEIT
	 * @param visible
	 * @param frequencyId
	 * @param icon
	 * @param format
	 * @param xmltvId
	 * @param defaultAuthority
	 * @return
	 */
	boolean addDBChannel( int multiplexId, int sourceId, int channelId, String callSign, String channelName, String channelNumber, int serviceId, int atscMajorChannel, int atscMinorChannel, boolean userEIT, boolean visible, String frequencyId, String icon, String format, String xmltvId, String defaultAuthority ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param sourceName
	 * @param grabber
	 * @param userId
	 * @param frequencyTable
	 * @param lineupId
	 * @param password
	 * @param useEit
	 * @param configPath
	 * @param nitId
	 * @return
	 */
	int addVideoSource( String sourceName, String grabber, String userId, String frequencyTable, String lineupId, String password, boolean useEit, String configPath, int nitId ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param sourceId
	 * @param cardId
	 * @param waitForFinish
	 * @return
	 */
	int fetchChannelsFromSource( int sourceId, int cardId, boolean waitForFinish, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @return
	 */
	ChannelInfoWrapper getChannelInfo( int channelId, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param sourceId
	 * @param startIndex
	 * @param count
	 * @return
	 */
	List<ChannelInfo> getChannelInfoList( int sourceId, int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException;

	/**
	 * @param sourceId
	 * @param startIndex
	 * @param count
	 * @return
	 */
	ResponseEntity<ChannelInfoList> getChannelInfoListResponseEntity( int sourceId, int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException;

	/**
	 * @return
	 */
	List<ChannelInfo> getChannelInfoList( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * @return
	 */
	ResponseEntity<ChannelInfoList> getChannelInfoListResponseEntity( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param source
	 * @param userId
	 * @param password
	 * @return
	 */
	List<Lineup> getDDLineupList( String source, String userId, String password, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param multiplexId
	 * @return
	 */
	VideoMultiplexWrapper getVideoMultiplex( int multiplexId, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param sourceId
	 * @param startIndex
	 * @param count
	 * @return
	 */
	List<VideoMultiplex> getVideoMultiplexList( int sourceId, int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param sourceId
	 * @return
	 */
	VideoSourceWrapper getVideoSource( int sourceId, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	List<VideoSource> getVideoSourceList( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param sourceId
	 * @return
	 */
	List<String> getXmltvIdList( int sourceId, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param channelId
	 * @return
	 */
	boolean removeDBChannel( int channelId ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param sourceId
	 * @return
	 */
	boolean removeVideoSource( int sourceId ) throws MythServiceApiRuntimeException;

	/**
	 * - POST
	 * 
	 * @param multiplexId
	 * @param sourceId
	 * @param channelId
	 * @param callSign
	 * @param channelName
	 * @param channelNumber
	 * @param serviceId
	 * @param atscMajorChannel
	 * @param atscMinorChannel
	 * @param useEIT
	 * @param visible
	 * @param frequencyId
	 * @param icon
	 * @param format
	 * @param xmltvId
	 * @param defaultAuthority
	 * @return
	 */
	boolean updateDBChannel( int multiplexId, int sourceId, int channelId, String callSign, String channelName, String channelNumber, int serviceId, int atscMajorChannel, int atscMinorChannel, boolean useEIT, boolean visible, String frequencyId, String icon, String format, String xmltvId, String defaultAuthority ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param sourceId
	 * @param sourceName
	 * @param grabber
	 * @param userId
	 * @param frequencyTable
	 * @param lineupId
	 * @param password
	 * @param userEIT
	 * @param configPath
	 * @param nitId
	 * @return
	 */
	boolean updateVideoSource( int sourceId, String sourceName, String grabber, String userId, String frequencyTable, String lineupId, String password, boolean userEIT, String configPath, int nitId ) throws MythServiceApiRuntimeException;
	
}
