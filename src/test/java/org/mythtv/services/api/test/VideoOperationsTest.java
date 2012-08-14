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

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.video.BlurayInfoWrapper;
import org.mythtv.services.api.video.VideoLookup;
import org.mythtv.services.api.video.VideoMetaDataInfoWrapper;
import org.mythtv.services.api.video.VideoMetadataInfo;
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
	public void testAddVideo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#getBluray(java.lang.String)}.
	 */
	@Test
	public void testGetBluray() throws MythServiceApiRuntimeException {
		BlurayInfoWrapper info = videoOperations.getBluray("/path/to/video");
		Assert.assertNotNull(info);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#getVideo(int)}.
	 */
	@Test
	public void testGetVideo() throws MythServiceApiRuntimeException {
		VideoMetaDataInfoWrapper info = videoOperations.getVideo(1);
		Assert.assertNotNull(info);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#getVideoByFilename(java.lang.String)}.
	 */
	@Test
	public void testGetVideoByFilename() throws MythServiceApiRuntimeException {
		VideoMetaDataInfoWrapper info = videoOperations.getVideoByFilename("/path/to/video");
		Assert.assertNotNull(info);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#getVideoList(boolean, int, int)}.
	 */
	@Test
	public void testGetVideoList() throws MythServiceApiRuntimeException {
		List<VideoMetadataInfo> list = videoOperations.getVideoList(false, 0, 10);
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#lookupVideo(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, boolean)}.
	 */
	@Test
	public void testLookupVideo() throws MythServiceApiRuntimeException {
		List<VideoLookup> list = videoOperations.lookupVideo("test", "", "", 1, 1, "", true);
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.video.impl.VideoTemplate#removeVideoFromDatabase(int)}.
	 */
	public void testRemoveVideoFromDatabase() {
		fail("Not yet implemented"); // TODO
	}

}
