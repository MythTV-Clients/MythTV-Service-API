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
package org.mythtv.services.api.v027;

import org.mythtv.services.api.ArrayOfString;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.Int;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.EncoderList;
import org.mythtv.services.api.v027.beans.Program;
import org.mythtv.services.api.v027.beans.ProgramList;
import org.mythtv.services.api.v027.beans.RecRule;
import org.mythtv.services.api.v027.beans.RecRuleList;
import org.mythtv.services.api.v027.beans.TitleInfoList;
import org.springframework.http.ResponseEntity;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface DvrOperations {

	/*
	 * POST method
	 *
	 * @param title
	 * @param subtitle
	 * @param description
	 * @param category
	 * @param startTime
	 * @param endTime
	 * @param seriesId
	 * @param programId
	 * @param chanId
	 * @param station
	 * @param findDay
	 * @param findTime
	 * @param parentId
	 * @param inactive
	 * @param season
	 * @param episode
	 * @param inetref
	 * @param type
	 * @param searchType
	 * @param recPriority
	 * @param preferredInput
	 * @param startOffset
	 * @param endOffset
	 * @param dupMethod
	 * @param dupIn
	 * @param filter
	 * @param recProfile
	 * @param recGroup
	 * @param storageGroup
	 * @param playGroup
	 * @param autoExpire
	 * @param maxEpisodes
	 * @param maxNewest
	 * @param autoCommflag
	 * @param autoTranscode
	 * @param autoMetaLookup
	 * @param autoUserJob1
	 * @param autoUserJob2
	 * @param autoUserJob3
	 * @param autoUserJob4
	 * @param transcoder
	 * @return ResponseEntity<Int>
	 */
	ResponseEntity<Int> addRecordSchedule(String title, String subtitle, String description, String category, org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, String seriesId, String programId, Integer chanId, String station, Integer findDay, org.joda.time.DateTime findTime, Integer parentId, Boolean inactive, Integer season, Integer episode, String inetref, String type, String searchType, Integer recPriority, Integer preferredInput, Integer startOffset, Integer endOffset, String dupMethod, String dupIn, Integer filter, String recProfile, String recGroup, String storageGroup, String playGroup, Boolean autoExpire, Integer maxEpisodes, Boolean maxNewest, Boolean autoCommflag, Boolean autoTranscode, Boolean autoMetaLookup, Boolean autoUserJob1, Boolean autoUserJob2, Boolean autoUserJob3, Boolean autoUserJob4, Integer transcoder) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param recordId
	 * @return ResponseEntity<Bool>
	 */
	ResponseEntity<Bool> disableRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param recordId
	 * @return ResponseEntity<Bool>
	 */
	ResponseEntity<Bool> enableRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @return ResponseEntity<ProgramList>
	 */
	ResponseEntity<ProgramList> getConflictList(Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<EncoderList>
	 */
	ResponseEntity<EncoderList> getEncoderList(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @return ResponseEntity<ProgramList>
	 */
	ResponseEntity<ProgramList> getExpiringList(Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<ArrayOfString>
	 */
	ResponseEntity<ArrayOfString> getRecGroupList(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param recordId
	 * @param template
	 * @param chanId
	 * @param startTime
	 * @param makeOverride
	 * @param etagInfo
	 * @return ResponseEntity<RecRule>
	 */
	ResponseEntity<RecRule> getRecordSchedule(Integer recordId, String template, Integer chanId, org.joda.time.DateTime startTime, Boolean makeOverride, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param startIndex
	 * @param count
	 * @param etagInfo
	 * @return ResponseEntity<RecRuleList>
	 */
	ResponseEntity<RecRuleList> getRecordScheduleList(Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return ResponseEntity<Program>
	 */
	ResponseEntity<Program> getRecorded(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param descending
	 * @param startIndex
	 * @param count
	 * @param titleRegEx
	 * @param recGroup
	 * @param storageGroup
	 * @param etagInfo
	 * @return ResponseEntity<ProgramList>
	 */
	ResponseEntity<ProgramList> getRecordedList(Boolean descending, Integer startIndex, Integer count, String titleRegEx, String recGroup, String storageGroup, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<TitleInfoList>
	 */
	ResponseEntity<TitleInfoList> getTitleInfoList(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<ArrayOfString>
	 */
	ResponseEntity<ArrayOfString> getTitleList(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param startIndex
	 * @param count
	 * @param showAll
	 * @param etagInfo
	 * @return ResponseEntity<ProgramList>
	 */
	ResponseEntity<ProgramList> getUpcomingList(Integer startIndex, Integer count, Boolean showAll, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param recordId
	 * @return ResponseEntity<Bool>
	 */
	ResponseEntity<Bool> removeRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param chanId
	 * @param startTime
	 * @param etagInfo
	 * @return ResponseEntity<Bool>
	 */
	ResponseEntity<Bool> removeRecorded(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param recordId
	 * @param title
	 * @param subtitle
	 * @param description
	 * @param category
	 * @param startTime
	 * @param endTime
	 * @param seriesId
	 * @param programId
	 * @param chanId
	 * @param station
	 * @param findDay
	 * @param findTime
	 * @param inactive
	 * @param season
	 * @param episode
	 * @param inetref
	 * @param type
	 * @param searchType
	 * @param recPriority
	 * @param preferredInput
	 * @param startOffset
	 * @param endOffset
	 * @param dupMethod
	 * @param dupIn
	 * @param filter
	 * @param recProfile
	 * @param recGroup
	 * @param storageGroup
	 * @param playGroup
	 * @param autoExpire
	 * @param maxEpisodes
	 * @param maxNewest
	 * @param autoCommflag
	 * @param autoTranscode
	 * @param autoMetaLookup
	 * @param autoUserJob1
	 * @param autoUserJob2
	 * @param autoUserJob3
	 * @param autoUserJob4
	 * @param transcoder
	 * @return ResponseEntity<Bool>
	 */
	ResponseEntity<Bool> updateRecordSchedule(Integer recordId, String title, String subtitle, String description, String category, org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, String seriesId, String programId, Integer chanId, String station, Integer findDay, org.joda.time.DateTime findTime, Boolean inactive, Integer season, Integer episode, String inetref, String type, String searchType, Integer recPriority, Integer preferredInput, Integer startOffset, Integer endOffset, String dupMethod, String dupIn, Integer filter, String recProfile, String recGroup, String storageGroup, String playGroup, Boolean autoExpire, Integer maxEpisodes, Boolean maxNewest, Boolean autoCommflag, Boolean autoTranscode, Boolean autoMetaLookup, Boolean autoUserJob1, Boolean autoUserJob2, Boolean autoUserJob3, Boolean autoUserJob4, Integer transcoder) throws MythServiceApiRuntimeException;

}