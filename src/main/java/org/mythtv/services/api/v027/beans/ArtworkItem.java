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
public class ArtworkItem {
    
        
        @JsonProperty( "Type" )
        private String type;
        
        
        @JsonProperty( "Url" )
        private String url;
        
        
        @JsonProperty( "Thumbnail" )
        private String thumbnail;
        
        
        @JsonProperty( "Width" )
        private Integer width;
        
        
        @JsonProperty( "Height" )
        private Integer height;
        
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
         * @return the url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url the url to set
         */
        public void setUrl( String url ) {
            this.url = url;
        }
        
        /**
         * @return the thumbnail
         */
        public String getThumbnail() {
            return thumbnail;
        }

        /**
         * @param thumbnail the thumbnail to set
         */
        public void setThumbnail( String thumbnail ) {
            this.thumbnail = thumbnail;
        }
        
        /**
         * @return the width
         */
        public Integer getWidth() {
            return width;
        }

        /**
         * @param width the width to set
         */
        public void setWidth( Integer width ) {
            this.width = width;
        }
        
        /**
         * @return the height
         */
        public Integer getHeight() {
            return height;
        }

        /**
         * @param height the height to set
         */
        public void setHeight( Integer height ) {
            this.height = height;
        }
        
}