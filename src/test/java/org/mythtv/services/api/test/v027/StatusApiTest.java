package org.mythtv.services.api.test.v027;

import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.test.v027.BaseApiTester;
import org.mythtv.services.api.v027.StatusOperations;

import static org.junit.Assert.fail;

/**
 * @author Sebastien Astie
 */
public class StatusApiTest extends BaseApiTester {
    private StatusOperations operations;

    @Override
    protected void prepareOperations() {
        operations = mythservices.statusOperations();
    }

    @Ignore
    public void testGetStatus() throws Exception {
        fail("Not yet implemented");
    }
}
