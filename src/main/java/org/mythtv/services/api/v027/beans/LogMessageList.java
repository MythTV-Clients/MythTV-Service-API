package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class LogMessageList {

    
    @JsonProperty( "HostNames" )
    private LabelValue[] hostNames;
    
    @JsonProperty( "Applications" )
    private LabelValue[] applications;
    
    @JsonProperty( "LogMessages" )
    private LogMessage[] logMessages;


    /**
     * @return the hostNames
     */
    public LabelValue[] getHostNames() {
        return hostNames;
    }
    
    /**
     * @param hostNames the hostNames to set
     */
    public void setHostNames( LabelValue[] hostNames ) {
        this.hostNames = hostNames;
    }

    /**
     * @return the applications
     */
    public LabelValue[] getApplications() {
        return applications;
    }
    
    /**
     * @param applications the applications to set
     */
    public void setApplications( LabelValue[] applications ) {
        this.applications = applications;
    }

    /**
     * @return the logMessages
     */
    public LogMessage[] getLogMessages() {
        return logMessages;
    }
    
    /**
     * @param logMessages the logMessages to set
     */
    public void setLogMessages( LogMessage[] logMessages ) {
        this.logMessages = logMessages;
    }
}