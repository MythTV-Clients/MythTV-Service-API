package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ConnectionInfo {

    
    @JsonProperty( "Version" )
    private VersionInfo version;
    
    @JsonProperty( "Database" )
    private DatabaseInfo database;
    
    @JsonProperty( "WOL" )
    private WOLInfo wOL;


    /**
     * @return the version
     */
    public VersionInfo getVersion() {
        return version;
    }
    
    /**
     * @param version the version to set
     */
    public void setVersion( VersionInfo version ) {
        this.version = version;
    }

    /**
     * @return the database
     */
    public DatabaseInfo getDatabase() {
        return database;
    }
    
    /**
     * @param database the database to set
     */
    public void setDatabase( DatabaseInfo database ) {
        this.database = database;
    }

    /**
     * @return the wOL
     */
    public WOLInfo getWOL() {
        return wOL;
    }
    
    /**
     * @param wOL the wOL to set
     */
    public void setWOL( WOLInfo wOL ) {
        this.wOL = wOL;
    }
}