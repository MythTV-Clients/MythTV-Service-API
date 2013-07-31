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
package org.mythtv.services.api.v026;

import org.joda.time.DateTime;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.beans.ArtworkInfoList;
import org.mythtv.services.api.v026.beans.ArtworkInfos;
import org.mythtv.services.api.v026.beans.LiveStreamInfo;
import org.mythtv.services.api.v026.beans.LiveStreamInfoWrapper;
import org.mythtv.services.api.v026.beans.LiveStreamInfos;
import org.springframework.http.ResponseEntity;

public interface ContentOperations {

	/**
	 * - GET
	 * 
	 * @param storageGroup
	 * @param filename
	 * @param hostname
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @return
	 */
	ResponseEntity<LiveStreamInfoWrapper> addLiveStream( String storageGroup, String filename, String hostname, int maxSegments, int width, int height, int bitrate, int audioBitrate, int sampleRate ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @return
	 */
	ResponseEntity<LiveStreamInfoWrapper> addRecordingLiveStream( int channelId, DateTime startTime, int maxSegments, int width, int height, int bitrate, int audioBitrate, int sampleRate ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param id
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @return
	 */
	ResponseEntity<LiveStreamInfoWrapper> addVideoLiveStream( int id, int maxSegments, int width, int height, int bitrate, int audioBitrate, int sampleRate ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param url
	 * @param storageGroup
	 * @return
	 */
	ResponseEntity<Bool> downloadFile( String url, String storageGroup, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param id
	 * @param width
	 * @param height
	 * @return
	 */
	ResponseEntity<byte[]> getAlbumArt( int id, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param storageGroup
	 * @param filename
	 * @return
	 */
	ResponseEntity<byte[]> getFile( String storageGroup, String filename, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param storageGroup
	 * @return
	 */
	ResponseEntity<StringList> getFileList( String storageGroup, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param filename
	 * @return
	 */
	ResponseEntity<LiveStreamInfos> getFilteredLiveStreamList( String filename, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param storageGroup
	 * @param filename
	 * @return
	 */
	ResponseEntity<String> getHash( String storageGroup, String filename, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param storageGroup
	 * @param filename
	 * @param width
	 * @param height
	 * @return
	 */
	ResponseEntity<byte[]> getImageFile( String storageGroup, String filename, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param id
	 * @return
	 */
	ResponseEntity<LiveStreamInfoWrapper> getLiveStream( int id, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<LiveStreamInfos> getLiveStreamList( ETagInfo etag ) throws MythServiceApiRuntimeException;

	/**
	 * - GET
	 * 
	 * @param id
	 * @return
	 */
	ResponseEntity<byte[]> getMusic( int id, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @param width
	 * @param height
	 * @param secondsIn
	 * @return
	 */
	ResponseEntity<byte[]> getPreviewImage( int channelId, DateTime startTime, int width, int height, int secondsIn, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param inetRef
	 * @param season
	 * @return
	 */
	ResponseEntity<ArtworkInfos> getProgramArtworkList( String inetRef, int season, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	ResponseEntity<byte[]> getRecording( int channelId, DateTime startTime, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param type
	 * @param inetRef
	 * @param season
	 * @param width
	 * @param height
	 * @return
	 */
	ResponseEntity<byte[]> getRecordingArtwork( String type, String inetRef, int season, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	ResponseEntity<ArtworkInfoList> getRecordingArtworkList( int channelId, DateTime startTime, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param id
	 * @return
	 */
	ResponseEntity<byte[]> getVideo( int id, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param type
	 * @param id
	 * @param width
	 * @param height
	 * @return
	 */
	ResponseEntity<byte[]> getVideoArtwork( String type, int id, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param id
	 * @return
	 */
	ResponseEntity<Bool> removeLiveStream( int id ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param id
	 * @return
	 */
	ResponseEntity<LiveStreamInfo> stopLiveStream( int id ) throws MythServiceApiRuntimeException;
	
}
