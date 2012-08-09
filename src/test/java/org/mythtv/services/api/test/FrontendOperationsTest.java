package org.mythtv.services.api.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.frontend.FrontendOperations;

public class FrontendOperationsTest extends BaseMythtvServiceApiTester {
	
	private FrontendOperations frontendOperations;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		frontendOperations = api.frontendOperations();
	}

	@Test
	public void testGetStatus() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSendMessage() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSendAction() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetActionList() {
		fail("Not yet implemented"); // TODO
	}

}
