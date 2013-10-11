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
package org.mythtv.services.api.v025;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface MythServices {

	/*
	 * Capture Operations
	 * @return an instance of a class implementing CaptureOperations
	 */
	CaptureOperations captureOperations();

	/*
	 * Channel Operations
	 * @return an instance of a class implementing ChannelOperations
	 */
	ChannelOperations channelOperations();

	/*
	 * Content Operations
	 * @return an instance of a class implementing ContentOperations
	 */
	ContentOperations contentOperations();

	/*
	 * Dvr Operations
	 * @return an instance of a class implementing DvrOperations
	 */
	DvrOperations dvrOperations();

	/*
	 * Guide Operations
	 * @return an instance of a class implementing GuideOperations
	 */
	GuideOperations guideOperations();

	/*
	 * Myth Operations
	 * @return an instance of a class implementing MythOperations
	 */
	MythOperations mythOperations();

	/*
	 * Video Operations
	 * @return an instance of a class implementing VideoOperations
	 */
	VideoOperations videoOperations();

	/*
	 * Frontend Operations
	 * @return an instance of a class implementing FrontendOperations
	 */
	FrontendOperations frontendOperations();

	/*
	 * Status Operations
	 * @return an instance of a class implementing StatusOperations
	 */
	StatusOperations statusOperations();

}