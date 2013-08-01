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
import org.mythtv.services.api.v027.beans.ConnectionInfo;
import org.mythtv.services.api.v027.beans.LogMessageList;
import org.mythtv.services.api.v027.beans.SettingList;
import org.mythtv.services.api.v027.beans.StorageGroupDirList;
import org.mythtv.services.api.v027.beans.TimeZoneInfo;
import org.springframework.http.ResponseEntity;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface MythOperations {

	/*
	 * POST method
	 *
	 * @param groupName
	 * @param dirName
	 * @param hostName
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> addStorageGroupDir(String groupName, String dirName, String hostName) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> backupDatabase() throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> changePassword(String userName, String oldPassword, String newPassword) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param repair
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> checkDatabase(Boolean repair) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param pin
	 * @param etagInfo
	 * @return ResponseEntity<ConnectionInfo>
	 */
	ResponseEntity<ConnectionInfo> getConnectionInfo(String pin, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> getHostName(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<String[]>
	 */
	ResponseEntity<String[]> getHosts(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<String[]>
	 */
	ResponseEntity<String[]> getKeys(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param hostName
	 * @param application
	 * @param pID
	 * @param tID
	 * @param thread
	 * @param filename
	 * @param line
	 * @param function
	 * @param fromTime
	 * @param toTime
	 * @param level
	 * @param msgContains
	 * @param etagInfo
	 * @return ResponseEntity<LogMessageList>
	 */
	ResponseEntity<LogMessageList> getLogs(String hostName, String application, Integer pID, Integer tID, String thread, String filename, Integer line, String function, org.joda.time.DateTime fromTime, org.joda.time.DateTime toTime, String level, String msgContains, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param hostName
	 * @param key
	 * @param defaultValue
	 * @param etagInfo
	 * @return ResponseEntity<SettingList>
	 */
	ResponseEntity<SettingList> getSetting(String hostName, String key, String defaultValue, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param groupName
	 * @param hostName
	 * @param etagInfo
	 * @return ResponseEntity<StorageGroupDirList>
	 */
	ResponseEntity<StorageGroupDirList> getStorageGroupDirs(String groupName, String hostName, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<TimeZoneInfo>
	 */
	ResponseEntity<TimeZoneInfo> getTimeZone(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> profileDelete() throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> profileSubmit() throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> profileText(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> profileURL(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ResponseEntity<String>
	 */
	ResponseEntity<String> profileUpdated(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param hostName
	 * @param key
	 * @param value
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> putSetting(String hostName, String key, String value) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param groupName
	 * @param dirName
	 * @param hostName
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> removeStorageGroupDir(String groupName, String dirName, String hostName) throws MythServiceApiRuntimeException;

	/*
	 * GET method
	 *
	 * @param message
	 * @param address
	 * @param udpPort
	 * @param timeout
	 * @param etagInfo
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> sendMessage(String message, String address, Integer udpPort, Integer timeout, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

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
	 * @param address
	 * @param udpPort
	 * @param etagInfo
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> sendNotification(Boolean error, String type, String message, String origin, String description, String image, String extra, String progressText, Float progress, Integer timeout, Boolean fullscreen, Integer visibility, Integer priority, String address, Integer udpPort, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

	/*
	 * POST method
	 *
	 * @param hostName
	 * @param userName
	 * @param password
	 * @param dBName
	 * @param dbPort
	 * @return ResponseEntity<Boolean>
	 */
	ResponseEntity<Boolean> testDBSettings(String hostName, String userName, String password, String dBName, Integer dbPort) throws MythServiceApiRuntimeException;

}