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
package org.mythtv.services.api.v027;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.FrontendActionList;
import org.mythtv.services.api.v027.beans.FrontendStatus;
import org.springframework.http.ResponseEntity;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface FrontendOperations {

    /*
     * GET method
     *
     * @param context
     * @param etagInfo
     * @return ResponseEntity<FrontendActionList>
     */
    ResponseEntity<FrontendActionList> getActionList(String context, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param etagInfo
     * @return ResponseEntity<String[]>
     */
    ResponseEntity<String[]> getContextList(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param etagInfo
     * @return ResponseEntity<FrontendStatus>
     */
    ResponseEntity<FrontendStatus> getStatus(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param chanId
     * @param startTime
     * @param etagInfo
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> playRecording(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param id
     * @param useBookmark
     * @param etagInfo
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> playVideo(String id, Boolean useBookmark, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param action
     * @param value
     * @param width
     * @param height
     * @param etagInfo
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> sendAction(String action, String value, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param message
     * @param timeout
     * @param etagInfo
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> sendMessage(String message, Integer timeout, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param error
     * @param type
     * @param message
     * @param origin
     * @param description
     * @param image
     * @param extra
     * @param progressText
     * @param progress
     * @param timeout
     * @param fullscreen
     * @param visibility
     * @param priority
     * @param etagInfo
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> sendNotification(Boolean error, String type, String message, String origin, String description, String image, String extra, String progressText, Float progress, Integer timeout, Boolean fullscreen, Integer visibility, Integer priority, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

}