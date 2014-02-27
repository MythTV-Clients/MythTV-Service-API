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

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.apache.commons.beanutils.BeanUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.mythtv.services.core.events.dvr.RecRuleDetails;

import java.lang.reflect.InvocationTargetException;

public class RecRule {

        private Integer id;
        private Integer parentId;
        private Boolean inactive;
        private String title;
        private String subTitle;
        private String description;
        private Integer season;
        private Integer episode;
        private String category;
        private DateTime startTime;
        private DateTime endTime;
        private String seriesId;
        private String programId;
        private String inetref;
        private Integer chanId;
        private String callSign;
        private Integer findDay;
        private LocalTime findTime;
        private String type;
        private String searchType;
        private Integer recPriority;
        private Integer preferredInput;
        private Integer startOffset;
        private Integer endOffset;
        private String dupMethod;
        private String dupIn;
        private Integer filter;
        private String recProfile;
        private String recGroup;
        private String storageGroup;
        private String playGroup;
        private Boolean autoExpire;
        private Integer maxEpisodes;
        private Boolean maxNewest;
        private Boolean autoCommflag;
        private Boolean autoTranscode;
        private Boolean autoMetaLookup;
        private Boolean autoUserJob1;
        private Boolean autoUserJob2;
        private Boolean autoUserJob3;
        private Boolean autoUserJob4;
        private Integer transcoder;
        private DateTime nextRecording;
        private DateTime lastRecorded;
        private DateTime lastDeleted;
        private Integer averageDelay;
        
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
         * @return the parentId
         */
        public Integer getParentId() {
            return parentId;
        }

        /**
         * @param parentId the parentId to set
         */
        public void setParentId( Integer parentId ) {
            this.parentId = parentId;
        }
        
        /**
         * @return the inactive
         */
        public Boolean isInactive() {
            return inactive;
        }

        /**
         * @param inactive the inactive to set
         */
        public void setInactive( Boolean inactive ) {
            this.inactive = inactive;
        }
        
        /**
         * @return the title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title the title to set
         */
        public void setTitle( String title ) {
            this.title = title;
        }
        
        /**
         * @return the subTitle
         */
        public String getSubTitle() {
            return subTitle;
        }

        /**
         * @param subTitle the subTitle to set
         */
        public void setSubTitle( String subTitle ) {
            this.subTitle = subTitle;
        }
        
        /**
         * @return the description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @param description the description to set
         */
        public void setDescription( String description ) {
            this.description = description;
        }
        
        /**
         * @return the season
         */
        public Integer getSeason() {
            return season;
        }

        /**
         * @param season the season to set
         */
        public void setSeason( Integer season ) {
            this.season = season;
        }
        
        /**
         * @return the episode
         */
        public Integer getEpisode() {
            return episode;
        }

        /**
         * @param episode the episode to set
         */
        public void setEpisode( Integer episode ) {
            this.episode = episode;
        }
        
        /**
         * @return the category
         */
        public String getCategory() {
            return category;
        }

        /**
         * @param category the category to set
         */
        public void setCategory( String category ) {
            this.category = category;
        }
        
        /**
         * @return the startTime
         */
        public DateTime getStartTime() {
            return startTime;
        }

        /**
         * @param startTime the startTime to set
         */
        public void setStartTime( DateTime startTime ) {
            this.startTime = startTime;
        }
        
        /**
         * @return the endTime
         */
        public DateTime getEndTime() {
            return endTime;
        }

        /**
         * @param endTime the endTime to set
         */
        public void setEndTime( DateTime endTime ) {
            this.endTime = endTime;
        }
        
        /**
         * @return the seriesId
         */
        public String getSeriesId() {
            return seriesId;
        }

        /**
         * @param seriesId the seriesId to set
         */
        public void setSeriesId( String seriesId ) {
            this.seriesId = seriesId;
        }
        
        /**
         * @return the programId
         */
        public String getProgramId() {
            return programId;
        }

        /**
         * @param programId the programId to set
         */
        public void setProgramId( String programId ) {
            this.programId = programId;
        }
        
        /**
         * @return the inetref
         */
        public String getInetref() {
            return inetref;
        }

        /**
         * @param inetref the inetref to set
         */
        public void setInetref( String inetref ) {
            this.inetref = inetref;
        }
        
        /**
         * @return the chanId
         */
        public Integer getChanId() {
            return chanId;
        }

        /**
         * @param chanId the chanId to set
         */
        public void setChanId( Integer chanId ) {
            this.chanId = chanId;
        }
        
        /**
         * @return the callSign
         */
        public String getCallSign() {
            return callSign;
        }

        /**
         * @param callSign the callSign to set
         */
        public void setCallSign( String callSign ) {
            this.callSign = callSign;
        }
        
        /**
         * @return the findDay
         */
        public Integer getFindDay() {
            return findDay;
        }

        /**
         * @param findDay the findDay to set
         */
        public void setFindDay( Integer findDay ) {
            this.findDay = findDay;
        }
        
        /**
         * @return the findTime
         */
        public LocalTime getFindTime() {
            return findTime;
        }

        /**
         * @param findTime the findTime to set
         */
        public void setFindTime( LocalTime findTime ) {
            this.findTime = findTime;
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
         * @return the searchType
         */
        public String getSearchType() {
            return searchType;
        }

        /**
         * @param searchType the searchType to set
         */
        public void setSearchType( String searchType ) {
            this.searchType = searchType;
        }
        
        /**
         * @return the recPriority
         */
        public Integer getRecPriority() {
            return recPriority;
        }

        /**
         * @param recPriority the recPriority to set
         */
        public void setRecPriority( Integer recPriority ) {
            this.recPriority = recPriority;
        }
        
        /**
         * @return the preferredInput
         */
        public Integer getPreferredInput() {
            return preferredInput;
        }

        /**
         * @param preferredInput the preferredInput to set
         */
        public void setPreferredInput( Integer preferredInput ) {
            this.preferredInput = preferredInput;
        }
        
        /**
         * @return the startOffset
         */
        public Integer getStartOffset() {
            return startOffset;
        }

        /**
         * @param startOffset the startOffset to set
         */
        public void setStartOffset( Integer startOffset ) {
            this.startOffset = startOffset;
        }
        
        /**
         * @return the endOffset
         */
        public Integer getEndOffset() {
            return endOffset;
        }

        /**
         * @param endOffset the endOffset to set
         */
        public void setEndOffset( Integer endOffset ) {
            this.endOffset = endOffset;
        }
        
        /**
         * @return the dupMethod
         */
        public String getDupMethod() {
            return dupMethod;
        }

        /**
         * @param dupMethod the dupMethod to set
         */
        public void setDupMethod( String dupMethod ) {
            this.dupMethod = dupMethod;
        }
        
        /**
         * @return the dupIn
         */
        public String getDupIn() {
            return dupIn;
        }

        /**
         * @param dupIn the dupIn to set
         */
        public void setDupIn( String dupIn ) {
            this.dupIn = dupIn;
        }
        
        /**
         * @return the filter
         */
        public Integer getFilter() {
            return filter;
        }

        /**
         * @param filter the filter to set
         */
        public void setFilter( Integer filter ) {
            this.filter = filter;
        }
        
        /**
         * @return the recProfile
         */
        public String getRecProfile() {
            return recProfile;
        }

        /**
         * @param recProfile the recProfile to set
         */
        public void setRecProfile( String recProfile ) {
            this.recProfile = recProfile;
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
         * @return the autoExpire
         */
        public Boolean isAutoExpire() {
            return autoExpire;
        }

        /**
         * @param autoExpire the autoExpire to set
         */
        public void setAutoExpire( Boolean autoExpire ) {
            this.autoExpire = autoExpire;
        }
        
        /**
         * @return the maxEpisodes
         */
        public Integer getMaxEpisodes() {
            return maxEpisodes;
        }

        /**
         * @param maxEpisodes the maxEpisodes to set
         */
        public void setMaxEpisodes( Integer maxEpisodes ) {
            this.maxEpisodes = maxEpisodes;
        }
        
        /**
         * @return the maxNewest
         */
        public Boolean isMaxNewest() {
            return maxNewest;
        }

        /**
         * @param maxNewest the maxNewest to set
         */
        public void setMaxNewest( Boolean maxNewest ) {
            this.maxNewest = maxNewest;
        }
        
        /**
         * @return the autoCommflag
         */
        public Boolean isAutoCommflag() {
            return autoCommflag;
        }

        /**
         * @param autoCommflag the autoCommflag to set
         */
        public void setAutoCommflag( Boolean autoCommflag ) {
            this.autoCommflag = autoCommflag;
        }
        
        /**
         * @return the autoTranscode
         */
        public Boolean isAutoTranscode() {
            return autoTranscode;
        }

        /**
         * @param autoTranscode the autoTranscode to set
         */
        public void setAutoTranscode( Boolean autoTranscode ) {
            this.autoTranscode = autoTranscode;
        }
        
        /**
         * @return the autoMetaLookup
         */
        public Boolean isAutoMetaLookup() {
            return autoMetaLookup;
        }

        /**
         * @param autoMetaLookup the autoMetaLookup to set
         */
        public void setAutoMetaLookup( Boolean autoMetaLookup ) {
            this.autoMetaLookup = autoMetaLookup;
        }
        
        /**
         * @return the autoUserJob1
         */
        public Boolean isAutoUserJob1() {
            return autoUserJob1;
        }

        /**
         * @param autoUserJob1 the autoUserJob1 to set
         */
        public void setAutoUserJob1( Boolean autoUserJob1 ) {
            this.autoUserJob1 = autoUserJob1;
        }
        
        /**
         * @return the autoUserJob2
         */
        public Boolean isAutoUserJob2() {
            return autoUserJob2;
        }

        /**
         * @param autoUserJob2 the autoUserJob2 to set
         */
        public void setAutoUserJob2( Boolean autoUserJob2 ) {
            this.autoUserJob2 = autoUserJob2;
        }
        
        /**
         * @return the autoUserJob3
         */
        public Boolean isAutoUserJob3() {
            return autoUserJob3;
        }

        /**
         * @param autoUserJob3 the autoUserJob3 to set
         */
        public void setAutoUserJob3( Boolean autoUserJob3 ) {
            this.autoUserJob3 = autoUserJob3;
        }
        
        /**
         * @return the autoUserJob4
         */
        public Boolean isAutoUserJob4() {
            return autoUserJob4;
        }

        /**
         * @param autoUserJob4 the autoUserJob4 to set
         */
        public void setAutoUserJob4( Boolean autoUserJob4 ) {
            this.autoUserJob4 = autoUserJob4;
        }
        
        /**
         * @return the transcoder
         */
        public Integer getTranscoder() {
            return transcoder;
        }

        /**
         * @param transcoder the transcoder to set
         */
        public void setTranscoder( Integer transcoder ) {
            this.transcoder = transcoder;
        }
        
        /**
         * @return the nextRecording
         */
        public DateTime getNextRecording() {
            return nextRecording;
        }

        /**
         * @param nextRecording the nextRecording to set
         */
        public void setNextRecording( DateTime nextRecording ) {
            this.nextRecording = nextRecording;
        }
        
        /**
         * @return the lastRecorded
         */
        public DateTime getLastRecorded() {
            return lastRecorded;
        }

        /**
         * @param lastRecorded the lastRecorded to set
         */
        public void setLastRecorded( DateTime lastRecorded ) {
            this.lastRecorded = lastRecorded;
        }
        
        /**
         * @return the lastDeleted
         */
        public DateTime getLastDeleted() {
            return lastDeleted;
        }

        /**
         * @param lastDeleted the lastDeleted to set
         */
        public void setLastDeleted( DateTime lastDeleted ) {
            this.lastDeleted = lastDeleted;
        }
        
        /**
         * @return the averageDelay
         */
        public Integer getAverageDelay() {
            return averageDelay;
        }

        /**
         * @param averageDelay the averageDelay to set
         */
        public void setAverageDelay( Integer averageDelay ) {
            this.averageDelay = averageDelay;
        }

    public RecRuleDetails toRecRuleDetails() {

        RecRuleDetails details = new RecRuleDetails();
        try {
            BeanUtils.copyProperties( details, this );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static RecRule fromRecRuleDetails( RecRuleDetails details ) {

        RecRule recRule = new RecRule();
        try {
            BeanUtils.copyProperties( recRule, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return recRule;
    }

}