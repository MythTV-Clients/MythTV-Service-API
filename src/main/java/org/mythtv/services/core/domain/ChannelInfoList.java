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
import org.mythtv.services.core.events.channel.ChannelInfoDetails;
import org.mythtv.services.core.events.channel.ChannelInfoListDetails;

import java.util.ArrayList;
import java.util.List;

public class ChannelInfoList {

        private Integer startIndex;
        private Integer count;
        private Integer currentPage;
        private Integer totalPages;
        private Integer totalAvailable;
        private DateTime asOf;
        private String version;
        private String protoVer;
        private ChannelInfo[] channelInfos;

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
         * @return the currentPage
         */
        public Integer getCurrentPage() {
            return currentPage;
        }

        /**
         * @param currentPage the currentPage to set
         */
        public void setCurrentPage( Integer currentPage ) {
            this.currentPage = currentPage;
        }

        /**
         * @return the totalPages
         */
        public Integer getTotalPages() {
            return totalPages;
        }

        /**
         * @param totalPages the totalPages to set
         */
        public void setTotalPages( Integer totalPages ) {
            this.totalPages = totalPages;
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
         * @return the channelInfos
         */
        public ChannelInfo[] getChannelInfos() {
            return channelInfos;
        }

        /**
         * @param channelInfos the channelInfos to set
         */
        public void setChannelInfos( ChannelInfo[] channelInfos ) {
            this.channelInfos = channelInfos;
        }

    public ChannelInfoListDetails toChannelInfoListDetails() {

        ChannelInfoListDetails details = new ChannelInfoListDetails();
        details.setStartIndex( startIndex );
        details.setCount( count );
        details.setCurrentPage( currentPage );
        details.setTotalPages( totalPages );
        details.setTotalAvailable( totalAvailable );
        details.setAsOf( asOf );
        details.setVersion( version );
        details.setProtoVer( protoVer );

        if( null != channelInfos && channelInfos.length > 0 ) {

            List<ChannelInfoDetails> channelInfoDetails = new ArrayList<ChannelInfoDetails>();
            for( ChannelInfo channelInfo : channelInfos ) {
                channelInfoDetails.add( channelInfo.toChannelInfoDetails() );
            }
            details.setChannelInfos( channelInfoDetails.toArray( new ChannelInfoDetails[ channelInfoDetails.size() ] ) );
        }

        return details;
    }

    public static ChannelInfoList fromChannelInfoListDetails( ChannelInfoListDetails details ) {

        ChannelInfoList list = new ChannelInfoList();
        list.setStartIndex( details.getStartIndex() );
        list.setCount( details.getCount() );
        list.setCurrentPage( details.getCurrentPage() );
        list.setTotalPages( details.getTotalPages() );
        list.setTotalAvailable( details.getTotalAvailable() );
        list.setAsOf( details.getAsOf() );
        list.setVersion( details.getVersion() );
        list.setProtoVer( details.getProtoVer() );

        if( null != details.getChannelInfos() && details.getChannelInfos().length > 0 ) {

            List<ChannelInfo> channelInfos = new ArrayList<ChannelInfo>();
            for( ChannelInfoDetails detail : details.getChannelInfos() ) {
                channelInfos.add( ChannelInfo.fromChannelInfoDetails(detail) );
            }
            list.setChannelInfos( channelInfos.toArray( new ChannelInfo[ channelInfos.size() ] ) );
        }

        return list;
    }

}