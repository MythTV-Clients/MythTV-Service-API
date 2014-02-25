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

import org.mythtv.services.core.events.content.LiveStreamInfoDetails;
import org.mythtv.services.core.events.content.LiveStreamInfoListDetails;

import java.util.ArrayList;
import java.util.List;

public class LiveStreamInfoList {
    
        private LiveStreamInfo[] liveStreamInfos;

        /**
         * @return the liveStreamInfos
         */
        public LiveStreamInfo[] getLiveStreamInfos() {
            return liveStreamInfos;
        }

        /**
         * @param liveStreamInfos the liveStreamInfos to set
         */
        public void setLiveStreamInfos( LiveStreamInfo[] liveStreamInfos ) {
            this.liveStreamInfos = liveStreamInfos;
        }

    public LiveStreamInfoListDetails toLiveStreamInfoListDetails() {

        LiveStreamInfoListDetails details = new LiveStreamInfoListDetails();

        if( null != liveStreamInfos && liveStreamInfos.length > 0 ) {

            List<LiveStreamInfoDetails> liveStreamInfoDetails = new ArrayList<LiveStreamInfoDetails>();
            for( LiveStreamInfo liveStreamInfo : liveStreamInfos ) {
                liveStreamInfoDetails.add( liveStreamInfo.toLiveStreamInfoDetails() );
            }
            details.setLiveStreamInfos( liveStreamInfoDetails.toArray( new LiveStreamInfoDetails[ liveStreamInfoDetails.size() ] ) );
        }

        return details;
    }

    public static LiveStreamInfoList fromArtworkInfoListDetails( LiveStreamInfoListDetails details ) {

        LiveStreamInfoList liveStreamInfoList = new LiveStreamInfoList();

        if( null != details.getLiveStreamInfos() && details.getLiveStreamInfos().length > 0 ) {

            List<LiveStreamInfo> liveStreamInfos = new ArrayList<LiveStreamInfo>();
            for( LiveStreamInfoDetails detail : details.getLiveStreamInfos() ) {
                liveStreamInfos.add( LiveStreamInfo.fromLiveStreamInfoDetails( detail ) );
            }
            liveStreamInfoList.setLiveStreamInfos( liveStreamInfos.toArray( new LiveStreamInfo[ liveStreamInfos.size() ] ) );
        }

        return liveStreamInfoList;
    }

}