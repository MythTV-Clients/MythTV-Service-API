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
package org.mythtv.services.api.v025.impl;

import org.mythtv.services.api.AbstractOperations;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.Int;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v025.beans.EncoderList;
import org.mythtv.services.api.v025.beans.Program;
import org.mythtv.services.api.v025.beans.ProgramList;
import org.mythtv.services.api.v025.beans.RecRule;
import org.mythtv.services.api.v025.beans.RecRuleList;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class DvrTemplate extends AbstractOperations implements org.mythtv.services.api.v025.DvrOperations {

    private final RestOperations restOperations;

    public DvrTemplate( RestOperations restOperations, String apiUrlBase ) {
        super( apiUrlBase + "Dvr/" );
        this.restOperations = restOperations;
    }

	@Override
	public ResponseEntity<Int> addRecordSchedule(Integer chanId, org.joda.time.DateTime startTime, Integer parentId, Boolean inactive, Integer season, Integer episode, String inetref, Integer findId, String type, String searchType, Integer recPriority, Integer preferredInput, Integer startOffset, Integer endOffset, String dupMethod, String dupIn, Integer filter, String recProfile, String recGroup, String storageGroup, String playGroup, Boolean autoExpire, Integer maxEpisodes, Boolean maxNewest, Boolean autoCommflag, Boolean autoTranscode, Boolean autoMetaLookup, Boolean autoUserJob1, Boolean autoUserJob2, Boolean autoUserJob3, Boolean autoUserJob4, Integer transcoder) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanId != null)
           		parameters.add( "ChanId", chanId.toString() );
		if(startTime != null)
           		parameters.add( "StartTime",  convertUtcAndFormat( startTime )  );
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
		if(findId != null)
           		parameters.add( "FindId", findId.toString() );
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
		
		ResponseEntity<Int> responseEntity = restOperations.exchange( buildUri( "AddRecordSchedule", parameters ), HttpMethod.POST, getRequestEntity(null), Int.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> disableRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(recordId != null)
           		parameters.add( "RecordId", recordId.toString() );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "DisableRecordSchedule", parameters ), HttpMethod.POST, getRequestEntity(null), Bool.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> enableRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(recordId != null)
           		parameters.add( "RecordId", recordId.toString() );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "EnableRecordSchedule", parameters ), HttpMethod.POST, getRequestEntity(null), Bool.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ProgramList> getConflictList(Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(startIndex != null)
           		parameters.add( "StartIndex", startIndex.toString() );
		if(count != null)
           		parameters.add( "Count", count.toString() );
		
		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetConflictList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<EncoderList> getEncoderList(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		
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
		
		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetExpiringList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ProgramList> getFilteredRecordedList(Boolean descending, Integer startIndex, Integer count, String titleRegEx, String recGroup, String storageGroup, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
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
		
		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetFilteredRecordedList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<RecRule> getRecordSchedule(Integer recordId, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(recordId != null)
           		parameters.add( "RecordId", recordId.toString() );
		
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
           		parameters.add( "StartTime",  convertUtcAndFormat( startTime )  );
		
		ResponseEntity<Program> responseEntity = restOperations.exchange( buildUri( "GetRecorded", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Program.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ProgramList> getRecordedList(Boolean descending, Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(descending != null)
           		parameters.add( "Descending", descending.toString() );
		if(startIndex != null)
           		parameters.add( "StartIndex", startIndex.toString() );
		if(count != null)
           		parameters.add( "Count", count.toString() );
		
		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetRecordedList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramList.class );
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
		
		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetUpcomingList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ProgramList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> removeRecordSchedule(Integer recordId) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(recordId != null)
           		parameters.add( "RecordId", recordId.toString() );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "RemoveRecordSchedule", parameters ), HttpMethod.POST, getRequestEntity(null), Bool.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> removeRecorded(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanId != null)
           		parameters.add( "ChanId", chanId.toString() );
		if(startTime != null)
           		parameters.add( "StartTime",  convertUtcAndFormat( startTime )  );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "RemoveRecorded", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Bool.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}


}