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
public class VideoLookupList {

    
    @JsonProperty( "Count" )
    private Integer count;
    @JsonSerialize( using = DateTimeSerializer.class )
    @JsonProperty( "AsOf" )
    private org.joda.time.DateTime asOf;
    
    @JsonProperty( "Version" )
    private String version;
    
    @JsonProperty( "ProtoVer" )
    private String protoVer;
    
    @JsonProperty( "VideoLookups" )
    private VideoLookup[] videoLookups;


    /**
     * @return the count
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * @param count the count to set
     */
    public void setCount( Integer count ) {
        this.count = count;
    }

    /**
     * @return the asOf
     */
    public org.joda.time.DateTime getAsOf() {
        return asOf;
    }
    
    /**
     * @param asOf the asOf to set
     */
    public void setAsOf( org.joda.time.DateTime asOf ) {
        this.asOf = asOf;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * @param version the version to set
     */
    public void setVersion( String version ) {
        this.version = version;
    }

    /**
     * @return the protoVer
     */
    public String getProtoVer() {
        return protoVer;
    }
    
    /**
     * @param protoVer the protoVer to set
     */
    public void setProtoVer( String protoVer ) {
        this.protoVer = protoVer;
    }

    /**
     * @return the videoLookups
     */
    public VideoLookup[] getVideoLookups() {
        return videoLookups;
    }
    
    /**
     * @param videoLookups the videoLookups to set
     */
    public void setVideoLookups( VideoLookup[] videoLookups ) {
        this.videoLookups = videoLookups;
    }
}