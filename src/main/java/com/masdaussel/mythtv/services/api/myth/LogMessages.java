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

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class LogMessages {

	@JsonProperty("HostNames")
	private List<LabelValue>	hostnames;

	@JsonProperty("Applications")
	private List<LabelValue>	applications;

	@JsonProperty("LogMessages")
	private List<LogMessage>	logMessages;

	public LogMessages() {
	}

	/**
	 * @return the applications
	 */
	public List<LabelValue> getApplications() {
		return applications;
	}

	/**
	 * @return the hostnames
	 */
	public List<LabelValue> getHostnames() {
		return hostnames;
	}

	/**
	 * @return the logMessages
	 */
	public List<LogMessage> getLogMessages() {
		return logMessages;
	}

	/**
	 * @param applications
	 *            the applications to set
	 */
	public void setApplications(final List<LabelValue> applications) {
		this.applications = applications;
	}

	/**
	 * @param hostnames
	 *            the hostnames to set
	 */
	public void setHostnames(final List<LabelValue> hostnames) {
		this.hostnames = hostnames;
	}

	/**
	 * @param logMessages
	 *            the logMessages to set
	 */
	public void setLogMessages(final List<LogMessage> logMessages) {
		this.logMessages = logMessages;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("LogMessages [");

		if (hostnames != null) {
			builder.append("hostnames=");
			builder.append(hostnames);
			builder.append(", ");
		}

		if (applications != null) {
			builder.append("applications=");
			builder.append(applications);
			builder.append(", ");
		}

		if (logMessages != null) {
			builder.append("logMessages=");
			builder.append(logMessages);
		}

		builder.append("]");

		return builder.toString();
	}

}
