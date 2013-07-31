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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v026.MythOperations;
import org.mythtv.services.api.v026.beans.SettingList;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.fail;

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
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#addStorageGroupDir(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testAddStorageGroupDir() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#backupDatabase()}.
	 */
	@Ignore
	public void testBackupDatabase() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#changePassword(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testChangePassword() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#checkDatabase(boolean)}.
	 */
	@Ignore
	public void testCheckDatabase() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#getConnectionInfo(java.lang.String)}.
	 */
	@Ignore
	public void testGetConnectionInfo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#getHostName()}.
	 */
	@Ignore
	public void testGetHostName() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#getHosts()}.
	 */
	@Ignore
	public void testGetHosts() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#getKeys()}.
	 */
	@Ignore
	public void testGetKeys() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#getLogs(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, int, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testGetLogs() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#getSetting(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetSetting() {
		ResponseEntity<SettingList> response = mythOperations.getSetting(null, null, null, ETagInfo.createEmptyETag());
		Assert.assertNotNull(response.getBody());
		Assert.assertNotNull(response.getBody().getSetting());
		Assert.assertNotNull(response.getBody().getSetting().getSettings());
		Assert.assertFalse(response.getBody().getSetting().getSettings().isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#getStorageGroupDirectories(String, String, org.mythtv.services.api.ETagInfo)}
	 */
	@Ignore
	public void testGetStorageGroupDirectories() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#getTimeZoneInfo()}.
	 */
	@Ignore
	public void testGetTimeZoneInfo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#profileDelete()}.
	 */
	@Ignore
	public void testProfileDelete() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#profileSubmit()}.
	 */
	@Ignore
	public void testProfileSubmit() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#profileText()}.
	 */
	@Ignore
	public void testProfileText() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#profileUrl()}.
	 */
	@Ignore
	public void testProfileUrl() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#profileUpdated()}.
	 */
	@Ignore
	public void testProfileUpdated() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#putSetting(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testPutSetting() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#removeStorageGroupDir(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testRemoveStorageGroupDirectory() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#sendMessage(java.lang.String, java.lang.String, int, int)}.
	 */
	@Ignore
	public void testSendMessage() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.MythTemplate#testDatabaseSettings(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Ignore
	public void testTestDatabaseSettings() {
		fail("Not yet implemented"); // TODO
	}

}
