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
package org.mythtv.services.api.capture;

import java.util.List;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;

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
	int addCaptureCard( CaptureCard captureCard ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param cardInput
	 * @return
	 */
	int addCardInput( CardInput cardInput ) throws MythServiceApiRuntimeException;

	/**
	 * - GET
	 * 
	 * @param cardId
	 * @return
	 */
	CaptureCardWrapper getCaptureCard( int cardId, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	List<CaptureCard> getCaptureCardList( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param hostName
	 * @param cardType
	 * @return
	 */
	List<CaptureCard> getCaptureCardList( String hostName, String cardType, ETagInfo etag ) throws MythServiceApiRuntimeException;

	/**
	 * - POST
	 * 
	 * @param cardId
	 * @return
	 */
	boolean removeCaptureCard( int cardId, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param cardInputId
	 * @return
	 */
	boolean removeCardInput( int cardInputId ) throws MythServiceApiRuntimeException;

	/**
	 * - POST
	 * 
	 * @param cardId
	 * @param setting
	 * @param value
	 * @return
	 */
	boolean updateCaptureCard( int cardId, String setting, String value ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param cardInputId
	 * @param setting
	 * @param value
	 * @return
	 */
	boolean updateCardInput( int cardInputId, String setting, String value ) throws MythServiceApiRuntimeException;

}
