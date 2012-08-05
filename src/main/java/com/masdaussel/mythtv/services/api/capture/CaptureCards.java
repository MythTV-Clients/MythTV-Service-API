/**
 *  This file is part of MythTV Service API for Java
 * 
 *  MythTV Service API for Java is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV Service API for Java is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV Service API for Java.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/tafypz/MythTV-Service-API.git>
 *
 */
package com.masdaussel.mythtv.services.api.capture;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class CaptureCards {

	@JsonProperty("CaptureCards")
	private List<CaptureCard>	captureCards;

	public CaptureCards() {
	}

	public CaptureCards(final List<CaptureCard> captureCards) {
		this.captureCards = captureCards;
	}

	/**
	 * @return the captureCards
	 */
	public List<CaptureCard> getCaptureCards() {
		return captureCards;
	}

	/**
	 * @param captureCards
	 *            the captureCards to set
	 */
	public void setCaptureCards(final List<CaptureCard> captureCards) {
		this.captureCards = captureCards;
	}

}
