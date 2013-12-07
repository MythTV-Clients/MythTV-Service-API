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

import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.beans.BlurayInfo;
import org.mythtv.services.api.v026.beans.VideoLookupList;
import org.mythtv.services.api.v026.beans.VideoMetadataInfo;
import org.mythtv.services.api.v026.beans.VideoMetadataInfoList;
import org.springframework.http.ResponseEntity;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface VideoOperations {

	/*
	 * POST method
	 *
	 * @param fileName
	 * @param hostName
	 * @return ResponseEntity<Bool>
	 */
	ResponseEntity<Bool> addVideo(String fileName, String hostName) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param path
	 * @param etagInfo
	 * @return ResponseEntity<BlurayInfo>
	 */
	ResponseEntity<BlurayInfo> getBluray(String path, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param id
	 * @param etagInfo
	 * @return ResponseEntity<VideoMetadataInfo>
	 */
	ResponseEntity<VideoMetadataInfo> getVideo(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param fileName
	 * @param etagInfo
	 * @return ResponseEntity<VideoMetadataInfo>
	 */
	ResponseEntity<VideoMetadataInfo> getVideoByFileName(String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param descending
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @return ResponseEntity<VideoMetadataInfoList>
	 */
	ResponseEntity<VideoMetadataInfoList> getVideoList(Boolean descending, Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param title
	 * @param subtitle
	 * @param inetref
	 * @param season
	 * @param episode
	 * @param grabberType
	 * @param allowGeneric
	 * @param etagInfo
	 * @return ResponseEntity<VideoLookupList>
	 */
	ResponseEntity<VideoLookupList> lookupVideo(String title, String subtitle, String inetref, Integer season, Integer episode, String grabberType, Boolean allowGeneric, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param id
	 * @return ResponseEntity<Bool>
	 */
	ResponseEntity<Bool> removeVideoFromDB(Integer id) throws MythServiceApiRuntimeException;

}