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
package com.masdaussel.mythtv.services.api.content;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class ArtworkInfo {

	@JsonProperty("URL")
	private String	url;

	@JsonProperty("FileName")
	private String	filename;

	@JsonProperty("StorageGroup")
	private String	storageGroup;

	@JsonProperty("Type")
	private String	type;

	public ArtworkInfo() {
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @return the storageGroup
	 */
	public String getStorageGroup() {
		return storageGroup;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param filename
	 *            the filename to set
	 */
	public void setFilename(final String filename) {
		this.filename = filename;
	}

	/**
	 * @param storageGroup
	 *            the storageGroup to set
	 */
	public void setStorageGroup(final String storageGroup) {
		this.storageGroup = storageGroup;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(final String url) {
		this.url = url;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("ArtworkInfo [");

		if (url != null) {
			builder.append("url=");
			builder.append(url);
			builder.append(", ");
		}

		if (filename != null) {
			builder.append("filename=");
			builder.append(filename);
			builder.append(", ");
		}

		if (storageGroup != null) {
			builder.append("storageGroup=");
			builder.append(storageGroup);
			builder.append(", ");
		}

		if (type != null) {
			builder.append("type=");
			builder.append(type);
		}

		builder.append("]");

		return builder.toString();
	}

}
