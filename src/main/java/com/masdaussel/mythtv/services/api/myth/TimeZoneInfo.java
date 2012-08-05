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
package com.masdaussel.mythtv.services.api.myth;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class TimeZoneInfo {

	@JsonProperty("TimeZoneID")
	private String	timeZoneId;

	@JsonProperty("UTCOffset")
	private int		utcOffset;

	@JsonProperty("CurrentDateTime")
	private Date	currentDateTime;

	public TimeZoneInfo() {
	}

	/**
	 * @return the currentDateTime
	 */
	public Date getCurrentDateTime() {
		return currentDateTime;
	}

	/**
	 * @return the timeZoneId
	 */
	public String getTimeZoneId() {
		return timeZoneId;
	}

	/**
	 * @return the utcOffset
	 */
	public int getUtcOffset() {
		return utcOffset;
	}

	/**
	 * @param currentDateTime
	 *            the currentDateTime to set
	 */
	public void setCurrentDateTime(final Date currentDateTime) {
		this.currentDateTime = currentDateTime;
	}

	/**
	 * @param timeZoneId
	 *            the timeZoneId to set
	 */
	public void setTimeZoneId(final String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	/**
	 * @param utcOffset
	 *            the utcOffset to set
	 */
	public void setUtcOffset(final int utcOffset) {
		this.utcOffset = utcOffset;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("TimeZoneInfo [");

		if (timeZoneId != null) {
			builder.append("timeZoneId=");
			builder.append(timeZoneId);
			builder.append(", ");
		}

		builder.append("utcOffset=");
		builder.append(utcOffset);
		builder.append(", ");

		if (currentDateTime != null) {
			builder.append("currentDateTime=");
			builder.append(currentDateTime);
		}

		builder.append("]");

		return builder.toString();
	}

}
