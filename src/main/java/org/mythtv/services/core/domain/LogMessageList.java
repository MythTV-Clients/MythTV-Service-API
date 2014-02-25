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

import org.mythtv.services.core.events.myth.LabelValueDetails;
import org.mythtv.services.core.events.myth.LogMessageDetails;
import org.mythtv.services.core.events.myth.LogMessageListDetails;

import java.util.ArrayList;
import java.util.List;

public class LogMessageList {

        private LabelValue[] hostNames;
        private LabelValue[] applications;
        private LogMessage[] logMessages;

        /**
         * @return the hostNames
         */
        public LabelValue[] getHostNames() {
            return hostNames;
        }

        /**
         * @param hostNames the hostNames to set
         */
        public void setHostNames( LabelValue[] hostNames ) {
            this.hostNames = hostNames;
        }

        /**
         * @return the applications
         */
        public LabelValue[] getApplications() {
            return applications;
        }

        /**
         * @param applications the applications to set
         */
        public void setApplications( LabelValue[] applications ) {
            this.applications = applications;
        }

        /**
         * @return the logMessages
         */
        public LogMessage[] getLogMessages() {
            return logMessages;
        }

        /**
         * @param logMessages the logMessages to set
         */
        public void setLogMessages( LogMessage[] logMessages ) {
            this.logMessages = logMessages;
        }

    public LogMessageListDetails toLogMessageListDetails() {

        LogMessageListDetails details = new LogMessageListDetails();

        if( null != hostNames && hostNames.length > 0 ) {

            List<LabelValueDetails> hostNamelabelValueDetails = new ArrayList<LabelValueDetails>();
            for( LabelValue labelValue : hostNames ) {
                hostNamelabelValueDetails.add( labelValue.toLabelValueDetails() );
            }
            details.setHostNames( hostNamelabelValueDetails.toArray( new LabelValueDetails[ hostNamelabelValueDetails.size() ] ) );
        }

        if( null != applications && applications.length > 0 ) {

            List<LabelValueDetails> applicationlabelValueDetails = new ArrayList<LabelValueDetails>();
            for( LabelValue labelValue : applications ) {
                applicationlabelValueDetails.add( labelValue.toLabelValueDetails() );
            }
            details.setApplications( applicationlabelValueDetails.toArray( new LabelValueDetails[ applicationlabelValueDetails.size() ] ) );
        }

        if( null != logMessages && logMessages.length > 0 ) {

            List<LogMessageDetails> logMessageDetails = new ArrayList<LogMessageDetails>();
            for( LogMessage logMessage : logMessages ) {
                logMessageDetails.add( logMessage.toLogMessageDetails() );
            }
            details.setLogMessages(logMessageDetails.toArray(new LogMessageDetails[logMessageDetails.size()]));
        }

        return details;
    }

    public static LogMessageList fromLogMessageListDetails( LogMessageListDetails details ) {

        LogMessageList logMessageList = new LogMessageList();

        if( null != details.getHostNames() && details.getHostNames().length > 0 ) {

            List<LabelValue> hostNames = new ArrayList<LabelValue>();
            for( LabelValueDetails detail : details.getHostNames() ) {
                hostNames.add( LabelValue.fromLabelValueDetails( detail ) );
            }
            logMessageList.setHostNames( hostNames.toArray( new LabelValue[ hostNames.size() ] ) );
        }

        if( null != details.getApplications() && details.getApplications().length > 0 ) {

            List<LabelValue> applications = new ArrayList<LabelValue>();
            for( LabelValueDetails detail : details.getApplications() ) {
                applications.add( LabelValue.fromLabelValueDetails( detail ) );
            }
            logMessageList.setApplications( applications.toArray( new LabelValue[ applications.size() ] ) );
        }

        if( null != details.getLogMessages() && details.getLogMessages().length > 0 ) {

            List<LogMessage> logMessages = new ArrayList<LogMessage>();
            for( LogMessageDetails detail : details.getLogMessages() ) {
                logMessages.add( LogMessage.fromLogMessageDetails(detail) );
            }
            logMessageList.setLogMessages(logMessages.toArray(new LogMessage[logMessages.size()]));
        }

        return logMessageList;
    }

}