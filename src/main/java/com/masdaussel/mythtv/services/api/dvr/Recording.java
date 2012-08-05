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
public class Recording {

	@JsonProperty("Status")
	private int		status;

	@JsonProperty("Priority")
	private int		priority;

	@JsonProperty("StartTs")
	private Date	startTimestamp;

	@JsonProperty("EndTs")
	private Date	endTimestamp;

	@JsonProperty("RecordId")
	private int		recordid;

	@JsonProperty("RecGroup")
	private String	recordingGroup;

	@JsonProperty("StorageGroup")
	private String	storageGroup;

	@JsonProperty("PlayGroup")
	private String	playGroup;

	@JsonProperty("RecType")
	private int		recordingType;

	@JsonProperty("DupInType")
	private int		duplicateInType;

	@JsonProperty("DupMethod")
	private int		duplicateMethod;

	@JsonProperty("EncoderId")
	private int		encoderId;

	@JsonProperty("Profile")
	private String	profile;

	public Recording() {
	}

	/**
	 * @return the duplicateInType
	 */
	public int getDuplicateInType() {
		return duplicateInType;
	}

	/**
	 * @return the duplicateMethod
	 */
	public int getDuplicateMethod() {
		return duplicateMethod;
	}

	/**
	 * @return the encoderId
	 */
	public int getEncoderId() {
		return encoderId;
	}

	/**
	 * @return the endTimestamp
	 */
	public Date getEndTimestamp() {
		return endTimestamp;
	}

	/**
	 * @return the playGroup
	 */
	public String getPlayGroup() {
		return playGroup;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @return the profile
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * @return the recordid
	 */
	public int getRecordid() {
		return recordid;
	}

	/**
	 * @return the recordingGroup
	 */
	public String getRecordingGroup() {
		return recordingGroup;
	}

	/**
	 * @return the recordingType
	 */
	public int getRecordingType() {
		return recordingType;
	}

	/**
	 * @return the startTimestamp
	 */
	public Date getStartTimestamp() {
		return startTimestamp;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @return the storageGroup
	 */
	public String getStorageGroup() {
		return storageGroup;
	}

	/**
	 * @param duplicateInType
	 *            the duplicateInType to set
	 */
	public void setDuplicateInType(final int duplicateInType) {
		this.duplicateInType = duplicateInType;
	}

	/**
	 * @param duplicateMethod
	 *            the duplicateMethod to set
	 */
	public void setDuplicateMethod(final int duplicateMethod) {
		this.duplicateMethod = duplicateMethod;
	}

	/**
	 * @param encoderId
	 *            the encoderId to set
	 */
	public void setEncoderId(final int encoderId) {
		this.encoderId = encoderId;
	}

	/**
	 * @param endTimestamp
	 *            the endTimestamp to set
	 */
	public void setEndTimestamp(final Date endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	/**
	 * @param playGroup
	 *            the playGroup to set
	 */
	public void setPlayGroup(final String playGroup) {
		this.playGroup = playGroup;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(final int priority) {
		this.priority = priority;
	}

	/**
	 * @param profile
	 *            the profile to set
	 */
	public void setProfile(final String profile) {
		this.profile = profile;
	}

	/**
	 * @param recordid
	 *            the recordid to set
	 */
	public void setRecordid(final int recordid) {
		this.recordid = recordid;
	}

	/**
	 * @param recordingGroup
	 *            the recordingGroup to set
	 */
	public void setRecordingGroup(final String recordingGroup) {
		this.recordingGroup = recordingGroup;
	}

	/**
	 * @param recordingType
	 *            the recordingType to set
	 */
	public void setRecordingType(final int recordingType) {
		this.recordingType = recordingType;
	}

	/**
	 * @param startTimestamp
	 *            the startTimestamp to set
	 */
	public void setStartTimestamp(final Date startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(final int status) {
		this.status = status;
	}

	/**
	 * @param storageGroup
	 *            the storageGroup to set
	 */
	public void setStorageGroup(final String storageGroup) {
		this.storageGroup = storageGroup;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("Recording [status=");

		builder.append(status);
		builder.append(", priority=");
		builder.append(priority);
		builder.append(", ");

		if (startTimestamp != null) {
			builder.append("startTimestamp=");
			builder.append(startTimestamp);
			builder.append(", ");
		}

		if (endTimestamp != null) {
			builder.append("endTimestamp=");
			builder.append(endTimestamp);
			builder.append(", ");
		}

		builder.append("recordid=");
		builder.append(recordid);
		builder.append(", ");

		if (recordingGroup != null) {
			builder.append("recordingGroup=");
			builder.append(recordingGroup);
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

		builder.append("recordingType=");
		builder.append(recordingType);
		builder.append(", duplicateInType=");
		builder.append(duplicateInType);
		builder.append(", duplicateMethod=");
		builder.append(duplicateMethod);
		builder.append(", encoderId=");
		builder.append(encoderId);
		builder.append(", ");

		if (profile != null) {
			builder.append("profile=");
			builder.append(profile);
		}

		builder.append("]");

		return builder.toString();
	}

}
