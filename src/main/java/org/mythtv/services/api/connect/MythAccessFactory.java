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
package org.mythtv.services.api.connect;

import org.mythtv.services.api.ApiVersion;

import java.util.logging.Level;

public class MythAccessFactory {
	/**
	 * Get the service interface instance by inferring the mythtv version by providing the service class
	 * @param serviceClass the service class to use to infer the backend version
	 * @param baseUri the backend base uri
	 * @param logLevel the logging level to use
	 * @return the mythservice api instance or null if no version handling exists
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getServiceTemplateApiByType(Class<T> serviceClass, String baseUri, Level logLevel){
		if(serviceClass.isAssignableFrom(org.mythtv.services.api.v026.MythServices.class))
			return (T) new org.mythtv.services.api.v026.MythServicesTemplate(scrubApiUrl(baseUri), logLevel); // v0.26
		else if(serviceClass.isAssignableFrom(org.mythtv.services.api.v027.MythServices.class))
			return (T) new org.mythtv.services.api.v027.MythServicesTemplate(scrubApiUrl(baseUri), logLevel); // v0.26
		return null;
	}
	
	/**
	 * Get the service interface instance by inferring the mythtv version by providing the service class
	 * @param serviceClass the service class to use to infer the backend version
	 * @param baseUri the backend base uri
	 * @return the mythservice api instance or null if no version handling exists
	 */
	public static <T> T getServiceTemplateApiByType(Class<T> serviceClass, String baseUri){
		return getServiceTemplateApiByType(serviceClass, baseUri, Level.INFO);
	}
	
	/**
	 * Get the service interface instance by using the mythtv version
	 * @param version the version to use
	 * @param baseUri the backend base uri
	 * @return the mythservice api instance or null if no version handling exists
	 */
	public static Object getServiceTemplateApiByVersion(ApiVersion version, String baseUri){
		return getServiceTemplateApiByVersion(version, baseUri, Level.INFO);
	}
	
	/**
	 * Get the service interface instance by using the mythtv version
	 * @param version the version to use
	 * @param baseUri the backend base uri
	 * @param logLevel the logging level to use
	 * @return the mythservice api instance or null if no version handling exists
	 */
	public static Object getServiceTemplateApiByVersion(ApiVersion version, String baseUri, Level logLevel){
		if(version != null)
			switch(version){
				case v026:
					return new org.mythtv.services.api.v026.MythServicesTemplate(scrubApiUrl(baseUri), logLevel);
				case v027:
					return new org.mythtv.services.api.v027.MythServicesTemplate(scrubApiUrl(baseUri), logLevel);
				default:
			}
		return null;
	}
	
	private static String scrubApiUrl(String apiUrlBase) {
		if(!apiUrlBase.endsWith("/"))
			return apiUrlBase + "/";
		else
			return apiUrlBase;
	}
}
