package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ArtworkInfo {

    
    @JsonProperty( "URL" )
    private String uRL;
    
    @JsonProperty( "FileName" )
    private String fileName;
    
    @JsonProperty( "StorageGroup" )
    private String storageGroup;
    
    @JsonProperty( "Type" )
    private String type;


    /**
     * @return the uRL
     */
    public String getURL() {
        return uRL;
    }
    
    /**
     * @param uRL the uRL to set
     */
    public void setURL( String uRL ) {
        this.uRL = uRL;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }
    
    /**
     * @param fileName the fileName to set
     */
    public void setFileName( String fileName ) {
        this.fileName = fileName;
    }

    /**
     * @return the storageGroup
     */
    public String getStorageGroup() {
        return storageGroup;
    }
    
    /**
     * @param storageGroup the storageGroup to set
     */
    public void setStorageGroup( String storageGroup ) {
        this.storageGroup = storageGroup;
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
}