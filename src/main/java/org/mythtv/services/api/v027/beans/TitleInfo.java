package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class TitleInfo {

    
    @JsonProperty( "Title" )
    private String title;
    
    @JsonProperty( "Inetref" )
    private String inetref;


    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * @param title the title to set
     */
    public void setTitle( String title ) {
        this.title = title;
    }

    /**
     * @return the inetref
     */
    public String getInetref() {
        return inetref;
    }
    
    /**
     * @param inetref the inetref to set
     */
    public void setInetref( String inetref ) {
        this.inetref = inetref;
    }
}