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
import org.joda.time.DateTime;
import org.mythtv.services.core.events.myth.TimeZoneInfoDetails;

import java.lang.reflect.InvocationTargetException;

public class TimeZoneInfo {

        private String timeZoneID;
        private Integer uTCOffset;
        private DateTime currentDateTime;
        
        /**
         * @return the timeZoneID
         */
        public String getTimeZoneID() {
            return timeZoneID;
        }

        /**
         * @param timeZoneID the timeZoneID to set
         */
        public void setTimeZoneID( String timeZoneID ) {
            this.timeZoneID = timeZoneID;
        }
        
        /**
         * @return the uTCOffset
         */
        public Integer getUTCOffset() {
            return uTCOffset;
        }

        /**
         * @param uTCOffset the uTCOffset to set
         */
        public void setUTCOffset( Integer uTCOffset ) {
            this.uTCOffset = uTCOffset;
        }
        
        /**
         * @return the currentDateTime
         */
        public DateTime getCurrentDateTime() {
            return currentDateTime;
        }

        /**
         * @param currentDateTime the currentDateTime to set
         */
        public void setCurrentDateTime( DateTime currentDateTime ) {
            this.currentDateTime = currentDateTime;
        }

    public TimeZoneInfoDetails toTimeZoneInfoDetails() {

        TimeZoneInfoDetails details = new TimeZoneInfoDetails();
        try {
            BeanUtils.copyProperties(details, this);
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static TimeZoneInfo fromTimeZoneInfoDetails( TimeZoneInfoDetails details ) {

        TimeZoneInfo timeZoneInfo = new TimeZoneInfo();
        try {
            BeanUtils.copyProperties( timeZoneInfo, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return timeZoneInfo;
    }

}