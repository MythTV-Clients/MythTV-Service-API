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

import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class Setting {

	@JsonProperty("HostName")
	private String				hostname;

	@JsonProperty("Settings")
	private Map<String, String>	settings;

	public Setting() {
	}

	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @return the settings
	 */
	public Map<String, String> getSettings() {
		return settings;
	}

	/**
	 * @param hostname
	 *            the hostname to set
	 */
	public void setHostname(final String hostname) {
		this.hostname = hostname;
	}

	/**
	 * @param settings
	 *            the settings to set
	 */
	public void setSettings(final Map<String, String> settings) {
		this.settings = settings;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("Setting [");

		if (hostname != null) {
			builder.append("hostname=");
			builder.append(hostname);
			builder.append(", ");
		}

		if (settings != null) {
			builder.append("settings=");
			builder.append(settings);
		}

		builder.append("]");

		return builder.toString();
	}

}
