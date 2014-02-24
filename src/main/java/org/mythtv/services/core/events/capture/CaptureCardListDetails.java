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
package org.mythtv.services.core.events.capture;

public class CaptureCardListDetails {

        private CaptureCardDetails[] captureCards;

        /**
         * @return the captureCards
         */
        public CaptureCardDetails[] getCaptureCards() {
            return captureCards;
        }

        /**
         * @param captureCards the captureCards to set
         */
        public void setCaptureCards( CaptureCardDetails[] captureCards ) {
            this.captureCards = captureCards;
        }

}