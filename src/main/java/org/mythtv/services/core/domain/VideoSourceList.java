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
import org.mythtv.services.core.events.channel.VideoSourceDetails;
import org.mythtv.services.core.events.channel.VideoSourceListDetails;

import java.util.ArrayList;
import java.util.List;

public class VideoSourceList {
    
        private DateTime asOf;
        private String version;
        private String protoVer;
        private VideoSource[] videoSources;

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
         * @return the videoSources
         */
        public VideoSource[] getVideoSources() {
            return videoSources;
        }

        /**
         * @param videoSources the videoSources to set
         */
        public void setVideoSources( VideoSource[] videoSources ) {
            this.videoSources = videoSources;
        }

    public VideoSourceListDetails toVideoSourceListDetails() {

        VideoSourceListDetails details = new VideoSourceListDetails();

        if( null != videoSources && videoSources.length > 0 ) {

            List<VideoSourceDetails> videoSourceDetails = new ArrayList<VideoSourceDetails>();
            for( VideoSource videoSource : videoSources ) {
                videoSourceDetails.add( videoSource.toVideoSourceDetails() );
            }
            details.setVideoSources( videoSourceDetails.toArray( new VideoSourceDetails[ videoSourceDetails.size() ] ) );
        }

        return details;
    }

    public static VideoSourceList fromVideoSourceListDetails( VideoSourceListDetails details ) {

        VideoSourceList videoSourceList = new VideoSourceList();

        if( null != details.getVideoSources() && details.getVideoSources().length > 0 ) {

            List<VideoSource> videoSources = new ArrayList<VideoSource>();
            for( VideoSourceDetails detail : details.getVideoSources() ) {
                videoSources.add( VideoSource.fromVideoSourceDetails( detail ) );
            }
            videoSourceList.setVideoSources( videoSources.toArray( new VideoSource[ videoSources.size() ] ) );
        }

        return videoSourceList;
    }

}