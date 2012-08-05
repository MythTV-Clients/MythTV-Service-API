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
package com.masdaussel.mythtv.services.api.guide;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.masdaussel.mythtv.services.api.channel.ChannelInfo;

/**
 * @author sebastien
 * 
 */
public class ProgramGuide {

	@JsonProperty("StartTime")
	private Date				startTime;

	@JsonProperty("EndTime")
	private Date				endTime;

	@JsonProperty("StartChanId")
	private int					startChannelId;

	@JsonProperty("EndChanId")
	private int					endChannelId;

	@JsonProperty("NumOfChannels")
	private int					numberOfChannels;

	@JsonProperty("Details")
	private boolean				details;

	@JsonProperty("Count")
	private int					count;

	@JsonProperty("AsOf")
	private Date				asOf;

	@JsonProperty("Version")
	private String				version;

	@JsonProperty("ProtoVer")
	private String				protocolVersion;

	@JsonProperty("Channels")
	private List<ChannelInfo>	channels;

	public ProgramGuide() {
	}

	/**
	 * @return the asOf
	 */
	public Date getAsOf() {
		return asOf;
	}

	/**
	 * @return the channels
	 */
	public List<ChannelInfo> getChannels() {
		return channels;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @return the endChannelId
	 */
	public int getEndChannelId() {
		return endChannelId;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * @return the numberOfChannels
	 */
	public int getNumberOfChannels() {
		return numberOfChannels;
	}

	/**
	 * @return the protocolVersion
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * @return the startChannelId
	 */
	public int getStartChannelId() {
		return startChannelId;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @return the details
	 */
	public boolean isDetails() {
		return details;
	}

	/**
	 * @param asOf
	 *            the asOf to set
	 */
	public void setAsOf(final Date asOf) {
		this.asOf = asOf;
	}

	/**
	 * @param channels
	 *            the channels to set
	 */
	public void setChannels(final List<ChannelInfo> channels) {
		this.channels = channels;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(final int count) {
		this.count = count;
	}

	/**
	 * @param details
	 *            the details to set
	 */
	public void setDetails(final boolean details) {
		this.details = details;
	}

	/**
	 * @param endChannelId
	 *            the endChannelId to set
	 */
	public void setEndChannelId(final int endChannelId) {
		this.endChannelId = endChannelId;
	}

	/**
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(final Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * @param numberOfChannels
	 *            the numberOfChannels to set
	 */
	public void setNumberOfChannels(final int numberOfChannels) {
		this.numberOfChannels = numberOfChannels;
	}

	/**
	 * @param protocolVersion
	 *            the protocolVersion to set
	 */
	public void setProtocolVersion(final String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	/**
	 * @param startChannelId
	 *            the startChannelId to set
	 */
	public void setStartChannelId(final int startChannelId) {
		this.startChannelId = startChannelId;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(final Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(final String version) {
		this.version = version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("ProgramGuide [");

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

		builder.append("startChannelId=");
		builder.append(startChannelId);
		builder.append(", endChannelId=");
		builder.append(endChannelId);
		builder.append(", numberOfChannels=");
		builder.append(numberOfChannels);
		builder.append(", details=");
		builder.append(details);
		builder.append(", count=");
		builder.append(count);
		builder.append(", ");

		if (asOf != null) {
			builder.append("asOf=");
			builder.append(asOf);
			builder.append(", ");
		}

		if (version != null) {
			builder.append("version=");
			builder.append(version);
			builder.append(", ");
		}

		if (protocolVersion != null) {
			builder.append("protocolVersion=");
			builder.append(protocolVersion);
			builder.append(", ");
		}

		if (channels != null) {
			builder.append("channels=");
			builder.append(channels);
		}

		builder.append("]");

		return builder.toString();
	}

}
