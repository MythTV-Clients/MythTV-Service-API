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
package org.mythtv.services.api.guide;

import org.joda.time.DateTime;
import org.mythtv.services.api.MythServiceApiRuntimeException;
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
	String getChannelIcon( int channelId, int width, int height ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	ProgramWrapper getProgramDetails( int channelId, DateTime startTime ) throws MythServiceApiRuntimeException;

	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	ResponseEntity<ProgramWrapper> getProgramResponseEntity( int channelId, DateTime startTime ) throws MythServiceApiRuntimeException;

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
	ProgramGuideWrapper getProgramGuide( DateTime start, DateTime end, int startChannelId, int numberOfChannels, boolean details ) throws MythServiceApiRuntimeException;
	
	/**
	 * @param start
	 * @param end
	 * @param startChannelId
	 * @param numberOfChannels
	 * @param details
	 * @return
	 */
	ResponseEntity<ProgramGuideWrapper> getProgramGuideResponseEntity( DateTime start, DateTime end, int startChannelId, int numberOfChannels, boolean details ) throws MythServiceApiRuntimeException;

}
