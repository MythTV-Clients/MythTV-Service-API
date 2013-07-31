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
import org.mythtv.services.api.v026.beans.ProgramGuideWrapper;
import org.mythtv.services.api.v026.beans.ProgramWrapper;
import org.springframework.http.ResponseEntity;

/**
 * @author Daniel Frey
 *
 */
public interface GuideOperations {

	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param width
	 * @param height
	 * @return
	 */
	ResponseEntity<String> getChannelIcon( int channelId, int width, int height, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	ResponseEntity<ProgramWrapper> getProgramDetails( int channelId, DateTime startTime, ETagInfo etag ) throws MythServiceApiRuntimeException;

	/**
	 * - GET
	 * 
	 * @param start
	 * @param end
	 * @param startChannelId
	 * @param numberOfChannels
	 * @param details
	 * @return
	 */
	ResponseEntity<ProgramGuideWrapper> getProgramGuide( DateTime start, DateTime end, int startChannelId, int numberOfChannels, boolean details, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
}
