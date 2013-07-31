package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.joda.time.DateTime;
import org.mythtv.services.api.DateTimeSerializer;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class TimeZoneInfo {

    
    @JsonProperty( "TimeZoneID" )
    private String timeZoneID;
    
    @JsonProperty( "UTCOffset" )
    private Integer uTCOffset;
    @JsonSerialize( using = DateTimeSerializer.class )
    @JsonProperty( "CurrentDateTime" )
    private org.joda.time.DateTime currentDateTime;


    /**
     * @return the timeZoneID
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }
    
    /**
     * @param timeZoneID the timeZoneID to set
     */
    public void setTimeZoneID( String timeZoneID ) {
        this.timeZoneID = timeZoneID;
    }

    /**
     * @return the uTCOffset
     */
    public Integer getUTCOffset() {
        return uTCOffset;
    }
    
    /**
     * @param uTCOffset the uTCOffset to set
     */
    public void setUTCOffset( Integer uTCOffset ) {
        this.uTCOffset = uTCOffset;
    }

    /**
     * @return the currentDateTime
     */
    public org.joda.time.DateTime getCurrentDateTime() {
        return currentDateTime;
    }
    
    /**
     * @param currentDateTime the currentDateTime to set
     */
    public void setCurrentDateTime( org.joda.time.DateTime currentDateTime ) {
        this.currentDateTime = currentDateTime;
    }
}