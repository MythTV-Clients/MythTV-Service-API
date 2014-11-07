package org.mythtv.services.core.domain.fixture;

import org.mythtv.services.core.domain.ArtworkInfo;
import org.mythtv.services.core.domain.ArtworkInfoList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmfrey on 2/27/14.
 */
public class DomainFixture {

    public static ArtworkInfo createStandardArtworkInfo() {

        ArtworkInfo artworkInfo = new ArtworkInfo();
        artworkInfo.setUrl( "url" );
        artworkInfo.setFileName( "fileName" );
        artworkInfo.setStorageGroup( "storageGroup" );
        artworkInfo.setType( "type" );

        return artworkInfo;
    }

    public static ArtworkInfoList createStandardArtworkInfoList() {

        ArtworkInfoList list = new ArtworkInfoList();

        List<ArtworkInfo> artworkInfos = new ArrayList<ArtworkInfo>();
        artworkInfos.add( createStandardArtworkInfo() );
        list.setArtworkInfos( artworkInfos.toArray( new ArtworkInfo[ artworkInfos.size() ] ) );

        return list;
    }

}
