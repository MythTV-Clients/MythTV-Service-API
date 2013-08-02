package org.mythtv.services.api.test.v027;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Before;
import org.mythtv.services.api.connect.MythAccessFactory;
import org.mythtv.services.api.v027.MythServices;

public abstract class BaseApiTester {
	protected Properties properties;
	protected MythServices mythservices;
	
	@Before
	public void setUp() throws Exception {
		properties = new Properties();
		properties.load(new FileInputStream("src/test/resources/BaseMythtvServiceApiTester.properties"));		
		String apiBase = properties.getProperty("MythServicesServiceTemplate.ApiBaseUrl");
		if(apiBase == null)
			throw new Exception("Property 'MythServicesServiceTemplate.ApiBaseUrl' is missing in property file.");
		mythservices = MythAccessFactory.getServiceTemplateApiByType(MythServices.class, apiBase);
		prepareOperations();
	}
	
	protected abstract void prepareOperations();
}
