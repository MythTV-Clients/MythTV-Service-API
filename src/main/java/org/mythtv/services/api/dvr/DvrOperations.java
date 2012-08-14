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
package org.mythtv.services.api.dvr;

import java.util.List;

import org.joda.time.DateTime;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.springframework.http.ResponseEntity;

/**
 * @author Daniel Frey
 *
 */
public interface DvrOperations {

	/**
	 * - POST
	 * 
	 * @param channelId
	 * @param startTime
	 * @param parentId
	 * @param interactive
	 * @param season
	 * @param episode
	 * @param inetRef
	 * @param findId
	 * @param type
	 * @param searchType
	 * @param recordingPriority
	 * @param perferredInput
	 * @param startOffset
	 * @param endOffset
	 * @param duplicateMethod
	 * @param duplicateIn
	 * @param filter
	 * @param recordingProfile
	 * @param recordingGroup
	 * @param storageGroup
	 * @param playGroup
	 * @param autoExpire
	 * @param maxEpisodes
	 * @param maxNewest
	 * @param autoCommercialFlag
	 * @param autoTranscode
	 * @param autoMetadataLookup
	 * @param autoUserJob1
	 * @param autoUserJob2
	 * @param autoUserJob3
	 * @param autoUserJob4
	 * @param transcoder
	 * @return
	 */
	int addRecordingSchedule( int channelId, DateTime startTime, int parentId, boolean interactive, int season, int episode, String inetRef, int findId, String type, String searchType, int recordingPriority, int perferredInput, int startOffset, int endOffset, String duplicateMethod, String duplicateIn, int filter, String recordingProfile, String recordingGroup, String storageGroup, String playGroup, boolean autoExpire, int maxEpisodes, boolean maxNewest, boolean autoCommercialFlag, boolean autoTranscode, boolean autoMetadataLookup, boolean autoUserJob1, boolean autoUserJob2, boolean autoUserJob3, boolean autoUserJob4, int transcoder ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param recordingId
	 * @return
	 */
	boolean disableRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param recordingId
	 * @return
	 */
	boolean enableRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @return
	 */
	List<Program> getConflictList( int startIndex, int count ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	List<Encoder> getEncoderList() throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @return
	 */
	List<Program> getExpiringList( int startIndex, int count ) throws MythServiceApiRuntimeException;

	/**
	 * - GET
	 * 
	 * @param descending
	 * @param startIndex
	 * @param count
	 * @param titleRegEx
	 * @param recordingGroup
	 * @param storageGroup
	 * @return
	 */
	List<Program> getFiltererRecordedList( boolean descending, int startIndex, int count, String titleRegEx, String recordingGroup, String storageGroup ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param recordId
	 * @return
	 */
	RecRule getRecordSchedule( int recordId ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @return
	 */
	List<RecRule> getRecordScheduleList( int startIndex, int count ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	Program getRecorded( int channelId, DateTime startTime ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	List<Program> getRecordedList() throws MythServiceApiRuntimeException;

	/**
	 * @return
	 */
	ResponseEntity<ProgramList> getRecordedListResponseEntity() throws MythServiceApiRuntimeException;

	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @param descending
	 * @return
	 */
	List<Program> getRecordedList( int startIndex, int count, boolean descending ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @param showAll
	 * @return
	 */
	List<Program> getUpcomingList( int startIndex, int count, boolean showAll ) throws MythServiceApiRuntimeException;
	
	/**
	 * @return
	 */
	ResponseEntity<ProgramList> getUpcomingListResponseEntity() throws MythServiceApiRuntimeException;

	/**
	 * - POST
	 * 
	 * @param recordingId
	 * @return
	 */
	boolean removeRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	boolean removeRecorded( int channelId, DateTime startTime ) throws MythServiceApiRuntimeException;

}
