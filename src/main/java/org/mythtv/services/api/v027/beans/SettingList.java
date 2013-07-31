package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class SettingList {

    
    @JsonProperty( "HostName" )
    private String hostName;
    
    @JsonProperty( "Settings" )
    private Map<String,String> settings;


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
     * @return the settings
     */
    public Map<String,String> getSettings() {
        return settings;
    }
    
    /**
     * @param settings the settings to set
     */
    public void setSettings( Map<String,String> settings ) {
        this.settings = settings;
    }
}