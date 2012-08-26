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
import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.myth.MythOperations;

/**
 * @author Sebastien Astie
 *
 */
public class MythOperationsTest extends BaseMythtvServiceApiTester {

	private MythOperations mythOperations;
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		mythOperations = api.mythOperations();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#addStorageGroupDir(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testAddStorageGroupDir() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#backupDatabase()}.
	 */
	@Ignore
	public void testBackupDatabase() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#changePassword(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testChangePassword() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#checkDatabase(boolean)}.
	 */
	@Ignore
	public void testCheckDatabase() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#getConnectionInfo(java.lang.String)}.
	 */
	@Ignore
	public void testGetConnectionInfo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#getHostName()}.
	 */
	@Ignore
	public void testGetHostName() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#getHosts()}.
	 */
	@Ignore
	public void testGetHosts() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#getKeys()}.
	 */
	@Ignore
	public void testGetKeys() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#getLogs(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, int, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testGetLogs() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#getSetting(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testGetSetting() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#getStoreageGroupDirectories(java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testGetStoreageGroupDirectories() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#getTimeZoneInfo()}.
	 */
	@Ignore
	public void testGetTimeZoneInfo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#profileDelete()}.
	 */
	@Ignore
	public void testProfileDelete() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#profileSubmit()}.
	 */
	@Ignore
	public void testProfileSubmit() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#profileText()}.
	 */
	@Ignore
	public void testProfileText() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#profileUrl()}.
	 */
	@Ignore
	public void testProfileUrl() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#profileUpdated()}.
	 */
	@Ignore
	public void testProfileUpdated() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#putSetting(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testPutSetting() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#removeStorageGroupDirectory(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testRemoveStorageGroupDirectory() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#sendMessage(java.lang.String, java.lang.String, int, int)}.
	 */
	@Ignore
	public void testSendMessage() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.myth.impl.MythTemplate#testDatabaseSettings(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Ignore
	public void testTestDatabaseSettings() {
		fail("Not yet implemented"); // TODO
	}

}
