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
package org.mythtv.services.api.v026.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class StorageGroupDir {
    
        
        @JsonProperty( "Id" )
        private Integer id;
        
        
        @JsonProperty( "GroupName" )
        private String groupName;
        
        
        @JsonProperty( "HostName" )
        private String hostName;
        
        
        @JsonProperty( "DirName" )
        private String dirName;
        
        /**
         * @return the id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId( Integer id ) {
            this.id = id;
        }
        
        /**
         * @return the groupName
         */
        public String getGroupName() {
            return groupName;
        }

        /**
         * @param groupName the groupName to set
         */
        public void setGroupName( String groupName ) {
            this.groupName = groupName;
        }
        
        /**
         * @return the hostName
         */
        public String getHostName() {
            return hostName;
        }

        /**
         * @param hostName the hostName to set
         */
        public void setHostName( String hostName ) {
            this.hostName = hostName;
        }
        
        /**
         * @return the dirName
         */
        public String getDirName() {
            return dirName;
        }

        /**
         * @param dirName the dirName to set
         */
        public void setDirName( String dirName ) {
            this.dirName = dirName;
        }
        
}