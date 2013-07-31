package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ArtworkInfoList {

    
    @JsonProperty( "ArtworkInfos" )
    private ArtworkInfo[] artworkInfos;


    /**
     * @return the artworkInfos
     */
    public ArtworkInfo[] getArtworkInfos() {
        return artworkInfos;
    }
    
    /**
     * @param artworkInfos the artworkInfos to set
     */
    public void setArtworkInfos( ArtworkInfo[] artworkInfos ) {
        this.artworkInfos = artworkInfos;
    }
}