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
package com.masdaussel.mythtv.services.api.guide;

import java.util.Date;

import org.springframework.http.ResponseEntity;

import com.masdaussel.mythtv.services.api.dvr.Program;

/**
 * @author sebastien
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
	String getChannelIcon(int channelId, int width, int height);

	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	Program getProgramDetails(int channelId, Date startTime);

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
	ProgramGuideWrapper getProgramGuide(Date start, Date end, int startChannelId, int numberOfChannels, boolean details);

	/**
	 * @param start
	 * @param end
	 * @param startChannelId
	 * @param numberOfChannels
	 * @param details
	 * @return
	 */
	ResponseEntity<ProgramGuideWrapper> getProgramGuideResponseEntity(Date start, Date end, int startChannelId, int numberOfChannels, boolean details);

}
