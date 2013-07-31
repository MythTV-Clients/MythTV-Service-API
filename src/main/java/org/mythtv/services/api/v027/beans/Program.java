package org.mythtv.services.api.v027.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.joda.time.DateTime;
import org.mythtv.services.api.DateTimeSerializer;

/**
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class Program {

    @JsonSerialize( using = DateTimeSerializer.class )
    @JsonProperty( "StartTime" )
    private org.joda.time.DateTime startTime;
    @JsonSerialize( using = DateTimeSerializer.class )
    @JsonProperty( "EndTime" )
    private org.joda.time.DateTime endTime;
    
    @JsonProperty( "Title" )
    private String title;
    
    @JsonProperty( "SubTitle" )
    private String subTitle;
    
    @JsonProperty( "Category" )
    private String category;
    
    @JsonProperty( "CatType" )
    private String catType;
    
    @JsonProperty( "Repeat" )
    private Boolean repeat;
    
    @JsonProperty( "VideoProps" )
    private Integer videoProps;
    
    @JsonProperty( "AudioProps" )
    private Integer audioProps;
    
    @JsonProperty( "SubProps" )
    private Integer subProps;
    
    @JsonProperty( "SeriesId" )
    private String seriesId;
    
    @JsonProperty( "ProgramId" )
    private String programId;
    
    @JsonProperty( "Stars" )
    private Double stars;
    
    @JsonProperty( "FileSize" )
    private Long fileSize;
    @JsonSerialize( using = DateTimeSerializer.class )
    @JsonProperty( "LastModified" )
    private org.joda.time.DateTime lastModified;
    
    @JsonProperty( "ProgramFlags" )
    private Integer programFlags;
    
    @JsonProperty( "FileName" )
    private String fileName;
    
    @JsonProperty( "HostName" )
    private String hostName;
    @JsonSerialize( using = DateTimeSerializer.class )
    @JsonProperty( "Airdate" )
    private org.joda.time.DateTime airdate;
    
    @JsonProperty( "Description" )
    private String description;
    
    @JsonProperty( "Inetref" )
    private String inetref;
    
    @JsonProperty( "Season" )
    private Integer season;
    
    @JsonProperty( "Episode" )
    private Integer episode;
    
    @JsonProperty( "Channel" )
    private ChannelInfo channel;
    
    @JsonProperty( "Recording" )
    private RecordingInfo recording;
    
    @JsonProperty( "Artwork" )
    private ArtworkInfoList artwork;


    /**
     * @return the startTime
     */
    public org.joda.time.DateTime getStartTime() {
        return startTime;
    }
    
    /**
     * @param startTime the startTime to set
     */
    public void setStartTime( org.joda.time.DateTime startTime ) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public org.joda.time.DateTime getEndTime() {
        return endTime;
    }
    
    /**
     * @param endTime the endTime to set
     */
    public void setEndTime( org.joda.time.DateTime endTime ) {
        this.endTime = endTime;
    }

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
     * @return the subTitle
     */
    public String getSubTitle() {
        return subTitle;
    }
    
    /**
     * @param subTitle the subTitle to set
     */
    public void setSubTitle( String subTitle ) {
        this.subTitle = subTitle;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }
    
    /**
     * @param category the category to set
     */
    public void setCategory( String category ) {
        this.category = category;
    }

    /**
     * @return the catType
     */
    public String getCatType() {
        return catType;
    }
    
    /**
     * @param catType the catType to set
     */
    public void setCatType( String catType ) {
        this.catType = catType;
    }

    /**
     * @return the repeat
     */
    public Boolean getRepeat() {
        return repeat;
    }
    
    /**
     * @param repeat the repeat to set
     */
    public void setRepeat( Boolean repeat ) {
        this.repeat = repeat;
    }

    /**
     * @return the videoProps
     */
    public Integer getVideoProps() {
        return videoProps;
    }
    
    /**
     * @param videoProps the videoProps to set
     */
    public void setVideoProps( Integer videoProps ) {
        this.videoProps = videoProps;
    }

    /**
     * @return the audioProps
     */
    public Integer getAudioProps() {
        return audioProps;
    }
    
    /**
     * @param audioProps the audioProps to set
     */
    public void setAudioProps( Integer audioProps ) {
        this.audioProps = audioProps;
    }

    /**
     * @return the subProps
     */
    public Integer getSubProps() {
        return subProps;
    }
    
    /**
     * @param subProps the subProps to set
     */
    public void setSubProps( Integer subProps ) {
        this.subProps = subProps;
    }

    /**
     * @return the seriesId
     */
    public String getSeriesId() {
        return seriesId;
    }
    
    /**
     * @param seriesId the seriesId to set
     */
    public void setSeriesId( String seriesId ) {
        this.seriesId = seriesId;
    }

    /**
     * @return the programId
     */
    public String getProgramId() {
        return programId;
    }
    
    /**
     * @param programId the programId to set
     */
    public void setProgramId( String programId ) {
        this.programId = programId;
    }

    /**
     * @return the stars
     */
    public Double getStars() {
        return stars;
    }
    
    /**
     * @param stars the stars to set
     */
    public void setStars( Double stars ) {
        this.stars = stars;
    }

    /**
     * @return the fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }
    
    /**
     * @param fileSize the fileSize to set
     */
    public void setFileSize( Long fileSize ) {
        this.fileSize = fileSize;
    }

    /**
     * @return the lastModified
     */
    public org.joda.time.DateTime getLastModified() {
        return lastModified;
    }
    
    /**
     * @param lastModified the lastModified to set
     */
    public void setLastModified( org.joda.time.DateTime lastModified ) {
        this.lastModified = lastModified;
    }

    /**
     * @return the programFlags
     */
    public Integer getProgramFlags() {
        return programFlags;
    }
    
    /**
     * @param programFlags the programFlags to set
     */
    public void setProgramFlags( Integer programFlags ) {
        this.programFlags = programFlags;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }
    
    /**
     * @param fileName the fileName to set
     */
    public void setFileName( String fileName ) {
        this.fileName = fileName;
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
     * @return the airdate
     */
    public org.joda.time.DateTime getAirdate() {
        return airdate;
    }
    
    /**
     * @param airdate the airdate to set
     */
    public void setAirdate( org.joda.time.DateTime airdate ) {
        this.airdate = airdate;
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

    /**
     * @return the season
     */
    public Integer getSeason() {
        return season;
    }
    
    /**
     * @param season the season to set
     */
    public void setSeason( Integer season ) {
        this.season = season;
    }

    /**
     * @return the episode
     */
    public Integer getEpisode() {
        return episode;
    }
    
    /**
     * @param episode the episode to set
     */
    public void setEpisode( Integer episode ) {
        this.episode = episode;
    }

    /**
     * @return the channel
     */
    public ChannelInfo getChannel() {
        return channel;
    }
    
    /**
     * @param channel the channel to set
     */
    public void setChannel( ChannelInfo channel ) {
        this.channel = channel;
    }

    /**
     * @return the recording
     */
    public RecordingInfo getRecording() {
        return recording;
    }
    
    /**
     * @param recording the recording to set
     */
    public void setRecording( RecordingInfo recording ) {
        this.recording = recording;
    }

    /**
     * @return the artwork
     */
    public ArtworkInfoList getArtwork() {
        return artwork;
    }
    
    /**
     * @param artwork the artwork to set
     */
    public void setArtwork( ArtworkInfoList artwork ) {
        this.artwork = artwork;
    }
}