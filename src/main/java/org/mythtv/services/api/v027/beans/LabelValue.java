package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class LabelValue {

    
    @JsonProperty( "Label" )
    private String label;
    
    @JsonProperty( "Value" )
    private String value;
    
    @JsonProperty( "Description" )
    private String description;
    
    @JsonProperty( "Active" )
    private Boolean active;
    
    @JsonProperty( "Selected" )
    private Boolean selected;


    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * @param label the label to set
     */
    public void setLabel( String label ) {
        this.label = label;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
    
    /**
     * @param value the value to set
     */
    public void setValue( String value ) {
        this.value = value;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * @param description the description to set
     */
    public void setDescription( String description ) {
        this.description = description;
    }

    /**
     * @return the active
     */
    public Boolean getActive() {
        return active;
    }
    
    /**
     * @param active the active to set
     */
    public void setActive( Boolean active ) {
        this.active = active;
    }

    /**
     * @return the selected
     */
    public Boolean getSelected() {
        return selected;
    }
    
    /**
     * @param selected the selected to set
     */
    public void setSelected( Boolean selected ) {
        this.selected = selected;
    }
}