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
package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class LabelValue {
        
        @JsonProperty( "Label" )
        private String label;
            
        @JsonProperty( "Value" )
        private String value;
            
        @JsonProperty( "Description" )
        private String description;
            
        @JsonProperty( "Active" )
        private Boolean active;
            
        @JsonProperty( "Selected" )
        private Boolean selected;
        
        /**
         * @return the label
         */
        public String getLabel() {
            return label;
        }

        /**
         * @param label the label to set
         */
        public void setLabel( String label ) {
            this.label = label;
        }
        
        /**
         * @return the value
         */
        public String getValue() {
            return value;
        }

        /**
         * @param value the value to set
         */
        public void setValue( String value ) {
            this.value = value;
        }
        
        /**
         * @return the description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @param description the description to set
         */
        public void setDescription( String description ) {
            this.description = description;
        }
        
        /**
         * @return the active
         */
        public Boolean isActive() {
            return active;
        }

        /**
         * @param active the active to set
         */
        public void setActive( Boolean active ) {
            this.active = active;
        }
        
        /**
         * @return the selected
         */
        public Boolean isSelected() {
            return selected;
        }

        /**
         * @param selected the selected to set
         */
        public void setSelected( Boolean selected ) {
            this.selected = selected;
        }
        
}