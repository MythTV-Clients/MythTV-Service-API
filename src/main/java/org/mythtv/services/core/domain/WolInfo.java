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
import org.mythtv.services.core.events.status.WolInfoDetails;

import java.lang.reflect.InvocationTargetException;

public class WolInfo {

        private Boolean enabled;
        private Integer reconnect;
        private Integer retry;
        private String command;
        
        /**
         * @return the enabled
         */
        public Boolean isEnabled() {
            return enabled;
        }

        /**
         * @param enabled the enabled to set
         */
        public void setEnabled( Boolean enabled ) {
            this.enabled = enabled;
        }
        
        /**
         * @return the reconnect
         */
        public Integer getReconnect() {
            return reconnect;
        }

        /**
         * @param reconnect the reconnect to set
         */
        public void setReconnect( Integer reconnect ) {
            this.reconnect = reconnect;
        }
        
        /**
         * @return the retry
         */
        public Integer getRetry() {
            return retry;
        }

        /**
         * @param retry the retry to set
         */
        public void setRetry( Integer retry ) {
            this.retry = retry;
        }
        
        /**
         * @return the command
         */
        public String getCommand() {
            return command;
        }

        /**
         * @param command the command to set
         */
        public void setCommand( String command ) {
            this.command = command;
        }

    public WolInfoDetails toWolInfoDetails() {

        WolInfoDetails details = new WolInfoDetails();
        try {
            BeanUtils.copyProperties(details, this);
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static WolInfo fromWolInfoDetails( WolInfoDetails details ) {

        WolInfo wolInfo = new WolInfo();
        try {
            BeanUtils.copyProperties( wolInfo, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return wolInfo;
    }

}