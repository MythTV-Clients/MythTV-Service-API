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
public class DatabaseInfo {

	@JsonProperty("Host")
	private String	host;

	@JsonProperty("Ping")
	private boolean	ping;

	@JsonProperty("Port")
	private int		port;

	@JsonProperty("UserName")
	private String	username;

	@JsonProperty("Password")
	private String	password;

	@JsonProperty("Name")
	private String	name;

	@JsonProperty("Type")
	private String	type;

	@JsonProperty("LocalEnabled")
	private boolean	localEnabled;

	@JsonProperty("LocalHostName")
	private String	localHostName;

	public DatabaseInfo() {
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @return the localHostName
	 */
	public String getLocalHostName() {
		return localHostName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the localEnabled
	 */
	public boolean isLocalEnabled() {
		return localEnabled;
	}

	/**
	 * @return the ping
	 */
	public boolean isPing() {
		return ping;
	}

	/**
	 * @param host
	 *            the host to set
	 */
	public void setHost(final String host) {
		this.host = host;
	}

	/**
	 * @param localEnabled
	 *            the localEnabled to set
	 */
	public void setLocalEnabled(final boolean localEnabled) {
		this.localEnabled = localEnabled;
	}

	/**
	 * @param localHostName
	 *            the localHostName to set
	 */
	public void setLocalHostName(final String localHostName) {
		this.localHostName = localHostName;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * @param ping
	 *            the ping to set
	 */
	public void setPing(final boolean ping) {
		this.ping = ping;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(final int port) {
		this.port = port;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("DatabaseInfo [");

		if (host != null) {
			builder.append("host=");
			builder.append(host);
			builder.append(", ");
		}

		builder.append("ping=");
		builder.append(ping);
		builder.append(", port=");
		builder.append(port);
		builder.append(", ");

		if (username != null) {
			builder.append("username=");
			builder.append(username);
			builder.append(", ");
		}

		if (password != null) {
			builder.append("password=");
			builder.append(password);
			builder.append(", ");
		}

		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}

		if (type != null) {
			builder.append("type=");
			builder.append(type);
			builder.append(", ");
		}

		builder.append("localEnabled=");
		builder.append(localEnabled);
		builder.append(", ");

		if (localHostName != null) {
			builder.append("localHostName=");
			builder.append(localHostName);
		}

		builder.append("]");

		return builder.toString();
	}

}
