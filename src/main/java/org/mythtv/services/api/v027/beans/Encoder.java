package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class Encoder {

    
    @JsonProperty( "Id" )
    private Integer id;
    
    @JsonProperty( "HostName" )
    private String hostName;
    
    @JsonProperty( "Local" )
    private Boolean local;
    
    @JsonProperty( "Connected" )
    private Boolean connected;
    
    @JsonProperty( "State" )
    private Integer state;
    
    @JsonProperty( "SleepStatus" )
    private Integer sleepStatus;
    
    @JsonProperty( "LowOnFreeSpace" )
    private Boolean lowOnFreeSpace;
    
    @JsonProperty( "Recording" )
    private Program recording;


    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId( Integer id ) {
        this.id = id;
    }

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
     * @return the local
     */
    public Boolean getLocal() {
        return local;
    }
    
    /**
     * @param local the local to set
     */
    public void setLocal( Boolean local ) {
        this.local = local;
    }

    /**
     * @return the connected
     */
    public Boolean getConnected() {
        return connected;
    }
    
    /**
     * @param connected the connected to set
     */
    public void setConnected( Boolean connected ) {
        this.connected = connected;
    }

    /**
     * @return the state
     */
    public Integer getState() {
        return state;
    }
    
    /**
     * @param state the state to set
     */
    public void setState( Integer state ) {
        this.state = state;
    }

    /**
     * @return the sleepStatus
     */
    public Integer getSleepStatus() {
        return sleepStatus;
    }
    
    /**
     * @param sleepStatus the sleepStatus to set
     */
    public void setSleepStatus( Integer sleepStatus ) {
        this.sleepStatus = sleepStatus;
    }

    /**
     * @return the lowOnFreeSpace
     */
    public Boolean getLowOnFreeSpace() {
        return lowOnFreeSpace;
    }
    
    /**
     * @param lowOnFreeSpace the lowOnFreeSpace to set
     */
    public void setLowOnFreeSpace( Boolean lowOnFreeSpace ) {
        this.lowOnFreeSpace = lowOnFreeSpace;
    }

    /**
     * @return the recording
     */
    public Program getRecording() {
        return recording;
    }
    
    /**
     * @param recording the recording to set
     */
    public void setRecording( Program recording ) {
        this.recording = recording;
    }
}