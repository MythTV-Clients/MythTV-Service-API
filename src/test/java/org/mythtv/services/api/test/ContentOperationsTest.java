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
import org.junit.Ignore;
import org.mythtv.services.api.v026.ContentOperations;

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
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#addLiveStream(java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, int)}.
	 */
	@Ignore
	public void testAddLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#addRecordingLiveStream(int, org.joda.time.DateTime, int, int, int, int, int, int)}.
	 */
	@Ignore
	public void testAddRecordingLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#addVideoLiveStream(int, int, int, int, int, int, int)}.
	 */
	@Ignore
	public void testAddVideoLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#downloadFile(java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testDownloadFile() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getAlbumArt(int, int, int)}.
	 */
	@Ignore
	public void testGetAlbumArt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getFile(java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testGetFile() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getFileList(java.lang.String)}.
	 */
	@Ignore
	public void testGetFileList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getFilteredLiveStreamList(java.lang.String)}.
	 */
	@Ignore
	public void testGetFilteredLiveStreamList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getHash(java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testGetHash() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getImageFile(java.lang.String, java.lang.String, int, int)}.
	 */
	@Ignore
	public void testGetImageFile() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getLiveStream(int)}.
	 */
	@Ignore
	public void testGetLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getLiveStreamList()}.
	 */
	@Ignore
	public void testGetLiveStreamList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getMusic(int)}.
	 */
	@Ignore
	public void testGetMusic() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getPreviewImage(int, org.joda.time.DateTime, int, int, int)}.
	 */
	@Ignore
	public void testGetPreviewImage() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getProgramArtworkList(java.lang.String, int)}.
	 */
	@Ignore
	public void testGetProgramArtworkList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getRecording(int, org.joda.time.DateTime)}.
	 */
	@Ignore
	public void testGetRecording() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getRecordingArtwork(java.lang.String, java.lang.String, int, int, int)}.
	 */
	@Ignore
	public void testGetRecordingArtwork() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getRecordingArtworkList(int, org.joda.time.DateTime)}.
	 */
	@Ignore
	public void testGetRecordingArtworkList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getVideo(int)}.
	 */
	@Ignore
	public void testGetVideo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#getVideoArtwork(java.lang.String, int, int, int)}.
	 */
	@Ignore
	public void testGetVideoArtwork() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#removeLiveStream(int)}.
	 */
	@Ignore
	public void testRemoveLiveStream() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.ContentTemplate#stopLiveStream(int)}.
	 */
	@Ignore
	public void testStopLiveStream() {
		fail("Not yet implemented"); // TODO
	}

}
