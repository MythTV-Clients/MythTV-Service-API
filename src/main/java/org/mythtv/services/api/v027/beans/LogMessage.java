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
package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.mythtv.services.api.DateTimeSerializer;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class LogMessage {

    
    @JsonProperty( "HostName" )
    private String hostName;
    
    @JsonProperty( "Application" )
    private String application;
    
    @JsonProperty( "PID" )
    private Integer pID;
    
    @JsonProperty( "TID" )
    private Integer tID;
    
    @JsonProperty( "Thread" )
    private String thread;
    
    @JsonProperty( "Filename" )
    private String filename;
    
    @JsonProperty( "Line" )
    private Integer line;
    
    @JsonProperty( "Function" )
    private String function;
    @JsonSerialize( using = DateTimeSerializer.class )
    @JsonProperty( "Time" )
    private org.joda.time.DateTime time;
    
    @JsonProperty( "Level" )
    private String level;
    
    @JsonProperty( "Message" )
    private String message;


    /**
     * @return the hostName
     */
    public String getHostName() {
        return hostName;
    }
    
    /**
     * @param hostName the hostName to set
     */
    public void setHostName( String hostName ) {
        this.hostName = hostName;
    }

    /**
     * @return the application
     */
    public String getApplication() {
        return application;
    }
    
    /**
     * @param application the application to set
     */
    public void setApplication( String application ) {
        this.application = application;
    }

    /**
     * @return the pID
     */
    public Integer getPID() {
        return pID;
    }
    
    /**
     * @param pID the pID to set
     */
    public void setPID( Integer pID ) {
        this.pID = pID;
    }

    /**
     * @return the tID
     */
    public Integer getTID() {
        return tID;
    }
    
    /**
     * @param tID the tID to set
     */
    public void setTID( Integer tID ) {
        this.tID = tID;
    }

    /**
     * @return the thread
     */
    public String getThread() {
        return thread;
    }
    
    /**
     * @param thread the thread to set
     */
    public void setThread( String thread ) {
        this.thread = thread;
    }

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }
    
    /**
     * @param filename the filename to set
     */
    public void setFilename( String filename ) {
        this.filename = filename;
    }

    /**
     * @return the line
     */
    public Integer getLine() {
        return line;
    }
    
    /**
     * @param line the line to set
     */
    public void setLine( Integer line ) {
        this.line = line;
    }

    /**
     * @return the function
     */
    public String getFunction() {
        return function;
    }
    
    /**
     * @param function the function to set
     */
    public void setFunction( String function ) {
        this.function = function;
    }

    /**
     * @return the time
     */
    public org.joda.time.DateTime getTime() {
        return time;
    }
    
    /**
     * @param time the time to set
     */
    public void setTime( org.joda.time.DateTime time ) {
        this.time = time;
    }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }
    
    /**
     * @param level the level to set
     */
    public void setLevel( String level ) {
        this.level = level;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * @param message the message to set
     */
    public void setMessage( String message ) {
        this.message = message;
    }
}