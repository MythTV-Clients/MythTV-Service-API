/**
 * 
 */
package org.mythtv.services.api.test;

import org.joda.time.DateTime;
import org.joda.time.Period;
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
	private DateTime now;
	private DateTime tomorrow;
	
	private GuideOperations operations;
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		now = new DateTime();
		tomorrow = now.plus(  Period.days( 1 ) );
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
	 * Test method for {@link org.mythtv.services.api.guide.impl.GuideTemplate#getProgramDetails(int, org.joda.time.DateTime)}.
	 */
	@Test
	public void testGetProgramDetails() {
		Program p = operations.getProgramDetails(chanid, now);
		p.toString();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.guide.impl.GuideTemplate#getProgramGuide(org.joda.time.DateTime, org.joda.time.DateTime, int, int, boolean)}.
	 */
	@Test
	public void testGetProgramGuide() {
		ProgramGuideWrapper guide =  operations.getProgramGuide(now, tomorrow, 0, 5000, true);
		guide.toString();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.guide.impl.GuideTemplate#getProgramGuideResponseEntity(org.joda.time.DateTime, org.joda.time.DateTime, int, int, boolean)}.
	 * /
	@Test
	public void testGetProgramGuideResponseEntity() {
		ResponseEntity<ProgramGuideWrapper> v =  operations.getProgramGuideResponseEntity(now, tomorrow, 0, 5000, true);
		
	}
	*/

}
