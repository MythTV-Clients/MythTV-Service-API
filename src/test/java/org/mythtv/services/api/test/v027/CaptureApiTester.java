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
package org.mythtv.services.api.test.v027;

import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v027.CaptureOperations;
import org.mythtv.services.api.v027.beans.CaptureCard;
import org.mythtv.services.api.v027.beans.CaptureCardList;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

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
