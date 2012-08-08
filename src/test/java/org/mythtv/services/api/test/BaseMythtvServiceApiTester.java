package org.mythtv.services.api.test;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Before;
import org.mythtv.services.api.MythServices;
import org.mythtv.services.connect.MythServicesServiceProvider;

public class BaseMythtvServiceApiTester {
	protected MythServices api;
	protected Properties properties;
	
	@Before
	public void setUp() throws Exception {
		properties = new Properties();
		properties.load(new FileInputStream("src/test/resources/BaseMythtvServiceApiTester.properties"));
		
		String baseUrl = properties.getProperty("MythServicesServiceProvider.ApiBaseUrl");
		
		MythServicesServiceProvider serv = new MythServicesServiceProvider(baseUrl);
		api = serv.getApi();
	}

}
