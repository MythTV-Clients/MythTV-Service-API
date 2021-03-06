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
public class Frontend {
    
        
        @JsonProperty( "Name" )
        private String name;
        
        
        @JsonProperty( "IP" )
        private String iP;
        
        
        @JsonProperty( "OnLine" )
        private Integer onLine;
        
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
         * @return the iP
         */
        public String getIP() {
            return iP;
        }

        /**
         * @param iP the iP to set
         */
        public void setIP( String iP ) {
            this.iP = iP;
        }
        
        /**
         * @return the onLine
         */
        public Integer getOnLine() {
            return onLine;
        }

        /**
         * @param onLine the onLine to set
         */
        public void setOnLine( Integer onLine ) {
            this.onLine = onLine;
        }
        
}