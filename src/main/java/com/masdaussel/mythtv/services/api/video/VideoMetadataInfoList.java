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
public class VideoMetadataInfoList {

	@JsonProperty("VideoMetadataInfoList")
	private VideoMetadataInfos	videoMetadataInfos;

	public VideoMetadataInfoList() {
	}

	/**
	 * @return the videoMetadataInfos
	 */
	public VideoMetadataInfos getVideoMetadataInfos() {
		return videoMetadataInfos;
	}

	/**
	 * @param videoMetadataInfos
	 *            the videoMetadataInfos to set
	 */
	public void setVideoMetadataInfos(final VideoMetadataInfos videoMetadataInfos) {
		this.videoMetadataInfos = videoMetadataInfos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("VideoMetadataInfoList [");

		if (videoMetadataInfos != null) {
			builder.append("videoMetadataInfos=");
			builder.append(videoMetadataInfos);
		}

		builder.append("]");

		return builder.toString();
	}

}
