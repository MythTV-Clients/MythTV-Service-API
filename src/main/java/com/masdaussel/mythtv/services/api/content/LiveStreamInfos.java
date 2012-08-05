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

/**
 * @author sebastien
 * 
 */
public class LiveStreamInfos {

	private List<LiveStreamInfo>	liveStreamInfos;

	public LiveStreamInfos() {
	}

	/**
	 * @return the liveStreamInfos
	 */
	public List<LiveStreamInfo> getLiveStreamInfos() {
		return liveStreamInfos;
	}

	/**
	 * @param liveStreamInfos
	 *            the liveStreamInfos to set
	 */
	public void setLiveStreamInfos(final List<LiveStreamInfo> liveStreamInfos) {
		this.liveStreamInfos = liveStreamInfos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("LiveStreamInfos [");

		if (liveStreamInfos != null) {
			builder.append("liveStreamInfos=");
			builder.append(liveStreamInfos);
		}

		builder.append("]");

		return builder.toString();
	}

}
