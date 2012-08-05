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

import com.masdaussel.mythtv.services.api.channel.ChannelInfo;
import com.masdaussel.mythtv.services.api.content.ArtworkInfos;

/**
 * @author sebastien
 * 
 */
public class Program {

	@JsonProperty("StartTime")
	private Date			startTime;

	@JsonProperty("EndTime")
	private Date			endTime;

	@JsonProperty("Title")
	private String			title;

	@JsonProperty("SubTitle")
	private String			subTitle;

	@JsonProperty("Category")
	private String			category;

	@JsonProperty("CatType")
	private String			categoryType;

	@JsonProperty("Repeat")
	private boolean			repeat;

	@JsonProperty("VideoProps")
	private int				videoProps;

	@JsonProperty("AudioProps")
	private int				audioProps;

	@JsonProperty("SubProps")
	private int				subProps;

	@JsonProperty("SeriesId")
	private String			seriesId;

	@JsonProperty("ProgramId")
	private String			programId;

	@JsonProperty("Stars")
	private float			stars;

	@JsonProperty("FileSize")
	private String			fileSize;

	@JsonProperty("LastModified")
	private Date			lastModified;

	@JsonProperty("ProgramFlags")
	private String			programFlags;

	@JsonProperty("HostName")
	private String			hostname;

	@JsonProperty("FileName")
	private String			filename;

	@JsonProperty("Airdate")
	private Date			airDate;

	@JsonProperty("Description")
	private String			description;

	@JsonProperty("Inetref")
	private String			inetref;

	@JsonProperty("Season")
	private String			season;

	@JsonProperty("Episode")
	private String			episode;

	@JsonProperty("Channel")
	private ChannelInfo		channelInfo;

	@JsonProperty("Recording")
	private Recording		recording;

	@JsonProperty("Artwork")
	private ArtworkInfos	artwork;

	public Program() {
	}

	/**
	 * @return the airDate
	 */
	public Date getAirDate() {
		return airDate;
	}

	/**
	 * @return the artwork
	 */
	public ArtworkInfos getArtwork() {
		return artwork;
	}

	/**
	 * @return the audioProps
	 */
	public int getAudioProps() {
		return audioProps;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the categoryType
	 */
	public String getCategoryType() {
		return categoryType;
	}

	/**
	 * @return the channelInfo
	 */
	public ChannelInfo getChannelInfo() {
		return channelInfo;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
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
	public String getEpisode() {
		return episode;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @return the fileSize
	 */
	public String getFileSize() {
		return fileSize;
	}

	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @return the inetref
	 */
	public String getInetref() {
		return inetref;
	}

	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * @return the programFlags
	 */
	public String getProgramFlags() {
		return programFlags;
	}

	/**
	 * @return the programId
	 */
	public String getProgramId() {
		return programId;
	}

	/**
	 * @return the recording
	 */
	public Recording getRecording() {
		return recording;
	}

	/**
	 * @return the season
	 */
	public String getSeason() {
		return season;
	}

	/**
	 * @return the seriesId
	 */
	public String getSeriesId() {
		return seriesId;
	}

	/**
	 * @return the stars
	 */
	public float getStars() {
		return stars;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @return the subProps
	 */
	public int getSubProps() {
		return subProps;
	}

	/**
	 * @return the subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the videoProps
	 */
	public int getVideoProps() {
		return videoProps;
	}

	/**
	 * @return the repeat
	 */
	public boolean isRepeat() {
		return repeat;
	}

	/**
	 * @param airDate
	 *            the airDate to set
	 */
	public void setAirDate(final Date airDate) {
		this.airDate = airDate;
	}

	/**
	 * @param artwork
	 *            the artwork to set
	 */
	public void setArtwork(final ArtworkInfos artwork) {
		this.artwork = artwork;
	}

	/**
	 * @param audioProps
	 *            the audioProps to set
	 */
	public void setAudioProps(final int audioProps) {
		this.audioProps = audioProps;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(final String category) {
		this.category = category;
	}

	/**
	 * @param categoryType
	 *            the categoryType to set
	 */
	public void setCategoryType(final String categoryType) {
		this.categoryType = categoryType;
	}

	/**
	 * @param channelInfo
	 *            the channelInfo to set
	 */
	public void setChannelInfo(final ChannelInfo channelInfo) {
		this.channelInfo = channelInfo;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
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
	public void setEpisode(final String episode) {
		this.episode = episode;
	}

	/**
	 * @param filename
	 *            the filename to set
	 */
	public void setFilename(final String filename) {
		this.filename = filename;
	}

	/**
	 * @param fileSize
	 *            the fileSize to set
	 */
	public void setFileSize(final String fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * @param hostname
	 *            the hostname to set
	 */
	public void setHostname(final String hostname) {
		this.hostname = hostname;
	}

	/**
	 * @param inetref
	 *            the inetref to set
	 */
	public void setInetref(final String inetref) {
		this.inetref = inetref;
	}

	/**
	 * @param lastModified
	 *            the lastModified to set
	 */
	public void setLastModified(final Date lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * @param programFlags
	 *            the programFlags to set
	 */
	public void setProgramFlags(final String programFlags) {
		this.programFlags = programFlags;
	}

	/**
	 * @param programId
	 *            the programId to set
	 */
	public void setProgramId(final String programId) {
		this.programId = programId;
	}

	/**
	 * @param recording
	 *            the recording to set
	 */
	public void setRecording(final Recording recording) {
		this.recording = recording;
	}

	/**
	 * @param repeat
	 *            the repeat to set
	 */
	public void setRepeat(final boolean repeat) {
		this.repeat = repeat;
	}

	/**
	 * @param season
	 *            the season to set
	 */
	public void setSeason(final String season) {
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
	 * @param stars
	 *            the stars to set
	 */
	public void setStars(final float stars) {
		this.stars = stars;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(final Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @param subProps
	 *            the subProps to set
	 */
	public void setSubProps(final int subProps) {
		this.subProps = subProps;
	}

	/**
	 * @param subTitle
	 *            the subTitle to set
	 */
	public void setSubTitle(final String subTitle) {
		this.subTitle = subTitle;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * @param videoProps
	 *            the videoProps to set
	 */
	public void setVideoProps(final int videoProps) {
		this.videoProps = videoProps;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("Program [");

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

		if (category != null) {
			builder.append("category=");
			builder.append(category);
			builder.append(", ");
		}

		if (categoryType != null) {
			builder.append("categoryType=");
			builder.append(categoryType);
			builder.append(", ");
		}

		builder.append("repeat=");
		builder.append(repeat);
		builder.append(", ");

		builder.append("videoProps=");
		builder.append(videoProps);
		builder.append(", ");

		builder.append("audioProps=");
		builder.append(audioProps);
		builder.append(", ");

		builder.append("subProps=");
		builder.append(subProps);
		builder.append(", ");

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

		builder.append("stars=");
		builder.append(stars);
		builder.append(", ");

		if (fileSize != null) {
			builder.append("fileSize=");
			builder.append(fileSize);
			builder.append(", ");
		}

		if (lastModified != null) {
			builder.append("lastModified=");
			builder.append(lastModified);
			builder.append(", ");
		}

		if (programFlags != null) {
			builder.append("programFlags=");
			builder.append(programFlags);
			builder.append(", ");
		}

		if (hostname != null) {
			builder.append("hostname=");
			builder.append(hostname);
			builder.append(", ");
		}

		if (filename != null) {
			builder.append("filename=");
			builder.append(filename);
			builder.append(", ");
		}

		if (airDate != null) {
			builder.append("airDate=");
			builder.append(airDate);
			builder.append(", ");
		}

		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}

		if (inetref != null) {
			builder.append("inetref=");
			builder.append(inetref);
			builder.append(", ");
		}

		if (season != null) {
			builder.append("season=");
			builder.append(season);
			builder.append(", ");
		}

		if (episode != null) {
			builder.append("episode=");
			builder.append(episode);
			builder.append(", ");
		}

		if (channelInfo != null) {
			builder.append("channelInfo=");
			builder.append(channelInfo);
			builder.append(", ");
		}

		if (recording != null) {
			builder.append("recording=");
			builder.append(recording);
			builder.append(", ");
		}

		if (artwork != null) {
			builder.append("artwork=");
			builder.append(artwork);
		}

		builder.append("]");

		return builder.toString();
	}

}
