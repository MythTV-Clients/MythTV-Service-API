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

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Sebastien Astie
 */
@JsonRootName("bool")
public class Bool {
	
	public Bool(String val){
        value = Boolean.parseBoolean(val);
    }

    public Bool(){
        value = Boolean.FALSE;
    }

    private Boolean value;

	/**
	 * @return the bool
	 */
	public Boolean getValue() {
		return value;
	}

	/**
	 * @param bool the bool to set
	 */
	public void setBool( Boolean bool ) {
		this.value = bool;
	}
}