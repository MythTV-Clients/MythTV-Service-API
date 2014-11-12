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
public class Encoder {
    
        
        @JsonProperty( "Id" )
        private Integer id;
        
        
        @JsonProperty( "HostName" )
        private String hostName;
        
        
        @JsonProperty( "Local" )
        private Boolean local;
        
        
        @JsonProperty( "Connected" )
        private Boolean connected;
        
        
        @JsonProperty( "State" )
        private Integer state;
        
        
        @JsonProperty( "SleepStatus" )
        private Integer sleepStatus;
        
        
        @JsonProperty( "LowOnFreeSpace" )
        private Boolean lowOnFreeSpace;
        
        
        @JsonProperty( "Inputs" )
        private Input[] inputs;
        
        
        @JsonProperty( "Recording" )
        private Program recording;
        
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
         * @return the local
         */
        public Boolean isLocal() {
            return local;
        }

        /**
         * @param local the local to set
         */
        public void setLocal( Boolean local ) {
            this.local = local;
        }
        
        /**
         * @return the connected
         */
        public Boolean isConnected() {
            return connected;
        }

        /**
         * @param connected the connected to set
         */
        public void setConnected( Boolean connected ) {
            this.connected = connected;
        }
        
        /**
         * @return the state
         */
        public Integer getState() {
            return state;
        }

        /**
         * @param state the state to set
         */
        public void setState( Integer state ) {
            this.state = state;
        }
        
        /**
         * @return the sleepStatus
         */
        public Integer getSleepStatus() {
            return sleepStatus;
        }

        /**
         * @param sleepStatus the sleepStatus to set
         */
        public void setSleepStatus( Integer sleepStatus ) {
            this.sleepStatus = sleepStatus;
        }
        
        /**
         * @return the lowOnFreeSpace
         */
        public Boolean isLowOnFreeSpace() {
            return lowOnFreeSpace;
        }

        /**
         * @param lowOnFreeSpace the lowOnFreeSpace to set
         */
        public void setLowOnFreeSpace( Boolean lowOnFreeSpace ) {
            this.lowOnFreeSpace = lowOnFreeSpace;
        }
        
        /**
         * @return the inputs
         */
        public Input[] getInputs() {
            return inputs;
        }

        /**
         * @param inputs the inputs to set
         */
        public void setInputs( Input[] inputs ) {
            this.inputs = inputs;
        }
        
        /**
         * @return the recording
         */
        public Program getRecording() {
            return recording;
        }

        /**
         * @param recording the recording to set
         */
        public void setRecording( Program recording ) {
            this.recording = recording;
        }
        
}