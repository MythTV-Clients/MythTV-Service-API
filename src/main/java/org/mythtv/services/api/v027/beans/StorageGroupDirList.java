package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class StorageGroupDirList {

    
    @JsonProperty( "StorageGroupDirs" )
    private StorageGroupDir[] storageGroupDirs;


    /**
     * @return the storageGroupDirs
     */
    public StorageGroupDir[] getStorageGroupDirs() {
        return storageGroupDirs;
    }
    
    /**
     * @param storageGroupDirs the storageGroupDirs to set
     */
    public void setStorageGroupDirs( StorageGroupDir[] storageGroupDirs ) {
        this.storageGroupDirs = storageGroupDirs;
    }
}