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
package com.masdaussel.mythtv.services.api.video;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class ArtworkItem {

	@JsonProperty("Type")
	private String	type;

	@JsonProperty("Url")
	private String	url;

	@JsonProperty("Thumbnail")
	private String	thumbnail;

	@JsonProperty("Width")
	private int		width;

	@JsonProperty("Height")
	private int		height;

	public ArtworkItem() {
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return the thumbnail
	 */
	public String getThumbnail() {
		return thumbnail;
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
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(final int height) {
		this.height = height;
	}

	/**
	 * @param thumbnail
	 *            the thumbnail to set
	 */
	public void setThumbnail(final String thumbnail) {
		this.thumbnail = thumbnail;
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

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(final int width) {
		this.width = width;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("ArtworkItem [");

		if (type != null) {
			builder.append("type=");
			builder.append(type);
			builder.append(", ");
		}

		if (url != null) {
			builder.append("url=");
			builder.append(url);
			builder.append(", ");
		}

		if (thumbnail != null) {
			builder.append("thumbnail=");
			builder.append(thumbnail);
			builder.append(", ");
		}

		builder.append("width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append("]");

		return builder.toString();
	}

}
