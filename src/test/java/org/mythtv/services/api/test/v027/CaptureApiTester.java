package org.mythtv.services.api.test.v027;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v027.CaptureOperations;
import org.mythtv.services.api.v027.beans.CaptureCard;
import org.mythtv.services.api.v027.beans.CaptureCardList;
import org.springframework.http.ResponseEntity;

public class CaptureApiTester extends BaseApiTester{
	private CaptureOperations operations;
	
	@Override
	protected void prepareOperations() {
		operations = mythservices.captureOperations();
	}
	
	@Ignore
	public void testAddCaptureCard() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testAddCardInput() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCaptureCard() {
		ResponseEntity<CaptureCardList> responseList = operations.getCaptureCardList(null, null, ETagInfo.createEmptyETag());
		assertNotNull(responseList);
		CaptureCardList list = responseList.getBody();
		assertNotNull(list);
		assertNotNull(list.getCaptureCards());
		assertTrue(list.getCaptureCards().length > 0);
		ResponseEntity<CaptureCard> response = operations.getCaptureCard(list.getCaptureCards()[0].getCardId(), ETagInfo.createEmptyETag());
		assertNotNull(response);
		assertNotNull(response.getBody());
	}

	@Test
	public void testGetCaptureCardList() {
		ResponseEntity<CaptureCardList> responseList = operations.getCaptureCardList(null, null, ETagInfo.createEmptyETag());
		assertNotNull(responseList);
		CaptureCardList list = responseList.getBody();
		assertNotNull(list);
		assertNotNull(list.getCaptureCards());
		assertTrue(list.getCaptureCards().length > 0);
	}

	@Ignore
	public void testRemoveCaptureCard() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testRemoveCardInput() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testUpdateCaptureCard() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testUpdateCardInput() {
		fail("Not yet implemented");
	}

}
