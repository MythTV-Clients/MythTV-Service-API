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
import org.mythtv.services.api.v027.FrontendOperations;

import static org.junit.Assert.fail;

/**
 * @author Sebastien Astie
 */
public class FrontendApiTest extends BaseApiTester {
    private FrontendOperations operations;

    @Override
    protected void prepareOperations() {
        operations = mythservices.frontendOperations();
    }

    @Ignore
    public void testGetActionList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetContextList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetStatus() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testPlayRecording() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testPlayVideo() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testSendAction() throws Exception {
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
}
