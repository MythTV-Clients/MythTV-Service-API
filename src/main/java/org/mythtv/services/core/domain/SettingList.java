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
import org.mythtv.services.core.events.myth.SettingListDetails;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class SettingList {

        private String hostName;
        private Map<String,String> settings;
        
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
         * @return the settings
         */
        public Map<String,String> getSettings() {
            return settings;
        }

        /**
         * @param settings the settings to set
         */
        public void setSettings( Map<String,String> settings ) {
            this.settings = settings;
        }

    public SettingListDetails toSettingListDetails() {

        SettingListDetails details = new SettingListDetails();
        try {
            BeanUtils.copyProperties(details, this);
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static SettingList fromSettingListDetails( SettingListDetails details ) {

        SettingList settingList = new SettingList();
        try {
            BeanUtils.copyProperties( settingList, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return settingList;
    }

}