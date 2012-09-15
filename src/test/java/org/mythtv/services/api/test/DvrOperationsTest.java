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
package org.mythtv.services.api.test;

import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.dvr.ProgramList;
import org.springframework.util.Assert;

/**
 * @author Sebastien Astie
 *
 */
public class DvrOperationsTest extends BaseMythtvServiceApiTester {

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#addRecordingSchedule(int, org.joda.time.DateTime, int, boolean, int, int, java.lang.String, int, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int)}.
	 */
	@Ignore
	public void testAddRecordingSchedule() {
		fail("Not yet implemented"); //TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#disableRecordingSchedule(int)}.
	 */
	@Ignore
	public void testDisableRecordingSchedule() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#enableRecordingSchedule(int)}.
	 */
	@Ignore
	public void testEnableRecordingSchedule() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getConflictList(int, int)}.
	 */
	@Ignore
	public void testGetConflictList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getEncoderList()}.
	 */
	@Ignore
	public void testGetEncoderList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getExpiringList(int, int)}.
	 */
	@Ignore
	public void testGetExpiringList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getFiltererRecordedList(boolean, int, int, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testGetFiltererRecordedList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordSchedule(int)}.
	 */
	@Ignore
	public void testGetRecordSchedule() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordScheduleList(int, int)}.
	 */
	@Ignore
	public void testGetRecordScheduleList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecorded(int, org.joda.time.DateTime)}.
	 */
	@Ignore
	public void testGetRecorded() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordedList()}.
	 */
	@Ignore
	public void testGetRecordedList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordedListResponseEntity()}.
	 */
	@Ignore
	public void testGetRecordedListResponseEntity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getRecordedList(int, int, boolean)}.
	 */
	@Ignore
	public void testGetRecordedListIntIntBoolean() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getUpcomingList(int, int, boolean)}.
	 */
	@Test
	public void testGetUpcomingList() {
		ProgramList programs = api.dvrOperations().getUpcomingList(0, 0, true, ETagInfo.createEmptyETag());
		Assert.notNull(programs);
		Assert.notEmpty(programs.getPrograms().getPrograms());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#getUpcomingListResponseEntity()}.
	 */
	@Ignore
	public void testGetUpcomingListResponseEntity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#removeRecordingSchedule(int)}.
	 */
	@Ignore
	public void testRemoveRecordingSchedule() {
		fail("Not yet implemented"); //TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.dvr.impl.DvrTemplate#removeRecorded(int, org.joda.time.DateTime)}.
	 */
	@Ignore
	public void testRemoveRecorded() {
		fail("Not yet implemented"); //TODO
	}

}
