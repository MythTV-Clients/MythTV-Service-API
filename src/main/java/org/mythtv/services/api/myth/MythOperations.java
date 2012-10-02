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
package org.mythtv.services.api.myth;

import org.joda.time.DateTime;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.StringList;
import org.springframework.http.ResponseEntity;

/**
 * @author Daniel Frey
 *
 */
public interface MythOperations {

	/**
	 * - POST
	 * 
	 * @param groupName
	 * @param directoryName
	 * @param hostName
	 * @return
	 */
	ResponseEntity<Bool> addStorageGroupDir( String groupName, String directoryName, String hostName ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @return
	 */
	ResponseEntity<Bool> backupDatabase() throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param username
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	ResponseEntity<Bool> changePassword( String username, String oldPassword, String newPassword ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param repair
	 * @return
	 */
	ResponseEntity<Bool> checkDatabase( boolean repair ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param pin
	 * @return
	 */
	ResponseEntity<ConnectionInfo> getConnectionInfo( String pin, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<String> getHostName() throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<StringList> getHosts( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<StringList> getKeys( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param hostname
	 * @param application
	 * @param pid
	 * @param tid
	 * @param thread
	 * @param filename
	 * @param line
	 * @param function
	 * @param from
	 * @param to
	 * @param level
	 * @param messageContains
	 * @return
	 */
	ResponseEntity<LogMessageList> getLogs( String hostname, String application, int pid, int tid, String thread, String filename, int line, String function, DateTime from, DateTime to, String level, String messageContains, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param hostname
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	ResponseEntity<SettingList> getSetting( String hostname, String key, String defaultValue, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param groupName
	 * @param hostname
	 * @return
	 */
	ResponseEntity<StorageGroupDirectoryList> getStoreageGroupDirectories( String groupName, String hostname, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<TimeZoneInfo> getTimeZoneInfo() throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @return
	 */
	ResponseEntity<Bool> profileDelete() throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @return
	 */
	ResponseEntity<Bool> profileSubmit() throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<String> profileText() throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<String> profileUrl() throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<String> profileUpdated() throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param hostname
	 * @param key
	 * @param value
	 * @return
	 */
	ResponseEntity<Bool> putSetting( String hostname, String key, String value ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param groupName
	 * @param directoryName
	 * @param hostname
	 * @return
	 */
	ResponseEntity<Bool> removeStorageGroupDirectory( String groupName, String directoryName, String hostname ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param message
	 * @param address
	 * @param udpPort
	 * @param timeout
	 * @return
	 */
	ResponseEntity<Bool> sendMessage( String message, String address, int udpPort, int timeout ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param hostname
	 * @param username
	 * @param password
	 * @param databaseName
	 * @param databasePort
	 * @return
	 */
	ResponseEntity<Bool> testDatabaseSettings( String hostname, String username, String password, String databaseName, int databasePort ) throws MythServiceApiRuntimeException;
	
}
