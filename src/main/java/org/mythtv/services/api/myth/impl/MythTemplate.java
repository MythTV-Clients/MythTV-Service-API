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
package org.mythtv.services.api.myth.impl;

import org.joda.time.DateTime;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.StringList;
import org.mythtv.services.api.myth.ConnectionInfo;
import org.mythtv.services.api.myth.LogMessageList;
import org.mythtv.services.api.myth.MythOperations;
import org.mythtv.services.api.myth.SettingList;
import org.mythtv.services.api.myth.StorageGroupDirectoryList;
import org.mythtv.services.api.myth.TimeZoneInfo;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 * 
 */
public class MythTemplate extends AbstractMythOperations implements MythOperations {

	public enum Endpoint {
		GET_CONNECTION_INFO( "GetConnectionInfo" ),
		GET_HOST_NAME( "GetHostName" );
		
		private String endpoint;
		
		private Endpoint( String endpoint ) {
			this.endpoint = endpoint;
		}
		
		public String getEndpoint() {
			return endpoint;
		}
		
	}
	private final RestOperations restOperations;

	public MythTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		this.restOperations = restOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#addStorageGroupDir(java.lang
	 * .String, java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<Bool> addStorageGroupDir( String groupName, String directoryName, String hostName ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#backupDatabase()
	 */
	@Override
	public ResponseEntity<Bool> backupDatabase() throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#changePassword(java.lang.
	 * String, java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<Bool> changePassword( String username, String oldPassword, String newPassword ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#checkDatabase(boolean)
	 */
	@Override
	public ResponseEntity<Bool> checkDatabase( boolean repair ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#getConnectionInfo(java.lang
	 * .String)
	 */
	@Override
	public ResponseEntity<ConnectionInfo> getConnectionInfo( String pin, ETagInfo etag ) throws MythServiceApiRuntimeException {

		ResponseEntity<ConnectionInfo> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_CONNECTION_INFO.getEndpoint() ), HttpMethod.GET, getRequestEntity( null ), ConnectionInfo.class );
		handleResponseEtag( etag, responseEntity.getHeaders() );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#getHostName()
	 */
	@Override
	public ResponseEntity<String> getHostName() throws MythServiceApiRuntimeException {

		ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_HOST_NAME.getEndpoint() ), HttpMethod.GET,	getRequestEntity( null ), String.class );

		return responseEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#getHosts()
	 */
	@Override
	public ResponseEntity<StringList> getHosts( ETagInfo etag ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#getKeys()
	 */
	@Override
	public ResponseEntity<StringList> getKeys( ETagInfo etag ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#getLogs(java.lang.String,
	 * java.lang.String, int, int, java.lang.String, java.lang.String, int,
	 * java.lang.String, java.util.Date, java.util.Date, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public ResponseEntity<LogMessageList> getLogs( String hostname, String application, int pid, int tid, String thread, String filename, int line, String function, DateTime from, DateTime to, String level, String messageContains, ETagInfo etag ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#getSetting(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<SettingList> getSetting( String hostname, String key, String defaultValue, ETagInfo etag ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#getStoreageGroupDirectories
	 * (java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<StorageGroupDirectoryList> getStoreageGroupDirectories( String groupName, String hostname, ETagInfo etag ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#getTimeZoneInfo()
	 */
	@Override
	public ResponseEntity<TimeZoneInfo> getTimeZoneInfo() throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#profileDelete()
	 */
	@Override
	public ResponseEntity<Bool> profileDelete() throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#profileSubmit()
	 */
	@Override
	public ResponseEntity<Bool> profileSubmit() throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#profileText()
	 */
	@Override
	public ResponseEntity<String> profileText() throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#profileUrl()
	 */
	@Override
	public ResponseEntity<String> profileUrl() throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.myth.MythOperations#profileUpdated()
	 */
	@Override
	public ResponseEntity<String> profileUpdated() throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#putSetting(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<Bool> putSetting( String hostname, String key, String value ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#removeStorageGroupDirectory
	 * (java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseEntity<Bool> removeStorageGroupDirectory( String groupName, String directoryName, String hostname ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#sendMessage(java.lang.String,
	 * java.lang.String, int, int)
	 */
	@Override
	public ResponseEntity<Bool> sendMessage( String message, String address, int udpPort, int timeout ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mythtv.services.api.myth.MythOperations#testDatabaseSettings(java
	 * .lang.String, java.lang.String, java.lang.String, java.lang.String, int)
	 */
	@Override
	public ResponseEntity<Bool> testDatabaseSettings( String hostname, String username, String password, String databaseName, int databasePort ) throws MythServiceApiRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

}
