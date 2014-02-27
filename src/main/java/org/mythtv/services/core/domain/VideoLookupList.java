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

import org.joda.time.DateTime;
import org.mythtv.services.core.events.video.VideoLookupDetails;
import org.mythtv.services.core.events.video.VideoLookupListDetails;

import java.util.ArrayList;
import java.util.List;

public class VideoLookupList {

        private Integer count;
        private DateTime asOf;
        private String version;
        private String protoVer;
        private VideoLookup[] videoLookups;

        /**
         * @return the count
         */
        public Integer getCount() {
            return count;
        }

        /**
         * @param count the count to set
         */
        public void setCount( Integer count ) {
            this.count = count;
        }

        /**
         * @return the asOf
         */
        public DateTime getAsOf() {
            return asOf;
        }

        /**
         * @param asOf the asOf to set
         */
        public void setAsOf( DateTime asOf ) {
            this.asOf = asOf;
        }

        /**
         * @return the version
         */
        public String getVersion() {
            return version;
        }

        /**
         * @param version the version to set
         */
        public void setVersion( String version ) {
            this.version = version;
        }

        /**
         * @return the protoVer
         */
        public String getProtoVer() {
            return protoVer;
        }

        /**
         * @param protoVer the protoVer to set
         */
        public void setProtoVer( String protoVer ) {
            this.protoVer = protoVer;
        }

        /**
         * @return the videoLookups
         */
        public VideoLookup[] getVideoLookups() {
            return videoLookups;
        }

        /**
         * @param videoLookups the videoLookups to set
         */
        public void setVideoLookups( VideoLookup[] videoLookups ) {
            this.videoLookups = videoLookups;
        }

    public VideoLookupListDetails toVideoLookupListDetails() {

        VideoLookupListDetails details = new VideoLookupListDetails();
        details.setCount( count );
        details.setAsOf( asOf );
        details.setVersion( version );
        details.setProtoVer( protoVer );

        if( null != videoLookups && videoLookups.length > 0 ) {

            List<VideoLookupDetails> videoLookupDetails = new ArrayList<VideoLookupDetails>();
            for( VideoLookup videoLookup : videoLookups ) {
                videoLookupDetails.add( videoLookup.toVideoLookupDetails() );
            }
            details.setVideoLookups( videoLookupDetails.toArray( new VideoLookupDetails[ videoLookupDetails.size() ] ) );
        }

        return details;
    }

    public static VideoLookupList fromVideoLookupListDetails( VideoLookupListDetails details ) {

        VideoLookupList list = new VideoLookupList();
        list.setCount( details.getCount() );
        list.setAsOf( details.getAsOf() );
        list.setVersion( details.getVersion() );
        list.setProtoVer( details.getProtoVer() );

        if( null != details.getVideoLookups() && details.getVideoLookups().length > 0 ) {

            List<VideoLookup> videoLookups = new ArrayList<VideoLookup>();
            for( VideoLookupDetails detail : details.getVideoLookups() ) {
                videoLookups.add( VideoLookup.fromVideoLookupDetails( detail ) );
            }
            list.setVideoLookups( videoLookups.toArray( new VideoLookup[ videoLookups.size() ] ) );
        }

        return list;
    }

}