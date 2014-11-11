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
package org.mythtv.services.api.v027.beans;

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
public class TimeZoneInfo {
    
        
        @JsonProperty( "TimeZoneID" )
        private String timeZoneID;
        
        
        @JsonProperty( "UTCOffset" )
        private Integer uTCOffset;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "CurrentDateTime" )
        private org.joda.time.DateTime currentDateTime;
        
        /**
         * @return the timeZoneID
         */
        public String getTimeZoneID() {
            return timeZoneID;
        }

        /**
         * @param timeZoneID the timeZoneID to set
         */
        public void setTimeZoneID( String timeZoneID ) {
            this.timeZoneID = timeZoneID;
        }
        
        /**
         * @return the uTCOffset
         */
        public Integer getUTCOffset() {
            return uTCOffset;
        }

        /**
         * @param uTCOffset the uTCOffset to set
         */
        public void setUTCOffset( Integer uTCOffset ) {
            this.uTCOffset = uTCOffset;
        }
        
        /**
         * @return the currentDateTime
         */
        public org.joda.time.DateTime getCurrentDateTime() {
            return currentDateTime;
        }

        /**
         * @param currentDateTime the currentDateTime to set
         */
        public void setCurrentDateTime( org.joda.time.DateTime currentDateTime ) {
            this.currentDateTime = currentDateTime;
        }
        
}