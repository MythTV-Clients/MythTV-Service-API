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
package org.mythtv.services.api.v028;

import org.mythtv.services.api.ArrayOfString;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v028.beans.ArtworkInfoList;
import org.mythtv.services.api.v028.beans.LiveStreamInfo;
import org.mythtv.services.api.v028.beans.LiveStreamInfoList;
import org.springframework.http.ResponseEntity;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface ContentOperations {

	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param fileName
	 * @param hostName
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @param etagInfo
	 * @return ResponseEntity<LiveStreamInfo>
	 */
	ResponseEntity<LiveStreamInfo> addLiveStream(String storageGroup, String fileName, String hostName, Integer maxSegments, Integer width, Integer height, Integer bitrate, Integer audioBitrate, Integer sampleRate, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @param etagInfo
	 * @return ResponseEntity<LiveStreamInfo>
	 */
	ResponseEntity<LiveStreamInfo> addRecordingLiveStream(Integer chanId, org.joda.time.DateTime startTime, Integer maxSegments, Integer width, Integer height, Integer bitrate, Integer audioBitrate, Integer sampleRate, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param id
	 * @param maxSegments
	 * @param width
	 * @param height
	 * @param bitrate
	 * @param audioBitrate
	 * @param sampleRate
	 * @param etagInfo
	 * @return ResponseEntity<LiveStreamInfo>
	 */
	ResponseEntity<LiveStreamInfo> addVideoLiveStream(Integer id, Integer maxSegments, Integer width, Integer height, Integer bitrate, Integer audioBitrate, Integer sampleRate, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param uRL
	 * @param storageGroup
	 * @return ResponseEntity<Bool>
	 */
	ResponseEntity<Bool> downloadFile(String uRL, String storageGroup) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param id
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getAlbumArt(Integer id, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param fileName
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getFile(String storageGroup, String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param etagInfo
	 * @return ResponseEntity<ArrayOfString>
	 */
	ResponseEntity<ArrayOfString> getFileList(String storageGroup, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param fileName
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getHash(String storageGroup, String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param storageGroup
	 * @param fileName
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getImageFile(String storageGroup, String fileName, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return ResponseEntity<LiveStreamInfo>
	 */
	ResponseEntity<LiveStreamInfo> getLiveStream(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param fileName
	 * @param etagInfo
	 * @return ResponseEntity<LiveStreamInfoList>
	 */
	ResponseEntity<LiveStreamInfoList> getLiveStreamList(String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getMusic(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param width
	 * @param height
	 * @param secsIn
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getPreviewImage(Integer chanId, org.joda.time.DateTime startTime, Integer width, Integer height, Integer secsIn, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param inetref
	 * @param season
	 * @param etagInfo
	 * @return ResponseEntity<ArtworkInfoList>
	 */
	ResponseEntity<ArtworkInfoList> getProgramArtworkList(String inetref, Integer season, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getRecording(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param type
	 * @param inetref
	 * @param season
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getRecordingArtwork(String type, String inetref, Integer season, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return ResponseEntity<ArtworkInfoList>
	 */
	ResponseEntity<ArtworkInfoList> getRecordingArtworkList(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getVideo(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param type
	 * @param id
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getVideoArtwork(String type, Integer id, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return ResponseEntity<Bool>
	 */
	ResponseEntity<Bool> removeLiveStream(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return ResponseEntity<LiveStreamInfo>
	 */
	ResponseEntity<LiveStreamInfo> stopLiveStream(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

}