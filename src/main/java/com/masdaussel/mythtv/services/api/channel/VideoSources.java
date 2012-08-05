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
package com.masdaussel.mythtv.services.api.channel;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class VideoSources {

	@JsonProperty("AsOf")
	private Date				asOf;

	@JsonProperty("Version")
	private String				version;

	@JsonProperty("ProtoVer")
	private String				protocolVersion;

	@JsonProperty("VideoSources")
	private List<VideoSource>	videoSources;

	public VideoSources() {
	}

	/**
	 * @return the asOf
	 */
	public Date getAsOf() {
		return asOf;
	}

	/**
	 * @return the protocolVersion
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @return the videoSources
	 */
	public List<VideoSource> getVideoSources() {
		return videoSources;
	}

	/**
	 * @param asOf
	 *            the asOf to set
	 */
	public void setAsOf(final Date asOf) {
		this.asOf = asOf;
	}

	/**
	 * @param protocolVersion
	 *            the protocolVersion to set
	 */
	public void setProtocolVersion(final String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(final String version) {
		this.version = version;
	}

	/**
	 * @param videoSources
	 *            the videoSources to set
	 */
	public void setVideoSources(final List<VideoSource> videoSources) {
		this.videoSources = videoSources;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("VideoSources [");

		if (asOf != null) {
			builder.append("asOf=");
			builder.append(asOf);
			builder.append(", ");
		}

		if (version != null) {
			builder.append("version=");
			builder.append(version);
			builder.append(", ");
		}

		if (protocolVersion != null) {
			builder.append("protocolVersion=");
			builder.append(protocolVersion);
			builder.append(", ");
		}

		if (videoSources != null) {
			builder.append("videoSources=");
			builder.append(videoSources);
		}

		builder.append("]");

		return builder.toString();
	}

}
