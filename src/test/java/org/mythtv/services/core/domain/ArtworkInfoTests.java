package org.mythtv.services.core.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.mythtv.services.core.domain.fixture.DomainFixture.createStandardArtworkInfo;
import static org.mythtv.services.core.domain.fixture.DomainFixture.createStandardArtworkInfoList;

import org.junit.Test;
import org.mythtv.services.core.events.dvr.ArtworkInfoDetails;

/**
 * Created by dmfrey on 2/27/14.
 */
public class ArtworkInfoTests {

    @Test
    public void testArtworkInfo() {

        ArtworkInfo artworkInfo = createStandardArtworkInfo();
        assertNotNull( artworkInfo );
        assertEquals( "url", artworkInfo.getUrl() );
        assertEquals( "fileName", artworkInfo.getFileName() );
        assertEquals( "storageGroup", artworkInfo.getStorageGroup() );
        assertEquals( "type", artworkInfo.getType() );

        ArtworkInfoDetails details = artworkInfo.toArtworkInfoDetails();
        assertNotNull( details );
        assertEquals( artworkInfo.getUrl(), details.getUrl() );
        assertEquals( artworkInfo.getFileName(), details.getFileName() );
        assertEquals( artworkInfo.getStorageGroup(), details.getStorageGroup() );
        assertEquals( artworkInfo.getType(), details.getType() );

        ArtworkInfo back = ArtworkInfo.fromArtworkInfoDetails( details );
        assertEquals( artworkInfo.getUrl(), back.getUrl() );
        assertEquals( artworkInfo.getFileName(), back.getFileName() );
        assertEquals( artworkInfo.getStorageGroup(), back.getStorageGroup() );
        assertEquals( artworkInfo.getType(), back.getType() );

    }

    @Test
    public void testArtworkInfoList() {

        ArtworkInfoList artworkInfoList = createStandardArtworkInfoList();
        assertNotNull( artworkInfoList );
        assertEquals( 1, artworkInfoList.getArtworkInfos().length );
    }

}
