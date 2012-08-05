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

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class Encoder {

	@JsonProperty("Id")
	private int		id;

	@JsonProperty("HostName")
	private String	hostname;

	@JsonProperty("Local")
	private boolean	local;

	@JsonProperty("Connected")
	private boolean	connected;

	@JsonProperty("State")
	private int		state;

	@JsonProperty("SleepStatus")
	private int		sleepStatus;

	@JsonProperty("LowOnFreeSpace")
	private boolean	lowOnFreeSpace;

	@JsonProperty("Recording")
	private Program	recording;

	public Encoder() {
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
	 * @return the recording
	 */
	public Program getRecording() {
		return recording;
	}

	/**
	 * @return the sleepStatus
	 */
	public int getSleepStatus() {
		return sleepStatus;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @return the connected
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * @return the local
	 */
	public boolean isLocal() {
		return local;
	}

	/**
	 * @return the lowOnFreeSpace
	 */
	public boolean isLowOnFreeSpace() {
		return lowOnFreeSpace;
	}

	/**
	 * @param connected
	 *            the connected to set
	 */
	public void setConnected(final boolean connected) {
		this.connected = connected;
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

	/**
	 * @param local
	 *            the local to set
	 */
	public void setLocal(final boolean local) {
		this.local = local;
	}

	/**
	 * @param lowOnFreeSpace
	 *            the lowOnFreeSpace to set
	 */
	public void setLowOnFreeSpace(final boolean lowOnFreeSpace) {
		this.lowOnFreeSpace = lowOnFreeSpace;
	}

	/**
	 * @param recording
	 *            the recording to set
	 */
	public void setRecording(final Program recording) {
		this.recording = recording;
	}

	/**
	 * @param sleepStatus
	 *            the sleepStatus to set
	 */
	public void setSleepStatus(final int sleepStatus) {
		this.sleepStatus = sleepStatus;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(final int state) {
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("Encoder [id=");
		builder.append(id);
		builder.append(", ");

		if (hostname != null) {
			builder.append("hostname=");
			builder.append(hostname);
			builder.append(", ");
		}

		builder.append("local=");
		builder.append(local);
		builder.append(", connected=");
		builder.append(connected);
		builder.append(", state=");
		builder.append(state);
		builder.append(", sleepStatus=");
		builder.append(sleepStatus);
		builder.append(", lowOnFreeSpace=");
		builder.append(lowOnFreeSpace);
		builder.append(", ");

		if (recording != null) {
			builder.append("recording=");
			builder.append(recording);
		}

		builder.append("]");

		return builder.toString();
	}

}
