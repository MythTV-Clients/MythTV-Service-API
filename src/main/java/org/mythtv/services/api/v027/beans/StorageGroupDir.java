package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class StorageGroupDir {

    
    @JsonProperty( "Id" )
    private Integer id;
    
    @JsonProperty( "GroupName" )
    private String groupName;
    
    @JsonProperty( "HostName" )
    private String hostName;
    
    @JsonProperty( "DirName" )
    private String dirName;


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
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * @param groupName the groupName to set
     */
    public void setGroupName( String groupName ) {
        this.groupName = groupName;
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
     * @return the dirName
     */
    public String getDirName() {
        return dirName;
    }
    
    /**
     * @param dirName the dirName to set
     */
    public void setDirName( String dirName ) {
        this.dirName = dirName;
    }
}