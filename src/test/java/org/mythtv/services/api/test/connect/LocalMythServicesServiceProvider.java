/**
 * 
 */
package org.mythtv.services.api.test.connect;

import org.mythtv.services.api.MythServices;
import org.mythtv.services.api.MythServicesTemplate;
import org.mythtv.services.connect.MythServicesServiceProvider;

/**
 * This class will only be use for static data testing.
 * @author Sebastien Astie
 *
 */
public class LocalMythServicesServiceProvider extends
		MythServicesServiceProvider {

	/**
	 * @param apiUrlBase
	 */
	public LocalMythServicesServiceProvider() {
		super("local://fakeuri/");
	}

	@Override
	public MythServices getApi() {
		return new MythServicesTemplate( getApiUrlBase() );
	}
}
