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
package com.masdaussel.mythtv.services.api.channel;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class VideoSource {

	@JsonProperty("Id")
	private int		id;

	@JsonProperty("SourceName")
	private String	sourceName;

	@JsonProperty("Grabber")
	private String	grabber;

	@JsonProperty("UserId")
	private String	userId;

	@JsonProperty("FreqTable")
	private String	frequencyTable;

	@JsonProperty("LineupId")
	private String	lineupId;

	@JsonProperty("Password")
	private String	password;

	@JsonProperty("UseEIT")
	private boolean	useEIT;

	@JsonProperty("ConfigPath")
	private String	configPath;

	@JsonProperty("NITId")
	private int		nitId;

	public VideoSource() {
	}

	/**
	 * @return the configPath
	 */
	public String getConfigPath() {
		return configPath;
	}

	/**
	 * @return the frequencyTable
	 */
	public String getFrequencyTable() {
		return frequencyTable;
	}

	/**
	 * @return the grabber
	 */
	public String getGrabber() {
		return grabber;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the lineupId
	 */
	public String getLineupId() {
		return lineupId;
	}

	/**
	 * @return the nitId
	 */
	public int getNitId() {
		return nitId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the sourceName
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @return the useEIT
	 */
	public boolean isUseEIT() {
		return useEIT;
	}

	/**
	 * @param configPath
	 *            the configPath to set
	 */
	public void setConfigPath(final String configPath) {
		this.configPath = configPath;
	}

	/**
	 * @param frequencyTable
	 *            the frequencyTable to set
	 */
	public void setFrequencyTable(final String frequencyTable) {
		this.frequencyTable = frequencyTable;
	}

	/**
	 * @param grabber
	 *            the grabber to set
	 */
	public void setGrabber(final String grabber) {
		this.grabber = grabber;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @param lineupId
	 *            the lineupId to set
	 */
	public void setLineupId(final String lineupId) {
		this.lineupId = lineupId;
	}

	/**
	 * @param nitId
	 *            the nitId to set
	 */
	public void setNitId(final int nitId) {
		this.nitId = nitId;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * @param sourceName
	 *            the sourceName to set
	 */
	public void setSourceName(final String sourceName) {
		this.sourceName = sourceName;
	}

	/**
	 * @param useEIT
	 *            the useEIT to set
	 */
	public void setUseEIT(final boolean useEIT) {
		this.useEIT = useEIT;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(final String userId) {
		this.userId = userId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("VideoSource [id=");
		builder.append(id);
		builder.append(", ");

		if (sourceName != null) {
			builder.append("sourceName=");
			builder.append(sourceName);
			builder.append(", ");
		}

		if (grabber != null) {
			builder.append("grabber=");
			builder.append(grabber);
			builder.append(", ");
		}

		if (userId != null) {
			builder.append("userId=");
			builder.append(userId);
			builder.append(", ");
		}

		if (frequencyTable != null) {
			builder.append("frequencyTable=");
			builder.append(frequencyTable);
			builder.append(", ");
		}

		if (lineupId != null) {
			builder.append("lineupId=");
			builder.append(lineupId);
			builder.append(", ");
		}

		if (password != null) {
			builder.append("password=");
			builder.append(password);
			builder.append(", ");
		}

		builder.append("useEIT=");
		builder.append(useEIT);
		builder.append(", ");

		if (configPath != null) {
			builder.append("configPath=");
			builder.append(configPath);
			builder.append(", ");
		}

		builder.append("nitId=");
		builder.append(nitId);

		builder.append("]");

		return builder.toString();
	}

}
