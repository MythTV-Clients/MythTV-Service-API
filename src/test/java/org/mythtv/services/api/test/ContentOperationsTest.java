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

import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.content.ContentOperations;

/**
 * @author Sebastien Astie
 *
 */
public class ContentOperationsTest extends BaseMythtvServiceApiTester {

	private ContentOperations contentOperations;
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		contentOperations = api.contentOperations();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#addLiveStream(java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, int)}.
	 */
	public void testAddLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#addRecordingLiveStream(int, org.joda.time.DateTime, int, int, int, int, int, int)}.
	 */
	public void testAddRecordingLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#addVideoLiveStream(int, int, int, int, int, int, int)}.
	 */
	public void testAddVideoLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#downloadFile(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testDownloadFile() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getAlbumArt(int, int, int)}.
	 */
	@Test
	public void testGetAlbumArt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getFile(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetFile() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getFileList(java.lang.String)}.
	 */
	@Test
	public void testGetFileList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getFilteredLiveStreamList(java.lang.String)}.
	 */
	@Test
	public void testGetFilteredLiveStreamList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getHash(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetHash() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getImageFile(java.lang.String, java.lang.String, int, int)}.
	 */
	@Test
	public void testGetImageFile() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getLiveStream(int)}.
	 */
	@Test
	public void testGetLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getLiveStreamList()}.
	 */
	@Test
	public void testGetLiveStreamList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getMusic(int)}.
	 */
	@Test
	public void testGetMusic() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getPreviewImage(int, org.joda.time.DateTime, int, int, int)}.
	 */
	@Test
	public void testGetPreviewImage() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getProgramArtworkList(java.lang.String, int)}.
	 */
	@Test
	public void testGetProgramArtworkList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getRecording(int, org.joda.time.DateTime)}.
	 */
	@Test
	public void testGetRecording() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getRecordingArtwork(java.lang.String, java.lang.String, int, int, int)}.
	 */
	@Test
	public void testGetRecordingArtwork() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getRecordingArtworkList(int, org.joda.time.DateTime)}.
	 */
	@Test
	public void testGetRecordingArtworkList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getVideo(int)}.
	 */
	@Test
	public void testGetVideo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#getVideoArtwork(java.lang.String, int, int, int)}.
	 */
	@Test
	public void testGetVideoArtwork() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#removeLiveStream(int)}.
	 */
	public void testRemoveLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.content.impl.ContentTemplate#stopLiveStream(int)}.
	 */
	public void testStopLiveStream() {
		fail("Not yet implemented"); // TODO
	}

}
