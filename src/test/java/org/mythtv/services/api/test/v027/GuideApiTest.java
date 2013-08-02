package org.mythtv.services.api.test.v027;

import org.junit.Ignore;
import org.mythtv.services.api.v027.GuideOperations;

import static org.junit.Assert.fail;

/**
 * @author Sebastien Astie
 */
public class GuideApiTest extends BaseApiTester {
    private GuideOperations operations;

    @Override
    protected void prepareOperations() {
        operations = mythservices.guideOperations();
    }

    @Ignore
    public void testGetChannelIcon() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetProgramDetails() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetProgramGuide() throws Exception {
        fail("Not yet implemented");
    }
}
