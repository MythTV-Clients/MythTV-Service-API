/**
 * 
 */
package org.mythtv.services.api.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.dvr.Program;
import org.mythtv.services.api.guide.GuideOperations;
import org.mythtv.services.api.guide.ProgramGuideWrapper;

/**
 * @author sebastien
 *
 */
public class GuideOperationsTest extends BaseMythtvServiceApiTester {

	private int iconsize = 512;
	private int chanid = 2502;
	private Date now;
	private static long DAY_OFFSET = 24 * 3600 * 1000;
	private Date tomorrow;
	
	private GuideOperations operations;
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		now = new Date();
		tomorrow = new Date(now.getTime() + DAY_OFFSET);
		operations = api.guideOperations();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.guide.impl.GuideTemplate#getChannelIcon(int, int, int)}.
	 */
	@Test
	public void testGetChannelIcon() {
		String res = operations.getChannelIcon(chanid, iconsize, iconsize);
		res.toString();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.guide.impl.GuideTemplate#getProgramDetails(int, java.util.Date)}.
	 */
	@Test
	public void testGetProgramDetails() {
		Program p = operations.getProgramDetails(chanid, now);
		p.toString();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.guide.impl.GuideTemplate#getProgramGuide(java.util.Date, java.util.Date, int, int, boolean)}.
	 */
	@Test
	public void testGetProgramGuide() {
		ProgramGuideWrapper guide =  operations.getProgramGuide(now, tomorrow, 0, 5000, true);
		guide.toString();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.guide.impl.GuideTemplate#getProgramGuideResponseEntity(java.util.Date, java.util.Date, int, int, boolean)}.
	 * /
	@Test
	public void testGetProgramGuideResponseEntity() {
		ResponseEntity<ProgramGuideWrapper> v =  operations.getProgramGuideResponseEntity(now, tomorrow, 0, 5000, true);
		
	}
	*/

}
