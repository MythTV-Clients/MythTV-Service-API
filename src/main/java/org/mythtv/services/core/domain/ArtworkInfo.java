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
package org.mythtv.services.core.domain;

import org.apache.commons.beanutils.BeanUtils;
import org.mythtv.services.core.events.dvr.ArtworkInfoDetails;

import java.lang.reflect.InvocationTargetException;

public class ArtworkInfo {

        private String url;
        private String fileName;
        private String storageGroup;
        private String type;
        
        /**
         * @return the uRL
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url the url to set
         */
        public void setURL( String url ) {
            this.url = url;
        }
        
        /**
         * @return the fileName
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * @param fileName the fileName to set
         */
        public void setFileName( String fileName ) {
            this.fileName = fileName;
        }
        
        /**
         * @return the storageGroup
         */
        public String getStorageGroup() {
            return storageGroup;
        }

        /**
         * @param storageGroup the storageGroup to set
         */
        public void setStorageGroup( String storageGroup ) {
            this.storageGroup = storageGroup;
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

    public ArtworkInfoDetails toArtworkInfoDetails() {

        ArtworkInfoDetails details = new ArtworkInfoDetails();
        try {
            BeanUtils.copyProperties( details, this );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static ArtworkInfo fromArtworkInfoDetails( ArtworkInfoDetails details ) {

        ArtworkInfo artworkInfo = new ArtworkInfo();
        try {
            BeanUtils.copyProperties( artworkInfo, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return artworkInfo;
    }

}