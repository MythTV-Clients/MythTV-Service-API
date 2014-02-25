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

import org.apache.commons.beanutils.BeanUtils;
import org.mythtv.services.core.events.frontend.FrontendActionListDetails;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class FrontendActionList {

        private Map<String,String> actionList;
        
        /**
         * @return the actionList
         */
        public Map<String,String> getActionList() {
            return actionList;
        }

        /**
         * @param actionList the actionList to set
         */
        public void setActionList( Map<String,String> actionList ) {
            this.actionList = actionList;
        }

    public FrontendActionListDetails toFrontendActionListDetails() {

        FrontendActionListDetails details = new FrontendActionListDetails();
        try {
            BeanUtils.copyProperties( details, this );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return details;
    }

    public static FrontendActionList fromFrontendActionListDetails( FrontendActionListDetails details ) {

        FrontendActionList frontendActionList = new FrontendActionList();
        try {
            BeanUtils.copyProperties( frontendActionList, details );
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        } catch( InvocationTargetException e ) {
            e.printStackTrace();
        }

        return frontendActionList;
    }

}