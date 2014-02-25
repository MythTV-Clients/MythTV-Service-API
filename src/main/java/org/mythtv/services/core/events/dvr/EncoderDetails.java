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
package org.mythtv.services.core.events.dvr;

public class EncoderDetails {

        private Integer id;
        private String hostName;
        private Boolean local;
        private Boolean connected;
        private Integer state;
        private Integer sleepStatus;
        private Boolean lowOnFreeSpace;
        private ProgramDetails recording;

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
         * @return the local
         */
        public Boolean isLocal() {
            return local;
        }

        /**
         * @param local the local to set
         */
        public void setLocal( Boolean local ) {
            this.local = local;
        }

        /**
         * @return the connected
         */
        public Boolean isConnected() {
            return connected;
        }

        /**
         * @param connected the connected to set
         */
        public void setConnected( Boolean connected ) {
            this.connected = connected;
        }

        /**
         * @return the state
         */
        public Integer getState() {
            return state;
        }

        /**
         * @param state the state to set
         */
        public void setState( Integer state ) {
            this.state = state;
        }

        /**
         * @return the sleepStatus
         */
        public Integer getSleepStatus() {
            return sleepStatus;
        }

        /**
         * @param sleepStatus the sleepStatus to set
         */
        public void setSleepStatus( Integer sleepStatus ) {
            this.sleepStatus = sleepStatus;
        }

        /**
         * @return the lowOnFreeSpace
         */
        public Boolean isLowOnFreeSpace() {
            return lowOnFreeSpace;
        }

        /**
         * @param lowOnFreeSpace the lowOnFreeSpace to set
         */
        public void setLowOnFreeSpace( Boolean lowOnFreeSpace ) {
            this.lowOnFreeSpace = lowOnFreeSpace;
        }

        /**
         * @return the recording
         */
        public ProgramDetails getRecording() {
            return recording;
        }

        /**
         * @param recording the recording to set
         */
        public void setRecording( ProgramDetails recording ) {
            this.recording = recording;
        }
        
}