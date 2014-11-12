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
public class StorageGroupDirList {
    
        
        @JsonProperty( "StorageGroupDirs" )
        private StorageGroupDir[] storageGroupDirs;
        
        /**
         * @return the storageGroupDirs
         */
        public StorageGroupDir[] getStorageGroupDirs() {
            return storageGroupDirs;
        }

        /**
         * @param storageGroupDirs the storageGroupDirs to set
         */
        public void setStorageGroupDirs( StorageGroupDir[] storageGroupDirs ) {
            this.storageGroupDirs = storageGroupDirs;
        }
        
}