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

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ConnectionInfo {
    
        
        @JsonProperty( "Version" )
        private VersionInfo version;
        
        
        @JsonProperty( "Database" )
        private DatabaseInfo database;
        
        
        @JsonProperty( "WOL" )
        private WOLInfo wOL;
        
        /**
         * @return the version
         */
        public VersionInfo getVersion() {
            return version;
        }

        /**
         * @param version the version to set
         */
        public void setVersion( VersionInfo version ) {
            this.version = version;
        }
        
        /**
         * @return the database
         */
        public DatabaseInfo getDatabase() {
            return database;
        }

        /**
         * @param database the database to set
         */
        public void setDatabase( DatabaseInfo database ) {
            this.database = database;
        }
        
        /**
         * @return the wOL
         */
        public WOLInfo getWOL() {
            return wOL;
        }

        /**
         * @param wOL the wOL to set
         */
        public void setWOL( WOLInfo wOL ) {
            this.wOL = wOL;
        }
        
}