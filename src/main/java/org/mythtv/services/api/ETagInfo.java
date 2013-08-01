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
package org.mythtv.services.api;

/**
 * @author Sebastien Astie
 *
 */
public class ETagInfo {
	private String eTag;
	
	private boolean newETag;
	
	public ETagInfo(String eTag){
		this.eTag = eTag;
		newETag = false;
	}

	public String getETag() {
		return eTag;
	}

	public void setETag(String eTag) {
		if(this.eTag == null)
		{
			if(eTag == null){
				newETag = false;
			} else {
				this.eTag = eTag;
				newETag = true;
			}
		} else {
			if(!this.eTag.equals(eTag)){
				this.eTag = eTag;
				newETag = true;
			} else {
				newETag = false;
			}
		}
	}

	public boolean isNewDataEtag() {
		return newETag;
	}
	
	public boolean isEmptyEtag(){
		return eTag == null || eTag.isEmpty();
	}
	
	public static ETagInfo createEmptyETag() {
		return new ETagInfo(null);
	}
}
