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
import org.mythtv.services.api.v026.beans.*;
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
	ResponseEntity<Int> addRecordingSchedule( int channelId, DateTime startTime, int parentId, boolean interactive, int season, int episode, String inetRef, int findId, String type, String searchType, int recordingPriority, int perferredInput, int startOffset, int endOffset, String duplicateMethod, String duplicateIn, int filter, String recordingProfile, String recordingGroup, String storageGroup, String playGroup, boolean autoExpire, int maxEpisodes, boolean maxNewest, boolean autoCommercialFlag, boolean autoTranscode, boolean autoMetadataLookup, boolean autoUserJob1, boolean autoUserJob2, boolean autoUserJob3, boolean autoUserJob4, int transcoder ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param recordingId
	 * @return
	 */
	ResponseEntity<Bool> disableRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param recordingId
	 * @return
	 */
	ResponseEntity<Bool> enableRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @return
	 */
	ResponseEntity<ProgramList> getConflictList( int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<EncoderList> getEncoderList( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @return
	 */
	ResponseEntity<ProgramList> getExpiringList( int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException;

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
	ResponseEntity<ProgramList> getFiltererRecordedList( boolean descending, int startIndex, int count, String titleRegEx, String recordingGroup, String storageGroup, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param recordId
	 * @return
	 */
	ResponseEntity<RecRuleWrapper> getRecordSchedule( int recordId, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @return
	 */
	ResponseEntity<RecRuleList> getRecordScheduleList( int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	ResponseEntity<ProgramWrapper> getRecorded( int channelId, DateTime startTime, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<ProgramList> getRecordedList( ETagInfo etag ) throws MythServiceApiRuntimeException;

	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @param descending
	 * @return
	 */
	ResponseEntity<ProgramList> getRecordedList( int startIndex, int count, boolean descending, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param startIndex
	 * @param count
	 * @param showAll
	 * @return
	 */
	ResponseEntity<ProgramList> getUpcomingList( int startIndex, int count, boolean showAll, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param recordingId
	 * @return
	 */
	ResponseEntity<Bool> removeRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param channelId
	 * @param startTime
	 * @return
	 */
	ResponseEntity<Bool> removeRecorded( int channelId, DateTime startTime ) throws MythServiceApiRuntimeException;

}
