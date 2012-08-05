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
package com.masdaussel.mythtv.services.api.dvr;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class RecRule {

	@JsonProperty("Id")
	private int		id;

	@JsonProperty("ParentId")
	private int		parentId;

	@JsonProperty("Inactive")
	private boolean	inactive;

	@JsonProperty("Title")
	private String	title;

	@JsonProperty("SubTitle")
	private String	subTitle;

	@JsonProperty("Description")
	private String	description;

	@JsonProperty("Season")
	private int		season;

	@JsonProperty("Episode")
	private int		episode;

	@JsonProperty("Category")
	private String	category;

	@JsonProperty("StartTime")
	private Date	startTime;

	@JsonProperty("EndTime")
	private Date	endTime;

	@JsonProperty("SeriesId")
	private String	seriesId;

	@JsonProperty("ProgramId")
	private String	programId;

	@JsonProperty("Inetref")
	private String	inetref;

	@JsonProperty("ChanId")
	private int		chanId;

	@JsonProperty("CallSign")
	private String	callSign;

	@JsonProperty("Day")
	private int		day;

	@JsonProperty("Time")
	private Date	time;

	@JsonProperty("FindId")
	private int		findId;

	@JsonProperty("Type")
	private String	type;

	@JsonProperty("SearchType")
	private String	searchType;

	@JsonProperty("RecPriority")
	private int		recPriority;

	@JsonProperty("PreferredInput")
	private int		preferredInput;

	@JsonProperty("StartOffset")
	private int		startOffset;

	@JsonProperty("EndOffset")
	private int		endOffset;

	@JsonProperty("DupMethod")
	private String	dupMethod;

	@JsonProperty("DupIn")
	private String	dupIn;

	@JsonProperty("Filter")
	private int		filter;

	@JsonProperty("RecProfile")
	private String	recProfile;

	@JsonProperty("RecGroup")
	private String	recGroup;

	@JsonProperty("StorageGroup")
	private String	storageGroup;

	@JsonProperty("PlayGroup")
	private String	playGroup;

	@JsonProperty("AutoExpire")
	private boolean	autoExpire;

	@JsonProperty("MaxEpisodes")
	private int		maxEpisodes;

	@JsonProperty("MaxNewest")
	private boolean	maxNewest;

	@JsonProperty("AutoCommflag")
	private boolean	autoCommflag;

	@JsonProperty("AutoTranscode")
	private boolean	autoTranscode;

	@JsonProperty("AutoMetaLookup")
	private boolean	autoMetaLookup;

	@JsonProperty("AutoUserJob1")
	private boolean	autoUserJob1;

	@JsonProperty("AutoUserJob2")
	private boolean	autoUserJob2;

	@JsonProperty("AutoUserJob3")
	private boolean	autoUserJob3;

	@JsonProperty("AutoUserJob4")
	private boolean	autoUserJob4;

	@JsonProperty("Transcoder")
	private int		transcoder;

	@JsonProperty("NextRecording")
	private Date	nextRecording;

	@JsonProperty("LastRecorded")
	private Date	lastRecorded;

	@JsonProperty("LastDeleted")
	private Date	lastDeleted;

	@JsonProperty("AverageDelay")
	private int		averageDelay;

	public RecRule() {
	}

	/**
	 * @return the averageDelay
	 */
	public int getAverageDelay() {
		return averageDelay;
	}

	/**
	 * @return the callSign
	 */
	public String getCallSign() {
		return callSign;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the chanId
	 */
	public int getChanId() {
		return chanId;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the dupIn
	 */
	public String getDupIn() {
		return dupIn;
	}

	/**
	 * @return the dupMethod
	 */
	public String getDupMethod() {
		return dupMethod;
	}

	/**
	 * @return the endOffset
	 */
	public int getEndOffset() {
		return endOffset;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * @return the episode
	 */
	public int getEpisode() {
		return episode;
	}

	/**
	 * @return the filter
	 */
	public int getFilter() {
		return filter;
	}

	/**
	 * @return the findId
	 */
	public int getFindId() {
		return findId;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the inetref
	 */
	public String getInetref() {
		return inetref;
	}

	/**
	 * @return the lastDeleted
	 */
	public Date getLastDeleted() {
		return lastDeleted;
	}

	/**
	 * @return the lastRecorded
	 */
	public Date getLastRecorded() {
		return lastRecorded;
	}

	/**
	 * @return the maxEpisodes
	 */
	public int getMaxEpisodes() {
		return maxEpisodes;
	}

	/**
	 * @return the nextRecording
	 */
	public Date getNextRecording() {
		return nextRecording;
	}

	/**
	 * @return the parentId
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * @return the playGroup
	 */
	public String getPlayGroup() {
		return playGroup;
	}

	/**
	 * @return the preferredInput
	 */
	public int getPreferredInput() {
		return preferredInput;
	}

	/**
	 * @return the programId
	 */
	public String getProgramId() {
		return programId;
	}

	/**
	 * @return the recGroup
	 */
	public String getRecGroup() {
		return recGroup;
	}

	/**
	 * @return the recPriority
	 */
	public int getRecPriority() {
		return recPriority;
	}

	/**
	 * @return the recProfile
	 */
	public String getRecProfile() {
		return recProfile;
	}

	/**
	 * @return the searchType
	 */
	public String getSearchType() {
		return searchType;
	}

	/**
	 * @return the season
	 */
	public int getSeason() {
		return season;
	}

	/**
	 * @return the seriesId
	 */
	public String getSeriesId() {
		return seriesId;
	}

	/**
	 * @return the startOffset
	 */
	public int getStartOffset() {
		return startOffset;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @return the storageGroup
	 */
	public String getStorageGroup() {
		return storageGroup;
	}

	/**
	 * @return the subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the transcoder
	 */
	public int getTranscoder() {
		return transcoder;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the autoCommflag
	 */
	public boolean isAutoCommflag() {
		return autoCommflag;
	}

	/**
	 * @return the autoExpire
	 */
	public boolean isAutoExpire() {
		return autoExpire;
	}

	/**
	 * @return the autoMetaLookup
	 */
	public boolean isAutoMetaLookup() {
		return autoMetaLookup;
	}

	/**
	 * @return the autoTranscode
	 */
	public boolean isAutoTranscode() {
		return autoTranscode;
	}

	/**
	 * @return the autoUserJob1
	 */
	public boolean isAutoUserJob1() {
		return autoUserJob1;
	}

	/**
	 * @return the autoUserJob2
	 */
	public boolean isAutoUserJob2() {
		return autoUserJob2;
	}

	/**
	 * @return the autoUserJob3
	 */
	public boolean isAutoUserJob3() {
		return autoUserJob3;
	}

	/**
	 * @return the autoUserJob4
	 */
	public boolean isAutoUserJob4() {
		return autoUserJob4;
	}

	/**
	 * @return the inactive
	 */
	public boolean isInactive() {
		return inactive;
	}

	/**
	 * @return the maxNewest
	 */
	public boolean isMaxNewest() {
		return maxNewest;
	}

	/**
	 * @param autoCommflag
	 *            the autoCommflag to set
	 */
	public void setAutoCommflag(final boolean autoCommflag) {
		this.autoCommflag = autoCommflag;
	}

	/**
	 * @param autoExpire
	 *            the autoExpire to set
	 */
	public void setAutoExpire(final boolean autoExpire) {
		this.autoExpire = autoExpire;
	}

	/**
	 * @param autoMetaLookup
	 *            the autoMetaLookup to set
	 */
	public void setAutoMetaLookup(final boolean autoMetaLookup) {
		this.autoMetaLookup = autoMetaLookup;
	}

	/**
	 * @param autoTranscode
	 *            the autoTranscode to set
	 */
	public void setAutoTranscode(final boolean autoTranscode) {
		this.autoTranscode = autoTranscode;
	}

	/**
	 * @param autoUserJob1
	 *            the autoUserJob1 to set
	 */
	public void setAutoUserJob1(final boolean autoUserJob1) {
		this.autoUserJob1 = autoUserJob1;
	}

	/**
	 * @param autoUserJob2
	 *            the autoUserJob2 to set
	 */
	public void setAutoUserJob2(final boolean autoUserJob2) {
		this.autoUserJob2 = autoUserJob2;
	}

	/**
	 * @param autoUserJob3
	 *            the autoUserJob3 to set
	 */
	public void setAutoUserJob3(final boolean autoUserJob3) {
		this.autoUserJob3 = autoUserJob3;
	}

	/**
	 * @param autoUserJob4
	 *            the autoUserJob4 to set
	 */
	public void setAutoUserJob4(final boolean autoUserJob4) {
		this.autoUserJob4 = autoUserJob4;
	}

	/**
	 * @param averageDelay
	 *            the averageDelay to set
	 */
	public void setAverageDelay(final int averageDelay) {
		this.averageDelay = averageDelay;
	}

	/**
	 * @param callSign
	 *            the callSign to set
	 */
	public void setCallSign(final String callSign) {
		this.callSign = callSign;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(final String category) {
		this.category = category;
	}

	/**
	 * @param chanId
	 *            the chanId to set
	 */
	public void setChanId(final int chanId) {
		this.chanId = chanId;
	}

	/**
	 * @param day
	 *            the day to set
	 */
	public void setDay(final int day) {
		this.day = day;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @param dupIn
	 *            the dupIn to set
	 */
	public void setDupIn(final String dupIn) {
		this.dupIn = dupIn;
	}

	/**
	 * @param dupMethod
	 *            the dupMethod to set
	 */
	public void setDupMethod(final String dupMethod) {
		this.dupMethod = dupMethod;
	}

	/**
	 * @param endOffset
	 *            the endOffset to set
	 */
	public void setEndOffset(final int endOffset) {
		this.endOffset = endOffset;
	}

	/**
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(final Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * @param episode
	 *            the episode to set
	 */
	public void setEpisode(final int episode) {
		this.episode = episode;
	}

	/**
	 * @param filter
	 *            the filter to set
	 */
	public void setFilter(final int filter) {
		this.filter = filter;
	}

	/**
	 * @param findId
	 *            the findId to set
	 */
	public void setFindId(final int findId) {
		this.findId = findId;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @param inactive
	 *            the inactive to set
	 */
	public void setInactive(final boolean inactive) {
		this.inactive = inactive;
	}

	/**
	 * @param inetref
	 *            the inetref to set
	 */
	public void setInetref(final String inetref) {
		this.inetref = inetref;
	}

	/**
	 * @param lastDeleted
	 *            the lastDeleted to set
	 */
	public void setLastDeleted(final Date lastDeleted) {
		this.lastDeleted = lastDeleted;
	}

	/**
	 * @param lastRecorded
	 *            the lastRecorded to set
	 */
	public void setLastRecorded(final Date lastRecorded) {
		this.lastRecorded = lastRecorded;
	}

	/**
	 * @param maxEpisodes
	 *            the maxEpisodes to set
	 */
	public void setMaxEpisodes(final int maxEpisodes) {
		this.maxEpisodes = maxEpisodes;
	}

	/**
	 * @param maxNewest
	 *            the maxNewest to set
	 */
	public void setMaxNewest(final boolean maxNewest) {
		this.maxNewest = maxNewest;
	}

	/**
	 * @param nextRecording
	 *            the nextRecording to set
	 */
	public void setNextRecording(final Date nextRecording) {
		this.nextRecording = nextRecording;
	}

	/**
	 * @param parentId
	 *            the parentId to set
	 */
	public void setParentId(final int parentId) {
		this.parentId = parentId;
	}

	/**
	 * @param playGroup
	 *            the playGroup to set
	 */
	public void setPlayGroup(final String playGroup) {
		this.playGroup = playGroup;
	}

	/**
	 * @param preferredInput
	 *            the preferredInput to set
	 */
	public void setPreferredInput(final int preferredInput) {
		this.preferredInput = preferredInput;
	}

	/**
	 * @param programId
	 *            the programId to set
	 */
	public void setProgramId(final String programId) {
		this.programId = programId;
	}

	/**
	 * @param recGroup
	 *            the recGroup to set
	 */
	public void setRecGroup(final String recGroup) {
		this.recGroup = recGroup;
	}

	/**
	 * @param recPriority
	 *            the recPriority to set
	 */
	public void setRecPriority(final int recPriority) {
		this.recPriority = recPriority;
	}

	/**
	 * @param recProfile
	 *            the recProfile to set
	 */
	public void setRecProfile(final String recProfile) {
		this.recProfile = recProfile;
	}

	/**
	 * @param searchType
	 *            the searchType to set
	 */
	public void setSearchType(final String searchType) {
		this.searchType = searchType;
	}

	/**
	 * @param season
	 *            the season to set
	 */
	public void setSeason(final int season) {
		this.season = season;
	}

	/**
	 * @param seriesId
	 *            the seriesId to set
	 */
	public void setSeriesId(final String seriesId) {
		this.seriesId = seriesId;
	}

	/**
	 * @param startOffset
	 *            the startOffset to set
	 */
	public void setStartOffset(final int startOffset) {
		this.startOffset = startOffset;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(final Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @param storageGroup
	 *            the storageGroup to set
	 */
	public void setStorageGroup(final String storageGroup) {
		this.storageGroup = storageGroup;
	}

	/**
	 * @param subTitle
	 *            the subTitle to set
	 */
	public void setSubTitle(final String subTitle) {
		this.subTitle = subTitle;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(final Date time) {
		this.time = time;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * @param transcoder
	 *            the transcoder to set
	 */
	public void setTranscoder(final int transcoder) {
		this.transcoder = transcoder;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(final String type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("RecRule [id=");
		builder.append(id);
		builder.append(", parentId=");
		builder.append(parentId);
		builder.append(", inactive=");
		builder.append(inactive);
		builder.append(", ");

		if (title != null) {
			builder.append("title=");
			builder.append(title);
			builder.append(", ");
		}

		if (subTitle != null) {
			builder.append("subTitle=");
			builder.append(subTitle);
			builder.append(", ");
		}

		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}

		builder.append("season=");
		builder.append(season);
		builder.append(", episode=");
		builder.append(episode);
		builder.append(", ");

		if (category != null) {
			builder.append("category=");
			builder.append(category);
			builder.append(", ");
		}

		if (startTime != null) {
			builder.append("startTime=");
			builder.append(startTime);
			builder.append(", ");
		}

		if (endTime != null) {
			builder.append("endTime=");
			builder.append(endTime);
			builder.append(", ");
		}

		if (seriesId != null) {
			builder.append("seriesId=");
			builder.append(seriesId);
			builder.append(", ");
		}

		if (programId != null) {
			builder.append("programId=");
			builder.append(programId);
			builder.append(", ");
		}

		if (inetref != null) {
			builder.append("inetref=");
			builder.append(inetref);
			builder.append(", ");
		}

		builder.append("chanId=");
		builder.append(chanId);
		builder.append(", ");

		if (callSign != null) {
			builder.append("callSign=");
			builder.append(callSign);
			builder.append(", ");
		}

		builder.append("day=");
		builder.append(day);
		builder.append(", ");

		if (time != null) {
			builder.append("time=");
			builder.append(time);
			builder.append(", ");
		}

		builder.append("findId=");
		builder.append(findId);
		builder.append(", ");

		if (type != null) {
			builder.append("type=");
			builder.append(type);
			builder.append(", ");
		}

		if (searchType != null) {
			builder.append("searchType=");
			builder.append(searchType);
			builder.append(", ");
		}

		builder.append("recPriority=");
		builder.append(recPriority);
		builder.append(", preferredInput=");
		builder.append(preferredInput);
		builder.append(", startOffset=");
		builder.append(startOffset);
		builder.append(", endOffset=");
		builder.append(endOffset);
		builder.append(", ");

		if (dupMethod != null) {
			builder.append("dupMethod=");
			builder.append(dupMethod);
			builder.append(", ");
		}

		if (dupIn != null) {
			builder.append("dupIn=");
			builder.append(dupIn);
			builder.append(", ");
		}

		builder.append("filter=");
		builder.append(filter);
		builder.append(", ");

		if (recProfile != null) {
			builder.append("recProfile=");
			builder.append(recProfile);
			builder.append(", ");
		}

		if (recGroup != null) {
			builder.append("recGroup=");
			builder.append(recGroup);
			builder.append(", ");
		}

		if (storageGroup != null) {
			builder.append("storageGroup=");
			builder.append(storageGroup);
			builder.append(", ");
		}

		if (playGroup != null) {
			builder.append("playGroup=");
			builder.append(playGroup);
			builder.append(", ");
		}

		builder.append("autoExpire=");
		builder.append(autoExpire);
		builder.append(", maxEpisodes=");
		builder.append(maxEpisodes);
		builder.append(", maxNewest=");
		builder.append(maxNewest);
		builder.append(", autoCommflag=");
		builder.append(autoCommflag);
		builder.append(", autoTranscode=");
		builder.append(autoTranscode);
		builder.append(", autoMetaLookup=");
		builder.append(autoMetaLookup);
		builder.append(", autoUserJob1=");
		builder.append(autoUserJob1);
		builder.append(", autoUserJob2=");
		builder.append(autoUserJob2);
		builder.append(", autoUserJob3=");
		builder.append(autoUserJob3);
		builder.append(", autoUserJob4=");
		builder.append(autoUserJob4);
		builder.append(", transcoder=");
		builder.append(transcoder);
		builder.append(", ");

		if (nextRecording != null) {
			builder.append("nextRecording=");
			builder.append(nextRecording);
			builder.append(", ");
		}

		if (lastRecorded != null) {
			builder.append("lastRecorded=");
			builder.append(lastRecorded);
			builder.append(", ");
		}

		if (lastDeleted != null) {
			builder.append("lastDeleted=");
			builder.append(lastDeleted);
			builder.append(", ");
		}

		builder.append("averageDelay=");
		builder.append(averageDelay);
		builder.append("]");

		return builder.toString();
	}

}
