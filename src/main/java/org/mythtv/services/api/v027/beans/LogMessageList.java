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
public class LogMessageList {
    
        
        @JsonProperty( "HostNames" )
        private LabelValue[] hostNames;
        
        
        @JsonProperty( "Applications" )
        private LabelValue[] applications;
        
        
        @JsonProperty( "LogMessages" )
        private LogMessage[] logMessages;
        
        /**
         * @return the hostNames
         */
        public LabelValue[] getHostNames() {
            return hostNames;
        }

        /**
         * @param hostNames the hostNames to set
         */
        public void setHostNames( LabelValue[] hostNames ) {
            this.hostNames = hostNames;
        }
        
        /**
         * @return the applications
         */
        public LabelValue[] getApplications() {
            return applications;
        }

        /**
         * @param applications the applications to set
         */
        public void setApplications( LabelValue[] applications ) {
            this.applications = applications;
        }
        
        /**
         * @return the logMessages
         */
        public LogMessage[] getLogMessages() {
            return logMessages;
        }

        /**
         * @param logMessages the logMessages to set
         */
        public void setLogMessages( LogMessage[] logMessages ) {
            this.logMessages = logMessages;
        }
        
}