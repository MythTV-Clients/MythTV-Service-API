package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class CaptureCardList {

    
    @JsonProperty( "CaptureCards" )
    private CaptureCard[] captureCards;


    /**
     * @return the captureCards
     */
    public CaptureCard[] getCaptureCards() {
        return captureCards;
    }
    
    /**
     * @param captureCards the captureCards to set
     */
    public void setCaptureCards( CaptureCard[] captureCards ) {
        this.captureCards = captureCards;
    }
}