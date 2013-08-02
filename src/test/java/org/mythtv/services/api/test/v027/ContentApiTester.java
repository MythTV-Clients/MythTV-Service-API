package org.mythtv.services.api.test.v027;

import org.junit.Ignore;
import org.junit.Test;
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

    @Test
    public void testGetAlbumArt() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetFile() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetFileList() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetHash() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetImageFile() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetLiveStream() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetLiveStreamList() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetMusic() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetPreviewImage() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetProgramArtworkList() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetRecording() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetRecordingArtwork() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetRecordingArtworkList() throws Exception {
        fail("Not yet implemented");
    }

    @Test
    public void testGetVideo() throws Exception {
        fail("Not yet implemented");
    }

    @Test
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
