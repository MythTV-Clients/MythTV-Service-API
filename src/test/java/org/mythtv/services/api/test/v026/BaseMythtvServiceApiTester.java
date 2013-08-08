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
package org.mythtv.services.api.test.v026;

import org.junit.Before;
import org.mythtv.services.api.v026.MythServices;
import org.mythtv.services.api.v026.MythServicesTemplate;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class BaseMythtvServiceApiTester {
	protected MythServices api;
	protected Properties properties;
	
	@Before
	public void setUp() throws Exception {
		properties = new Properties();
		properties.load(new FileInputStream("src/test/resources/BaseMythtvServiceApiTester.properties"));
		
		String templateClass = properties.getProperty("MythServicesServiceTemplate.class");
		String apiBase = properties.getProperty("MythServicesServiceTemplate.ApiBaseUrl");
		
		if(templateClass == null)
			throw new Exception("Property 'MythServicesServiceTemplate.class' is missing in property file.");
		if(apiBase == null)
			throw new Exception("Property 'MythServicesServiceTemplate.ApiBaseUrl' is missing in property file.");
		
		Class<? extends MythServicesTemplate> clazz = Class.forName(templateClass).asSubclass(MythServicesTemplate.class);
		Constructor<? extends MythServicesTemplate> c = clazz.getConstructor(String.class);
		MythServicesTemplate serv = c.newInstance(apiBase);
		api = serv;
	}

}
