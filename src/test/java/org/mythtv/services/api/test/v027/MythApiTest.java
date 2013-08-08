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
package org.mythtv.services.api.test.v027;

import org.junit.Ignore;
import org.mythtv.services.api.v027.MythOperations;

import static org.junit.Assert.fail;

/**
 * @author Sebastien Astie
 */
public class MythApiTest extends BaseApiTester {
    private MythOperations operations;

    @Override
    protected void prepareOperations() {
        operations = mythservices.mythOperations();
    }

    @Ignore
    public void testAddStorageGroupDir() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testBackupDatabase() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testChangePassword() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testCheckDatabase() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetConnectionInfo() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetHostName() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetHosts() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetKeys() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetLogs() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetSetting() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetStorageGroupDirs() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetTimeZone() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testProfileDelete() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testProfileSubmit() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testProfileText() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testProfileURL() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testProfileUpdated() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testPutSetting() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testRemoveStorageGroupDir() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testSendMessage() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testSendNotification() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testTestDBSettings() throws Exception {
        fail("Not yet implemented");
    }
}
