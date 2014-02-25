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
import org.mythtv.services.core.events.channel.LineupDetails;

import java.lang.reflect.InvocationTargetException;

public class Lineup {

        private String lineupId;
        private String name;
        private String displayName;
        private String type;
        private String postal;
        private String device;
        
        /**
         * @return the lineupId
         */
        public String getLineupId() {
            return lineupId;
        }

        /**
         * @param lineupId the lineupId to set
         */
        public void setLineupId( String lineupId ) {
            this.lineupId = lineupId;
        }
        
        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName( String name ) {
            this.name = name;
        }
        
        /**
         * @return the displayName
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * @param displayName the displayName to set
         */
        public void setDisplayName( String displayName ) {
            this.displayName = displayName;
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
        
        /**
         * @return the postal
         */
        public String getPostal() {
            return postal;
        }

        /**
         * @param postal the postal to set
         */
        public void setPostal( String postal ) {
            this.postal = postal;
        }
        
        /**
         * @return the device
         */
        public String getDevice() {
            return device;
        }

        /**
         * @param device the device to set
         */
        public void setDevice( String device ) {
            this.device = device;
        }

    public LineupDetails toLineupDetails() {

        LineupDetails details = new LineupDetails();
        try {
            BeanUtils.copyProperties(details, this);
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static Lineup fromLineupDetails( LineupDetails details ) {

        Lineup lineup = new Lineup();
        try {
            BeanUtils.copyProperties( lineup, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return lineup;
    }

}