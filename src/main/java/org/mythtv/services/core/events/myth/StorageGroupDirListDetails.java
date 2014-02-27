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
package org.mythtv.services.core.events.myth;

import org.mythtv.services.core.domain.ArtworkInfo;
import org.mythtv.services.core.domain.ArtworkInfoList;
import org.mythtv.services.core.domain.StorageGroupDir;

import java.util.ArrayList;
import java.util.List;

public class StorageGroupDirListDetails {

        private StorageGroupDirDetails[] storageGroupDirs;

        /**
         * @return the storageGroupDirs
         */
        public StorageGroupDirDetails[] getStorageGroupDirs() {
            return storageGroupDirs;
        }

        /**
         * @param storageGroupDirs the storageGroupDirs to set
         */
        public void setStorageGroupDirs( StorageGroupDirDetails[] storageGroupDirs ) {
            this.storageGroupDirs = storageGroupDirs;
        }

}