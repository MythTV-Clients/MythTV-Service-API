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
package org.mythtv.services.api.dvr.impl;

import java.util.List;

import org.joda.time.DateTime;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.Int;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.dvr.DvrOperations;
import org.mythtv.services.api.dvr.Encoder;
import org.mythtv.services.api.dvr.EncoderList;
import org.mythtv.services.api.dvr.Program;
import org.mythtv.services.api.dvr.ProgramList;
import org.mythtv.services.api.dvr.RecRule;
import org.mythtv.services.api.dvr.RecRuleList;
import org.mythtv.services.api.dvr.RecRuleWrapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 *
 */
public class DvrTemplate extends AbstractDvrOperations implements DvrOperations {

	private final RestOperations restOperations;
	
	/**
	 * @param restOperations
	 * @param apiUrlBase
	 */
	public DvrTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		
		this.restOperations = restOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#addRecordingSchedule(int, java.util.Date, int, boolean, int, int, java.lang.String, int, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int)
	 */
	@Override
	public int addRecordingSchedule( int channelId, DateTime startTime, int parentId, boolean interactive, int season, int episode, String inetRef, int findId, String type, String searchType, int recordingPriority, int perferredInput, int startOffset, int endOffset, String duplicateMethod, String duplicateIn, int filter, String recordingProfile, String recordingGroup, String storageGroup, String playGroup, boolean autoExpire, int maxEpisodes, boolean maxNewest, boolean autoCommercialFlag, boolean autoTranscode, boolean autoMetadataLookup, boolean autoUserJob1, boolean autoUserJob2, boolean autoUserJob3, boolean autoUserJob4, int transcoder ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		parameters.add( "StartTime", convertUtcAndFormat( startTime ) );
		parameters.add( "ParentId", "" + parentId );
		parameters.add( "Inactive", Boolean.toString( interactive ) );
		parameters.add( "Season", "" + season );
		parameters.add( "Episode", "" + episode );
		parameters.add( "Inetref", inetRef );
		parameters.add( "FindId", "" + findId );
		parameters.add( "Type", type );
		parameters.add( "SearchType", searchType );
		parameters.add( "RecPriority", "" + recordingPriority );
		parameters.add( "PreferredInput", "" + perferredInput );
		parameters.add( "StartOffset", "" + startOffset );
		parameters.add( "EndOffset", "" + endOffset );
		parameters.add( "DupMethod", duplicateMethod );
		parameters.add( "DupIn", duplicateIn );
		parameters.add( "Filter", "" + filter );
		parameters.add( "RecProfile", recordingProfile );
		parameters.add( "RecGroup", recordingGroup );
		parameters.add( "StorageGroup", storageGroup );
		parameters.add( "PlayGroup", playGroup );
		parameters.add( "AutoExpire", Boolean.toString( autoExpire ) );
		parameters.add( "MaxEpisodes", "" + maxEpisodes );
		parameters.add( "MaxNewest", Boolean.toString( maxNewest ) );
		parameters.add( "AutoCommflag", Boolean.toString( autoCommercialFlag ) );
		parameters.add( "AutoTranscode", Boolean.toString( autoTranscode ) );
		parameters.add( "AutoMetaLookup", Boolean.toString( autoMetadataLookup ) );
		parameters.add( "AutoUserJob1", Boolean.toString( autoUserJob1 ) );
		parameters.add( "AutoUserJob2", Boolean.toString( autoUserJob2 ) );
		parameters.add( "AutoUserJob3", Boolean.toString( autoUserJob3 ) );
		parameters.add( "AutoUserJob4", Boolean.toString( autoUserJob4 ) );
		parameters.add( "Transcoder", "" + transcoder );

		ResponseEntity<Int> responseEntity = restOperations.exchange( buildUri( "DisableRecordSchedule", parameters ), HttpMethod.GET, getRequestEntity(null), Int.class );
		Int i = responseEntity.getBody();
		return i.getInteger();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#disableRecordingSchedule(int)
	 */
	@Override
	public boolean disableRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "RecordId", "" + recordingId );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "DisableRecordSchedule", parameters ), HttpMethod.GET, getRequestEntity(null), Bool.class );
		Bool bool = responseEntity.getBody();
		return bool.getBool();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#enableRecordingSchedule(int)
	 */
	@Override
	public boolean enableRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "RecordId", "" + recordingId );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "EnableRecordSchedule", parameters ), HttpMethod.GET, getRequestEntity(null), Bool.class );
		Bool bool = responseEntity.getBody();
		return bool.getBool();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getConflictList(int, int)
	 */
	@Override
	public List<Program> getConflictList( int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		
		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}
		
		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetConflictList", parameters ), HttpMethod.GET, getRequestEntity(etag), ProgramList.class );
		ProgramList programList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return programList.getPrograms().getPrograms();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getEncoderList()
	 */
	@Override
	public List<Encoder> getEncoderList( ETagInfo etag ) throws MythServiceApiRuntimeException {

		ResponseEntity<EncoderList> responseEntity = restOperations.exchange( buildUri( "GetConflictList" ), HttpMethod.GET, getRequestEntity(etag), EncoderList.class );
		EncoderList encoderList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return encoderList.getEncoders().getEncoders();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getExpiringList(int, int)
	 */
	@Override
	public List<Program> getExpiringList( int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		
		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}
		
		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetExpiringList", parameters ), HttpMethod.GET, getRequestEntity(etag), ProgramList.class );
		ProgramList programList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return programList.getPrograms().getPrograms();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getFiltererRecordedList(boolean, int, int, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Program> getFiltererRecordedList( boolean descending, int startIndex, int count, String titleRegEx, String recordingGroup, String storageGroup, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "Descending", Boolean.toString( descending ) );
		
		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}
		
		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		if( null != titleRegEx && !"".equals( titleRegEx ) ) {
			parameters.add( "TitleRegEx", titleRegEx );
		}

		if( null != recordingGroup && !"".equals( recordingGroup ) ) {
			parameters.add( "RecGroup", recordingGroup );
		}

		if( null != storageGroup && !"".equals( storageGroup ) ) {
			parameters.add( "StorageGroup", storageGroup );
		}

		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetFilteredRecordedList", parameters ), HttpMethod.GET, getRequestEntity(etag), ProgramList.class );
		ProgramList programList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return programList.getPrograms().getPrograms();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecordSchedule(int)
	 */
	@Override
	public RecRule getRecordSchedule( int recordId, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "RecordId", "" + recordId );
		
		ResponseEntity<RecRuleWrapper> responseEntity = restOperations.exchange( buildUri( "GetRecordSchedule", parameters ), HttpMethod.GET, getRequestEntity(etag), RecRuleWrapper.class );
		RecRuleWrapper recRule = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return recRule.getRecRule();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecordScheduleList(int, int)
	 */
	@Override
	public List<RecRule> getRecordScheduleList( int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		
		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}
		
		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		ResponseEntity<RecRuleList> responseEntity = restOperations.exchange( buildUri( "GetRecordScheduleList", parameters ), HttpMethod.GET, getRequestEntity(etag), RecRuleList.class );
		RecRuleList recRuleList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return recRuleList.getRecRules().getRecRules();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecorded(int, java.util.Date)
	 */
	@Override
	public Program getRecorded( int channelId, DateTime startTime, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		parameters.add( "StartTime", convertUtcAndFormat( startTime ) );

		ResponseEntity<Program> responseEntity = restOperations.exchange( buildUri( "GetRecorded", parameters ), HttpMethod.GET, getRequestEntity(etag), Program.class );
		Program program = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return program;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecordedList()
	 */
	@Override
	public ProgramList getRecordedList( ETagInfo etag ) throws MythServiceApiRuntimeException {

		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetRecordedList" ), HttpMethod.GET, getRequestEntity(etag), ProgramList.class );
		ProgramList programList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		
		return programList;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecordedListResponseEntity()
	 */
	@Override
	public ResponseEntity<ProgramList> getRecordedListResponseEntity(ETagInfo etag) throws MythServiceApiRuntimeException {
		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetRecordedList" ), HttpMethod.GET, getRequestEntity(etag), ProgramList.class );
		handleResponseEtag(etag, responseEntity.getHeaders());
		
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecordedList(int, int, boolean)
	 */
	@Override
	public ProgramList getRecordedList( int startIndex, int count, boolean descending, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		
		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}
		
		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		parameters.add( "Descending", Boolean.toString( descending ) );

		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetRecordedList", parameters ), HttpMethod.GET, getRequestEntity(etag), ProgramList.class );
		ProgramList programList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		
		return programList;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getUpcomingList(int, int, boolean)
	 */
	@Override
	public ProgramList getUpcomingList( int startIndex, int count, boolean showAll, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		
		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}
		
		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		parameters.add( "ShowAll", Boolean.toString( showAll ) );

		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetUpcomingList", parameters ), HttpMethod.GET, getRequestEntity(etag), ProgramList.class );
		ProgramList programList = responseEntity.getBody();
		handleResponseEtag(etag, responseEntity.getHeaders());
		return programList;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#getUpcomingListResponseEntity()
	 */
	@Override
	public ResponseEntity<ProgramList> getUpcomingListResponseEntity( ETagInfo etag ) throws MythServiceApiRuntimeException {
		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( "GetUpcomingList" ), HttpMethod.GET, getRequestEntity(etag), ProgramList.class );
		handleResponseEtag(etag, responseEntity.getHeaders());
		return responseEntity;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#removeRecordingSchedule(int)
	 */
	@Override
	public boolean removeRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "RecordId", "" + recordingId );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "RemoveRecordSchedule", parameters ), HttpMethod.GET, getRequestEntity(null), Bool.class );
		Bool bool = responseEntity.getBody();
		return bool.getBool();
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.dvr.DvrOperations#removeRecorded(int, java.util.Date)
	 */
	@Override
	public boolean removeRecorded( int channelId, DateTime startTime ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		parameters.add( "StartTime", convertUtcAndFormat( startTime ) );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "RemoveRecorded", parameters ), HttpMethod.GET, getRequestEntity(null), Bool.class );
		Bool bool = responseEntity.getBody();
		return bool.getBool();
	}
	
}
