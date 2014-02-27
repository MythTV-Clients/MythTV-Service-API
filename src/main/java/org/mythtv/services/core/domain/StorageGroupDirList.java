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

import org.mythtv.services.core.events.myth.StorageGroupDirDetails;
import org.mythtv.services.core.events.myth.StorageGroupDirListDetails;

import java.util.ArrayList;
import java.util.List;

public class StorageGroupDirList {

        private StorageGroupDir[] storageGroupDirs;

        /**
         * @return the storageGroupDirs
         */
        public StorageGroupDir[] getStorageGroupDirs() {
            return storageGroupDirs;
        }

        /**
         * @param storageGroupDirs the storageGroupDirs to set
         */
        public void setStorageGroupDirs( StorageGroupDir[] storageGroupDirs ) {
            this.storageGroupDirs = storageGroupDirs;
        }

    public StorageGroupDirListDetails toStorageGroupDirListDetails() {

        StorageGroupDirListDetails details = new StorageGroupDirListDetails();

        if( null != storageGroupDirs && storageGroupDirs.length > 0 ) {

            List<StorageGroupDirDetails> storageGroupDirDetails = new ArrayList<StorageGroupDirDetails>();
            for( StorageGroupDir storageGroupDir : storageGroupDirs ) {
                storageGroupDirDetails.add( storageGroupDir.toStorageGroupDirDetails() );
            }
            details.setStorageGroupDirs( storageGroupDirDetails.toArray( new StorageGroupDirDetails[ storageGroupDirDetails.size() ] ) );
        }

        return details;
    }

    public static StorageGroupDirList fromStorageGroupDirListDetails( StorageGroupDirListDetails details ) {

        StorageGroupDirList storageGroupDirList = new StorageGroupDirList();

        if( null != details.getStorageGroupDirs() && details.getStorageGroupDirs().length > 0 ) {

            List<StorageGroupDir> storageGroupDirs = new ArrayList<StorageGroupDir>();
            for( StorageGroupDirDetails detail : details.getStorageGroupDirs() ) {
                storageGroupDirs.add( StorageGroupDir.fromStorageGroupDirDetails( detail ) );
            }
            storageGroupDirList.setStorageGroupDirs( storageGroupDirs.toArray( new StorageGroupDir[ storageGroupDirs.size() ] ) );
        }

        return storageGroupDirList;
    }

}