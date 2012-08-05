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
package com.masdaussel.mythtv.services.connect;

import com.masdaussel.mythtv.services.api.MythServicesApi;
import com.masdaussel.mythtv.services.api.MythServicesApiTemplate;

/**
 * @author sebastien
 * 
 */
public class MythServicesApiProvider {

	private final String	apiUrlBase;

	public MythServicesApiProvider(final String apiUrlBase) {
		this.apiUrlBase = apiUrlBase;
	}

	public MythServicesApi getApi() {
		return new MythServicesApiTemplate(getApiUrlBase());
	}

	// internal helpers

	private String getApiUrlBase() {
		return apiUrlBase;
	}
}
