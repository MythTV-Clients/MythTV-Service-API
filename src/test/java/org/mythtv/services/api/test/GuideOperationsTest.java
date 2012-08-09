/**
 * 
 */
package org.mythtv.services.api.test;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.channel.ChannelInfo;
import org.mythtv.services.api.dvr.Program;
import org.mythtv.services.api.guide.GuideOperations;
import org.mythtv.services.api.guide.ProgramGuideWrapper;
import org.mythtv.services.api.guide.ProgramWrapper;

/**
 * @author sebastien
 *
 */
public class GuideOperationsTest extends BaseMythtvServiceApiTester {

	private int iconsize;
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
		iconsize = Integer.parseInt(properties.getProperty("MythServicesServiceProvider.GuideOperationsTest.IconSize", "512"));
		chanid = Integer.parseInt(properties.getProperty("MythServicesServiceProvider.GuideOperationsTest.ChannelId", "2502"));
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
		// let's run getProgramGuide to get an actual program.
		DateTime fourHours = now.plus(Period.hours(4));
		ProgramGuideWrapper guideWrapper = operations.getProgramGuide(now, fourHours, 0, 10, false);
		List<ChannelInfo> channels = guideWrapper.getProgramGuide().getChannels();
		Assert.assertNotNull(channels);
		Assert.assertFalse("No channels retuned", channels.isEmpty());
		ChannelInfo chan = channels.get(0);
		List<Program> programs = chan.getPrograms();
		Assert.assertFalse("No programs retuned", programs.isEmpty());
		ProgramWrapper p = operations.getProgramDetails(Integer.parseInt(chan.getChannelId()), programs.get(0).getStartTime());
		Assert.assertNotNull("ProgramWrapper is null", p);
		Assert.assertNotNull("Program is null", p.getProgram());		
	}

	/**
	 * Test method for {@link org.mythtv.services.api.guide.impl.GuideTemplate#getProgramGuide(org.joda.time.DateTime, org.joda.time.DateTime, int, int, boolean)}.
	 */
	@Test
	public void testGetProgramGuide() {
		ProgramGuideWrapper guide =  operations.getProgramGuide(now, tomorrow, 0, 100, true);
		guide.toString();
	}
}
