package org.mythtv.services.api.connect;

import java.util.logging.Level;

import org.mythtv.services.api.ApiVersion;
import org.mythtv.services.api.v026.MythServices;
import org.mythtv.services.api.v026.MythServicesTemplate;

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
		if(serviceClass.isAssignableFrom(MythServices.class))
			return (T) new MythServicesTemplate(scrubApiUrl(baseUri), logLevel); // v0.26
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
		switch(version){
			case v026:
				return new MythServicesTemplate(scrubApiUrl(baseUri), logLevel);
			case v027:
				break;
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
