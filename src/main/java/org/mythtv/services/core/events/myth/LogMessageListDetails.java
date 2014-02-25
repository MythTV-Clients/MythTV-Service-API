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
package org.mythtv.services.core.events.myth;

public class LogMessageListDetails {

        private LabelValueDetails[] hostNames;
        private LabelValueDetails[] applications;
        private LogMessageDetails[] logMessages;

        /**
         * @return the hostNames
         */
        public LabelValueDetails[] getHostNames() {
            return hostNames;
        }

        /**
         * @param hostNames the hostNames to set
         */
        public void setHostNames( LabelValueDetails[] hostNames ) {
            this.hostNames = hostNames;
        }

        /**
         * @return the applications
         */
        public LabelValueDetails[] getApplications() {
            return applications;
        }

        /**
         * @param applications the applications to set
         */
        public void setApplications( LabelValueDetails[] applications ) {
            this.applications = applications;
        }

        /**
         * @return the logMessages
         */
        public LogMessageDetails[] getLogMessages() {
            return logMessages;
        }

        /**
         * @param logMessages the logMessages to set
         */
        public void setLogMessages( LogMessageDetails[] logMessages ) {
            this.logMessages = logMessages;
        }
        
}