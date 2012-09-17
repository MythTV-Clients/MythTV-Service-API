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
package org.mythtv.services.api.video;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 *
 */
public class BlurayInfoWrapper {

	@JsonProperty( "BlurayInfo" )
	private BlurayInfo blurayInfo;
	
	public BlurayInfoWrapper() { }

	/**
	 * @return the blurayInfo
	 */
	public BlurayInfo getBlurayInfo() {
		return blurayInfo;
	}

	/**
	 * @param blurayInfo the blurayInfo to set
	 */
	public void setBlurayInfo( BlurayInfo blurayInfo ) {
		this.blurayInfo = blurayInfo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append( "BlurayInfoWrapper [" );
		
		if( blurayInfo != null ) {
			builder.append( "blurayInfo=" );
			builder.append( blurayInfo );
		}
		
		builder.append( "]" );
	
		return builder.toString();
	}
	
}
