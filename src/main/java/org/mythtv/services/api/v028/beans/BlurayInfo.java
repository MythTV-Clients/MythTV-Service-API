/*
 * Copyright (c) 2014 TIKINOU LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mythtv.services.api.v028.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class BlurayInfo {
    
        
        @JsonProperty( "Path" )
        private String path;
        
        
        @JsonProperty( "Title" )
        private String title;
        
        
        @JsonProperty( "AltTitle" )
        private String altTitle;
        
        
        @JsonProperty( "DiscLang" )
        private String discLang;
        
        
        @JsonProperty( "DiscNum" )
        private Integer discNum;
        
        
        @JsonProperty( "TotalDiscNum" )
        private Integer totalDiscNum;
        
        
        @JsonProperty( "TitleCount" )
        private Integer titleCount;
        
        
        @JsonProperty( "ThumbCount" )
        private Integer thumbCount;
        
        
        @JsonProperty( "ThumbPath" )
        private String thumbPath;
        
        
        @JsonProperty( "TopMenuSupported" )
        private Boolean topMenuSupported;
        
        
        @JsonProperty( "FirstPlaySupported" )
        private Boolean firstPlaySupported;
        
        
        @JsonProperty( "NumHDMVTitles" )
        private Integer numHDMVTitles;
        
        
        @JsonProperty( "NumBDJTitles" )
        private Integer numBDJTitles;
        
        
        @JsonProperty( "NumUnsupportedTitles" )
        private Integer numUnsupportedTitles;
        
        
        @JsonProperty( "AACSDetected" )
        private Boolean aACSDetected;
        
        
        @JsonProperty( "LibAACSDetected" )
        private Boolean libAACSDetected;
        
        
        @JsonProperty( "AACSHandled" )
        private Boolean aACSHandled;
        
        
        @JsonProperty( "BDPlusDetected" )
        private Boolean bDPlusDetected;
        
        
        @JsonProperty( "LibBDPlusDetected" )
        private Boolean libBDPlusDetected;
        
        
        @JsonProperty( "BDPlusHandled" )
        private Boolean bDPlusHandled;
        
        /**
         * @return the path
         */
        public String getPath() {
            return path;
        }

        /**
         * @param path the path to set
         */
        public void setPath( String path ) {
            this.path = path;
        }
        
        /**
         * @return the title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title the title to set
         */
        public void setTitle( String title ) {
            this.title = title;
        }
        
        /**
         * @return the altTitle
         */
        public String getAltTitle() {
            return altTitle;
        }

        /**
         * @param altTitle the altTitle to set
         */
        public void setAltTitle( String altTitle ) {
            this.altTitle = altTitle;
        }
        
        /**
         * @return the discLang
         */
        public String getDiscLang() {
            return discLang;
        }

        /**
         * @param discLang the discLang to set
         */
        public void setDiscLang( String discLang ) {
            this.discLang = discLang;
        }
        
        /**
         * @return the discNum
         */
        public Integer getDiscNum() {
            return discNum;
        }

        /**
         * @param discNum the discNum to set
         */
        public void setDiscNum( Integer discNum ) {
            this.discNum = discNum;
        }
        
        /**
         * @return the totalDiscNum
         */
        public Integer getTotalDiscNum() {
            return totalDiscNum;
        }

        /**
         * @param totalDiscNum the totalDiscNum to set
         */
        public void setTotalDiscNum( Integer totalDiscNum ) {
            this.totalDiscNum = totalDiscNum;
        }
        
        /**
         * @return the titleCount
         */
        public Integer getTitleCount() {
            return titleCount;
        }

        /**
         * @param titleCount the titleCount to set
         */
        public void setTitleCount( Integer titleCount ) {
            this.titleCount = titleCount;
        }
        
        /**
         * @return the thumbCount
         */
        public Integer getThumbCount() {
            return thumbCount;
        }

        /**
         * @param thumbCount the thumbCount to set
         */
        public void setThumbCount( Integer thumbCount ) {
            this.thumbCount = thumbCount;
        }
        
        /**
         * @return the thumbPath
         */
        public String getThumbPath() {
            return thumbPath;
        }

        /**
         * @param thumbPath the thumbPath to set
         */
        public void setThumbPath( String thumbPath ) {
            this.thumbPath = thumbPath;
        }
        
        /**
         * @return the topMenuSupported
         */
        public Boolean isTopMenuSupported() {
            return topMenuSupported;
        }

        /**
         * @param topMenuSupported the topMenuSupported to set
         */
        public void setTopMenuSupported( Boolean topMenuSupported ) {
            this.topMenuSupported = topMenuSupported;
        }
        
        /**
         * @return the firstPlaySupported
         */
        public Boolean isFirstPlaySupported() {
            return firstPlaySupported;
        }

        /**
         * @param firstPlaySupported the firstPlaySupported to set
         */
        public void setFirstPlaySupported( Boolean firstPlaySupported ) {
            this.firstPlaySupported = firstPlaySupported;
        }
        
        /**
         * @return the numHDMVTitles
         */
        public Integer getNumHDMVTitles() {
            return numHDMVTitles;
        }

        /**
         * @param numHDMVTitles the numHDMVTitles to set
         */
        public void setNumHDMVTitles( Integer numHDMVTitles ) {
            this.numHDMVTitles = numHDMVTitles;
        }
        
        /**
         * @return the numBDJTitles
         */
        public Integer getNumBDJTitles() {
            return numBDJTitles;
        }

        /**
         * @param numBDJTitles the numBDJTitles to set
         */
        public void setNumBDJTitles( Integer numBDJTitles ) {
            this.numBDJTitles = numBDJTitles;
        }
        
        /**
         * @return the numUnsupportedTitles
         */
        public Integer getNumUnsupportedTitles() {
            return numUnsupportedTitles;
        }

        /**
         * @param numUnsupportedTitles the numUnsupportedTitles to set
         */
        public void setNumUnsupportedTitles( Integer numUnsupportedTitles ) {
            this.numUnsupportedTitles = numUnsupportedTitles;
        }
        
        /**
         * @return the aACSDetected
         */
        public Boolean isAACSDetected() {
            return aACSDetected;
        }

        /**
         * @param aACSDetected the aACSDetected to set
         */
        public void setAACSDetected( Boolean aACSDetected ) {
            this.aACSDetected = aACSDetected;
        }
        
        /**
         * @return the libAACSDetected
         */
        public Boolean isLibAACSDetected() {
            return libAACSDetected;
        }

        /**
         * @param libAACSDetected the libAACSDetected to set
         */
        public void setLibAACSDetected( Boolean libAACSDetected ) {
            this.libAACSDetected = libAACSDetected;
        }
        
        /**
         * @return the aACSHandled
         */
        public Boolean isAACSHandled() {
            return aACSHandled;
        }

        /**
         * @param aACSHandled the aACSHandled to set
         */
        public void setAACSHandled( Boolean aACSHandled ) {
            this.aACSHandled = aACSHandled;
        }
        
        /**
         * @return the bDPlusDetected
         */
        public Boolean isBDPlusDetected() {
            return bDPlusDetected;
        }

        /**
         * @param bDPlusDetected the bDPlusDetected to set
         */
        public void setBDPlusDetected( Boolean bDPlusDetected ) {
            this.bDPlusDetected = bDPlusDetected;
        }
        
        /**
         * @return the libBDPlusDetected
         */
        public Boolean isLibBDPlusDetected() {
            return libBDPlusDetected;
        }

        /**
         * @param libBDPlusDetected the libBDPlusDetected to set
         */
        public void setLibBDPlusDetected( Boolean libBDPlusDetected ) {
            this.libBDPlusDetected = libBDPlusDetected;
        }
        
        /**
         * @return the bDPlusHandled
         */
        public Boolean isBDPlusHandled() {
            return bDPlusHandled;
        }

        /**
         * @param bDPlusHandled the bDPlusHandled to set
         */
        public void setBDPlusHandled( Boolean bDPlusHandled ) {
            this.bDPlusHandled = bDPlusHandled;
        }
        
}