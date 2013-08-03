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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Sebastien Astie
 */
@JsonRootName("int")
public class Int {
	
	private Integer value;
	
	public Int(String val) {
        try{
            value = Integer.parseInt(val);
        } catch (Exception e) {
            value = 0;
        }
    }

    public Int() {
        value = 0;
    }

    /**
     * @return the integer
     */
	public Integer getValue() {
		return value;
	}

	/**
	 * @param integer the integer to set
	 */
	public void setValue( Integer integer ) {
		this.value = integer;
	}
}
