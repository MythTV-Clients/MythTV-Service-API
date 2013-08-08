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
package org.mythtv.services.api.test.v027;

import org.junit.Ignore;
import org.mythtv.services.api.v027.ContentOperations;

import static org.junit.Assert.fail;

/**
 * @author Sebastien Astie
 */
public class ContentApiTester extends BaseApiTester {
    protected ContentOperations operations;

    @Override
    protected void prepareOperations() {
        operations = mythservices.contentOperations();
    }

    @Ignore
    public void testAddLiveStream() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testAddRecordingLiveStream() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testAddVideoLiveStream() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testDownloadFile() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetAlbumArt() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetFile() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetFileList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetHash() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetImageFile() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetLiveStream() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetLiveStreamList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetMusic() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetPreviewImage() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetProgramArtworkList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetRecording() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetRecordingArtwork() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetRecordingArtworkList() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetVideo() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testGetVideoArtwork() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testRemoveLiveStream() throws Exception {
        fail("Not yet implemented");
    }

    @Ignore
    public void testStopLiveStream() throws Exception {
        fail("Not yet implemented");
    }
}
