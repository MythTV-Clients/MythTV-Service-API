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
package org.mythtv.services.api.frontend;

import org.joda.time.DateTime;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.springframework.http.ResponseEntity;

/**
 * @author Daniel Frey
 *
 */
public interface FrontendOperations {

	/**
	 * - GET
	 * 
	 * @param frontedApiUrlBase
	 * @return
	 */
	ResponseEntity<FrontendStatus> getStatus( String frontedApiUrlBase, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param frontedApiUrlBase
	 * @param message
	 * @return
	 */
	ResponseEntity<Bool> sendMessage( String frontedApiUrlBase, String message ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param frontedApiUrlBase
	 * @param action
	 * @param file
	 * @param width
	 * @param height
	 * @return
	 */
	ResponseEntity<Bool> sendAction( String frontedApiUrlBase, String action, String file, int width, int height ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param frontedApiUrlBase
	 * @return
	 */
	ResponseEntity<FrontendActionList> getActionList( String frontedApiUrlBase, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * 
	 * - GET
	 * 
	 * @param frontedApiUrlBase
	 * @param channelId - (Required) The database channel id for the recording
	 * @param startTime - (Required) The recording start time for the item. This should be in MySQL ISO format, eg: 2011-08-29 18:59:00. You can replace the space with %20 or T.
	 * @return
	 * @throws MythServiceApiRuntimeException
	 */
	ResponseEntity<Bool> playRecording(String frontedApiUrlBase, Long channelId, DateTime startTime) throws MythServiceApiRuntimeException;
	
	/**
	 * 
	 * @param frontedApiUrlBase
	 * @param id - (Required) The database id for the video file
	 * @param useBookmark - (Optional) Pass 1 to resume playback at a bookmark
	 * @return
	 * @throws MythServiceApiRuntimeException
	 */
	ResponseEntity<Bool> playVideo(String frontedApiUrlBase, String id, boolean useBookmark) throws MythServiceApiRuntimeException;
}
