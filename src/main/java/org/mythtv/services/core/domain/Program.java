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
import org.joda.time.LocalDate;
import org.mythtv.services.core.events.dvr.ArtworkInfoDetails;
import org.mythtv.services.core.events.dvr.ProgramDetails;

import java.lang.reflect.InvocationTargetException;

public class Program {
    
        private DateTime startTime;
        private DateTime endTime;
        private String title;
        private String subTitle;
        private String category;
        private String catType;
        private Boolean repeat;
        private Integer videoProps;
        private Integer audioProps;
        private Integer subProps;
        private String seriesId;
        private String programId;
        private Double stars;
        private Long fileSize;
        private DateTime lastModified;
        private Integer programFlags;
        private String fileName;
        private String hostName;
        private LocalDate airdate;
        private String description;
        private String inetref;
        private Integer season;
        private Integer episode;
        private ChannelInfo channel;
        private RecordingInfo recording;
        private ArtworkInfoList artwork;

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
         * @return the catType
         */
        public String getCatType() {
            return catType;
        }

        /**
         * @param catType the catType to set
         */
        public void setCatType( String catType ) {
            this.catType = catType;
        }

        /**
         * @return the repeat
         */
        public Boolean isRepeat() {
            return repeat;
        }

        /**
         * @param repeat the repeat to set
         */
        public void setRepeat( Boolean repeat ) {
            this.repeat = repeat;
        }

        /**
         * @return the videoProps
         */
        public Integer getVideoProps() {
            return videoProps;
        }

        /**
         * @param videoProps the videoProps to set
         */
        public void setVideoProps( Integer videoProps ) {
            this.videoProps = videoProps;
        }

        /**
         * @return the audioProps
         */
        public Integer getAudioProps() {
            return audioProps;
        }

        /**
         * @param audioProps the audioProps to set
         */
        public void setAudioProps( Integer audioProps ) {
            this.audioProps = audioProps;
        }

        /**
         * @return the subProps
         */
        public Integer getSubProps() {
            return subProps;
        }

        /**
         * @param subProps the subProps to set
         */
        public void setSubProps( Integer subProps ) {
            this.subProps = subProps;
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
         * @return the stars
         */
        public Double getStars() {
            return stars;
        }

        /**
         * @param stars the stars to set
         */
        public void setStars( Double stars ) {
            this.stars = stars;
        }

        /**
         * @return the fileSize
         */
        public Long getFileSize() {
            return fileSize;
        }

        /**
         * @param fileSize the fileSize to set
         */
        public void setFileSize( Long fileSize ) {
            this.fileSize = fileSize;
        }

        /**
         * @return the lastModified
         */
        public DateTime getLastModified() {
            return lastModified;
        }

        /**
         * @param lastModified the lastModified to set
         */
        public void setLastModified( DateTime lastModified ) {
            this.lastModified = lastModified;
        }

        /**
         * @return the programFlags
         */
        public Integer getProgramFlags() {
            return programFlags;
        }

        /**
         * @param programFlags the programFlags to set
         */
        public void setProgramFlags( Integer programFlags ) {
            this.programFlags = programFlags;
        }

        /**
         * @return the fileName
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * @param fileName the fileName to set
         */
        public void setFileName( String fileName ) {
            this.fileName = fileName;
        }

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
         * @return the airdate
         */
        public LocalDate getAirdate() {
            return airdate;
        }

        /**
         * @param airdate the airdate to set
         */
        public void setAirdate( LocalDate airdate ) {
            this.airdate = airdate;
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
         * @return the channel
         */
        public ChannelInfo getChannel() {
            return channel;
        }

        /**
         * @param channel the channel to set
         */
        public void setChannel( ChannelInfo channel ) {
            this.channel = channel;
        }

        /**
         * @return the recording
         */
        public RecordingInfo getRecording() {
            return recording;
        }

        /**
         * @param recording the recording to set
         */
        public void setRecording( RecordingInfo recording ) {
            this.recording = recording;
        }

        /**
         * @return the artwork
         */
        public ArtworkInfoList getArtwork() {
            return artwork;
        }

        /**
         * @param artwork the artwork to set
         */
        public void setArtwork( ArtworkInfoList artwork ) {
            this.artwork = artwork;
        }

    public ProgramDetails toArtworkInfoDetails() {

        ProgramDetails details = new ProgramDetails();
        try {
            BeanUtils.copyProperties(details, this);
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static Program fromProgramDetails( ProgramDetails details ) {

        Program program = new Program();
        try {
            BeanUtils.copyProperties( program, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return program;
    }

}