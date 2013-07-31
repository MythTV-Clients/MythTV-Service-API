package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ChannelInfo {

    
    @JsonProperty( "ChanId" )
    private Integer chanId;
    
    @JsonProperty( "ChanNum" )
    private String chanNum;
    
    @JsonProperty( "CallSign" )
    private String callSign;
    
    @JsonProperty( "IconURL" )
    private String iconURL;
    
    @JsonProperty( "ChannelName" )
    private String channelName;
    
    @JsonProperty( "MplexId" )
    private Integer mplexId;
    
    @JsonProperty( "TransportId" )
    private Integer transportId;
    
    @JsonProperty( "ServiceId" )
    private Integer serviceId;
    
    @JsonProperty( "NetworkId" )
    private Integer networkId;
    
    @JsonProperty( "ATSCMajorChan" )
    private Integer aTSCMajorChan;
    
    @JsonProperty( "ATSCMinorChan" )
    private Integer aTSCMinorChan;
    
    @JsonProperty( "Format" )
    private String format;
    
    @JsonProperty( "Modulation" )
    private String modulation;
    
    @JsonProperty( "Frequency" )
    private Long frequency;
    
    @JsonProperty( "FrequencyId" )
    private String frequencyId;
    
    @JsonProperty( "FrequencyTable" )
    private String frequencyTable;
    
    @JsonProperty( "FineTune" )
    private Integer fineTune;
    
    @JsonProperty( "SIStandard" )
    private String sIStandard;
    
    @JsonProperty( "ChanFilters" )
    private String chanFilters;
    
    @JsonProperty( "SourceId" )
    private Integer sourceId;
    
    @JsonProperty( "InputId" )
    private Integer inputId;
    
    @JsonProperty( "CommFree" )
    private Integer commFree;
    
    @JsonProperty( "UseEIT" )
    private Boolean useEIT;
    
    @JsonProperty( "Visible" )
    private Boolean visible;
    
    @JsonProperty( "XMLTVID" )
    private String xMLTVID;
    
    @JsonProperty( "DefaultAuth" )
    private String defaultAuth;
    
    @JsonProperty( "Programs" )
    private Program[] programs;


    /**
     * @return the chanId
     */
    public Integer getChanId() {
        return chanId;
    }
    
    /**
     * @param chanId the chanId to set
     */
    public void setChanId( Integer chanId ) {
        this.chanId = chanId;
    }

    /**
     * @return the chanNum
     */
    public String getChanNum() {
        return chanNum;
    }
    
    /**
     * @param chanNum the chanNum to set
     */
    public void setChanNum( String chanNum ) {
        this.chanNum = chanNum;
    }

    /**
     * @return the callSign
     */
    public String getCallSign() {
        return callSign;
    }
    
    /**
     * @param callSign the callSign to set
     */
    public void setCallSign( String callSign ) {
        this.callSign = callSign;
    }

    /**
     * @return the iconURL
     */
    public String getIconURL() {
        return iconURL;
    }
    
    /**
     * @param iconURL the iconURL to set
     */
    public void setIconURL( String iconURL ) {
        this.iconURL = iconURL;
    }

    /**
     * @return the channelName
     */
    public String getChannelName() {
        return channelName;
    }
    
    /**
     * @param channelName the channelName to set
     */
    public void setChannelName( String channelName ) {
        this.channelName = channelName;
    }

    /**
     * @return the mplexId
     */
    public Integer getMplexId() {
        return mplexId;
    }
    
    /**
     * @param mplexId the mplexId to set
     */
    public void setMplexId( Integer mplexId ) {
        this.mplexId = mplexId;
    }

    /**
     * @return the transportId
     */
    public Integer getTransportId() {
        return transportId;
    }
    
    /**
     * @param transportId the transportId to set
     */
    public void setTransportId( Integer transportId ) {
        this.transportId = transportId;
    }

    /**
     * @return the serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }
    
    /**
     * @param serviceId the serviceId to set
     */
    public void setServiceId( Integer serviceId ) {
        this.serviceId = serviceId;
    }

    /**
     * @return the networkId
     */
    public Integer getNetworkId() {
        return networkId;
    }
    
    /**
     * @param networkId the networkId to set
     */
    public void setNetworkId( Integer networkId ) {
        this.networkId = networkId;
    }

    /**
     * @return the aTSCMajorChan
     */
    public Integer getATSCMajorChan() {
        return aTSCMajorChan;
    }
    
    /**
     * @param aTSCMajorChan the aTSCMajorChan to set
     */
    public void setATSCMajorChan( Integer aTSCMajorChan ) {
        this.aTSCMajorChan = aTSCMajorChan;
    }

    /**
     * @return the aTSCMinorChan
     */
    public Integer getATSCMinorChan() {
        return aTSCMinorChan;
    }
    
    /**
     * @param aTSCMinorChan the aTSCMinorChan to set
     */
    public void setATSCMinorChan( Integer aTSCMinorChan ) {
        this.aTSCMinorChan = aTSCMinorChan;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * @param format the format to set
     */
    public void setFormat( String format ) {
        this.format = format;
    }

    /**
     * @return the modulation
     */
    public String getModulation() {
        return modulation;
    }
    
    /**
     * @param modulation the modulation to set
     */
    public void setModulation( String modulation ) {
        this.modulation = modulation;
    }

    /**
     * @return the frequency
     */
    public Long getFrequency() {
        return frequency;
    }
    
    /**
     * @param frequency the frequency to set
     */
    public void setFrequency( Long frequency ) {
        this.frequency = frequency;
    }

    /**
     * @return the frequencyId
     */
    public String getFrequencyId() {
        return frequencyId;
    }
    
    /**
     * @param frequencyId the frequencyId to set
     */
    public void setFrequencyId( String frequencyId ) {
        this.frequencyId = frequencyId;
    }

    /**
     * @return the frequencyTable
     */
    public String getFrequencyTable() {
        return frequencyTable;
    }
    
    /**
     * @param frequencyTable the frequencyTable to set
     */
    public void setFrequencyTable( String frequencyTable ) {
        this.frequencyTable = frequencyTable;
    }

    /**
     * @return the fineTune
     */
    public Integer getFineTune() {
        return fineTune;
    }
    
    /**
     * @param fineTune the fineTune to set
     */
    public void setFineTune( Integer fineTune ) {
        this.fineTune = fineTune;
    }

    /**
     * @return the sIStandard
     */
    public String getSIStandard() {
        return sIStandard;
    }
    
    /**
     * @param sIStandard the sIStandard to set
     */
    public void setSIStandard( String sIStandard ) {
        this.sIStandard = sIStandard;
    }

    /**
     * @return the chanFilters
     */
    public String getChanFilters() {
        return chanFilters;
    }
    
    /**
     * @param chanFilters the chanFilters to set
     */
    public void setChanFilters( String chanFilters ) {
        this.chanFilters = chanFilters;
    }

    /**
     * @return the sourceId
     */
    public Integer getSourceId() {
        return sourceId;
    }
    
    /**
     * @param sourceId the sourceId to set
     */
    public void setSourceId( Integer sourceId ) {
        this.sourceId = sourceId;
    }

    /**
     * @return the inputId
     */
    public Integer getInputId() {
        return inputId;
    }
    
    /**
     * @param inputId the inputId to set
     */
    public void setInputId( Integer inputId ) {
        this.inputId = inputId;
    }

    /**
     * @return the commFree
     */
    public Integer getCommFree() {
        return commFree;
    }
    
    /**
     * @param commFree the commFree to set
     */
    public void setCommFree( Integer commFree ) {
        this.commFree = commFree;
    }

    /**
     * @return the useEIT
     */
    public Boolean getUseEIT() {
        return useEIT;
    }
    
    /**
     * @param useEIT the useEIT to set
     */
    public void setUseEIT( Boolean useEIT ) {
        this.useEIT = useEIT;
    }

    /**
     * @return the visible
     */
    public Boolean getVisible() {
        return visible;
    }
    
    /**
     * @param visible the visible to set
     */
    public void setVisible( Boolean visible ) {
        this.visible = visible;
    }

    /**
     * @return the xMLTVID
     */
    public String getXMLTVID() {
        return xMLTVID;
    }
    
    /**
     * @param xMLTVID the xMLTVID to set
     */
    public void setXMLTVID( String xMLTVID ) {
        this.xMLTVID = xMLTVID;
    }

    /**
     * @return the defaultAuth
     */
    public String getDefaultAuth() {
        return defaultAuth;
    }
    
    /**
     * @param defaultAuth the defaultAuth to set
     */
    public void setDefaultAuth( String defaultAuth ) {
        this.defaultAuth = defaultAuth;
    }

    /**
     * @return the programs
     */
    public Program[] getPrograms() {
        return programs;
    }
    
    /**
     * @param programs the programs to set
     */
    public void setPrograms( Program[] programs ) {
        this.programs = programs;
    }
}