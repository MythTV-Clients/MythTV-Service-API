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

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.beans.BlurayInfoWrapper;
import org.mythtv.services.api.v026.beans.VideoLookupList;
import org.mythtv.services.api.v026.beans.VideoMetaDataInfoWrapper;
import org.mythtv.services.api.v026.beans.VideoMetadataInfoList;
import org.springframework.http.ResponseEntity;

/**
 * @author Daniel Frey
 *
 */
public interface VideoOperations {

	/**
	 * - POST
	 * 
	 * @param filename
	 * @param hostname
	 * @return
	 */
	ResponseEntity<Bool> addVideo( String filename, String hostname ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param path
	 * @return
	 */
	ResponseEntity<BlurayInfoWrapper> getBluray( String path, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param id
	 * @return
	 */
	ResponseEntity<VideoMetaDataInfoWrapper> getVideo( int id, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param filename
	 * @return
	 */
	ResponseEntity<VideoMetaDataInfoWrapper> getVideoByFilename( String filename, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param descending
	 * @param startIndex
	 * @param count
	 * @return
	 */
	ResponseEntity<VideoMetadataInfoList> getVideoList( boolean descending, int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param title
	 * @param subtitle
	 * @param inetRef
	 * @param season
	 * @param episode
	 * @param grabberType
	 * @param allowGeneric
	 * @return
	 */
	ResponseEntity<VideoLookupList> lookupVideo( String title, String subtitle, String inetRef, int season, int episode, String grabberType, boolean allowGeneric, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param id
	 * @return
	 */
	ResponseEntity<Bool> removeVideoFromDatabase( int id ) throws MythServiceApiRuntimeException;
	
}
