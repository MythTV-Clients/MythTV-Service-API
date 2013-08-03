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
import org.junit.Test;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.v027.DvrOperations;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * @author Sebastien Astie
 */
public class DvrApiTest extends BaseApiTester {
    protected DvrOperations operations;

    @Override
    protected void prepareOperations() {
        operations = mythservices.dvrOperations();
    }

    @Ignore
    public void testAddRecordSchedule() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testDisableRecordSchedule() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testEnableRecordSchedule() throws Exception {
        ResponseEntity<Bool> boolResponseEntity = operations.enableRecordSchedule(2386);
        assertNotNull(boolResponseEntity);
    }

    @Ignore
    public void testGetConflictList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetEncoderList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetExpiringList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetRecGroupList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetRecordSchedule() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetRecordScheduleList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetRecorded() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetRecordedList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetTitleInfoList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetTitleList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetUpcomingList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testRemoveRecordSchedule() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testRemoveRecorded() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testUpdateRecordSchedule() throws Exception {
        fail("Not yet implemented");
    }
}
