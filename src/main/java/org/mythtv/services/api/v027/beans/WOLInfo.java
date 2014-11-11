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
public class WOLInfo {
    
        
        @JsonProperty( "Enabled" )
        private Boolean enabled;
        
        
        @JsonProperty( "Reconnect" )
        private Integer reconnect;
        
        
        @JsonProperty( "Retry" )
        private Integer retry;
        
        
        @JsonProperty( "Command" )
        private String command;
        
        /**
         * @return the enabled
         */
        public Boolean isEnabled() {
            return enabled;
        }

        /**
         * @param enabled the enabled to set
         */
        public void setEnabled( Boolean enabled ) {
            this.enabled = enabled;
        }
        
        /**
         * @return the reconnect
         */
        public Integer getReconnect() {
            return reconnect;
        }

        /**
         * @param reconnect the reconnect to set
         */
        public void setReconnect( Integer reconnect ) {
            this.reconnect = reconnect;
        }
        
        /**
         * @return the retry
         */
        public Integer getRetry() {
            return retry;
        }

        /**
         * @param retry the retry to set
         */
        public void setRetry( Integer retry ) {
            this.retry = retry;
        }
        
        /**
         * @return the command
         */
        public String getCommand() {
            return command;
        }

        /**
         * @param command the command to set
         */
        public void setCommand( String command ) {
            this.command = command;
        }
        
}