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
public class ArtworkInfo {
    
        
        @JsonProperty( "URL" )
        private String uRL;
        
        
        @JsonProperty( "FileName" )
        private String fileName;
        
        
        @JsonProperty( "StorageGroup" )
        private String storageGroup;
        
        
        @JsonProperty( "Type" )
        private String type;
        
        /**
         * @return the uRL
         */
        public String getURL() {
            return uRL;
        }

        /**
         * @param uRL the uRL to set
         */
        public void setURL( String uRL ) {
            this.uRL = uRL;
        }
        
        /**
         * @return the fileName
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * @param fileName the fileName to set
         */
        public void setFileName( String fileName ) {
            this.fileName = fileName;
        }
        
        /**
         * @return the storageGroup
         */
        public String getStorageGroup() {
            return storageGroup;
        }

        /**
         * @param storageGroup the storageGroup to set
         */
        public void setStorageGroup( String storageGroup ) {
            this.storageGroup = storageGroup;
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
        
}