package org.mythtv.services.api.test.connect;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mythtv.services.api.ApiVersion;
import org.mythtv.services.api.connect.MythAccessFactory;
import org.mythtv.services.api.v027.MythServices;

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
