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