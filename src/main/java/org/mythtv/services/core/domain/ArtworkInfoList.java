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
package org.mythtv.services.core.domain;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.mythtv.services.core.events.dvr.ArtworkInfoDetails;
import org.mythtv.services.core.events.dvr.ArtworkInfoListDetails;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ArtworkInfoList {

    private ArtworkInfo[] artworkInfos;

    /**
      * @return the artworkInfos
      */
    public ArtworkInfo[] getArtworkInfos() {
            return artworkInfos;
        }

    /**
      * @param artworkInfos the artworkInfos to set
      */
    public void setArtworkInfos( ArtworkInfo[] artworkInfos ) {
            this.artworkInfos = artworkInfos;
        }

    public ArtworkInfoListDetails toArtworkInfoListDetails() {

        ArtworkInfoListDetails details = new ArtworkInfoListDetails();

        if( null != artworkInfos && artworkInfos.length > 0 ) {

            List<ArtworkInfoDetails> artworkInfoDetails = new ArrayList<ArtworkInfoDetails>();
            for( ArtworkInfo artworkInfo : artworkInfos ) {
                 artworkInfoDetails.add( artworkInfo.toArtworkInfoDetails() );
            }
            details.setArtworkInfos( artworkInfoDetails.toArray( new ArtworkInfoDetails[ artworkInfoDetails.size() ] ) );
        }

        return details;
    }

    public static ArtworkInfoList fromArtworkInfoListDetails( ArtworkInfoListDetails details ) {

        ArtworkInfoList artworkInfoList = new ArtworkInfoList();

        if( null != details.getArtworkInfos() && details.getArtworkInfos().length > 0 ) {

            List<ArtworkInfo> artworkInfos = new ArrayList<ArtworkInfo>();
            for( ArtworkInfoDetails detail : details.getArtworkInfos() ) {
                artworkInfos.add( ArtworkInfo.fromArtworkInfoDetails(detail) );
            }
            artworkInfoList.setArtworkInfos( artworkInfos.toArray( new ArtworkInfo[ artworkInfos.size() ] ) );
        }

        return artworkInfoList;
    }

}