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
public class ProgramList {

    
    @JsonProperty( "StartIndex" )
    private Integer startIndex;
    
    @JsonProperty( "Count" )
    private Integer count;
    
    @JsonProperty( "TotalAvailable" )
    private Integer totalAvailable;
    @JsonSerialize( using = DateTimeSerializer.class )
    @JsonProperty( "AsOf" )
    private org.joda.time.DateTime asOf;
    
    @JsonProperty( "Version" )
    private String version;
    
    @JsonProperty( "ProtoVer" )
    private String protoVer;
    
    @JsonProperty( "Programs" )
    private Program[] programs;


    /**
     * @return the startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }
    
    /**
     * @param startIndex the startIndex to set
     */
    public void setStartIndex( Integer startIndex ) {
        this.startIndex = startIndex;
    }

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
     * @return the totalAvailable
     */
    public Integer getTotalAvailable() {
        return totalAvailable;
    }
    
    /**
     * @param totalAvailable the totalAvailable to set
     */
    public void setTotalAvailable( Integer totalAvailable ) {
        this.totalAvailable = totalAvailable;
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
     * @return the programs
     */
    public Program[] getPrograms() {
        return programs;
    }
    
    /**
     * @param programs the programs to set
     */
    public void setPrograms( Program[] programs ) {
        this.programs = programs;
    }
}