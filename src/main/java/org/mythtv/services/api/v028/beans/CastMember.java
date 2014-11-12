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
public class CastMember {
    
        
        @JsonProperty( "Name" )
        private String name;
        
        
        @JsonProperty( "CharacterName" )
        private String characterName;
        
        
        @JsonProperty( "Role" )
        private String role;
        
        
        @JsonProperty( "TranslatedRole" )
        private String translatedRole;
        
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
         * @return the characterName
         */
        public String getCharacterName() {
            return characterName;
        }

        /**
         * @param characterName the characterName to set
         */
        public void setCharacterName( String characterName ) {
            this.characterName = characterName;
        }
        
        /**
         * @return the role
         */
        public String getRole() {
            return role;
        }

        /**
         * @param role the role to set
         */
        public void setRole( String role ) {
            this.role = role;
        }
        
        /**
         * @return the translatedRole
         */
        public String getTranslatedRole() {
            return translatedRole;
        }

        /**
         * @param translatedRole the translatedRole to set
         */
        public void setTranslatedRole( String translatedRole ) {
            this.translatedRole = translatedRole;
        }
        
}