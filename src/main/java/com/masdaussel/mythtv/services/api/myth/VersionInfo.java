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
public class VersionInfo {

	@JsonProperty("Version")
	private String	version;

	@JsonProperty("Branch")
	private String	branch;

	@JsonProperty("Protocol")
	private String	protocol;

	@JsonProperty("Binary")
	private String	binary;

	@JsonProperty("Schema")
	private String	schema;

	public VersionInfo() {
	}

	/**
	 * @return the binary
	 */
	public String getBinary() {
		return binary;
	}

	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * @return the schema
	 */
	public String getSchema() {
		return schema;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param binary
	 *            the binary to set
	 */
	public void setBinary(final String binary) {
		this.binary = binary;
	}

	/**
	 * @param branch
	 *            the branch to set
	 */
	public void setBranch(final String branch) {
		this.branch = branch;
	}

	/**
	 * @param protocol
	 *            the protocol to set
	 */
	public void setProtocol(final String protocol) {
		this.protocol = protocol;
	}

	/**
	 * @param schema
	 *            the schema to set
	 */
	public void setSchema(final String schema) {
		this.schema = schema;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(final String version) {
		this.version = version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("VersionInfo [");

		if (version != null) {
			builder.append("version=");
			builder.append(version);
			builder.append(", ");
		}

		if (branch != null) {
			builder.append("branch=");
			builder.append(branch);
			builder.append(", ");
		}

		if (protocol != null) {
			builder.append("protocol=");
			builder.append(protocol);
			builder.append(", ");
		}

		if (binary != null) {
			builder.append("binary=");
			builder.append(binary);
			builder.append(", ");
		}

		if (schema != null) {
			builder.append("schema=");
			builder.append(schema);
		}

		builder.append("]");

		return builder.toString();
	}

}
