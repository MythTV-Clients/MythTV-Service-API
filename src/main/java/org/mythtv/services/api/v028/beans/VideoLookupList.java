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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.mythtv.services.api.DateTimeSerializer;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class VideoLookupList {
    
        
        @JsonProperty( "Count" )
        private Integer count;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "AsOf" )
        private org.joda.time.DateTime asOf;
        
        
        @JsonProperty( "Version" )
        private String version;
        
        
        @JsonProperty( "ProtoVer" )
        private String protoVer;
        
        
        @JsonProperty( "VideoLookups" )
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
        public org.joda.time.DateTime getAsOf() {
            return asOf;
        }

        /**
         * @param asOf the asOf to set
         */
        public void setAsOf( org.joda.time.DateTime asOf ) {
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
        
}