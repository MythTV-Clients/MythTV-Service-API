/**
 *  This file is part of MythTV for Android
 * 
 *  MythTV for Android is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV for Android is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV for Android.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/MythTV-Android/MythTV-Service-API/>
 *
 */
package org.mythtv.services.api.v026.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Daniel Frey
 *
 */
public class LiveStreamInfoList {

	@JsonProperty( "LiveStreamInfoList" )
	private LiveStreamInfos liveStreamInfos;

	public LiveStreamInfoList() { }

	/**
	 * @return the liveStreamInfos
	 */
	public LiveStreamInfos getLiveStreamInfos() {
		return liveStreamInfos;
	}

	/**
	 * @param liveStreamInfos the liveStreamInfos to set
	 */
	public void setLiveStreamInfos( LiveStreamInfos liveStreamInfos ) {
		this.liveStreamInfos = liveStreamInfos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append( "LiveStreamInfosList [" );
		
		if( liveStreamInfos != null ) {
			builder.append( "liveStreamInfos=" );
			builder.append( liveStreamInfos );
		}
		
		builder.append( "]" );
	
		return builder.toString();
	}
	
}
