package org.mythtv.services.api.v027.impl;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.EncoderList;
import org.mythtv.services.api.v027.beans.Program;
import org.mythtv.services.api.v027.beans.ProgramList;
import org.mythtv.services.api.v027.beans.RecRule;
import org.mythtv.services.api.v027.beans.RecRuleList;
import org.mythtv.services.api.v027.beans.TitleInfoList;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class DvrTemplate extends AbstractDvrOperations implements org.mythtv.services.api.v027.DvrOperations {

    private final RestOperations restOperations;

    public DvrTemplate( RestOperations restOperations, String apiUrlBase ) {
        super( apiUrlBase );
        this.restOperations = restOperations;
    }


    @Override
    public ResponseEntity<Integer> addRecordSchedule(String title, String subtitle, String description, String category, org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, String seriesId, String programId, Integer chanId, String station, Integer findDay, org.joda.time.DateTime findTime, Integer parentId, Boolean inactive, Integer season, Integer episode, String inetref, String type, String searchType, Integer recPriority, Integer preferredInput, Integer startOffset, Integer endOffset, String dupMethod, String dupIn, Integer filter, String recProfile, String recGroup, String storageGroup, String playGroup, Boolean autoExpire, Integer maxEpisodes, Boolean maxNewest, Boolean autoCommflag, Boolean autoTranscode, Boolean autoMetaLookup, Boolean autoUserJob1, Boolean autoUserJob2, Boolean autoUserJob3, Boolean autoUserJob4, Integer transcoder) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(title != null && !title.isEmpty())
            parameters.add( "Title", title );
        if(subtitle != null && !subtitle.isEmpty())
            parameters.add( "Subtitle", subtitle );
        if(description != null && !description.isEmpty())
            parameters.add( "Description", description );
        if(category != null && !category.isEmpty())
            parameters.add( "Category", category );
        if(startTime != null)
            parameters.add( "StartTime", startTime.toString() );
        if(endTime != null)
            parameters.add( "EndTime", endTime.toString() );
        if(seriesId != null && !seriesId.isEmpty())
            parameters.add( "SeriesId", seriesId );
        if(programId != null && !programId.isEmpty())
            parameters.add( "ProgramId", programId );
        if(chanId != null)
            parameters.add( "ChanId", chanId.toString() );
        if(station != null && !station.isEmpty())
            parameters.add( "Station", station );
        if(findDay != null)
            parameters.add( "FindDay", findDay.toString() );
        if(findTime != null)
            parameters.add( "FindTime", findTime.toString() );
        if(parentId != null)
            parameters.add( "ParentId", parentId.toString() );
        if(inactive != null)
            parameters.add( "Inactive", inactive.toString() );
        if(season != null)
            parameters.add( "Season", season.toString() );
        if(episode != null)
            parameters.add( "Episode", episode.toString() );
        if(inetref != null && !inetref.isEmpty())
            parameters.add( "Inetref", inetref );
        if(type != null && !type.isEmpty())
            parameters.add( "Type", type );
        if(searchType != null && !searchType.isEmpty())
            parameters.add( "SearchType", searchType );
        if(recPriority != null)
            parameters.add( "RecPriority", recPriority.toString() );
        if(preferredInput != null)
            parameters.add( "PreferredInput", preferredInput.toString() );
        if(startOffset != null)
            parameters.add( "StartOffset", startOffset.toString() );
        if(endOffset != null)
            parameters.add( "EndOffset", endOffset.toString() );
        if(dupMethod != null && !dupMethod.isEmpty())
            parameters.add( "DupMethod", dupMethod );
        if(dupIn != null && !dupIn.isEmpty())
            parameters.add( "DupIn", dupIn );
        if(filter != null)
            parameters.add( "Filter", filter.toString() );
        if(recProfile != null && !recProfile.isEmpty())
            parameters.add( "RecProfile", recProfile );
        if(recGroup != null && !recGroup.isEmpty())
            parameters.add( "RecGroup", recGroup );
        if(storageGroup != null && !storageGroup.isEmpty())
            parameters.add( "StorageGroup", storageGroup );
        if(playGroup != null && !playGroup.isEmpty())
            parameters.add( "PlayGroup", playGroup );
        if(autoExpire != null)
            parameters.add( "AutoExpire", autoExpire.toString() );
        if(maxEpisodes != null)
            parameters.add( "MaxEpisodes", maxEpisodes.toString() );
        if(maxNewest != null)
            parameters.add( "MaxNewest", maxNewest.toString() );
        if(autoCommflag != null)
            parameters.add( "AutoCommflag", autoCommflag.toString() );
        if(autoTranscode != null)
            parameters.add( "AutoTranscode", autoTranscode.toString() );
        if(autoMetaLookup != null)
            parameters.add( "AutoMetaLookup", autoMetaLookup.toString() );
        if(autoUserJob1 != null)
            parameters.add( "AutoUserJob1", autoUserJob1.toString() );
        if(autoUserJob2 != null)
            parameters.add( "AutoUserJob2", autoUserJob2.toString() );
        if(autoUserJob3 != null)
            parameters.add( "AutoUserJob3", autoUserJob3.toString() );
        if(autoUserJob4 != null)
            parameters.add( "AutoUserJob4", autoUserJob4.toString() );
        if(transcoder != null)
            parameters.add( "Transcoder", transcoder.toString() );

        ResponseEntity<Integer> responseEntity = restOperations.exchange( buildUri( "AddRecordSchedule", parameters ), HttpMethod.POST, getRequestEntity(null), Integer.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> disableRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(recordId != null)
            parameters.add( "RecordId", recordId.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "DisableRecordSchedule", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> enableRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(recordId != null)
            parameters.add( "RecordId", recordId.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "EnableRecordSchedule", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<ProgramList> getConflictList(Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(startIndex != null)
            parameters.add( "StartIndex", startIndex.toString() );
        if(count != null)
            parameters.add( "Count", count.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetConflictList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<EncoderList> getEncoderList(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<EncoderList> responseEntity = restOperations.exchange( buildUri( "GetEncoderList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), EncoderList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<ProgramList> getExpiringList(Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(startIndex != null)
            parameters.add( "StartIndex", startIndex.toString() );
        if(count != null)
            parameters.add( "Count", count.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetExpiringList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<String[]> getRecGroupList(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<String[]> responseEntity = restOperations.exchange( buildUri( "GetRecGroupList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String[].class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<RecRule> getRecordSchedule(Integer recordId, String template, Integer chanId, org.joda.time.DateTime startTime, Boolean makeOverride, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(recordId != null)
            parameters.add( "RecordId", recordId.toString() );
        if(template != null && !template.isEmpty())
            parameters.add( "Template", template );
        if(chanId != null)
            parameters.add( "ChanId", chanId.toString() );
        if(startTime != null)
            parameters.add( "StartTime", startTime.toString() );
        if(makeOverride != null)
            parameters.add( "MakeOverride", makeOverride.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<RecRule> responseEntity = restOperations.exchange( buildUri( "GetRecordSchedule", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), RecRule.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<RecRuleList> getRecordScheduleList(Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(startIndex != null)
            parameters.add( "StartIndex", startIndex.toString() );
        if(count != null)
            parameters.add( "Count", count.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<RecRuleList> responseEntity = restOperations.exchange( buildUri( "GetRecordScheduleList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), RecRuleList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Program> getRecorded(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(chanId != null)
            parameters.add( "ChanId", chanId.toString() );
        if(startTime != null)
            parameters.add( "StartTime", startTime.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<Program> responseEntity = restOperations.exchange( buildUri( "GetRecorded", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Program.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<ProgramList> getRecordedList(Boolean descending, Integer startIndex, Integer count, String titleRegEx, String recGroup, String storageGroup, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(descending != null)
            parameters.add( "Descending", descending.toString() );
        if(startIndex != null)
            parameters.add( "StartIndex", startIndex.toString() );
        if(count != null)
            parameters.add( "Count", count.toString() );
        if(titleRegEx != null && !titleRegEx.isEmpty())
            parameters.add( "TitleRegEx", titleRegEx );
        if(recGroup != null && !recGroup.isEmpty())
            parameters.add( "RecGroup", recGroup );
        if(storageGroup != null && !storageGroup.isEmpty())
            parameters.add( "StorageGroup", storageGroup );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetRecordedList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<TitleInfoList> getTitleInfoList(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<TitleInfoList> responseEntity = restOperations.exchange( buildUri( "GetTitleInfoList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), TitleInfoList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<String[]> getTitleList(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<String[]> responseEntity = restOperations.exchange( buildUri( "GetTitleList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String[].class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<ProgramList> getUpcomingList(Integer startIndex, Integer count, Boolean showAll, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(startIndex != null)
            parameters.add( "StartIndex", startIndex.toString() );
        if(count != null)
            parameters.add( "Count", count.toString() );
        if(showAll != null)
            parameters.add( "ShowAll", showAll.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetUpcomingList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> removeRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(recordId != null)
            parameters.add( "RecordId", recordId.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "RemoveRecordSchedule", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> removeRecorded(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(chanId != null)
            parameters.add( "ChanId", chanId.toString() );
        if(startTime != null)
            parameters.add( "StartTime", startTime.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "RemoveRecorded", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Boolean.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> updateRecordSchedule(Integer recordId, String title, String subtitle, String description, String category, org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, String seriesId, String programId, Integer chanId, String station, Integer findDay, org.joda.time.DateTime findTime, Boolean inactive, Integer season, Integer episode, String inetref, String type, String searchType, Integer recPriority, Integer preferredInput, Integer startOffset, Integer endOffset, String dupMethod, String dupIn, Integer filter, String recProfile, String recGroup, String storageGroup, String playGroup, Boolean autoExpire, Integer maxEpisodes, Boolean maxNewest, Boolean autoCommflag, Boolean autoTranscode, Boolean autoMetaLookup, Boolean autoUserJob1, Boolean autoUserJob2, Boolean autoUserJob3, Boolean autoUserJob4, Integer transcoder) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(recordId != null)
            parameters.add( "RecordId", recordId.toString() );
        if(title != null && !title.isEmpty())
            parameters.add( "Title", title );
        if(subtitle != null && !subtitle.isEmpty())
            parameters.add( "Subtitle", subtitle );
        if(description != null && !description.isEmpty())
            parameters.add( "Description", description );
        if(category != null && !category.isEmpty())
            parameters.add( "Category", category );
        if(startTime != null)
            parameters.add( "StartTime", startTime.toString() );
        if(endTime != null)
            parameters.add( "EndTime", endTime.toString() );
        if(seriesId != null && !seriesId.isEmpty())
            parameters.add( "SeriesId", seriesId );
        if(programId != null && !programId.isEmpty())
            parameters.add( "ProgramId", programId );
        if(chanId != null)
            parameters.add( "ChanId", chanId.toString() );
        if(station != null && !station.isEmpty())
            parameters.add( "Station", station );
        if(findDay != null)
            parameters.add( "FindDay", findDay.toString() );
        if(findTime != null)
            parameters.add( "FindTime", findTime.toString() );
        if(inactive != null)
            parameters.add( "Inactive", inactive.toString() );
        if(season != null)
            parameters.add( "Season", season.toString() );
        if(episode != null)
            parameters.add( "Episode", episode.toString() );
        if(inetref != null && !inetref.isEmpty())
            parameters.add( "Inetref", inetref );
        if(type != null && !type.isEmpty())
            parameters.add( "Type", type );
        if(searchType != null && !searchType.isEmpty())
            parameters.add( "SearchType", searchType );
        if(recPriority != null)
            parameters.add( "RecPriority", recPriority.toString() );
        if(preferredInput != null)
            parameters.add( "PreferredInput", preferredInput.toString() );
        if(startOffset != null)
            parameters.add( "StartOffset", startOffset.toString() );
        if(endOffset != null)
            parameters.add( "EndOffset", endOffset.toString() );
        if(dupMethod != null && !dupMethod.isEmpty())
            parameters.add( "DupMethod", dupMethod );
        if(dupIn != null && !dupIn.isEmpty())
            parameters.add( "DupIn", dupIn );
        if(filter != null)
            parameters.add( "Filter", filter.toString() );
        if(recProfile != null && !recProfile.isEmpty())
            parameters.add( "RecProfile", recProfile );
        if(recGroup != null && !recGroup.isEmpty())
            parameters.add( "RecGroup", recGroup );
        if(storageGroup != null && !storageGroup.isEmpty())
            parameters.add( "StorageGroup", storageGroup );
        if(playGroup != null && !playGroup.isEmpty())
            parameters.add( "PlayGroup", playGroup );
        if(autoExpire != null)
            parameters.add( "AutoExpire", autoExpire.toString() );
        if(maxEpisodes != null)
            parameters.add( "MaxEpisodes", maxEpisodes.toString() );
        if(maxNewest != null)
            parameters.add( "MaxNewest", maxNewest.toString() );
        if(autoCommflag != null)
            parameters.add( "AutoCommflag", autoCommflag.toString() );
        if(autoTranscode != null)
            parameters.add( "AutoTranscode", autoTranscode.toString() );
        if(autoMetaLookup != null)
            parameters.add( "AutoMetaLookup", autoMetaLookup.toString() );
        if(autoUserJob1 != null)
            parameters.add( "AutoUserJob1", autoUserJob1.toString() );
        if(autoUserJob2 != null)
            parameters.add( "AutoUserJob2", autoUserJob2.toString() );
        if(autoUserJob3 != null)
            parameters.add( "AutoUserJob3", autoUserJob3.toString() );
        if(autoUserJob4 != null)
            parameters.add( "AutoUserJob4", autoUserJob4.toString() );
        if(transcoder != null)
            parameters.add( "Transcoder", transcoder.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "UpdateRecordSchedule", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}

}