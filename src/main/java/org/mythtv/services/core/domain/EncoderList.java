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

import org.mythtv.services.core.events.dvr.EncoderDetails;
import org.mythtv.services.core.events.dvr.EncoderListDetails;

import java.util.ArrayList;
import java.util.List;

public class EncoderList {
    
        private Encoder[] encoders;

        /**
         * @return the encoders
         */
        public Encoder[] getEncoders() {
            return encoders;
        }

        /**
         * @param encoders the encoders to set
         */
        public void setEncoders( Encoder[] encoders ) {
            this.encoders = encoders;
        }

    public EncoderListDetails toEncoderListDetails() {

        EncoderListDetails details = new EncoderListDetails();

        if( null != encoders && encoders.length > 0 ) {

            List<EncoderDetails> encoderDetails = new ArrayList<EncoderDetails>();
            for( Encoder encoder : encoders ) {
                encoderDetails.add( encoder.toEncoderDetails() );
            }
            details.setEncoders( encoderDetails.toArray( new EncoderDetails[ encoderDetails.size() ] ) );
        }

        return details;
    }

    public static EncoderList fromEncoderListDetails( EncoderListDetails details ) {

        EncoderList encoderList = new EncoderList();

        if( null != details.getEncoders() && details.getEncoders().length > 0 ) {

            List<Encoder> encoders = new ArrayList<Encoder>();
            for( EncoderDetails detail : details.getEncoders() ) {
                encoders.add( Encoder.fromEncoderDetails( detail ) );
            }
            encoderList.setEncoders( encoders.toArray( new Encoder[ encoders.size() ] ) );
        }

        return encoderList;
    }

}