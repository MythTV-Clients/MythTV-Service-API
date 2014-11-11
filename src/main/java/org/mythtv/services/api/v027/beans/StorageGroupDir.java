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