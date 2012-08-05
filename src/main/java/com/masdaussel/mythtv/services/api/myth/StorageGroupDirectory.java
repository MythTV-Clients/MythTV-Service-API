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

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class StorageGroupDirectory {

	@JsonProperty("Id")
	private int		id;

	@JsonProperty("GroupName")
	private String	groupName;

	@JsonProperty("HostName")
	private String	hostname;

	@JsonProperty("DirName")
	private String	directoryName;

	public StorageGroupDirectory() {
	}

	/**
	 * @return the directoryName
	 */
	public String getDirectoryName() {
		return directoryName;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param directoryName
	 *            the directoryName to set
	 */
	public void setDirectoryName(final String directoryName) {
		this.directoryName = directoryName;
	}

	/**
	 * @param groupName
	 *            the groupName to set
	 */
	public void setGroupName(final String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @param hostname
	 *            the hostname to set
	 */
	public void setHostname(final String hostname) {
		this.hostname = hostname;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("StorageGroupDirectory [id=");
		builder.append(id);
		builder.append(", ");

		if (groupName != null) {
			builder.append("groupName=");
			builder.append(groupName);
			builder.append(", ");
		}

		if (hostname != null) {
			builder.append("hostname=");
			builder.append(hostname);
			builder.append(", ");
		}

		if (directoryName != null) {
			builder.append("directoryName=");
			builder.append(directoryName);
		}

		builder.append("]");

		return builder.toString();
	}

}
