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
public class DatabaseInfo {
    
        
        @JsonProperty( "Host" )
        private String host;
        
        
        @JsonProperty( "Ping" )
        private Boolean ping;
        
        
        @JsonProperty( "Port" )
        private Integer port;
        
        
        @JsonProperty( "UserName" )
        private String userName;
        
        
        @JsonProperty( "Password" )
        private String password;
        
        
        @JsonProperty( "Name" )
        private String name;
        
        
        @JsonProperty( "Type" )
        private String type;
        
        
        @JsonProperty( "LocalEnabled" )
        private Boolean localEnabled;
        
        
        @JsonProperty( "LocalHostName" )
        private String localHostName;
        
        /**
         * @return the host
         */
        public String getHost() {
            return host;
        }

        /**
         * @param host the host to set
         */
        public void setHost( String host ) {
            this.host = host;
        }
        
        /**
         * @return the ping
         */
        public Boolean isPing() {
            return ping;
        }

        /**
         * @param ping the ping to set
         */
        public void setPing( Boolean ping ) {
            this.ping = ping;
        }
        
        /**
         * @return the port
         */
        public Integer getPort() {
            return port;
        }

        /**
         * @param port the port to set
         */
        public void setPort( Integer port ) {
            this.port = port;
        }
        
        /**
         * @return the userName
         */
        public String getUserName() {
            return userName;
        }

        /**
         * @param userName the userName to set
         */
        public void setUserName( String userName ) {
            this.userName = userName;
        }
        
        /**
         * @return the password
         */
        public String getPassword() {
            return password;
        }

        /**
         * @param password the password to set
         */
        public void setPassword( String password ) {
            this.password = password;
        }
        
        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName( String name ) {
            this.name = name;
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
        
        /**
         * @return the localEnabled
         */
        public Boolean isLocalEnabled() {
            return localEnabled;
        }

        /**
         * @param localEnabled the localEnabled to set
         */
        public void setLocalEnabled( Boolean localEnabled ) {
            this.localEnabled = localEnabled;
        }
        
        /**
         * @return the localHostName
         */
        public String getLocalHostName() {
            return localHostName;
        }

        /**
         * @param localHostName the localHostName to set
         */
        public void setLocalHostName( String localHostName ) {
            this.localHostName = localHostName;
        }
        
}