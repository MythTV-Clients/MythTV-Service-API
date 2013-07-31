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
package org.mythtv.services.api.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.CaptureOperations;
import org.mythtv.services.api.v026.beans.CaptureCard;
import org.mythtv.services.api.v026.beans.CaptureCardList;
import org.mythtv.services.api.v026.beans.CaptureCardWrapper;
import org.springframework.http.ResponseEntity;

/**
 * @author sebastien
 *
 */
public class CaptureOperationsTest extends BaseMythtvServiceApiTester {

	private CaptureOperations captureOperations;
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		captureOperations = api.captureOperations();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.CaptureTemplate#addCaptureCard(org.mythtv.services.api.v026.beans.CaptureCard)}.
	 */
	@Ignore
	public void testAddCaptureCard() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.CaptureTemplate#addCardInput(org.mythtv.services.api.capture.CardInput)}.
	 */
	@Ignore
	public void testAddCardInput() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.CaptureTemplate#getCaptureCard(int)}.
	 */
	@Test
	public void testGetCaptureCard() throws MythServiceApiRuntimeException {
		List<CaptureCard> cards = getCaptureCards();
		ResponseEntity<CaptureCardWrapper> card = captureOperations.getCaptureCard( cards.get(0).getCardId(), ETagInfo.createEmptyETag() );
		Assert.assertNotNull( "card object is null", card.getBody() );
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.CaptureTemplate#getCaptureCardList()}.
	 */
	public void testGetCaptureCardList() throws MythServiceApiRuntimeException {
		getCaptureCards();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.CaptureTemplate#getCaptureCardList(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetCaptureCardListStringString() throws MythServiceApiRuntimeException {
		List<CaptureCard> cards = getCaptureCards();
		CaptureCard c = cards.get( 0 );
		
		ResponseEntity<CaptureCardList> responseEntity = captureOperations.getCaptureCardList( c.getHostName(), c.getCardType(), ETagInfo.createEmptyETag() );
		cards = responseEntity.getBody().getCaptureCards().getCaptureCards();
		Assert.assertNotNull("List of card is null...", cards);
		Assert.assertFalse("No capture cards returned...", cards.isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.CaptureTemplate#removeCaptureCard(int)}.
	 */
	@Ignore
	public void testRemoveCaptureCard() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.CaptureTemplate#removeCardInput(int)}.
	 */
	@Ignore
	public void testRemoveCardInput() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.CaptureTemplate#updateCaptureCard(int, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testUpdateCaptureCard() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.v026.impl.CaptureTemplate#updateCardInput(int, java.lang.String, java.lang.String)}.
	 */
	@Ignore
	public void testUpdateCardInput() {
		fail("Not yet implemented"); // TODO
	}
	
	private List<CaptureCard> getCaptureCards() throws MythServiceApiRuntimeException {
		ResponseEntity<CaptureCardList> responseEntity = captureOperations.getCaptureCardList( ETagInfo.createEmptyETag() );
		Assert.assertNotNull( "responseEntity is null...", responseEntity );
		
		CaptureCardList cards = responseEntity.getBody();
		Assert.assertFalse( "No capture cards returned...", cards.getCaptureCards().getCaptureCards().isEmpty() );
		return cards.getCaptureCards().getCaptureCards();
	}

}
