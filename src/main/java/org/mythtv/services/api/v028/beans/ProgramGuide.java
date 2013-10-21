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
package org.mythtv.services.api.v028.beans;

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
public class ProgramGuide {
    
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "StartTime" )
        private org.joda.time.DateTime startTime;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "EndTime" )
        private org.joda.time.DateTime endTime;
        
        
        @JsonProperty( "StartChanId" )
        private Integer startChanId;
        
        
        @JsonProperty( "EndChanId" )
        private Integer endChanId;
        
        
        @JsonProperty( "NumOfChannels" )
        private Integer numOfChannels;
        
        
        @JsonProperty( "Details" )
        private Boolean details;
        
        
        @JsonProperty( "Count" )
        private Integer count;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "AsOf" )
        private org.joda.time.DateTime asOf;
        
        
        @JsonProperty( "Version" )
        private String version;
        
        
        @JsonProperty( "ProtoVer" )
        private String protoVer;
        
        
        @JsonProperty( "Channels" )
        private ChannelInfo[] channels;
        
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
         * @return the startChanId
         */
        public Integer getStartChanId() {
            return startChanId;
        }

        /**
         * @param startChanId the startChanId to set
         */
        public void setStartChanId( Integer startChanId ) {
            this.startChanId = startChanId;
        }
        
        /**
         * @return the endChanId
         */
        public Integer getEndChanId() {
            return endChanId;
        }

        /**
         * @param endChanId the endChanId to set
         */
        public void setEndChanId( Integer endChanId ) {
            this.endChanId = endChanId;
        }
        
        /**
         * @return the numOfChannels
         */
        public Integer getNumOfChannels() {
            return numOfChannels;
        }

        /**
         * @param numOfChannels the numOfChannels to set
         */
        public void setNumOfChannels( Integer numOfChannels ) {
            this.numOfChannels = numOfChannels;
        }
        
        /**
         * @return the details
         */
        public Boolean isDetails() {
            return details;
        }

        /**
         * @param details the details to set
         */
        public void setDetails( Boolean details ) {
            this.details = details;
        }
        
        /**
         * @return the count
         */
        public Integer getCount() {
            return count;
        }

        /**
         * @param count the count to set
         */
        public void setCount( Integer count ) {
            this.count = count;
        }
        
        /**
         * @return the asOf
         */
        public org.joda.time.DateTime getAsOf() {
            return asOf;
        }

        /**
         * @param asOf the asOf to set
         */
        public void setAsOf( org.joda.time.DateTime asOf ) {
            this.asOf = asOf;
        }
        
        /**
         * @return the version
         */
        public String getVersion() {
            return version;
        }

        /**
         * @param version the version to set
         */
        public void setVersion( String version ) {
            this.version = version;
        }
        
        /**
         * @return the protoVer
         */
        public String getProtoVer() {
            return protoVer;
        }

        /**
         * @param protoVer the protoVer to set
         */
        public void setProtoVer( String protoVer ) {
            this.protoVer = protoVer;
        }
        
        /**
         * @return the channels
         */
        public ChannelInfo[] getChannels() {
            return channels;
        }

        /**
         * @param channels the channels to set
         */
        public void setChannels( ChannelInfo[] channels ) {
            this.channels = channels;
        }
        
}