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
package com.masdaussel.mythtv.services.api.content;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class LiveStreamInfo {

	@JsonProperty("Id")
	private int		id;

	@JsonProperty("Width")
	private int		width;

	@JsonProperty("Height")
	private int		height;

	@JsonProperty("Bitrate")
	private int		bitrate;

	@JsonProperty("AudioBitrate")
	private int		audioBitrate;

	@JsonProperty("SegmentSize")
	private int		segmentSize;

	@JsonProperty("MaxSegments")
	private int		maxSegments;

	@JsonProperty("StartSegment")
	private int		startSegment;

	@JsonProperty("CurrentSegment")
	private int		currentSegment;

	@JsonProperty("SegmentCount")
	private int		segmentCount;

	@JsonProperty("PercentComplete")
	private int		percentComplete;

	@JsonProperty("Created")
	private Date	created;

	@JsonProperty("LastModified")
	private Date	lastModified;

	@JsonProperty("RelativeURL")
	private String	relativeUrl;

	@JsonProperty("FullURL")
	private String	fullUrl;

	@JsonProperty("StatusStr")
	private String	statusStr;

	@JsonProperty("StatusInt")
	private int		statusInt;

	@JsonProperty("StatusMessage")
	private String	statusMessage;

	@JsonProperty("SourceFile")
	private String	sourceFile;

	@JsonProperty("SourceHost")
	private String	sourceHost;

	@JsonProperty("SourceWidth")
	private int		sourceWidth;

	@JsonProperty("SourceHeight")
	private int		sourceHeight;

	@JsonProperty("AudioOnlyBitrate")
	private int		audioOnlyBitrate;

	public LiveStreamInfo() {
	}

	/**
	 * @return the audioBitrate
	 */
	public int getAudioBitrate() {
		return audioBitrate;
	}

	/**
	 * @return the audioOnlyBitrate
	 */
	public int getAudioOnlyBitrate() {
		return audioOnlyBitrate;
	}

	/**
	 * @return the bitrate
	 */
	public int getBitrate() {
		return bitrate;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @return the currentSegment
	 */
	public int getCurrentSegment() {
		return currentSegment;
	}

	/**
	 * @return the fullUrl
	 */
	public String getFullUrl() {
		return fullUrl;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * @return the maxSegments
	 */
	public int getMaxSegments() {
		return maxSegments;
	}

	/**
	 * @return the percentComplete
	 */
	public int getPercentComplete() {
		return percentComplete;
	}

	/**
	 * @return the relativeUrl
	 */
	public String getRelativeUrl() {
		return relativeUrl;
	}

	/**
	 * @return the segmentCount
	 */
	public int getSegmentCount() {
		return segmentCount;
	}

	/**
	 * @return the segmentSize
	 */
	public int getSegmentSize() {
		return segmentSize;
	}

	/**
	 * @return the sourceFile
	 */
	public String getSourceFile() {
		return sourceFile;
	}

	/**
	 * @return the sourceHeight
	 */
	public int getSourceHeight() {
		return sourceHeight;
	}

	/**
	 * @return the sourceHost
	 */
	public String getSourceHost() {
		return sourceHost;
	}

	/**
	 * @return the sourceWidth
	 */
	public int getSourceWidth() {
		return sourceWidth;
	}

	/**
	 * @return the startSegment
	 */
	public int getStartSegment() {
		return startSegment;
	}

	/**
	 * @return the statusInt
	 */
	public int getStatusInt() {
		return statusInt;
	}

	/**
	 * @return the statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}

	/**
	 * @return the statusStr
	 */
	public String getStatusStr() {
		return statusStr;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param audioBitrate
	 *            the audioBitrate to set
	 */
	public void setAudioBitrate(final int audioBitrate) {
		this.audioBitrate = audioBitrate;
	}

	/**
	 * @param audioOnlyBitrate
	 *            the audioOnlyBitrate to set
	 */
	public void setAudioOnlyBitrate(final int audioOnlyBitrate) {
		this.audioOnlyBitrate = audioOnlyBitrate;
	}

	/**
	 * @param bitrate
	 *            the bitrate to set
	 */
	public void setBitrate(final int bitrate) {
		this.bitrate = bitrate;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(final Date created) {
		this.created = created;
	}

	/**
	 * @param currentSegment
	 *            the currentSegment to set
	 */
	public void setCurrentSegment(final int currentSegment) {
		this.currentSegment = currentSegment;
	}

	/**
	 * @param fullUrl
	 *            the fullUrl to set
	 */
	public void setFullUrl(final String fullUrl) {
		this.fullUrl = fullUrl;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(final int height) {
		this.height = height;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @param lastModified
	 *            the lastModified to set
	 */
	public void setLastModified(final Date lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * @param maxSegments
	 *            the maxSegments to set
	 */
	public void setMaxSegments(final int maxSegments) {
		this.maxSegments = maxSegments;
	}

	/**
	 * @param percentComplete
	 *            the percentComplete to set
	 */
	public void setPercentComplete(final int percentComplete) {
		this.percentComplete = percentComplete;
	}

	/**
	 * @param relativeUrl
	 *            the relativeUrl to set
	 */
	public void setRelativeUrl(final String relativeUrl) {
		this.relativeUrl = relativeUrl;
	}

	/**
	 * @param segmentCount
	 *            the segmentCount to set
	 */
	public void setSegmentCount(final int segmentCount) {
		this.segmentCount = segmentCount;
	}

	/**
	 * @param segmentSize
	 *            the segmentSize to set
	 */
	public void setSegmentSize(final int segmentSize) {
		this.segmentSize = segmentSize;
	}

	/**
	 * @param sourceFile
	 *            the sourceFile to set
	 */
	public void setSourceFile(final String sourceFile) {
		this.sourceFile = sourceFile;
	}

	/**
	 * @param sourceHeight
	 *            the sourceHeight to set
	 */
	public void setSourceHeight(final int sourceHeight) {
		this.sourceHeight = sourceHeight;
	}

	/**
	 * @param sourceHost
	 *            the sourceHost to set
	 */
	public void setSourceHost(final String sourceHost) {
		this.sourceHost = sourceHost;
	}

	/**
	 * @param sourceWidth
	 *            the sourceWidth to set
	 */
	public void setSourceWidth(final int sourceWidth) {
		this.sourceWidth = sourceWidth;
	}

	/**
	 * @param startSegment
	 *            the startSegment to set
	 */
	public void setStartSegment(final int startSegment) {
		this.startSegment = startSegment;
	}

	/**
	 * @param statusInt
	 *            the statusInt to set
	 */
	public void setStatusInt(final int statusInt) {
		this.statusInt = statusInt;
	}

	/**
	 * @param statusMessage
	 *            the statusMessage to set
	 */
	public void setStatusMessage(final String statusMessage) {
		this.statusMessage = statusMessage;
	}

	/**
	 * @param statusStr
	 *            the statusStr to set
	 */
	public void setStatusStr(final String statusStr) {
		this.statusStr = statusStr;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(final int width) {
		this.width = width;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("LiveStreamInfo [id=");
		builder.append(id);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", bitrate=");
		builder.append(bitrate);
		builder.append(", audioBitrate=");
		builder.append(audioBitrate);
		builder.append(", segmentSize=");
		builder.append(segmentSize);
		builder.append(", maxSegments=");
		builder.append(maxSegments);
		builder.append(", startSegment=");
		builder.append(startSegment);
		builder.append(", currentSegment=");
		builder.append(currentSegment);
		builder.append(", segmentCount=");
		builder.append(segmentCount);
		builder.append(", percentComplete=");
		builder.append(percentComplete);
		builder.append(", ");

		if (created != null) {
			builder.append("created=");
			builder.append(created);
			builder.append(", ");
		}

		if (lastModified != null) {
			builder.append("lastModified=");
			builder.append(lastModified);
			builder.append(", ");
		}

		if (relativeUrl != null) {
			builder.append("relativeUrl=");
			builder.append(relativeUrl);
			builder.append(", ");
		}

		if (fullUrl != null) {
			builder.append("fullUrl=");
			builder.append(fullUrl);
			builder.append(", ");
		}

		if (statusStr != null) {
			builder.append("statusStr=");
			builder.append(statusStr);
			builder.append(", ");
		}

		builder.append("statusInt=");
		builder.append(statusInt);
		builder.append(", ");

		if (statusMessage != null) {
			builder.append("statusMessage=");
			builder.append(statusMessage);
			builder.append(", ");
		}

		if (sourceFile != null) {
			builder.append("sourceFile=");
			builder.append(sourceFile);
			builder.append(", ");
		}

		if (sourceHost != null) {
			builder.append("sourceHost=");
			builder.append(sourceHost);
			builder.append(", ");
		}

		builder.append("sourceWidth=");
		builder.append(sourceWidth);
		builder.append(", sourceHeight=");
		builder.append(sourceHeight);
		builder.append(", audioOnlyBitrate=");
		builder.append(audioOnlyBitrate);

		builder.append("]");

		return builder.toString();
	}

}
