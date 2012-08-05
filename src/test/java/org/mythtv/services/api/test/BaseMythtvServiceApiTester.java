package org.mythtv.services.api.test;

import org.junit.Before;
import org.mythtv.services.api.MythServices;
import org.mythtv.services.connect.MythServicesServiceProvider;

public class BaseMythtvServiceApiTester {
	protected MythServices api;
	
	@Before
	public void setUp() throws Exception {
		MythServicesServiceProvider serv = new MythServicesServiceProvider("http://master:6544");
		api = serv.getApi();
	}

}
