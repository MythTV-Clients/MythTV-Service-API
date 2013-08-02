package org.mythtv.services.api.test.v027;

import org.junit.Ignore;
import org.mythtv.services.api.v027.DvrOperations;

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

    @Ignore
    public void testEnableRecordSchedule() throws Exception {
        fail("Not yet implemented");
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
