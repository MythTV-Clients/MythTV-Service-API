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

/**
 * @author sebastien
 * 
 */
public class WOLInfo {

	private boolean	enabled;

	private int		reconnect;

	private int		retry;

	private String	command;

	public WOLInfo() {
	}

	/**
	 * @return the command
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * @return the reconnect
	 */
	public int getReconnect() {
		return reconnect;
	}

	/**
	 * @return the retry
	 */
	public int getRetry() {
		return retry;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param command
	 *            the command to set
	 */
	public void setCommand(final String command) {
		this.command = command;
	}

	/**
	 * @param enabled
	 *            the enabled to set
	 */
	public void setEnabled(final boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @param reconnect
	 *            the reconnect to set
	 */
	public void setReconnect(final int reconnect) {
		this.reconnect = reconnect;
	}

	/**
	 * @param retry
	 *            the retry to set
	 */
	public void setRetry(final int retry) {
		this.retry = retry;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("WOLInfo [enabled=");
		builder.append(enabled);
		builder.append(", reconnect=");
		builder.append(reconnect);
		builder.append(", retry=");
		builder.append(retry);
		builder.append(", ");

		if (command != null) {
			builder.append("command=");
			builder.append(command);
		}

		builder.append("]");

		return builder.toString();
	}

}
