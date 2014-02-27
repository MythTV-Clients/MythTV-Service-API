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
package org.mythtv.services.core.events.channel;

import org.joda.time.DateTime;

public class VideoMultiplexDetails {

        private Integer mplexId;
        private Integer sourceId;
        private Integer transportId;
        private Integer networkId;
        private Long frequency;
        private String inversion;
        private Long symbolRate;
        private String fEC;
        private String polarity;
        private String modulation;
        private String bandwidth;
        private String lPCodeRate;
        private String hPCodeRate;
        private String transmissionMode;
        private String guardInterval;
        private Boolean visible;
        private String constellation;
        private String hierarchy;
        private String modulationSystem;
        private String rollOff;
        private String sIStandard;
        private Integer serviceVersion;
        private DateTime updateTimeStamp;
        private String defaultAuthority;
        
        /**
         * @return the mplexId
         */
        public Integer getMplexId() {
            return mplexId;
        }

        /**
         * @param mplexId the mplexId to set
         */
        public void setMplexId( Integer mplexId ) {
            this.mplexId = mplexId;
        }
        
        /**
         * @return the sourceId
         */
        public Integer getSourceId() {
            return sourceId;
        }

        /**
         * @param sourceId the sourceId to set
         */
        public void setSourceId( Integer sourceId ) {
            this.sourceId = sourceId;
        }
        
        /**
         * @return the transportId
         */
        public Integer getTransportId() {
            return transportId;
        }

        /**
         * @param transportId the transportId to set
         */
        public void setTransportId( Integer transportId ) {
            this.transportId = transportId;
        }
        
        /**
         * @return the networkId
         */
        public Integer getNetworkId() {
            return networkId;
        }

        /**
         * @param networkId the networkId to set
         */
        public void setNetworkId( Integer networkId ) {
            this.networkId = networkId;
        }
        
        /**
         * @return the frequency
         */
        public Long getFrequency() {
            return frequency;
        }

        /**
         * @param frequency the frequency to set
         */
        public void setFrequency( Long frequency ) {
            this.frequency = frequency;
        }
        
        /**
         * @return the inversion
         */
        public String getInversion() {
            return inversion;
        }

        /**
         * @param inversion the inversion to set
         */
        public void setInversion( String inversion ) {
            this.inversion = inversion;
        }
        
        /**
         * @return the symbolRate
         */
        public Long getSymbolRate() {
            return symbolRate;
        }

        /**
         * @param symbolRate the symbolRate to set
         */
        public void setSymbolRate( Long symbolRate ) {
            this.symbolRate = symbolRate;
        }
        
        /**
         * @return the fEC
         */
        public String getFEC() {
            return fEC;
        }

        /**
         * @param fEC the fEC to set
         */
        public void setFEC( String fEC ) {
            this.fEC = fEC;
        }
        
        /**
         * @return the polarity
         */
        public String getPolarity() {
            return polarity;
        }

        /**
         * @param polarity the polarity to set
         */
        public void setPolarity( String polarity ) {
            this.polarity = polarity;
        }
        
        /**
         * @return the modulation
         */
        public String getModulation() {
            return modulation;
        }

        /**
         * @param modulation the modulation to set
         */
        public void setModulation( String modulation ) {
            this.modulation = modulation;
        }
        
        /**
         * @return the bandwidth
         */
        public String getBandwidth() {
            return bandwidth;
        }

        /**
         * @param bandwidth the bandwidth to set
         */
        public void setBandwidth( String bandwidth ) {
            this.bandwidth = bandwidth;
        }
        
        /**
         * @return the lPCodeRate
         */
        public String getLPCodeRate() {
            return lPCodeRate;
        }

        /**
         * @param lPCodeRate the lPCodeRate to set
         */
        public void setLPCodeRate( String lPCodeRate ) {
            this.lPCodeRate = lPCodeRate;
        }
        
        /**
         * @return the hPCodeRate
         */
        public String getHPCodeRate() {
            return hPCodeRate;
        }

        /**
         * @param hPCodeRate the hPCodeRate to set
         */
        public void setHPCodeRate( String hPCodeRate ) {
            this.hPCodeRate = hPCodeRate;
        }
        
        /**
         * @return the transmissionMode
         */
        public String getTransmissionMode() {
            return transmissionMode;
        }

        /**
         * @param transmissionMode the transmissionMode to set
         */
        public void setTransmissionMode( String transmissionMode ) {
            this.transmissionMode = transmissionMode;
        }
        
        /**
         * @return the guardInterval
         */
        public String getGuardInterval() {
            return guardInterval;
        }

        /**
         * @param guardInterval the guardInterval to set
         */
        public void setGuardInterval( String guardInterval ) {
            this.guardInterval = guardInterval;
        }
        
        /**
         * @return the visible
         */
        public Boolean isVisible() {
            return visible;
        }

        /**
         * @param visible the visible to set
         */
        public void setVisible( Boolean visible ) {
            this.visible = visible;
        }
        
        /**
         * @return the constellation
         */
        public String getConstellation() {
            return constellation;
        }

        /**
         * @param constellation the constellation to set
         */
        public void setConstellation( String constellation ) {
            this.constellation = constellation;
        }
        
        /**
         * @return the hierarchy
         */
        public String getHierarchy() {
            return hierarchy;
        }

        /**
         * @param hierarchy the hierarchy to set
         */
        public void setHierarchy( String hierarchy ) {
            this.hierarchy = hierarchy;
        }
        
        /**
         * @return the modulationSystem
         */
        public String getModulationSystem() {
            return modulationSystem;
        }

        /**
         * @param modulationSystem the modulationSystem to set
         */
        public void setModulationSystem( String modulationSystem ) {
            this.modulationSystem = modulationSystem;
        }
        
        /**
         * @return the rollOff
         */
        public String getRollOff() {
            return rollOff;
        }

        /**
         * @param rollOff the rollOff to set
         */
        public void setRollOff( String rollOff ) {
            this.rollOff = rollOff;
        }
        
        /**
         * @return the sIStandard
         */
        public String getSIStandard() {
            return sIStandard;
        }

        /**
         * @param sIStandard the sIStandard to set
         */
        public void setSIStandard( String sIStandard ) {
            this.sIStandard = sIStandard;
        }
        
        /**
         * @return the serviceVersion
         */
        public Integer getServiceVersion() {
            return serviceVersion;
        }

        /**
         * @param serviceVersion the serviceVersion to set
         */
        public void setServiceVersion( Integer serviceVersion ) {
            this.serviceVersion = serviceVersion;
        }
        
        /**
         * @return the updateTimeStamp
         */
        public DateTime getUpdateTimeStamp() {
            return updateTimeStamp;
        }

        /**
         * @param updateTimeStamp the updateTimeStamp to set
         */
        public void setUpdateTimeStamp( DateTime updateTimeStamp ) {
            this.updateTimeStamp = updateTimeStamp;
        }
        
        /**
         * @return the defaultAuthority
         */
        public String getDefaultAuthority() {
            return defaultAuthority;
        }

        /**
         * @param defaultAuthority the defaultAuthority to set
         */
        public void setDefaultAuthority( String defaultAuthority ) {
            this.defaultAuthority = defaultAuthority;
        }
        
}