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

import org.joda.time.DateTime;
import org.mythtv.services.core.events.dvr.RecRuleDetails;
import org.mythtv.services.core.events.dvr.RecRuleListDetails;

import java.util.ArrayList;
import java.util.List;

public class RecRuleList {

        private Integer startIndex;
        private Integer count;
        private Integer totalAvailable;
        private DateTime asOf;
        private String version;
        private String protoVer;
        private RecRule[] recRules;

        /**
         * @return the startIndex
         */
        public Integer getStartIndex() {
            return startIndex;
        }

        /**
         * @param startIndex the startIndex to set
         */
        public void setStartIndex( Integer startIndex ) {
            this.startIndex = startIndex;
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
         * @return the totalAvailable
         */
        public Integer getTotalAvailable() {
            return totalAvailable;
        }

        /**
         * @param totalAvailable the totalAvailable to set
         */
        public void setTotalAvailable( Integer totalAvailable ) {
            this.totalAvailable = totalAvailable;
        }

        /**
         * @return the asOf
         */
        public DateTime getAsOf() {
            return asOf;
        }

        /**
         * @param asOf the asOf to set
         */
        public void setAsOf( DateTime asOf ) {
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
         * @return the recRules
         */
        public RecRule[] getRecRules() {
            return recRules;
        }

        /**
         * @param recRules the recRules to set
         */
        public void setRecRules( RecRule[] recRules ) {
            this.recRules = recRules;
        }

    public RecRuleListDetails toRecRuleListDetails() {

        RecRuleListDetails details = new RecRuleListDetails();
        details.setStartIndex( startIndex );
        details.setCount( count );
        details.setTotalAvailable( totalAvailable );
        details.setAsOf( asOf );
        details.setVersion( version );
        details.setProtoVer( protoVer );

        if( null != recRules && recRules.length > 0 ) {

            List<RecRuleDetails> recRuleDetails = new ArrayList<RecRuleDetails>();
            for( RecRule recRule : recRules ) {
                recRuleDetails.add( recRule.toRecRuleDetails() );
            }
            details.setRecRules( recRuleDetails.toArray( new RecRuleDetails[ recRuleDetails.size() ] ) );
        }

        return details;
    }

    public static RecRuleList fromRecRuleListDetails( RecRuleListDetails details ) {

        RecRuleList list = new RecRuleList();
        list.setStartIndex( details.getStartIndex() );
        list.setCount( details.getCount() );
        list.setTotalAvailable( details.getTotalAvailable() );
        list.setAsOf( details.getAsOf() );
        list.setVersion( details.getVersion() );
        list.setProtoVer( details.getProtoVer() );

        if( null != details.getRecRules() && details.getRecRules().length > 0 ) {

            List<RecRule> recRules = new ArrayList<RecRule>();
            for( RecRuleDetails detail : details.getRecRules() ) {
                recRules.add( RecRule.fromRecRuleDetails( detail ) );
            }
            list.setRecRules( recRules.toArray( new RecRule[ recRules.size() ] ) );
        }

        return list;
    }

}