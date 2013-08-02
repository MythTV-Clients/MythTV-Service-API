/**
 * 
 */
package org.mythtv.services.api.test.v026;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.StatusOperations;
import org.mythtv.services.api.v026.beans.BackendStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author Daniel Frey
 *
 */
public class StatusOperationsTest extends BaseMythtvServiceApiTester {

	private StatusOperations statusOperations;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		statusOperations = api.statusOperations();
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.status.impl.StatusTemplate#getStatus(@link ETagInfo)}.
	 */
	@Test
	public void testGetStatus() throws MythServiceApiRuntimeException {
		ResponseEntity<BackendStatus> status = statusOperations.getStatus( ETagInfo.createEmptyETag() );
		Assert.assertNotNull( status.getBody() );
	}
	
}
