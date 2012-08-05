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
package com.masdaussel.mythtv.services.api.myth.impl;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.masdaussel.mythtv.services.api.myth.ConnectionInfo;
import com.masdaussel.mythtv.services.api.myth.LogMessage;
import com.masdaussel.mythtv.services.api.myth.MythOperations;
import com.masdaussel.mythtv.services.api.myth.Setting;
import com.masdaussel.mythtv.services.api.myth.StorageGroupDirectory;
import com.masdaussel.mythtv.services.api.myth.TimeZoneInfo;

/**
 * @author sebastien
 * 
 */
public class MythTemplate extends AbstractMythOperations implements MythOperations {

	private final RestTemplate	restTemplate;

	public MythTemplate(final RestTemplate restTemplate, final String apiUrlBase) {
		super(apiUrlBase);
		this.restTemplate = restTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#addStorageGroupDir
	 * (java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addStorageGroupDir(final String groupName, final String directoryName, final String hostName) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#backupDatabase()
	 */
	@Override
	public boolean backupDatabase() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#changePassword
	 * (java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean changePassword(final String username, final String oldPassword, final String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#checkDatabase(
	 * boolean)
	 */
	@Override
	public boolean checkDatabase(final boolean repair) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#getConnectionInfo
	 * (java.lang.String)
	 */
	@Override
	public ConnectionInfo getConnectionInfo(final String pin) {

		final ResponseEntity<ConnectionInfo> responseEntity = restTemplate.exchange(buildUri("GetConnectionInfo"), HttpMethod.GET, getRequestEntity(),
				ConnectionInfo.class);
		final ConnectionInfo connectionInfo = responseEntity.getBody();

		return connectionInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.myth.MythOperations#getHostName()
	 */
	@Override
	public String getHostName() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.myth.MythOperations#getHosts()
	 */
	@Override
	public List<String> getHosts() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.myth.MythOperations#getKeys()
	 */
	@Override
	public List<String> getKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#getLogs(java.lang
	 * .String, java.lang.String, int, int, java.lang.String, java.lang.String,
	 * int, java.lang.String, java.util.Date, java.util.Date, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public List<LogMessage> getLogs(final String hostname, final String application, final int pid, final int tid, final String thread, final String filename,
			final int line, final String function, final Date from, final Date to, final String level, final String messageContains) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#getSetting(java
	 * .lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Setting> getSetting(final String hostname, final String key, final String defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.myth.MythOperations#
	 * getStoreageGroupDirectories(java.lang.String, java.lang.String)
	 */
	@Override
	public List<StorageGroupDirectory> getStoreageGroupDirectories(final String groupName, final String hostname) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#getTimeZoneInfo()
	 */
	@Override
	public TimeZoneInfo getTimeZoneInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#profileDelete()
	 */
	@Override
	public boolean profileDelete() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#profileSubmit()
	 */
	@Override
	public boolean profileSubmit() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.myth.MythOperations#profileText()
	 */
	@Override
	public String profileText() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#profileUpdated()
	 */
	@Override
	public String profileUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.myth.MythOperations#profileUrl()
	 */
	@Override
	public String profileUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#putSetting(java
	 * .lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean putSetting(final String hostname, final String key, final String value) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.myth.MythOperations#
	 * removeStorageGroupDirectory(java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean removeStorageGroupDirectory(final String groupName, final String directoryName, final String hostname) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#sendMessage(java
	 * .lang.String, java.lang.String, int, int)
	 */
	@Override
	public boolean sendMessage(final String message, final String address, final int udpPort, final int timeout) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.myth.MythOperations#testDatabaseSettings
	 * (java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * int)
	 */
	@Override
	public boolean testDatabaseSettings(final String hostname, final String username, final String password, final String databaseName, final int databasePort) {
		// TODO Auto-generated method stub
		return false;
	}

}
