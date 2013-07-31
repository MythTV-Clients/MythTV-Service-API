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
package org.mythtv.services.api.v026;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.beans.CaptureCard;
import org.mythtv.services.api.v026.beans.CaptureCardList;
import org.mythtv.services.api.v026.beans.CaptureCardWrapper;
import org.mythtv.services.api.v026.beans.CardInput;
import org.springframework.http.ResponseEntity;

/**
 * @author Daniel Frey
 *
 */
public interface CaptureOperations {

	/**
	 * - POST
	 * 
	 * @param captureCard
	 * @return
	 */
	ResponseEntity<Int> addCaptureCard( CaptureCard captureCard ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param cardInput
	 * @return
	 */
	ResponseEntity<Int> addCardInput( CardInput cardInput ) throws MythServiceApiRuntimeException;

	/**
	 * - GET
	 * 
	 * @param cardId
	 * @return
	 */
	ResponseEntity<CaptureCardWrapper> getCaptureCard( int cardId, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<CaptureCardList> getCaptureCardList( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param hostName
	 * @param cardType
	 * @return
	 */
	ResponseEntity<CaptureCardList> getCaptureCardList( String hostName, String cardType, ETagInfo etag ) throws MythServiceApiRuntimeException;

	/**
	 * - POST
	 * 
	 * @param cardId
	 * @return
	 */
	ResponseEntity<Bool> removeCaptureCard( int cardId, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param cardInputId
	 * @return
	 */
	ResponseEntity<Bool> removeCardInput( int cardInputId ) throws MythServiceApiRuntimeException;

	/**
	 * - POST
	 * 
	 * @param cardId
	 * @param setting
	 * @param value
	 * @return
	 */
	ResponseEntity<Bool> updateCaptureCard( int cardId, String setting, String value ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param cardInputId
	 * @param setting
	 * @param value
	 * @return
	 */
	ResponseEntity<Bool> updateCardInput( int cardInputId, String setting, String value ) throws MythServiceApiRuntimeException;

}
