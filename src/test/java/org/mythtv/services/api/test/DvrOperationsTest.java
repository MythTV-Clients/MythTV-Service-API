/**
 * 
 */
package org.mythtv.services.api.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.dvr.DvrOperations;

/**
 * @author Sebastien Astie
 *
 */
public class DvrOperationsTest extends BaseMythtvServiceApiTester {

	private DvrOperations dvrOperations;
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		dvrOperations = api.dvrOperations();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#addRecordingSchedule(int, org.joda.time.DateTime, int, boolean, int, int, java.lang.String, int, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int)}.
	 */
	@Test
	public void testAddRecordingSchedule() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#disableRecordingSchedule(int)}.
	 */
	@Test
	public void testDisableRecordingSchedule() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#enableRecordingSchedule(int)}.
	 */
	@Test
	public void testEnableRecordingSchedule() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getConflictList(int, int)}.
	 */
	@Test
	public void testGetConflictList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getEncoderList()}.
	 */
	@Test
	public void testGetEncoderList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getExpiringList(int, int)}.
	 */
	@Test
	public void testGetExpiringList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getFiltererRecordedList(boolean, int, int, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetFiltererRecordedList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordSchedule(int)}.
	 */
	@Test
	public void testGetRecordSchedule() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordScheduleList(int, int)}.
	 */
	@Test
	public void testGetRecordScheduleList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecorded(int, org.joda.time.DateTime)}.
	 */
	@Test
	public void testGetRecorded() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordedList()}.
	 */
	@Test
	public void testGetRecordedList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordedListResponseEntity()}.
	 */
	@Test
	public void testGetRecordedListResponseEntity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordedList(int, int, boolean)}.
	 */
	@Test
	public void testGetRecordedListIntIntBoolean() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getUpcomingList(int, int, boolean)}.
	 */
	@Test
	public void testGetUpcomingList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getUpcomingListResponseEntity()}.
	 */
	@Test
	public void testGetUpcomingListResponseEntity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#removeRecordingSchedule(int)}.
	 */
	@Test
	public void testRemoveRecordingSchedule() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#removeRecorded(int, org.joda.time.DateTime)}.
	 */
	@Test
	public void testRemoveRecorded() {
		fail("Not yet implemented");
	}

}
