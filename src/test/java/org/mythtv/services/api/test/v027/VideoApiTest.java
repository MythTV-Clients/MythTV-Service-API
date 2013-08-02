package org.mythtv.services.api.test.v027;

import org.junit.Ignore;
import org.mythtv.services.api.v027.VideoOperations;

import static org.junit.Assert.fail;

/**
 * @author Sebastien Astie
 */
public class VideoApiTest extends BaseApiTester {
    private VideoOperations operations;

    @Override
    protected void prepareOperations() {
        operations = mythservices.videoOperations();
    }

    @Ignore
    public void testAddVideo() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetBluray() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetVideo() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetVideoByFileName() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetVideoList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testLookupVideo() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testRemoveVideoFromDB() throws Exception {
        fail("Not yet implemented");
    }
}
