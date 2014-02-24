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

import org.mythtv.services.core.events.capture.CaptureCardDetails;
import org.mythtv.services.core.events.capture.CaptureCardListDetails;

import java.util.ArrayList;
import java.util.List;

public class CaptureCardList {

    private CaptureCard[] captureCards;

    /**
      * @return the captureCards
      */
    public CaptureCard[] getCaptureCards() {
            return captureCards;
        }

    /**
      * @param captureCards the captureCards to set
      */
    public void setCaptureCards( CaptureCard[] captureCards ) {
            this.captureCards = captureCards;
        }

    public CaptureCardListDetails toCaptureCardListDetails() {

        CaptureCardListDetails details = new CaptureCardListDetails();

        if( null != captureCards && captureCards.length > 0 ) {

            List<CaptureCardDetails> captureCardDetails = new ArrayList<CaptureCardDetails>();
            for( CaptureCard captureCard : captureCards ) {
                captureCardDetails.add( captureCard.toCaptureCardDetails() );
            }
            details.setCaptureCards(captureCardDetails.toArray(new CaptureCardDetails[captureCardDetails.size()]));
        }

        return details;
    }

    public static CaptureCardList fromCaptureCardListDetails( CaptureCardListDetails details ) {

        CaptureCardList captureCardList = new CaptureCardList();

        if( null != details.getCaptureCards() && details.getCaptureCards().length > 0 ) {

            List<CaptureCard> captureCards = new ArrayList<CaptureCard>();
            for( CaptureCardDetails detail : details.getCaptureCards() ) {
                captureCards.add( CaptureCard.fromCaptureCardDetails(detail) );
            }
            captureCardList.setCaptureCards(captureCards.toArray(new CaptureCard[captureCards.size()]));
        }

        return captureCardList;
    }

}