/**
 * 
 */
package org.mythtv.services.api.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.video.VideoOperations;

/**
 * @author Sebastien Astie
 *
 */
public class VideoOperationsTest extends BaseMythtvServiceApiTester {

	private VideoOperations videoOperations;
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		videoOperations = api.videoOperations();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#addVideo(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddVideo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#getBluray(java.lang.String)}.
	 */
	@Test
	public void testGetBluray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#getVideo(int)}.
	 */
	@Test
	public void testGetVideo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#getVideByFilename(java.lang.String)}.
	 */
	@Test
	public void testGetVideByFilename() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#getVideoList(boolean, int, int)}.
	 */
	@Test
	public void testGetVideoList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#lookupVideo(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, boolean)}.
	 */
	@Test
	public void testLookupVideo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#removeVideoFromDatabase(int)}.
	 */
	@Test
	public void testRemoveVideoFromDatabase() {
		fail("Not yet implemented"); // TODO
	}

}
