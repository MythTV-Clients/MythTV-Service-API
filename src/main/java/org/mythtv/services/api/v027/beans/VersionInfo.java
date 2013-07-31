package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class VersionInfo {

    
    @JsonProperty( "Version" )
    private String version;
    
    @JsonProperty( "Branch" )
    private String branch;
    
    @JsonProperty( "Protocol" )
    private String protocol;
    
    @JsonProperty( "Binary" )
    private String binary;
    
    @JsonProperty( "Schema" )
    private String schema;


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
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }
    
    /**
     * @param branch the branch to set
     */
    public void setBranch( String branch ) {
        this.branch = branch;
    }

    /**
     * @return the protocol
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * @param protocol the protocol to set
     */
    public void setProtocol( String protocol ) {
        this.protocol = protocol;
    }

    /**
     * @return the binary
     */
    public String getBinary() {
        return binary;
    }
    
    /**
     * @param binary the binary to set
     */
    public void setBinary( String binary ) {
        this.binary = binary;
    }

    /**
     * @return the schema
     */
    public String getSchema() {
        return schema;
    }
    
    /**
     * @param schema the schema to set
     */
    public void setSchema( String schema ) {
        this.schema = schema;
    }
}