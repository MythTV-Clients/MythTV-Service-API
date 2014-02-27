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

import org.mythtv.services.core.events.dvr.TitleInfoDetails;
import org.mythtv.services.core.events.dvr.TitleInfoListDetails;

import java.util.ArrayList;
import java.util.List;

public class TitleInfoList {

        private TitleInfo[] titleInfos;

        /**
         * @return the titleInfos
         */
        public TitleInfo[] getTitleInfos() {
            return titleInfos;
        }

        /**
         * @param titleInfos the titleInfos to set
         */
        public void setTitleInfos( TitleInfo[] titleInfos ) {
            this.titleInfos = titleInfos;
        }

    public TitleInfoListDetails toTitleInfoListDetails() {

        TitleInfoListDetails details = new TitleInfoListDetails();

        if( null != titleInfos && titleInfos.length > 0 ) {

            List<TitleInfoDetails> titleInfoDetails = new ArrayList<TitleInfoDetails>();
            for( TitleInfo titleInfo : titleInfos ) {
                titleInfoDetails.add( titleInfo.toTitleInfoDetails() );
            }
            details.setTitleInfos( titleInfoDetails.toArray( new TitleInfoDetails[ titleInfoDetails.size() ] ) );
        }

        return details;
    }

    public static TitleInfoList fromTitleInfoListDetails( TitleInfoListDetails details ) {

        TitleInfoList titleInfoList = new TitleInfoList();

        if( null != details.getTitleInfos() && details.getTitleInfos().length > 0 ) {

            List<TitleInfo> titleInfos = new ArrayList<TitleInfo>();
            for( TitleInfoDetails detail : details.getTitleInfos() ) {
                titleInfos.add( TitleInfo.fromTitleInfoDetails( detail ) );
            }
            titleInfoList.setTitleInfos( titleInfos.toArray( new TitleInfo[ titleInfos.size() ] ) );
        }

        return titleInfoList;
    }

}