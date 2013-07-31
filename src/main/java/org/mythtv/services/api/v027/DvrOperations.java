package org.mythtv.services.api.v027;

import org.mythtv.services.api.ETagInfo;
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
     * @return ResponseEntity<Integer>
     */
    ResponseEntity<Integer> addRecordSchedule(String title, String subtitle, String description, String category, org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, String seriesId, String programId, Integer chanId, String station, Integer findDay, org.joda.time.DateTime findTime, Integer parentId, Boolean inactive, Integer season, Integer episode, String inetref, String type, String searchType, Integer recPriority, Integer preferredInput, Integer startOffset, Integer endOffset, String dupMethod, String dupIn, Integer filter, String recProfile, String recGroup, String storageGroup, String playGroup, Boolean autoExpire, Integer maxEpisodes, Boolean maxNewest, Boolean autoCommflag, Boolean autoTranscode, Boolean autoMetaLookup, Boolean autoUserJob1, Boolean autoUserJob2, Boolean autoUserJob3, Boolean autoUserJob4, Integer transcoder) throws MythServiceApiRuntimeException;

    /*
     * POST method
     *
     * @param recordId
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> disableRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException;

    /*
     * POST method
     *
     * @param recordId
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> enableRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException;

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
     * @return ResponseEntity<String[]>
     */
    ResponseEntity<String[]> getRecGroupList(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

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
     * @return ResponseEntity<String[]>
     */
    ResponseEntity<String[]> getTitleList(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

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
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> removeRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param chanId
     * @param startTime
     * @param etagInfo
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> removeRecorded(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

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
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> updateRecordSchedule(Integer recordId, String title, String subtitle, String description, String category, org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, String seriesId, String programId, Integer chanId, String station, Integer findDay, org.joda.time.DateTime findTime, Boolean inactive, Integer season, Integer episode, String inetref, String type, String searchType, Integer recPriority, Integer preferredInput, Integer startOffset, Integer endOffset, String dupMethod, String dupIn, Integer filter, String recProfile, String recGroup, String storageGroup, String playGroup, Boolean autoExpire, Integer maxEpisodes, Boolean maxNewest, Boolean autoCommflag, Boolean autoTranscode, Boolean autoMetaLookup, Boolean autoUserJob1, Boolean autoUserJob2, Boolean autoUserJob3, Boolean autoUserJob4, Integer transcoder) throws MythServiceApiRuntimeException;

}