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
import org.mythtv.services.core.events.frontend.FrontendStatusDetails;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class FrontendStatus {

        private Map<String,String> state;
        private String[] chapterTimes;
        private Map<String,String> subtitleTracks;
        private Map<String,String> audioTracks;
        
        /**
         * @return the state
         */
        public Map<String,String> getState() {
            return state;
        }

        /**
         * @param state the state to set
         */
        public void setState( Map<String,String> state ) {
            this.state = state;
        }
        
        /**
         * @return the chapterTimes
         */
        public String[] getChapterTimes() {
            return chapterTimes;
        }

        /**
         * @param chapterTimes the chapterTimes to set
         */
        public void setChapterTimes( String[] chapterTimes ) {
            this.chapterTimes = chapterTimes;
        }
        
        /**
         * @return the subtitleTracks
         */
        public Map<String,String> getSubtitleTracks() {
            return subtitleTracks;
        }

        /**
         * @param subtitleTracks the subtitleTracks to set
         */
        public void setSubtitleTracks( Map<String,String> subtitleTracks ) {
            this.subtitleTracks = subtitleTracks;
        }
        
        /**
         * @return the audioTracks
         */
        public Map<String,String> getAudioTracks() {
            return audioTracks;
        }

        /**
         * @param audioTracks the audioTracks to set
         */
        public void setAudioTracks( Map<String,String> audioTracks ) {
            this.audioTracks = audioTracks;
        }

    public FrontendStatusDetails toFrontendStatusDetails() {

        FrontendStatusDetails details = new FrontendStatusDetails();
        try {
            BeanUtils.copyProperties( details, this );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static FrontendStatus fromFrontendStatusDetails( FrontendStatusDetails details ) {

        FrontendStatus frontendStatus = new FrontendStatus();
        try {
            BeanUtils.copyProperties( frontendStatus, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return frontendStatus;
    }

}