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

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class ArtworkInfos {

	@JsonProperty("ArtworkInfos")
	private List<ArtworkInfo>	artworkInfos;

	public ArtworkInfos() {
	}

	/**
	 * @return the artworkInfos
	 */
	public List<ArtworkInfo> getArtworkInfos() {
		return artworkInfos;
	}

	/**
	 * @param artworkInfos
	 *            the artworkInfos to set
	 */
	public void setArtworkInfos(final List<ArtworkInfo> artworkInfos) {
		this.artworkInfos = artworkInfos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("ArtworkInfos [");

		if (artworkInfos != null) {
			builder.append("artworkInfos=");
			builder.append(artworkInfos);
		}

		builder.append("]");

		return builder.toString();
	}

}
