package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class EncoderList {

    
    @JsonProperty( "Encoders" )
    private Encoder[] encoders;


    /**
     * @return the encoders
     */
    public Encoder[] getEncoders() {
        return encoders;
    }
    
    /**
     * @param encoders the encoders to set
     */
    public void setEncoders( Encoder[] encoders ) {
        this.encoders = encoders;
    }
}