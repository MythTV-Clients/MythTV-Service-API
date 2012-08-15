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

import java.util.List;

import org.joda.time.DateTime;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;

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
	boolean addStorageGroupDir( String groupName, String directoryName, String hostName ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @return
	 */
	boolean backupDatabase() throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param username
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	boolean changePassword( String username, String oldPassword, String newPassword ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param repair
	 * @return
	 */
	boolean checkDatabase( boolean repair ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param pin
	 * @return
	 */
	ConnectionInfo getConnectionInfo( String pin, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	String getHostName() throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	List<String> getHosts( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	List<String> getKeys( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
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
	List<LogMessage> getLogs( String hostname, String application, int pid, int tid, String thread, String filename, int line, String function, DateTime from, DateTime to, String level, String messageContains, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param hostname
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	List<Setting> getSetting( String hostname, String key, String defaultValue, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param groupName
	 * @param hostname
	 * @return
	 */
	List<StorageGroupDirectory> getStoreageGroupDirectories( String groupName, String hostname, ETagInfo etag ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	TimeZoneInfo getTimeZoneInfo() throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @return
	 */
	boolean profileDelete() throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @return
	 */
	boolean profileSubmit() throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	String profileText() throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	String profileUrl() throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @return
	 */
	String profileUpdated() throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param hostname
	 * @param key
	 * @param value
	 * @return
	 */
	boolean putSetting( String hostname, String key, String value ) throws MythServiceApiRuntimeException;
	
	/**
	 * - POST
	 * 
	 * @param groupName
	 * @param directoryName
	 * @param hostname
	 * @return
	 */
	boolean removeStorageGroupDirectory( String groupName, String directoryName, String hostname ) throws MythServiceApiRuntimeException;
	
	/**
	 * - GET
	 * 
	 * @param message
	 * @param address
	 * @param udpPort
	 * @param timeout
	 * @return
	 */
	boolean sendMessage( String message, String address, int udpPort, int timeout ) throws MythServiceApiRuntimeException;
	
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
	boolean testDatabaseSettings( String hostname, String username, String password, String databaseName, int databasePort ) throws MythServiceApiRuntimeException;
	
}
