package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class TitleInfoList {

    
    @JsonProperty( "TitleInfos" )
    private TitleInfo[] titleInfos;


    /**
     * @return the titleInfos
     */
    public TitleInfo[] getTitleInfos() {
        return titleInfos;
    }
    
    /**
     * @param titleInfos the titleInfos to set
     */
    public void setTitleInfos( TitleInfo[] titleInfos ) {
        this.titleInfos = titleInfos;
    }
}