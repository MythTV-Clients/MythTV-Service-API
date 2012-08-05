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
public class ConnectionInfo {

	@JsonProperty("Version")
	private VersionInfo		version;

	@JsonProperty("Database")
	private DatabaseInfo	database;

	@JsonProperty("WOL")
	private WOLInfo			wol;

	public ConnectionInfo() {
	}

	/**
	 * @return the database
	 */
	public DatabaseInfo getDatabase() {
		return database;
	}

	/**
	 * @return the version
	 */
	public VersionInfo getVersion() {
		return version;
	}

	/**
	 * @return the wol
	 */
	public WOLInfo getWol() {
		return wol;
	}

	/**
	 * @param database
	 *            the database to set
	 */
	public void setDatabase(final DatabaseInfo database) {
		this.database = database;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(final VersionInfo version) {
		this.version = version;
	}

	/**
	 * @param wol
	 *            the wol to set
	 */
	public void setWol(final WOLInfo wol) {
		this.wol = wol;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("ConnectionInfo [");

		if (version != null) {
			builder.append("version=");
			builder.append(version);
			builder.append(", ");
		}

		if (database != null) {
			builder.append("database=");
			builder.append(database);
			builder.append(", ");
		}

		if (wol != null) {
			builder.append("wol=");
			builder.append(wol);
		}

		builder.append("]");

		return builder.toString();
	}

}
