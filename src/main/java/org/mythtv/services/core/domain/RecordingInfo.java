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
import org.mythtv.services.core.events.dvr.RecordingInfoDetails;

import java.lang.reflect.InvocationTargetException;

public class RecordingInfo {

        private Integer status;
        private Integer priority;
        private org.joda.time.DateTime startTs;
        private org.joda.time.DateTime endTs;
        private Integer recordId;
        private String recGroup;
        private String playGroup;
        private String storageGroup;
        private Integer recType;
        private Integer dupInType;
        private Integer dupMethod;
        private Integer encoderId;
        private String profile;
        
        /**
         * @return the status
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * @param status the status to set
         */
        public void setStatus( Integer status ) {
            this.status = status;
        }
        
        /**
         * @return the priority
         */
        public Integer getPriority() {
            return priority;
        }

        /**
         * @param priority the priority to set
         */
        public void setPriority( Integer priority ) {
            this.priority = priority;
        }
        
        /**
         * @return the startTs
         */
        public org.joda.time.DateTime getStartTs() {
            return startTs;
        }

        /**
         * @param startTs the startTs to set
         */
        public void setStartTs( org.joda.time.DateTime startTs ) {
            this.startTs = startTs;
        }
        
        /**
         * @return the endTs
         */
        public org.joda.time.DateTime getEndTs() {
            return endTs;
        }

        /**
         * @param endTs the endTs to set
         */
        public void setEndTs( org.joda.time.DateTime endTs ) {
            this.endTs = endTs;
        }
        
        /**
         * @return the recordId
         */
        public Integer getRecordId() {
            return recordId;
        }

        /**
         * @param recordId the recordId to set
         */
        public void setRecordId( Integer recordId ) {
            this.recordId = recordId;
        }
        
        /**
         * @return the recGroup
         */
        public String getRecGroup() {
            return recGroup;
        }

        /**
         * @param recGroup the recGroup to set
         */
        public void setRecGroup( String recGroup ) {
            this.recGroup = recGroup;
        }
        
        /**
         * @return the playGroup
         */
        public String getPlayGroup() {
            return playGroup;
        }

        /**
         * @param playGroup the playGroup to set
         */
        public void setPlayGroup( String playGroup ) {
            this.playGroup = playGroup;
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
         * @return the recType
         */
        public Integer getRecType() {
            return recType;
        }

        /**
         * @param recType the recType to set
         */
        public void setRecType( Integer recType ) {
            this.recType = recType;
        }
        
        /**
         * @return the dupInType
         */
        public Integer getDupInType() {
            return dupInType;
        }

        /**
         * @param dupInType the dupInType to set
         */
        public void setDupInType( Integer dupInType ) {
            this.dupInType = dupInType;
        }
        
        /**
         * @return the dupMethod
         */
        public Integer getDupMethod() {
            return dupMethod;
        }

        /**
         * @param dupMethod the dupMethod to set
         */
        public void setDupMethod( Integer dupMethod ) {
            this.dupMethod = dupMethod;
        }
        
        /**
         * @return the encoderId
         */
        public Integer getEncoderId() {
            return encoderId;
        }

        /**
         * @param encoderId the encoderId to set
         */
        public void setEncoderId( Integer encoderId ) {
            this.encoderId = encoderId;
        }
        
        /**
         * @return the profile
         */
        public String getProfile() {
            return profile;
        }

        /**
         * @param profile the profile to set
         */
        public void setProfile( String profile ) {
            this.profile = profile;
        }

    public RecordingInfoDetails toRecordingInfoDetails() {

        RecordingInfoDetails details = new RecordingInfoDetails();
        try {
            BeanUtils.copyProperties(details, this);
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static RecordingInfo fromRecordingInfoDetails( RecordingInfoDetails details ) {

        RecordingInfo recordingInfo = new RecordingInfo();
        try {
            BeanUtils.copyProperties( recordingInfo, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return recordingInfo;
    }

}