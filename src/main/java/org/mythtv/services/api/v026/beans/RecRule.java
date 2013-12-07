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
package org.mythtv.services.api.v026.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.ser.LocalTimeSerializer;
import org.mythtv.services.api.DateTimeSerializer;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class RecRule {
    
        
        @JsonProperty( "Id" )
        private Integer id;
        
        
        @JsonProperty( "ParentId" )
        private Integer parentId;
        
        
        @JsonProperty( "Inactive" )
        private Boolean inactive;
        
        
        @JsonProperty( "Title" )
        private String title;
        
        
        @JsonProperty( "SubTitle" )
        private String subTitle;
        
        
        @JsonProperty( "Description" )
        private String description;
        
        
        @JsonProperty( "Season" )
        private Integer season;
        
        
        @JsonProperty( "Episode" )
        private Integer episode;
        
        
        @JsonProperty( "Category" )
        private String category;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "StartTime" )
        private org.joda.time.DateTime startTime;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "EndTime" )
        private org.joda.time.DateTime endTime;
        
        
        @JsonProperty( "SeriesId" )
        private String seriesId;
        
        
        @JsonProperty( "ProgramId" )
        private String programId;
        
        
        @JsonProperty( "Inetref" )
        private String inetref;
        
        
        @JsonProperty( "ChanId" )
        private Integer chanId;
        
        
        @JsonProperty( "CallSign" )
        private String callSign;
        
        
        @JsonProperty( "Day" )
        private Integer day;
        
        @JsonSerialize( using = LocalTimeSerializer.class )
        @JsonProperty( "Time" )
        private org.joda.time.LocalTime time;
        
        
        @JsonProperty( "FindId" )
        private Integer findId;
        
        
        @JsonProperty( "Type" )
        private String type;
        
        
        @JsonProperty( "SearchType" )
        private String searchType;
        
        
        @JsonProperty( "RecPriority" )
        private Integer recPriority;
        
        
        @JsonProperty( "PreferredInput" )
        private Integer preferredInput;
        
        
        @JsonProperty( "StartOffset" )
        private Integer startOffset;
        
        
        @JsonProperty( "EndOffset" )
        private Integer endOffset;
        
        
        @JsonProperty( "DupMethod" )
        private String dupMethod;
        
        
        @JsonProperty( "DupIn" )
        private String dupIn;
        
        
        @JsonProperty( "Filter" )
        private Integer filter;
        
        
        @JsonProperty( "RecProfile" )
        private String recProfile;
        
        
        @JsonProperty( "RecGroup" )
        private String recGroup;
        
        
        @JsonProperty( "StorageGroup" )
        private String storageGroup;
        
        
        @JsonProperty( "PlayGroup" )
        private String playGroup;
        
        
        @JsonProperty( "AutoExpire" )
        private Boolean autoExpire;
        
        
        @JsonProperty( "MaxEpisodes" )
        private Integer maxEpisodes;
        
        
        @JsonProperty( "MaxNewest" )
        private Boolean maxNewest;
        
        
        @JsonProperty( "AutoCommflag" )
        private Boolean autoCommflag;
        
        
        @JsonProperty( "AutoTranscode" )
        private Boolean autoTranscode;
        
        
        @JsonProperty( "AutoMetaLookup" )
        private Boolean autoMetaLookup;
        
        
        @JsonProperty( "AutoUserJob1" )
        private Boolean autoUserJob1;
        
        
        @JsonProperty( "AutoUserJob2" )
        private Boolean autoUserJob2;
        
        
        @JsonProperty( "AutoUserJob3" )
        private Boolean autoUserJob3;
        
        
        @JsonProperty( "AutoUserJob4" )
        private Boolean autoUserJob4;
        
        
        @JsonProperty( "Transcoder" )
        private Integer transcoder;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "NextRecording" )
        private org.joda.time.DateTime nextRecording;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "LastRecorded" )
        private org.joda.time.DateTime lastRecorded;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "LastDeleted" )
        private org.joda.time.DateTime lastDeleted;
        
        
        @JsonProperty( "AverageDelay" )
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
        public org.joda.time.DateTime getStartTime() {
            return startTime;
        }

        /**
         * @param startTime the startTime to set
         */
        public void setStartTime( org.joda.time.DateTime startTime ) {
            this.startTime = startTime;
        }
        
        /**
         * @return the endTime
         */
        public org.joda.time.DateTime getEndTime() {
            return endTime;
        }

        /**
         * @param endTime the endTime to set
         */
        public void setEndTime( org.joda.time.DateTime endTime ) {
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
         * @return the day
         */
        public Integer getDay() {
            return day;
        }

        /**
         * @param day the day to set
         */
        public void setDay( Integer day ) {
            this.day = day;
        }
        
        /**
         * @return the time
         */
        public org.joda.time.LocalTime getTime() {
            return time;
        }

        /**
         * @param time the time to set
         */
        public void setTime( org.joda.time.LocalTime time ) {
            this.time = time;
        }
        
        /**
         * @return the findId
         */
        public Integer getFindId() {
            return findId;
        }

        /**
         * @param findId the findId to set
         */
        public void setFindId( Integer findId ) {
            this.findId = findId;
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
        public org.joda.time.DateTime getNextRecording() {
            return nextRecording;
        }

        /**
         * @param nextRecording the nextRecording to set
         */
        public void setNextRecording( org.joda.time.DateTime nextRecording ) {
            this.nextRecording = nextRecording;
        }
        
        /**
         * @return the lastRecorded
         */
        public org.joda.time.DateTime getLastRecorded() {
            return lastRecorded;
        }

        /**
         * @param lastRecorded the lastRecorded to set
         */
        public void setLastRecorded( org.joda.time.DateTime lastRecorded ) {
            this.lastRecorded = lastRecorded;
        }
        
        /**
         * @return the lastDeleted
         */
        public org.joda.time.DateTime getLastDeleted() {
            return lastDeleted;
        }

        /**
         * @param lastDeleted the lastDeleted to set
         */
        public void setLastDeleted( org.joda.time.DateTime lastDeleted ) {
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
        
}