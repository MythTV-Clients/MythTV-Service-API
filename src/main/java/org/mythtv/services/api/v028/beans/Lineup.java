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
public class Lineup {
    
        
        @JsonProperty( "LineupId" )
        private String lineupId;
        
        
        @JsonProperty( "Name" )
        private String name;
        
        
        @JsonProperty( "DisplayName" )
        private String displayName;
        
        
        @JsonProperty( "Type" )
        private String type;
        
        
        @JsonProperty( "Postal" )
        private String postal;
        
        
        @JsonProperty( "Device" )
        private String device;
        
        /**
         * @return the lineupId
         */
        public String getLineupId() {
            return lineupId;
        }

        /**
         * @param lineupId the lineupId to set
         */
        public void setLineupId( String lineupId ) {
            this.lineupId = lineupId;
        }
        
        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName( String name ) {
            this.name = name;
        }
        
        /**
         * @return the displayName
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * @param displayName the displayName to set
         */
        public void setDisplayName( String displayName ) {
            this.displayName = displayName;
        }
        
        /**
         * @return the type
         */
        public String getType() {
            return type;
        }

        /**
         * @param type the type to set
         */
        public void setType( String type ) {
            this.type = type;
        }
        
        /**
         * @return the postal
         */
        public String getPostal() {
            return postal;
        }

        /**
         * @param postal the postal to set
         */
        public void setPostal( String postal ) {
            this.postal = postal;
        }
        
        /**
         * @return the device
         */
        public String getDevice() {
            return device;
        }

        /**
         * @param device the device to set
         */
        public void setDevice( String device ) {
            this.device = device;
        }
        
}