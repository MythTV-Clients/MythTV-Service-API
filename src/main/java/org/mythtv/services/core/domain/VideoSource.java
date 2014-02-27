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
import org.mythtv.services.core.events.channel.VideoSourceDetails;

import java.lang.reflect.InvocationTargetException;

public class VideoSource {

        private Integer id;
        private String sourceName;
        private String grabber;
        private String userId;
        private String freqTable;
        private String lineupId;
        private String password;
        private Boolean useEIT;
        private String configPath;
        private Integer nITId;
        
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
         * @return the sourceName
         */
        public String getSourceName() {
            return sourceName;
        }

        /**
         * @param sourceName the sourceName to set
         */
        public void setSourceName( String sourceName ) {
            this.sourceName = sourceName;
        }
        
        /**
         * @return the grabber
         */
        public String getGrabber() {
            return grabber;
        }

        /**
         * @param grabber the grabber to set
         */
        public void setGrabber( String grabber ) {
            this.grabber = grabber;
        }
        
        /**
         * @return the userId
         */
        public String getUserId() {
            return userId;
        }

        /**
         * @param userId the userId to set
         */
        public void setUserId( String userId ) {
            this.userId = userId;
        }
        
        /**
         * @return the freqTable
         */
        public String getFreqTable() {
            return freqTable;
        }

        /**
         * @param freqTable the freqTable to set
         */
        public void setFreqTable( String freqTable ) {
            this.freqTable = freqTable;
        }
        
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
         * @return the password
         */
        public String getPassword() {
            return password;
        }

        /**
         * @param password the password to set
         */
        public void setPassword( String password ) {
            this.password = password;
        }
        
        /**
         * @return the useEIT
         */
        public Boolean isUseEIT() {
            return useEIT;
        }

        /**
         * @param useEIT the useEIT to set
         */
        public void setUseEIT( Boolean useEIT ) {
            this.useEIT = useEIT;
        }
        
        /**
         * @return the configPath
         */
        public String getConfigPath() {
            return configPath;
        }

        /**
         * @param configPath the configPath to set
         */
        public void setConfigPath( String configPath ) {
            this.configPath = configPath;
        }
        
        /**
         * @return the nITId
         */
        public Integer getNITId() {
            return nITId;
        }

        /**
         * @param nITId the nITId to set
         */
        public void setNITId( Integer nITId ) {
            this.nITId = nITId;
        }

    public VideoSourceDetails toVideoSourceDetails() {

        VideoSourceDetails details = new VideoSourceDetails();
        try {
            BeanUtils.copyProperties( details, this );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static VideoSource fromVideoSourceDetails( VideoSourceDetails details ) {

        VideoSource videoSource = new VideoSource();
        try {
            BeanUtils.copyProperties( videoSource, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return videoSource;
    }

}