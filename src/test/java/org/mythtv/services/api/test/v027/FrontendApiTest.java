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
