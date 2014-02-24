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
import org.mythtv.services.core.events.status.ConnectionInfoDetails;

import java.lang.reflect.InvocationTargetException;

public class ConnectionInfo {

        private VersionInfo version;
        private DatabaseInfo database;
        private WolInfo wol;

        /**
         * @return the version
         */
        public VersionInfo getVersion() {
            return version;
        }

        /**
         * @param version the version to set
         */
        public void setVersion( VersionInfo version ) {
            this.version = version;
        }

        /**
         * @return the database
         */
        public DatabaseInfo getDatabase() {
            return database;
        }

        /**
         * @param database the database to set
         */
        public void setDatabase( DatabaseInfo database ) {
            this.database = database;
        }
        
        /**
         * @return the wol
         */
        public WolInfo getWol() {
            return wol;
        }

        /**
         * @param wol the wol to set
         */
        public void setWol( WolInfo wol ) {
            this.wol = wol;
        }

    public ConnectionInfoDetails toConnectionInfoDetails() {

        ConnectionInfoDetails details = new ConnectionInfoDetails();
        try {
            BeanUtils.copyProperties(details, this);
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static ConnectionInfo fromConnectionInfoDetails( ConnectionInfoDetails details ) {

        ConnectionInfo connectionInfo = new ConnectionInfo();
        try {
            BeanUtils.copyProperties( connectionInfo, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return connectionInfo;
    }

}