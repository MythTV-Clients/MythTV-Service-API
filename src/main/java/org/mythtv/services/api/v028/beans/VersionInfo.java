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
package org.mythtv.services.api.v028.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class VersionInfo {
    
        
        @JsonProperty( "Version" )
        private String version;
        
        
        @JsonProperty( "Branch" )
        private String branch;
        
        
        @JsonProperty( "Protocol" )
        private String protocol;
        
        
        @JsonProperty( "Binary" )
        private String binary;
        
        
        @JsonProperty( "Schema" )
        private String schema;
        
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
         * @return the branch
         */
        public String getBranch() {
            return branch;
        }

        /**
         * @param branch the branch to set
         */
        public void setBranch( String branch ) {
            this.branch = branch;
        }
        
        /**
         * @return the protocol
         */
        public String getProtocol() {
            return protocol;
        }

        /**
         * @param protocol the protocol to set
         */
        public void setProtocol( String protocol ) {
            this.protocol = protocol;
        }
        
        /**
         * @return the binary
         */
        public String getBinary() {
            return binary;
        }

        /**
         * @param binary the binary to set
         */
        public void setBinary( String binary ) {
            this.binary = binary;
        }
        
        /**
         * @return the schema
         */
        public String getSchema() {
            return schema;
        }

        /**
         * @param schema the schema to set
         */
        public void setSchema( String schema ) {
            this.schema = schema;
        }
        
}