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
package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class FrontendStatus {
        
        @JsonProperty( "State" )
        private Map<String,String> state;
            
        @JsonProperty( "ChapterTimes" )
        private String[] chapterTimes;
            
        @JsonProperty( "SubtitleTracks" )
        private Map<String,String> subtitleTracks;
            
        @JsonProperty( "AudioTracks" )
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
        
}