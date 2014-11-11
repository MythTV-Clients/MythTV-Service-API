/*
 * Copyright (c) 2014 TIKINOU LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.mythtv.services.api.DateTimeSerializer;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class LiveStreamInfo {
    
        
        @JsonProperty( "Id" )
        private Integer id;
        
        
        @JsonProperty( "Width" )
        private Integer width;
        
        
        @JsonProperty( "Height" )
        private Integer height;
        
        
        @JsonProperty( "Bitrate" )
        private Integer bitrate;
        
        
        @JsonProperty( "AudioBitrate" )
        private Integer audioBitrate;
        
        
        @JsonProperty( "SegmentSize" )
        private Integer segmentSize;
        
        
        @JsonProperty( "MaxSegments" )
        private Integer maxSegments;
        
        
        @JsonProperty( "StartSegment" )
        private Integer startSegment;
        
        
        @JsonProperty( "CurrentSegment" )
        private Integer currentSegment;
        
        
        @JsonProperty( "SegmentCount" )
        private Integer segmentCount;
        
        
        @JsonProperty( "PercentComplete" )
        private Integer percentComplete;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "Created" )
        private org.joda.time.DateTime created;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "LastModified" )
        private org.joda.time.DateTime lastModified;
        
        
        @JsonProperty( "RelativeURL" )
        private String relativeURL;
        
        
        @JsonProperty( "FullURL" )
        private String fullURL;
        
        
        @JsonProperty( "StatusStr" )
        private String statusStr;
        
        
        @JsonProperty( "StatusInt" )
        private Integer statusInt;
        
        
        @JsonProperty( "StatusMessage" )
        private String statusMessage;
        
        
        @JsonProperty( "SourceFile" )
        private String sourceFile;
        
        
        @JsonProperty( "SourceHost" )
        private String sourceHost;
        
        
        @JsonProperty( "SourceWidth" )
        private Integer sourceWidth;
        
        
        @JsonProperty( "SourceHeight" )
        private Integer sourceHeight;
        
        
        @JsonProperty( "AudioOnlyBitrate" )
        private Integer audioOnlyBitrate;
        
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
         * @return the width
         */
        public Integer getWidth() {
            return width;
        }

        /**
         * @param width the width to set
         */
        public void setWidth( Integer width ) {
            this.width = width;
        }
        
        /**
         * @return the height
         */
        public Integer getHeight() {
            return height;
        }

        /**
         * @param height the height to set
         */
        public void setHeight( Integer height ) {
            this.height = height;
        }
        
        /**
         * @return the bitrate
         */
        public Integer getBitrate() {
            return bitrate;
        }

        /**
         * @param bitrate the bitrate to set
         */
        public void setBitrate( Integer bitrate ) {
            this.bitrate = bitrate;
        }
        
        /**
         * @return the audioBitrate
         */
        public Integer getAudioBitrate() {
            return audioBitrate;
        }

        /**
         * @param audioBitrate the audioBitrate to set
         */
        public void setAudioBitrate( Integer audioBitrate ) {
            this.audioBitrate = audioBitrate;
        }
        
        /**
         * @return the segmentSize
         */
        public Integer getSegmentSize() {
            return segmentSize;
        }

        /**
         * @param segmentSize the segmentSize to set
         */
        public void setSegmentSize( Integer segmentSize ) {
            this.segmentSize = segmentSize;
        }
        
        /**
         * @return the maxSegments
         */
        public Integer getMaxSegments() {
            return maxSegments;
        }

        /**
         * @param maxSegments the maxSegments to set
         */
        public void setMaxSegments( Integer maxSegments ) {
            this.maxSegments = maxSegments;
        }
        
        /**
         * @return the startSegment
         */
        public Integer getStartSegment() {
            return startSegment;
        }

        /**
         * @param startSegment the startSegment to set
         */
        public void setStartSegment( Integer startSegment ) {
            this.startSegment = startSegment;
        }
        
        /**
         * @return the currentSegment
         */
        public Integer getCurrentSegment() {
            return currentSegment;
        }

        /**
         * @param currentSegment the currentSegment to set
         */
        public void setCurrentSegment( Integer currentSegment ) {
            this.currentSegment = currentSegment;
        }
        
        /**
         * @return the segmentCount
         */
        public Integer getSegmentCount() {
            return segmentCount;
        }

        /**
         * @param segmentCount the segmentCount to set
         */
        public void setSegmentCount( Integer segmentCount ) {
            this.segmentCount = segmentCount;
        }
        
        /**
         * @return the percentComplete
         */
        public Integer getPercentComplete() {
            return percentComplete;
        }

        /**
         * @param percentComplete the percentComplete to set
         */
        public void setPercentComplete( Integer percentComplete ) {
            this.percentComplete = percentComplete;
        }
        
        /**
         * @return the created
         */
        public org.joda.time.DateTime getCreated() {
            return created;
        }

        /**
         * @param created the created to set
         */
        public void setCreated( org.joda.time.DateTime created ) {
            this.created = created;
        }
        
        /**
         * @return the lastModified
         */
        public org.joda.time.DateTime getLastModified() {
            return lastModified;
        }

        /**
         * @param lastModified the lastModified to set
         */
        public void setLastModified( org.joda.time.DateTime lastModified ) {
            this.lastModified = lastModified;
        }
        
        /**
         * @return the relativeURL
         */
        public String getRelativeURL() {
            return relativeURL;
        }

        /**
         * @param relativeURL the relativeURL to set
         */
        public void setRelativeURL( String relativeURL ) {
            this.relativeURL = relativeURL;
        }
        
        /**
         * @return the fullURL
         */
        public String getFullURL() {
            return fullURL;
        }

        /**
         * @param fullURL the fullURL to set
         */
        public void setFullURL( String fullURL ) {
            this.fullURL = fullURL;
        }
        
        /**
         * @return the statusStr
         */
        public String getStatusStr() {
            return statusStr;
        }

        /**
         * @param statusStr the statusStr to set
         */
        public void setStatusStr( String statusStr ) {
            this.statusStr = statusStr;
        }
        
        /**
         * @return the statusInt
         */
        public Integer getStatusInt() {
            return statusInt;
        }

        /**
         * @param statusInt the statusInt to set
         */
        public void setStatusInt( Integer statusInt ) {
            this.statusInt = statusInt;
        }
        
        /**
         * @return the statusMessage
         */
        public String getStatusMessage() {
            return statusMessage;
        }

        /**
         * @param statusMessage the statusMessage to set
         */
        public void setStatusMessage( String statusMessage ) {
            this.statusMessage = statusMessage;
        }
        
        /**
         * @return the sourceFile
         */
        public String getSourceFile() {
            return sourceFile;
        }

        /**
         * @param sourceFile the sourceFile to set
         */
        public void setSourceFile( String sourceFile ) {
            this.sourceFile = sourceFile;
        }
        
        /**
         * @return the sourceHost
         */
        public String getSourceHost() {
            return sourceHost;
        }

        /**
         * @param sourceHost the sourceHost to set
         */
        public void setSourceHost( String sourceHost ) {
            this.sourceHost = sourceHost;
        }
        
        /**
         * @return the sourceWidth
         */
        public Integer getSourceWidth() {
            return sourceWidth;
        }

        /**
         * @param sourceWidth the sourceWidth to set
         */
        public void setSourceWidth( Integer sourceWidth ) {
            this.sourceWidth = sourceWidth;
        }
        
        /**
         * @return the sourceHeight
         */
        public Integer getSourceHeight() {
            return sourceHeight;
        }

        /**
         * @param sourceHeight the sourceHeight to set
         */
        public void setSourceHeight( Integer sourceHeight ) {
            this.sourceHeight = sourceHeight;
        }
        
        /**
         * @return the audioOnlyBitrate
         */
        public Integer getAudioOnlyBitrate() {
            return audioOnlyBitrate;
        }

        /**
         * @param audioOnlyBitrate the audioOnlyBitrate to set
         */
        public void setAudioOnlyBitrate( Integer audioOnlyBitrate ) {
            this.audioOnlyBitrate = audioOnlyBitrate;
        }
        
}