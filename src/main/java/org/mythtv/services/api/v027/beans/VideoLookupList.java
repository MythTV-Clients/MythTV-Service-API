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