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
package org.mythtv.services.api.test.connect;

import org.junit.Test;
import org.mythtv.services.api.ApiVersion;
import org.mythtv.services.api.connect.MythAccessFactory;
import org.mythtv.services.api.v027.MythServices;

import static org.junit.Assert.*;

public class ApiVersionTest {

	@Test
	public void testInferredInterfaceVersions() {
		Object o = MythAccessFactory.getServiceTemplateApiByType(org.mythtv.services.api.v026.MythServices.class, "fake:/uri");
		assertions(o, org.mythtv.services.api.v026.MythServices.class, MythServices.class);
		o = MythAccessFactory.getServiceTemplateApiByType(MythServices.class, "fake:/uri");
		assertions(o, MythServices.class, org.mythtv.services.api.v026.MythServices.class);
		o = MythAccessFactory.getServiceTemplateApiByType(String.class, "fake:/uri");
		assertNull(o);
	}
	
	@Test
	public void testExplicitInterfaceVersions() {
		Object o = MythAccessFactory.getServiceTemplateApiByVersion(ApiVersion.v026, "fake:/uri");
		assertions(o, org.mythtv.services.api.v026.MythServices.class, MythServices.class);
		o = MythAccessFactory.getServiceTemplateApiByVersion(ApiVersion.v027, "fake:/uri");
		assertions(o, MythServices.class, org.mythtv.services.api.v026.MythServices.class);
		o = MythAccessFactory.getServiceTemplateApiByVersion(null, "fake:/uri");
		assertNull(o);
	}
	
	private void assertions(Object instance, Class<?> valid, Class<?> invalid){
		assertNotNull(instance);
		assertFalse(invalid.isInstance(instance));
		assertTrue(valid.isInstance(instance));
	}
	

}
