/**
 * 
 */
package org.mythtv.services.api.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.capture.CaptureCard;
import org.mythtv.services.api.capture.CaptureCardWrapper;
import org.mythtv.services.api.capture.CaptureOperations;

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
	 * Test method for {@link org.mythtv.services.api.capture.impl.CaptureTemplate#addCaptureCard(org.mythtv.services.api.capture.CaptureCard)}.
	 */
	@Test
	public void testAddCaptureCard() {
		Assert.assertTrue("Needs to be implemented", true);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.capture.impl.CaptureTemplate#addCardInput(org.mythtv.services.api.capture.CardInput)}.
	 */
	@Test
	public void testAddCardInput() {
		Assert.assertTrue("Needs to be implemented", true);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.capture.impl.CaptureTemplate#getCaptureCard(int)}.
	 */
	@Test
	public void testGetCaptureCard() {
		List<CaptureCard> cards = getCaptureCards();
		CaptureCardWrapper card = captureOperations.getCaptureCard(cards.get(0).getCardId());
		Assert.assertNotNull("card object is null", card);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.capture.impl.CaptureTemplate#getCaptureCardList()}.
	 */
	@Test
	public void testGetCaptureCardList() {
		getCaptureCards();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.capture.impl.CaptureTemplate#getCaptureCardList(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetCaptureCardListStringString() {
		List<CaptureCard> cards = getCaptureCards();
		CaptureCard c = cards.get(0);
		cards = captureOperations.getCaptureCardList(c.getHostName(), c.getCardType());
		Assert.assertNotNull("List of card is null...", cards);
		Assert.assertFalse("No capture cards returned...", cards.isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.capture.impl.CaptureTemplate#removeCaptureCard(int)}.
	 */
	@Test
	public void testRemoveCaptureCard() {
		Assert.assertTrue("Needs to be implemented", true);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.capture.impl.CaptureTemplate#removeCardInput(int)}.
	 */
	@Test
	public void testRemoveCardInput() {
		Assert.assertTrue("Needs to be implemented", true);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.capture.impl.CaptureTemplate#updateCaptureCard(int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUpdateCaptureCard() {
		Assert.assertTrue("Needs to be implemented", true);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.capture.impl.CaptureTemplate#updateCardInput(int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUpdateCardInput() {
		Assert.assertTrue("Needs to be implemented", true);
	}
	
	private List<CaptureCard> getCaptureCards() {
		List<CaptureCard> cards = captureOperations.getCaptureCardList();
		Assert.assertNotNull("List of card is null...", cards);
		Assert.assertFalse("No capture cards returned...", cards.isEmpty());
		return cards;
	}

}
