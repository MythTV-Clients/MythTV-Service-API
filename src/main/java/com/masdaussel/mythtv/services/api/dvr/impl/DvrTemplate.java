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
package com.masdaussel.mythtv.services.api.dvr.impl;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.masdaussel.mythtv.services.api.AbstractMythApiOperations;
import com.masdaussel.mythtv.services.api.dvr.DvrOperations;
import com.masdaussel.mythtv.services.api.dvr.Encoder;
import com.masdaussel.mythtv.services.api.dvr.EncoderList;
import com.masdaussel.mythtv.services.api.dvr.Program;
import com.masdaussel.mythtv.services.api.dvr.ProgramList;
import com.masdaussel.mythtv.services.api.dvr.RecRule;
import com.masdaussel.mythtv.services.api.dvr.RecRuleList;
import com.masdaussel.mythtv.services.api.utils.Bool;
import com.masdaussel.mythtv.services.api.utils.Int;

/**
 * @author sebastien
 * 
 */
public class DvrTemplate extends AbstractDvrOperations implements DvrOperations {

	private final RestTemplate	restTemplate;

	/**
	 * @param restTemplate
	 * @param apiUrlBase
	 */
	public DvrTemplate(final RestTemplate restTemplate, final String apiUrlBase) {
		super(apiUrlBase);

		this.restTemplate = restTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#addRecordingSchedule
	 * (int, java.util.Date, int, boolean, int, int, java.lang.String, int,
	 * java.lang.String, java.lang.String, int, int, int, int, java.lang.String,
	 * java.lang.String, int, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, boolean, int, boolean, boolean,
	 * boolean, boolean, boolean, boolean, boolean, boolean, int)
	 */
	@Override
	public int addRecordingSchedule(final int channelId, final Date startTime, final int parentId, final boolean interactive, final int season,
			final int episode, final String inetRef, final int findId, final String type, final String searchType, final int recordingPriority,
			final int perferredInput, final int startOffset, final int endOffset, final String duplicateMethod, final String duplicateIn, final int filter,
			final String recordingProfile, final String recordingGroup, final String storageGroup, final String playGroup, final boolean autoExpire,
			final int maxEpisodes, final boolean maxNewest, final boolean autoCommercialFlag, final boolean autoTranscode, final boolean autoMetadataLookup,
			final boolean autoUserJob1, final boolean autoUserJob2, final boolean autoUserJob3, final boolean autoUserJob4, final int transcoder) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);
		parameters.add("StartTime", AbstractMythApiOperations.sdf.format(startTime));
		parameters.add("ParentId", "" + parentId);
		parameters.add("Inactive", Boolean.toString(interactive));
		parameters.add("Season", "" + season);
		parameters.add("Episode", "" + episode);
		parameters.add("Inetref", inetRef);
		parameters.add("FindId", "" + findId);
		parameters.add("Type", type);
		parameters.add("SearchType", searchType);
		parameters.add("RecPriority", "" + recordingPriority);
		parameters.add("PreferredInput", "" + perferredInput);
		parameters.add("StartOffset", "" + startOffset);
		parameters.add("EndOffset", "" + endOffset);
		parameters.add("DupMethod", duplicateMethod);
		parameters.add("DupIn", duplicateIn);
		parameters.add("Filter", "" + filter);
		parameters.add("RecProfile", recordingProfile);
		parameters.add("RecGroup", recordingGroup);
		parameters.add("StorageGroup", storageGroup);
		parameters.add("PlayGroup", playGroup);
		parameters.add("AutoExpire", Boolean.toString(autoExpire));
		parameters.add("MaxEpisodes", "" + maxEpisodes);
		parameters.add("MaxNewest", Boolean.toString(maxNewest));
		parameters.add("AutoCommflag", Boolean.toString(autoCommercialFlag));
		parameters.add("AutoTranscode", Boolean.toString(autoTranscode));
		parameters.add("AutoMetaLookup", Boolean.toString(autoMetadataLookup));
		parameters.add("AutoUserJob1", Boolean.toString(autoUserJob1));
		parameters.add("AutoUserJob2", Boolean.toString(autoUserJob2));
		parameters.add("AutoUserJob3", Boolean.toString(autoUserJob3));
		parameters.add("AutoUserJob4", Boolean.toString(autoUserJob4));
		parameters.add("Transcoder", "" + transcoder);

		final ResponseEntity<Int> responseEntity = restTemplate.exchange(buildUri("DisableRecordSchedule", parameters), HttpMethod.GET, getRequestEntity(),
				Int.class);
		final Int i = responseEntity.getBody();

		return i.getInteger();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#disableRecordingSchedule
	 * (int)
	 */
	@Override
	public boolean disableRecordingSchedule(final int recordingId) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("RecordId", "" + recordingId);

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("DisableRecordSchedule", parameters), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#enableRecordingSchedule
	 * (int)
	 */
	@Override
	public boolean enableRecordingSchedule(final int recordingId) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("RecordId", "" + recordingId);

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("EnableRecordSchedule", parameters), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getConflictList(int,
	 * int)
	 */
	@Override
	public List<Program> getConflictList(final int startIndex, final int count) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (startIndex > 0)
			parameters.add("StartIndex", "" + startIndex);

		if (count > 0)
			parameters.add("Count", "" + count);

		final ResponseEntity<ProgramList> responseEntity = restTemplate.exchange(buildUri("GetConflictList", parameters), HttpMethod.GET, getRequestEntity(),
				ProgramList.class);
		final ProgramList programList = responseEntity.getBody();

		return programList.getPrograms().getPrograms();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getEncoderList()
	 */
	@Override
	public List<Encoder> getEncoderList() {

		final ResponseEntity<EncoderList> responseEntity = restTemplate.exchange(buildUri("GetConflictList"), HttpMethod.GET, getRequestEntity(),
				EncoderList.class);
		final EncoderList encoderList = responseEntity.getBody();

		return encoderList.getEncoders().getEncoders();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getExpiringList(int,
	 * int)
	 */
	@Override
	public List<Program> getExpiringList(final int startIndex, final int count) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (startIndex > 0)
			parameters.add("StartIndex", "" + startIndex);

		if (count > 0)
			parameters.add("Count", "" + count);

		final ResponseEntity<ProgramList> responseEntity = restTemplate.exchange(buildUri("GetExpiringList", parameters), HttpMethod.GET, getRequestEntity(),
				ProgramList.class);
		final ProgramList programList = responseEntity.getBody();

		return programList.getPrograms().getPrograms();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getFiltererRecordedList
	 * (boolean, int, int, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Program> getFiltererRecordedList(final boolean descending, final int startIndex, final int count, final String titleRegEx,
			final String recordingGroup, final String storageGroup) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Descending", Boolean.toString(descending));

		if (startIndex > 0)
			parameters.add("StartIndex", "" + startIndex);

		if (count > 0)
			parameters.add("Count", "" + count);

		if ((null != titleRegEx) && !"".equals(titleRegEx))
			parameters.add("TitleRegEx", titleRegEx);

		if ((null != recordingGroup) && !"".equals(recordingGroup))
			parameters.add("RecGroup", recordingGroup);

		if ((null != storageGroup) && !"".equals(storageGroup))
			parameters.add("StorageGroup", storageGroup);

		final ResponseEntity<ProgramList> responseEntity = restTemplate.exchange(buildUri("GetFilteredRecordedList", parameters), HttpMethod.GET,
				getRequestEntity(), ProgramList.class);
		final ProgramList programList = responseEntity.getBody();

		return programList.getPrograms().getPrograms();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getRecorded(int,
	 * java.util.Date)
	 */
	@Override
	public Program getRecorded(final int channelId, final Date startTime) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);
		parameters.add("StartTime", AbstractMythApiOperations.sdf.format(startTime));

		final ResponseEntity<Program> responseEntity = restTemplate.exchange(buildUri("GetRecorded", parameters), HttpMethod.GET, getRequestEntity(),
				Program.class);
		final Program program = responseEntity.getBody();

		return program;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getRecordedList()
	 */
	@Override
	public List<Program> getRecordedList() {

		final ResponseEntity<ProgramList> responseEntity = restTemplate.exchange(buildUri("GetRecordedList"), HttpMethod.GET, getRequestEntity(),
				ProgramList.class);
		final ProgramList programList = responseEntity.getBody();

		return programList.getPrograms().getPrograms();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getRecordedList(int,
	 * int, boolean)
	 */
	@Override
	public List<Program> getRecordedList(final int startIndex, final int count, final boolean descending) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (startIndex > 0)
			parameters.add("StartIndex", "" + startIndex);

		if (count > 0)
			parameters.add("Count", "" + count);

		parameters.add("Descending", Boolean.toString(descending));

		final ResponseEntity<ProgramList> responseEntity = restTemplate.exchange(buildUri("GetRecordedList", parameters), HttpMethod.GET, getRequestEntity(),
				ProgramList.class);
		final ProgramList programList = responseEntity.getBody();

		return programList.getPrograms().getPrograms();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.dvr.DvrOperations#
	 * getRecordedListResponseEntity()
	 */
	@Override
	public ResponseEntity<ProgramList> getRecordedListResponseEntity() {
		return restTemplate.exchange(buildUri("GetRecordedList"), HttpMethod.GET, getRequestEntity(), ProgramList.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getRecordSchedule
	 * (int)
	 */
	@Override
	public RecRule getRecordSchedule(final int recordId) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("RecordId", "" + recordId);

		final ResponseEntity<RecRule> responseEntity = restTemplate.exchange(buildUri("GetRecordSchedule", parameters), HttpMethod.GET, getRequestEntity(),
				RecRule.class);
		final RecRule recRule = responseEntity.getBody();

		return recRule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getRecordScheduleList
	 * (int, int)
	 */
	@Override
	public List<RecRule> getRecordScheduleList(final int startIndex, final int count) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (startIndex > 0)
			parameters.add("StartIndex", "" + startIndex);

		if (count > 0)
			parameters.add("Count", "" + count);

		final ResponseEntity<RecRuleList> responseEntity = restTemplate.exchange(buildUri("GetRecordScheduleList", parameters), HttpMethod.GET,
				getRequestEntity(), RecRuleList.class);
		final RecRuleList recRuleList = responseEntity.getBody();

		return recRuleList.getRecRules().getRecRules();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#getUpcomingList(int,
	 * int, boolean)
	 */
	@Override
	public List<Program> getUpcomingList(final int startIndex, final int count, final boolean showAll) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (startIndex > 0)
			parameters.add("StartIndex", "" + startIndex);

		if (count > 0)
			parameters.add("Count", "" + count);

		parameters.add("ShowAll", Boolean.toString(showAll));

		final ResponseEntity<ProgramList> responseEntity = restTemplate.exchange(buildUri("GetUpcomingList", parameters), HttpMethod.GET, getRequestEntity(),
				ProgramList.class);
		final ProgramList programList = responseEntity.getBody();

		return programList.getPrograms().getPrograms();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.dvr.DvrOperations#
	 * getUpcomingListResponseEntity()
	 */
	@Override
	public ResponseEntity<ProgramList> getUpcomingListResponseEntity() {
		return restTemplate.exchange(buildUri("GetUpcomingList"), HttpMethod.GET, getRequestEntity(), ProgramList.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#removeRecorded(int,
	 * java.util.Date)
	 */
	@Override
	public boolean removeRecorded(final int channelId, final Date startTime) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);
		parameters.add("StartTime", AbstractMythApiOperations.sdf.format(startTime));

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("RemoveRecorded", parameters), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.dvr.DvrOperations#removeRecordingSchedule
	 * (int)
	 */
	@Override
	public boolean removeRecordingSchedule(final int recordingId) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("RecordId", "" + recordingId);

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri("RemoveRecordSchedule", parameters), HttpMethod.GET, getRequestEntity(),
				Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

}
