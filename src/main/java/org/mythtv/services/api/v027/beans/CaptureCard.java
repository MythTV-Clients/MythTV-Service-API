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

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class CaptureCard {
    
        
        @JsonProperty( "CardId" )
        private Integer cardId;
        
        
        @JsonProperty( "VideoDevice" )
        private String videoDevice;
        
        
        @JsonProperty( "AudioDevice" )
        private String audioDevice;
        
        
        @JsonProperty( "VBIDevice" )
        private String vBIDevice;
        
        
        @JsonProperty( "CardType" )
        private String cardType;
        
        
        @JsonProperty( "AudioRateLimit" )
        private Integer audioRateLimit;
        
        
        @JsonProperty( "HostName" )
        private String hostName;
        
        
        @JsonProperty( "DVBSWFilter" )
        private Integer dVBSWFilter;
        
        
        @JsonProperty( "DVBSatType" )
        private Integer dVBSatType;
        
        
        @JsonProperty( "DVBWaitForSeqStart" )
        private Boolean dVBWaitForSeqStart;
        
        
        @JsonProperty( "SkipBTAudio" )
        private Boolean skipBTAudio;
        
        
        @JsonProperty( "DVBOnDemand" )
        private Boolean dVBOnDemand;
        
        
        @JsonProperty( "DVBDiSEqCType" )
        private Integer dVBDiSEqCType;
        
        
        @JsonProperty( "FirewireSpeed" )
        private Integer firewireSpeed;
        
        
        @JsonProperty( "FirewireModel" )
        private String firewireModel;
        
        
        @JsonProperty( "FirewireConnection" )
        private Integer firewireConnection;
        
        
        @JsonProperty( "SignalTimeout" )
        private Integer signalTimeout;
        
        
        @JsonProperty( "ChannelTimeout" )
        private Integer channelTimeout;
        
        
        @JsonProperty( "DVBTuningDelay" )
        private Integer dVBTuningDelay;
        
        
        @JsonProperty( "Contrast" )
        private Integer contrast;
        
        
        @JsonProperty( "Brightness" )
        private Integer brightness;
        
        
        @JsonProperty( "Colour" )
        private Integer colour;
        
        
        @JsonProperty( "Hue" )
        private Integer hue;
        
        
        @JsonProperty( "DiSEqCId" )
        private Integer diSEqCId;
        
        
        @JsonProperty( "DVBEITScan" )
        private Boolean dVBEITScan;
        
        /**
         * @return the cardId
         */
        public Integer getCardId() {
            return cardId;
        }

        /**
         * @param cardId the cardId to set
         */
        public void setCardId( Integer cardId ) {
            this.cardId = cardId;
        }
        
        /**
         * @return the videoDevice
         */
        public String getVideoDevice() {
            return videoDevice;
        }

        /**
         * @param videoDevice the videoDevice to set
         */
        public void setVideoDevice( String videoDevice ) {
            this.videoDevice = videoDevice;
        }
        
        /**
         * @return the audioDevice
         */
        public String getAudioDevice() {
            return audioDevice;
        }

        /**
         * @param audioDevice the audioDevice to set
         */
        public void setAudioDevice( String audioDevice ) {
            this.audioDevice = audioDevice;
        }
        
        /**
         * @return the vBIDevice
         */
        public String getVBIDevice() {
            return vBIDevice;
        }

        /**
         * @param vBIDevice the vBIDevice to set
         */
        public void setVBIDevice( String vBIDevice ) {
            this.vBIDevice = vBIDevice;
        }
        
        /**
         * @return the cardType
         */
        public String getCardType() {
            return cardType;
        }

        /**
         * @param cardType the cardType to set
         */
        public void setCardType( String cardType ) {
            this.cardType = cardType;
        }
        
        /**
         * @return the audioRateLimit
         */
        public Integer getAudioRateLimit() {
            return audioRateLimit;
        }

        /**
         * @param audioRateLimit the audioRateLimit to set
         */
        public void setAudioRateLimit( Integer audioRateLimit ) {
            this.audioRateLimit = audioRateLimit;
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
         * @return the dVBSWFilter
         */
        public Integer getDVBSWFilter() {
            return dVBSWFilter;
        }

        /**
         * @param dVBSWFilter the dVBSWFilter to set
         */
        public void setDVBSWFilter( Integer dVBSWFilter ) {
            this.dVBSWFilter = dVBSWFilter;
        }
        
        /**
         * @return the dVBSatType
         */
        public Integer getDVBSatType() {
            return dVBSatType;
        }

        /**
         * @param dVBSatType the dVBSatType to set
         */
        public void setDVBSatType( Integer dVBSatType ) {
            this.dVBSatType = dVBSatType;
        }
        
        /**
         * @return the dVBWaitForSeqStart
         */
        public Boolean isDVBWaitForSeqStart() {
            return dVBWaitForSeqStart;
        }

        /**
         * @param dVBWaitForSeqStart the dVBWaitForSeqStart to set
         */
        public void setDVBWaitForSeqStart( Boolean dVBWaitForSeqStart ) {
            this.dVBWaitForSeqStart = dVBWaitForSeqStart;
        }
        
        /**
         * @return the skipBTAudio
         */
        public Boolean isSkipBTAudio() {
            return skipBTAudio;
        }

        /**
         * @param skipBTAudio the skipBTAudio to set
         */
        public void setSkipBTAudio( Boolean skipBTAudio ) {
            this.skipBTAudio = skipBTAudio;
        }
        
        /**
         * @return the dVBOnDemand
         */
        public Boolean isDVBOnDemand() {
            return dVBOnDemand;
        }

        /**
         * @param dVBOnDemand the dVBOnDemand to set
         */
        public void setDVBOnDemand( Boolean dVBOnDemand ) {
            this.dVBOnDemand = dVBOnDemand;
        }
        
        /**
         * @return the dVBDiSEqCType
         */
        public Integer getDVBDiSEqCType() {
            return dVBDiSEqCType;
        }

        /**
         * @param dVBDiSEqCType the dVBDiSEqCType to set
         */
        public void setDVBDiSEqCType( Integer dVBDiSEqCType ) {
            this.dVBDiSEqCType = dVBDiSEqCType;
        }
        
        /**
         * @return the firewireSpeed
         */
        public Integer getFirewireSpeed() {
            return firewireSpeed;
        }

        /**
         * @param firewireSpeed the firewireSpeed to set
         */
        public void setFirewireSpeed( Integer firewireSpeed ) {
            this.firewireSpeed = firewireSpeed;
        }
        
        /**
         * @return the firewireModel
         */
        public String getFirewireModel() {
            return firewireModel;
        }

        /**
         * @param firewireModel the firewireModel to set
         */
        public void setFirewireModel( String firewireModel ) {
            this.firewireModel = firewireModel;
        }
        
        /**
         * @return the firewireConnection
         */
        public Integer getFirewireConnection() {
            return firewireConnection;
        }

        /**
         * @param firewireConnection the firewireConnection to set
         */
        public void setFirewireConnection( Integer firewireConnection ) {
            this.firewireConnection = firewireConnection;
        }
        
        /**
         * @return the signalTimeout
         */
        public Integer getSignalTimeout() {
            return signalTimeout;
        }

        /**
         * @param signalTimeout the signalTimeout to set
         */
        public void setSignalTimeout( Integer signalTimeout ) {
            this.signalTimeout = signalTimeout;
        }
        
        /**
         * @return the channelTimeout
         */
        public Integer getChannelTimeout() {
            return channelTimeout;
        }

        /**
         * @param channelTimeout the channelTimeout to set
         */
        public void setChannelTimeout( Integer channelTimeout ) {
            this.channelTimeout = channelTimeout;
        }
        
        /**
         * @return the dVBTuningDelay
         */
        public Integer getDVBTuningDelay() {
            return dVBTuningDelay;
        }

        /**
         * @param dVBTuningDelay the dVBTuningDelay to set
         */
        public void setDVBTuningDelay( Integer dVBTuningDelay ) {
            this.dVBTuningDelay = dVBTuningDelay;
        }
        
        /**
         * @return the contrast
         */
        public Integer getContrast() {
            return contrast;
        }

        /**
         * @param contrast the contrast to set
         */
        public void setContrast( Integer contrast ) {
            this.contrast = contrast;
        }
        
        /**
         * @return the brightness
         */
        public Integer getBrightness() {
            return brightness;
        }

        /**
         * @param brightness the brightness to set
         */
        public void setBrightness( Integer brightness ) {
            this.brightness = brightness;
        }
        
        /**
         * @return the colour
         */
        public Integer getColour() {
            return colour;
        }

        /**
         * @param colour the colour to set
         */
        public void setColour( Integer colour ) {
            this.colour = colour;
        }
        
        /**
         * @return the hue
         */
        public Integer getHue() {
            return hue;
        }

        /**
         * @param hue the hue to set
         */
        public void setHue( Integer hue ) {
            this.hue = hue;
        }
        
        /**
         * @return the diSEqCId
         */
        public Integer getDiSEqCId() {
            return diSEqCId;
        }

        /**
         * @param diSEqCId the diSEqCId to set
         */
        public void setDiSEqCId( Integer diSEqCId ) {
            this.diSEqCId = diSEqCId;
        }
        
        /**
         * @return the dVBEITScan
         */
        public Boolean isDVBEITScan() {
            return dVBEITScan;
        }

        /**
         * @param dVBEITScan the dVBEITScan to set
         */
        public void setDVBEITScan( Boolean dVBEITScan ) {
            this.dVBEITScan = dVBEITScan;
        }
        
}