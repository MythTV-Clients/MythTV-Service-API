package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class LineupList {

    
    @JsonProperty( "Lineups" )
    private Lineup[] lineups;


    /**
     * @return the lineups
     */
    public Lineup[] getLineups() {
        return lineups;
    }
    
    /**
     * @param lineups the lineups to set
     */
    public void setLineups( Lineup[] lineups ) {
        this.lineups = lineups;
    }
}