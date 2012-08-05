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
public class Lineup {

	@JsonProperty("LineupId")
	private String	lineupId;

	@JsonProperty("Name")
	private String	name;

	@JsonProperty("DisplayName")
	private String	displayName;

	@JsonProperty("Type")
	private String	type;

	@JsonProperty("Postal")
	private String	postal;

	@JsonProperty("Device")
	private String	device;

	public Lineup() {
	}

	/**
	 * @return the device
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @return the lineupId
	 */
	public String getLineupId() {
		return lineupId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the postal
	 */
	public String getPostal() {
		return postal;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param device
	 *            the device to set
	 */
	public void setDevice(final String device) {
		this.device = device;
	}

	/**
	 * @param displayName
	 *            the displayName to set
	 */
	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @param lineupId
	 *            the lineupId to set
	 */
	public void setLineupId(final String lineupId) {
		this.lineupId = lineupId;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @param postal
	 *            the postal to set
	 */
	public void setPostal(final String postal) {
		this.postal = postal;
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

		builder.append("Lineup [");

		if (lineupId != null) {
			builder.append("lineupId=");
			builder.append(lineupId);
			builder.append(", ");
		}

		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}

		if (displayName != null) {
			builder.append("displayName=");
			builder.append(displayName);
			builder.append(", ");
		}

		if (type != null) {
			builder.append("type=");
			builder.append(type);
			builder.append(", ");
		}

		if (postal != null) {
			builder.append("postal=");
			builder.append(postal);
			builder.append(", ");
		}

		if (device != null) {
			builder.append("device=");
			builder.append(device);
		}

		builder.append("]");

		return builder.toString();
	}

}
