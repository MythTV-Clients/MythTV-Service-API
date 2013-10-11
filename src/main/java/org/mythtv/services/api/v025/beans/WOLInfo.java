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
package org.mythtv.services.api.v025.beans;

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