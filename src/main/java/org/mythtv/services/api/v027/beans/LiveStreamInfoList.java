package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class LiveStreamInfoList {

    
    @JsonProperty( "LiveStreamInfos" )
    private LiveStreamInfo[] liveStreamInfos;


    /**
     * @return the liveStreamInfos
     */
    public LiveStreamInfo[] getLiveStreamInfos() {
        return liveStreamInfos;
    }
    
    /**
     * @param liveStreamInfos the liveStreamInfos to set
     */
    public void setLiveStreamInfos( LiveStreamInfo[] liveStreamInfos ) {
        this.liveStreamInfos = liveStreamInfos;
    }
}