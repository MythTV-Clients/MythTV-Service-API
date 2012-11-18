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

import org.joda.time.DateTime;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.Int;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.dvr.DvrOperations;
import org.mythtv.services.api.dvr.EncoderList;
import org.mythtv.services.api.dvr.ProgramList;
import org.mythtv.services.api.dvr.ProgramWrapper;
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

	public enum Endpoint {
		ADD_RECORD_SCHEDULE( "AddRecordSchedule" ),
		DISABLE_RECORD_SCHEDULE( "DisableRecordSchedule" ),
		ENABLE_RECORD_SCHEDULE( "EnableRecordSchedule" ),
		GET_CONFLICT_LIST( "GetConflictList" ),
		GET_ENCODER_LIST( "GetEncoderList" ),
		GET_EXPIRING_LIST( "GetExpiringList"),
		GET_FILTERED_RECORDED_LIST( "GetFilteredRecordedList" ),
		GET_RECORD_SCHEDULE( "GetRecordSchedule" ),
		GET_RECORD_SCHEDULE_LIST( "GetRecordScheduleList" ),
		GET_RECORDED( "GetRecorded" ),
		GET_RECORDED_LIST( "GetRecordedList" ),
		GET_UPCOMING_LIST( "GetUpcomingList" ),
		REMOVE_RECORD_SCHEDULE( "RemoveRecordSchedule" ),
		REMOVE_RECORDED( "RemoveRecorded" );
		
		private String endpoint;
		
		private Endpoint( String endpoint ) {
			this.endpoint = endpoint;
		}
		
		public String getEndpoint() {
			return endpoint;
		}
		
	}
	
	private final RestOperations restOperations;

	/**
	 * @param restOperations
	 * @param apiUrlBase
	 */
	public DvrTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );

		this.restOperations = restOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#addRecordingSchedule(int,
	 * java.util.Date, int, boolean, int, int, java.lang.String, int,
	 * java.lang.String, java.lang.String, int, int, int, int, java.lang.String,
	 * java.lang.String, int, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, boolean, int, boolean, boolean,
	 * boolean, boolean, boolean, boolean, boolean, boolean, int)
	 */
	@Override
	public ResponseEntity<Int> addRecordingSchedule( int channelId, DateTime startTime, int parentId,
			boolean interactive, int season, int episode, String inetRef, int findId, String type, String searchType,
			int recordingPriority, int perferredInput, int startOffset, int endOffset, String duplicateMethod,
			String duplicateIn, int filter, String recordingProfile, String recordingGroup, String storageGroup,
			String playGroup, boolean autoExpire, int maxEpisodes, boolean maxNewest, boolean autoCommercialFlag,
			boolean autoTranscode, boolean autoMetadataLookup, boolean autoUserJob1, boolean autoUserJob2,
			boolean autoUserJob3, boolean autoUserJob4, int transcoder ) throws MythServiceApiRuntimeException {

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

		ResponseEntity<Int> responseEntity = restOperations.exchange( buildUri( Endpoint.ADD_RECORD_SCHEDULE.getEndpoint(), parameters ), HttpMethod.POST, getRequestEntity( null ), Int.class );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.dvr.DvrOperations#disableRecordingSchedule(int)
	 */
	@Override
	public ResponseEntity<Bool> disableRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "RecordId", "" + recordingId );

		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( Endpoint.DISABLE_RECORD_SCHEDULE.getEndpoint(), parameters ), HttpMethod.POST, getRequestEntity( null ), Bool.class );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.dvr.DvrOperations#enableRecordingSchedule(int)
	 */
	@Override
	public ResponseEntity<Bool> enableRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "RecordId", "" + recordingId );

		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( Endpoint.ENABLE_RECORD_SCHEDULE.getEndpoint(), parameters ), HttpMethod.POST, getRequestEntity( null ), Bool.class );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#getConflictList(int, int)
	 */
	@Override
	public ResponseEntity<ProgramList> getConflictList( int startIndex, int count, ETagInfo etag )
			throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}

		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_CONFLICT_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), ProgramList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#getEncoderList()
	 */
	@Override
	public ResponseEntity<EncoderList> getEncoderList( ETagInfo etag ) throws MythServiceApiRuntimeException {

		ResponseEntity<EncoderList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_ENCODER_LIST.getEndpoint() ), HttpMethod.GET, getRequestEntity( etag ), EncoderList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#getExpiringList(int, int)
	 */
	@Override
	public ResponseEntity<ProgramList> getExpiringList( int startIndex, int count, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}

		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_EXPIRING_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), ProgramList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.dvr.DvrOperations#getFiltererRecordedList(boolean
	 * , int, int, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<ProgramList> getFiltererRecordedList( boolean descending, int startIndex, int count, String titleRegEx,
			String recordingGroup, String storageGroup, ETagInfo etag ) throws MythServiceApiRuntimeException {

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

		ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_FILTERED_RECORDED_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), ProgramList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecordSchedule(int)
	 */
	@Override
	public ResponseEntity<RecRuleWrapper> getRecordSchedule( int recordId, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "RecordId", "" + recordId );

		ResponseEntity<RecRuleWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_RECORD_SCHEDULE.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), RecRuleWrapper.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecordScheduleList(int,
	 * int)
	 */
	@Override
	public ResponseEntity<RecRuleList> getRecordScheduleList( int startIndex, int count, ETagInfo etag )
			throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}

		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		ResponseEntity<RecRuleList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_RECORD_SCHEDULE_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), RecRuleList.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecorded(int,
	 * java.util.Date)
	 */
	@Override
	public ResponseEntity<ProgramWrapper> getRecorded( int channelId, DateTime startTime, ETagInfo etag )
			throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		parameters.add( "StartTime", convertUtcAndFormat( startTime ) );

		ResponseEntity<ProgramWrapper> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_RECORDED.getEndpoint(), parameters ),	HttpMethod.GET, getRequestEntity( etag ), ProgramWrapper.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );
		
		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecordedList()
	 */
	@Override
	public ResponseEntity<ProgramList> getRecordedList( ETagInfo etag ) throws MythServiceApiRuntimeException {

		try {
			ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_RECORDED_LIST.getEndpoint() ), HttpMethod.GET, getRequestEntity( etag ), ProgramList.class );
			handleResponseEtag( etag, responseEntity.getHeaders() );

			return responseEntity;
		} catch( Exception e ) {
			throw new MythServiceApiRuntimeException( e );
		}
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#getRecordedList(int, int,
	 * boolean)
	 */
	@Override
	public ResponseEntity<ProgramList> getRecordedList( int startIndex, int count, boolean descending, ETagInfo etag ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}

		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		parameters.add( "Descending", Boolean.toString( descending ) );

		try {
			ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_RECORDED_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), ProgramList.class );
			handleResponseEtag( etag, responseEntity.getHeaders() );

			return responseEntity;
		} catch( Exception e ) {
			throw new MythServiceApiRuntimeException( e );
		}
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#getUpcomingList(int, int,
	 * boolean)
	 */
	@Override
	public ResponseEntity<ProgramList> getUpcomingList( int startIndex, int count, boolean showAll, ETagInfo etag )
			throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if( startIndex > 0 ) {
			parameters.add( "StartIndex", "" + startIndex );
		}

		if( count > 0 ) {
			parameters.add( "Count", "" + count );
		}

		parameters.add( "ShowAll", Boolean.toString( showAll ) );

		try {
			ResponseEntity<ProgramList> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_UPCOMING_LIST.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( etag ), ProgramList.class );
			handleResponseEtag( etag, responseEntity.getHeaders() );
		
			return responseEntity;
		} catch( Exception e ) {
			throw new MythServiceApiRuntimeException( e );
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.dvr.DvrOperations#removeRecordingSchedule(int)
	 */
	@Override
	public ResponseEntity<Bool> removeRecordingSchedule( int recordingId ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "RecordId", "" + recordingId );

		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( Endpoint.REMOVE_RECORD_SCHEDULE.getEndpoint(), parameters ), HttpMethod.POST, getRequestEntity( null ), Bool.class );
		
		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.dvr.DvrOperations#removeRecorded(int,
	 * java.util.Date)
	 */
	@Override
	public ResponseEntity<Bool> removeRecorded( Long channelId, DateTime startTime ) throws MythServiceApiRuntimeException {

		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add( "ChanId", "" + channelId );
		parameters.add( "StartTime", convertUtcAndFormat( startTime ) );

		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( Endpoint.REMOVE_RECORDED.getEndpoint(), parameters ), HttpMethod.GET, getRequestEntity( null ), Bool.class );
		
		return responseEntity;
	}

}
