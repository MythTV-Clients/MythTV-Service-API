package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class Lineup {

    
    @JsonProperty( "LineupId" )
    private String lineupId;
    
    @JsonProperty( "Name" )
    private String name;
    
    @JsonProperty( "DisplayName" )
    private String displayName;
    
    @JsonProperty( "Type" )
    private String type;
    
    @JsonProperty( "Postal" )
    private String postal;
    
    @JsonProperty( "Device" )
    private String device;


    /**
     * @return the lineupId
     */
    public String getLineupId() {
        return lineupId;
    }
    
    /**
     * @param lineupId the lineupId to set
     */
    public void setLineupId( String lineupId ) {
        this.lineupId = lineupId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }
    
    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName( String displayName ) {
        this.displayName = displayName;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    /**
     * @param type the type to set
     */
    public void setType( String type ) {
        this.type = type;
    }

    /**
     * @return the postal
     */
    public String getPostal() {
        return postal;
    }
    
    /**
     * @param postal the postal to set
     */
    public void setPostal( String postal ) {
        this.postal = postal;
    }

    /**
     * @return the device
     */
    public String getDevice() {
        return device;
    }
    
    /**
     * @param device the device to set
     */
    public void setDevice( String device ) {
        this.device = device;
    }
}