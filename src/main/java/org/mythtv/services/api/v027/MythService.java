/*
 * Copyright (c) 2014 TIKINOU LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mythtv.services.api.v027;

import org.mythtv.services.api.ArrayOfString;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v027.beans.ConnectionInfo;
import org.mythtv.services.api.v027.beans.LogMessageList;
import org.mythtv.services.api.v027.beans.SettingList;
import org.mythtv.services.api.v027.beans.StorageGroupDirList;
import org.mythtv.services.api.v027.beans.TimeZoneInfo;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface MythService {

	/*
	 * POST method
	 *
	 * @param groupName
	 * @param dirName
	 * @param hostName
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Myth/AddStorageGroupDir")
	Bool addStorageGroupDir(@Query("GroupName") String groupName, @Query("DirName") String dirName, @Query("HostName") String hostName);

	/*
     * POST method (asynchronous)
     *
	 * @param groupName
	 * @param dirName
	 * @param hostName
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Myth/AddStorageGroupDir")
    void addStorageGroupDir(@Query("GroupName") String groupName, @Query("DirName") String dirName, @Query("HostName") String hostName, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Myth/BackupDatabase")
	Bool backupDatabase();

	/*
     * POST method (asynchronous)
     *
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Myth/BackupDatabase")
    void backupDatabase(Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Myth/ChangePassword")
	Bool changePassword(@Query("UserName") String userName, @Query("OldPassword") String oldPassword, @Query("NewPassword") String newPassword);

	/*
     * POST method (asynchronous)
     *
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Myth/ChangePassword")
    void changePassword(@Query("UserName") String userName, @Query("OldPassword") String oldPassword, @Query("NewPassword") String newPassword, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param repair
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Myth/CheckDatabase")
	Bool checkDatabase(@Query("Repair") Boolean repair);

	/*
     * POST method (asynchronous)
     *
	 * @param repair
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Myth/CheckDatabase")
    void checkDatabase(@Query("Repair") Boolean repair, Callback<Bool> callback);


	/*
	 * GET method
	 *
	 * @param pin
	 * @param etagInfo
	 * @return ConnectionInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/GetConnectionInfo")
	ConnectionInfo getConnectionInfo(@Query("Pin") String pin, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param pin
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/GetConnectionInfo")
    void getConnectionInfo(@Query("Pin") String pin, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ConnectionInfo> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/GetHostName")
	String getHostName(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/GetHostName")
    void getHostName(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ArrayOfString
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/GetHosts")
	ArrayOfString getHosts(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/GetHosts")
    void getHosts(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArrayOfString> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return ArrayOfString
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/GetKeys")
	ArrayOfString getKeys(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/GetKeys")
    void getKeys(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<ArrayOfString> callback);


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
	 * @return LogMessageList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/GetLogs")
	LogMessageList getLogs(@Query("HostName") String hostName, @Query("Application") String application, @Query("PID") Integer pID, @Query("TID") Integer tID, @Query("Thread") String thread, @Query("Filename") String filename, @Query("Line") Integer line, @Query("Function") String function, @Query("FromTime") org.joda.time.DateTime fromTime, @Query("ToTime") org.joda.time.DateTime toTime, @Query("Level") String level, @Query("MsgContains") String msgContains, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
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
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/GetLogs")
    void getLogs(@Query("HostName") String hostName, @Query("Application") String application, @Query("PID") Integer pID, @Query("TID") Integer tID, @Query("Thread") String thread, @Query("Filename") String filename, @Query("Line") Integer line, @Query("Function") String function, @Query("FromTime") org.joda.time.DateTime fromTime, @Query("ToTime") org.joda.time.DateTime toTime, @Query("Level") String level, @Query("MsgContains") String msgContains, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<LogMessageList> callback);


	/*
	 * GET method
	 *
	 * @param hostName
	 * @param key
	 * @param defaultValue
	 * @param etagInfo
	 * @return SettingList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/GetSetting")
	SettingList getSetting(@Query("HostName") String hostName, @Query("Key") String key, @Query("Default") String defaultValue, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param hostName
	 * @param key
	 * @param defaultValue
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/GetSetting")
    void getSetting(@Query("HostName") String hostName, @Query("Key") String key, @Query("Default") String defaultValue, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<SettingList> callback);


	/*
	 * GET method
	 *
	 * @param groupName
	 * @param hostName
	 * @param etagInfo
	 * @return StorageGroupDirList
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/GetStorageGroupDirs")
	StorageGroupDirList getStorageGroupDirs(@Query("GroupName") String groupName, @Query("HostName") String hostName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param groupName
	 * @param hostName
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/GetStorageGroupDirs")
    void getStorageGroupDirs(@Query("GroupName") String groupName, @Query("HostName") String hostName, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<StorageGroupDirList> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return TimeZoneInfo
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/GetTimeZone")
	TimeZoneInfo getTimeZone(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/GetTimeZone")
    void getTimeZone(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<TimeZoneInfo> callback);


	/*
	 * POST method
	 *
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Myth/ProfileDelete")
	Bool profileDelete();

	/*
     * POST method (asynchronous)
     *
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Myth/ProfileDelete")
    void profileDelete(Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Myth/ProfileSubmit")
	Bool profileSubmit();

	/*
     * POST method (asynchronous)
     *
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Myth/ProfileSubmit")
    void profileSubmit(Callback<Bool> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/ProfileText")
	String profileText(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/ProfileText")
    void profileText(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/ProfileURL")
	String profileURL(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/ProfileURL")
    void profileURL(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * GET method
	 *
	 * @param etagInfo
	 * @return String
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/ProfileUpdated")
	String profileUpdated(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/ProfileUpdated")
    void profileUpdated(@Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<String> callback);


	/*
	 * POST method
	 *
	 * @param hostName
	 * @param key
	 * @param value
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Myth/PutSetting")
	Bool putSetting(@Query("HostName") String hostName, @Query("Key") String key, @Query("Value") String value);

	/*
     * POST method (asynchronous)
     *
	 * @param hostName
	 * @param key
	 * @param value
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Myth/PutSetting")
    void putSetting(@Query("HostName") String hostName, @Query("Key") String key, @Query("Value") String value, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param groupName
	 * @param dirName
	 * @param hostName
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Myth/RemoveStorageGroupDir")
	Bool removeStorageGroupDir(@Query("GroupName") String groupName, @Query("DirName") String dirName, @Query("HostName") String hostName);

	/*
     * POST method (asynchronous)
     *
	 * @param groupName
	 * @param dirName
	 * @param hostName
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Myth/RemoveStorageGroupDir")
    void removeStorageGroupDir(@Query("GroupName") String groupName, @Query("DirName") String dirName, @Query("HostName") String hostName, Callback<Bool> callback);


	/*
	 * GET method
	 *
	 * @param message
	 * @param address
	 * @param udpPort
	 * @param timeout
	 * @param etagInfo
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/SendMessage")
	Bool sendMessage(@Query("Message") String message, @Query("Address") String address, @Query("udpPort") Integer udpPort, @Query("Timeout") Integer timeout, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
     *
	 * @param message
	 * @param address
	 * @param udpPort
	 * @param timeout
	 * @param etagInfo
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/SendMessage")
    void sendMessage(@Query("Message") String message, @Query("Address") String address, @Query("udpPort") Integer udpPort, @Query("Timeout") Integer timeout, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<Bool> callback);


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
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @GET("/Myth/SendNotification")
	Bool sendNotification(@Query("Error") Boolean error, @Query("Type") String type, @Query("Message") String message, @Query("Origin") String origin, @Query("Description") String description, @Query("Image") String image, @Query("Extra") String extra, @Query("ProgressText") String progressText, @Query("Progress") Float progress, @Query("Timeout") Integer timeout, @Query("Fullscreen") Boolean fullscreen, @Query("Visibility") Integer visibility, @Query("Priority") Integer priority, @Query("Address") String address, @Query("udpPort") Integer udpPort, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId);

	/*
     * GET method (asynchronous)
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
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @GET("/Myth/SendNotification")
    void sendNotification(@Query("Error") Boolean error, @Query("Type") String type, @Query("Message") String message, @Query("Origin") String origin, @Query("Description") String description, @Query("Image") String image, @Query("Extra") String extra, @Query("ProgressText") String progressText, @Query("Progress") Float progress, @Query("Timeout") Integer timeout, @Query("Fullscreen") Boolean fullscreen, @Query("Visibility") Integer visibility, @Query("Priority") Integer priority, @Query("Address") String address, @Query("udpPort") Integer udpPort, @Header("If-None-Match") ETagInfo etagInfo, @Header("MYTH_REQUEST_ID") String headerMythRequestId, Callback<Bool> callback);


	/*
	 * POST method
	 *
	 * @param hostName
	 * @param userName
	 * @param password
	 * @param dBName
	 * @param dbPort
	 * @return Bool
	 */
	@Headers({"Accept: application/json"})
    @POST("/Myth/TestDBSettings")
	Bool testDBSettings(@Query("HostName") String hostName, @Query("UserName") String userName, @Query("Password") String password, @Query("DBName") String dBName, @Query("dbPort") Integer dbPort);

	/*
     * POST method (asynchronous)
     *
	 * @param hostName
	 * @param userName
	 * @param password
	 * @param dBName
	 * @param dbPort
	 * @param callback
     */
    @Headers({"Accept: application/json"})
    @POST("/Myth/TestDBSettings")
    void testDBSettings(@Query("HostName") String hostName, @Query("UserName") String userName, @Query("Password") String password, @Query("DBName") String dBName, @Query("dbPort") Integer dbPort, Callback<Bool> callback);


}