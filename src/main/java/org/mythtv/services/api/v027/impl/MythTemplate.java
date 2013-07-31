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
package org.mythtv.services.api.v027.impl;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.ConnectionInfo;
import org.mythtv.services.api.v027.beans.LogMessageList;
import org.mythtv.services.api.v027.beans.SettingList;
import org.mythtv.services.api.v027.beans.StorageGroupDirList;
import org.mythtv.services.api.v027.beans.TimeZoneInfo;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class MythTemplate extends AbstractMythOperations implements org.mythtv.services.api.v027.MythOperations {

    private final RestOperations restOperations;

    public MythTemplate( RestOperations restOperations, String apiUrlBase ) {
        super( apiUrlBase );
        this.restOperations = restOperations;
    }


    @Override
    public ResponseEntity<Boolean> addStorageGroupDir(String groupName, String dirName, String hostName) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(groupName != null && !groupName.isEmpty())
            parameters.add( "GroupName", groupName );
        if(dirName != null && !dirName.isEmpty())
            parameters.add( "DirName", dirName );
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "AddStorageGroupDir", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> backupDatabase() throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "BackupDatabase", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> changePassword(String userName, String oldPassword, String newPassword) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(userName != null && !userName.isEmpty())
            parameters.add( "UserName", userName );
        if(oldPassword != null && !oldPassword.isEmpty())
            parameters.add( "OldPassword", oldPassword );
        if(newPassword != null && !newPassword.isEmpty())
            parameters.add( "NewPassword", newPassword );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "ChangePassword", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> checkDatabase(Boolean repair) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(repair != null)
            parameters.add( "Repair", repair.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "CheckDatabase", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<ConnectionInfo> getConnectionInfo(String pin, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(pin != null && !pin.isEmpty())
            parameters.add( "Pin", pin );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<ConnectionInfo> responseEntity = restOperations.exchange( buildUri( "GetConnectionInfo", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ConnectionInfo.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<String> getHostName(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "GetHostName", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<String[]> getHosts(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<String[]> responseEntity = restOperations.exchange( buildUri( "GetHosts", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String[].class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<String[]> getKeys(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<String[]> responseEntity = restOperations.exchange( buildUri( "GetKeys", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String[].class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<LogMessageList> getLogs(String hostName, String application, Integer pID, Integer tID, String thread, String filename, Integer line, String function, org.joda.time.DateTime fromTime, org.joda.time.DateTime toTime, String level, String msgContains, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );
        if(application != null && !application.isEmpty())
            parameters.add( "Application", application );
        if(pID != null)
            parameters.add( "PID", pID.toString() );
        if(tID != null)
            parameters.add( "TID", tID.toString() );
        if(thread != null && !thread.isEmpty())
            parameters.add( "Thread", thread );
        if(filename != null && !filename.isEmpty())
            parameters.add( "Filename", filename );
        if(line != null)
            parameters.add( "Line", line.toString() );
        if(function != null && !function.isEmpty())
            parameters.add( "Function", function );
        if(fromTime != null)
            parameters.add( "FromTime", fromTime.toString() );
        if(toTime != null)
            parameters.add( "ToTime", toTime.toString() );
        if(level != null && !level.isEmpty())
            parameters.add( "Level", level );
        if(msgContains != null && !msgContains.isEmpty())
            parameters.add( "MsgContains", msgContains );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<LogMessageList> responseEntity = restOperations.exchange( buildUri( "GetLogs", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), LogMessageList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<SettingList> getSetting(String hostName, String key, String defaultValue, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );
        if(key != null && !key.isEmpty())
            parameters.add( "Key", key );
        if(defaultValue != null && !defaultValue.isEmpty())
            parameters.add( "Default", defaultValue );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<SettingList> responseEntity = restOperations.exchange( buildUri( "GetSetting", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), SettingList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<StorageGroupDirList> getStorageGroupDirs(String groupName, String hostName, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(groupName != null && !groupName.isEmpty())
            parameters.add( "GroupName", groupName );
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<StorageGroupDirList> responseEntity = restOperations.exchange( buildUri( "GetStorageGroupDirs", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), StorageGroupDirList.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<TimeZoneInfo> getTimeZone(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<TimeZoneInfo> responseEntity = restOperations.exchange( buildUri( "GetTimeZone", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), TimeZoneInfo.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> profileDelete() throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "ProfileDelete", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> profileSubmit() throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "ProfileSubmit", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<String> profileText(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "ProfileText", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<String> profileURL(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "ProfileURL", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<String> profileUpdated(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<String> responseEntity = restOperations.exchange( buildUri( "ProfileUpdated", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), String.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> putSetting(String hostName, String key, String value) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );
        if(key != null && !key.isEmpty())
            parameters.add( "Key", key );
        if(value != null && !value.isEmpty())
            parameters.add( "Value", value );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "PutSetting", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> removeStorageGroupDir(String groupName, String dirName, String hostName) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(groupName != null && !groupName.isEmpty())
            parameters.add( "GroupName", groupName );
        if(dirName != null && !dirName.isEmpty())
            parameters.add( "DirName", dirName );
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "RemoveStorageGroupDir", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> sendMessage(String message, String address, Integer udpPort, Integer timeout, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(message != null && !message.isEmpty())
            parameters.add( "Message", message );
        if(address != null && !address.isEmpty())
            parameters.add( "Address", address );
        if(udpPort != null)
            parameters.add( "udpPort", udpPort.toString() );
        if(timeout != null)
            parameters.add( "Timeout", timeout.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "SendMessage", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Boolean.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> sendNotification(Boolean error, String type, String message, String origin, String description, String image, String extra, String progressText, Float progress, Integer timeout, Boolean fullscreen, Integer visibility, Integer priority, String address, Integer udpPort, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(error != null)
            parameters.add( "Error", error.toString() );
        if(type != null && !type.isEmpty())
            parameters.add( "Type", type );
        if(message != null && !message.isEmpty())
            parameters.add( "Message", message );
        if(origin != null && !origin.isEmpty())
            parameters.add( "Origin", origin );
        if(description != null && !description.isEmpty())
            parameters.add( "Description", description );
        if(image != null && !image.isEmpty())
            parameters.add( "Image", image );
        if(extra != null && !extra.isEmpty())
            parameters.add( "Extra", extra );
        if(progressText != null && !progressText.isEmpty())
            parameters.add( "ProgressText", progressText );
        if(progress != null)
            parameters.add( "Progress", progress.toString() );
        if(timeout != null)
            parameters.add( "Timeout", timeout.toString() );
        if(fullscreen != null)
            parameters.add( "Fullscreen", fullscreen.toString() );
        if(visibility != null)
            parameters.add( "Visibility", visibility.toString() );
        if(priority != null)
            parameters.add( "Priority", priority.toString() );
        if(address != null && !address.isEmpty())
            parameters.add( "Address", address );
        if(udpPort != null)
            parameters.add( "udpPort", udpPort.toString() );
        if(etagInfo != null)
            parameters.add( "etagInfo", etagInfo.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "SendNotification", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Boolean.class );
            handleResponseEtag( etagInfo, responseEntity.getHeaders() );
        
        return responseEntity;
	}


    @Override
    public ResponseEntity<Boolean> testDBSettings(String hostName, String userName, String password, String dBName, Integer dbPort) throws MythServiceApiRuntimeException {
        LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        
        if(hostName != null && !hostName.isEmpty())
            parameters.add( "HostName", hostName );
        if(userName != null && !userName.isEmpty())
            parameters.add( "UserName", userName );
        if(password != null && !password.isEmpty())
            parameters.add( "Password", password );
        if(dBName != null && !dBName.isEmpty())
            parameters.add( "DBName", dBName );
        if(dbPort != null)
            parameters.add( "dbPort", dbPort.toString() );

        ResponseEntity<Boolean> responseEntity = restOperations.exchange( buildUri( "TestDBSettings", parameters ), HttpMethod.POST, getRequestEntity(null), Boolean.class );
        
        
        return responseEntity;
	}

}