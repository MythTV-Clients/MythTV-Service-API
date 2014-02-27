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
import org.mythtv.services.core.events.myth.StorageGroupDirDetails;

import java.lang.reflect.InvocationTargetException;

public class StorageGroupDir {

        private Integer id;
        private String groupName;
        private String hostName;
        private String dirName;
        
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
         * @return the groupName
         */
        public String getGroupName() {
            return groupName;
        }

        /**
         * @param groupName the groupName to set
         */
        public void setGroupName( String groupName ) {
            this.groupName = groupName;
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
         * @return the dirName
         */
        public String getDirName() {
            return dirName;
        }

        /**
         * @param dirName the dirName to set
         */
        public void setDirName( String dirName ) {
            this.dirName = dirName;
        }

    public StorageGroupDirDetails toStorageGroupDirDetails() {

        StorageGroupDirDetails details = new StorageGroupDirDetails();
        try {
            BeanUtils.copyProperties(details, this);
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static StorageGroupDir fromStorageGroupDirDetails( StorageGroupDirDetails details ) {

        StorageGroupDir storageGroupDir = new StorageGroupDir();
        try {
            BeanUtils.copyProperties( storageGroupDir, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return storageGroupDir;
    }

}