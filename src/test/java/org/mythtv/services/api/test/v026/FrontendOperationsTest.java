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

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.mythtv.services.api.v026.FrontendOperations;

public class FrontendOperationsTest extends BaseMythtvServiceApiTester {
	
	private FrontendOperations frontendOperations;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		frontendOperations = api.frontendOperations();
	}

	
	@Ignore
	public void testGetStatus() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	public void testSendMessage() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	public void testSendAction() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	public void testGetActionList() {
		fail("Not yet implemented"); // TODO
	}
	
	@Ignore
	public void testPlayRecording() {
		fail("Not yet implemented"); // TODO
	}
	
	@Ignore
	public void testPlayVideo() {
		fail("Not yet implemented"); // TODO
	}

}
