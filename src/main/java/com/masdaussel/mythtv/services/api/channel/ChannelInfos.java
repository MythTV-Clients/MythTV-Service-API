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
public class ChannelInfos {

	@JsonProperty("StartIndex")
	private int					startIndex;

	@JsonProperty("Count")
	private int					count;

	@JsonProperty("CurrentPage")
	private int					currentPage;

	@JsonProperty("TotalPages")
	private int					totalPages;

	@JsonProperty("TotalAvailable")
	private int					totalAvailable;

	@JsonProperty("AsOf")
	private Date				asOf;

	@JsonProperty("Version")
	private String				version;

	@JsonProperty("ProtoVer")
	private String				protocolVersion;

	@JsonProperty("ChannelInfos")
	private List<ChannelInfo>	channelInfos;

	public ChannelInfos() {
	}

	/**
	 * @return the asOf
	 */
	public Date getAsOf() {
		return asOf;
	}

	/**
	 * @return the channelInfos
	 */
	public List<ChannelInfo> getChannelInfos() {
		return channelInfos;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @return the protocolVersion
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * @return the startIndex
	 */
	public int getStartIndex() {
		return startIndex;
	}

	/**
	 * @return the totalAvailable
	 */
	public int getTotalAvailable() {
		return totalAvailable;
	}

	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param asOf
	 *            the asOf to set
	 */
	public void setAsOf(final Date asOf) {
		this.asOf = asOf;
	}

	/**
	 * @param channelInfos
	 *            the channelInfos to set
	 */
	public void setChannelInfos(final List<ChannelInfo> channelInfos) {
		this.channelInfos = channelInfos;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(final int count) {
		this.count = count;
	}

	/**
	 * @param currentPage
	 *            the currentPage to set
	 */
	public void setCurrentPage(final int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @param protocolVersion
	 *            the protocolVersion to set
	 */
	public void setProtocolVersion(final String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	/**
	 * @param startIndex
	 *            the startIndex to set
	 */
	public void setStartIndex(final int startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * @param totalAvailable
	 *            the totalAvailable to set
	 */
	public void setTotalAvailable(final int totalAvailable) {
		this.totalAvailable = totalAvailable;
	}

	/**
	 * @param totalPages
	 *            the totalPages to set
	 */
	public void setTotalPages(final int totalPages) {
		this.totalPages = totalPages;
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

		builder.append("ChannelInfos [startIndex=");
		builder.append(startIndex);
		builder.append(", count=");
		builder.append(count);
		builder.append(", currentPage=");
		builder.append(currentPage);
		builder.append(", totalPages=");
		builder.append(totalPages);
		builder.append(", totalAvailable=");
		builder.append(totalAvailable);
		builder.append(", ");

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

		if (channelInfos != null) {
			builder.append("channelInfos=");
			builder.append(channelInfos);
		}

		builder.append("]");

		return builder.toString();
	}

}
