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
import org.mythtv.services.api.v026.beans.Program;
import org.mythtv.services.api.v026.beans.ProgramGuide;
import org.springframework.http.ResponseEntity;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface GuideOperations {

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param width
	 * @param height
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getChannelIcon(Integer chanId, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return ResponseEntity<Program>
	 */
	ResponseEntity<Program> getProgramDetails(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param startTime
	 * @param endTime
	 * @param startChanId
	 * @param numChannels
	 * @param details
	 * @param etagInfo
	 * @return ResponseEntity<ProgramGuide>
	 */
	ResponseEntity<ProgramGuide> getProgramGuide(org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, Integer startChanId, Integer numChannels, Boolean details, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

}