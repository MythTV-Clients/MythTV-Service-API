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
