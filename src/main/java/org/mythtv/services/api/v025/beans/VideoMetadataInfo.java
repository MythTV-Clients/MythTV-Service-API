/**
 *  This file is part of MythTV for Android
 *
 *  MythTV for Android is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV for Android is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV for Android.  If not, see <http://www.gnu.org/licenses/>.
 *
 * This software can be found at <https://github.com/MythTV-Android/MythTV-Service-API/>
 *
 */
package org.mythtv.services.api.v025.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.mythtv.services.api.DateTimeSerializer;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class VideoMetadataInfo {
    
        
        @JsonProperty( "Id" )
        private Integer id;
        
        
        @JsonProperty( "Title" )
        private String title;
        
        
        @JsonProperty( "SubTitle" )
        private String subTitle;
        
        
        @JsonProperty( "Tagline" )
        private String tagline;
        
        
        @JsonProperty( "Director" )
        private String director;
        
        
        @JsonProperty( "Studio" )
        private String studio;
        
        
        @JsonProperty( "Description" )
        private String description;
        
        
        @JsonProperty( "Certification" )
        private String certification;
        
        
        @JsonProperty( "Inetref" )
        private String inetref;
        
        
        @JsonProperty( "Collectionref" )
        private Integer collectionref;
        
        
        @JsonProperty( "HomePage" )
        private String homePage;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "ReleaseDate" )
        private org.joda.time.DateTime releaseDate;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "AddDate" )
        private org.joda.time.DateTime addDate;
        
        
        @JsonProperty( "UserRating" )
        private Float userRating;
        
        
        @JsonProperty( "Length" )
        private Integer length;
        
        
        @JsonProperty( "PlayCount" )
        private Integer playCount;
        
        
        @JsonProperty( "Season" )
        private Integer season;
        
        
        @JsonProperty( "Episode" )
        private Integer episode;
        
        
        @JsonProperty( "ParentalLevel" )
        private Integer parentalLevel;
        
        
        @JsonProperty( "Visible" )
        private Boolean visible;
        
        
        @JsonProperty( "Watched" )
        private Boolean watched;
        
        
        @JsonProperty( "Processed" )
        private Boolean processed;
        
        
        @JsonProperty( "ContentType" )
        private String contentType;
        
        
        @JsonProperty( "FileName" )
        private String fileName;
        
        
        @JsonProperty( "Hash" )
        private String hash;
        
        
        @JsonProperty( "HostName" )
        private String hostName;
        
        
        @JsonProperty( "Coverart" )
        private String coverart;
        
        
        @JsonProperty( "Fanart" )
        private String fanart;
        
        
        @JsonProperty( "Banner" )
        private String banner;
        
        
        @JsonProperty( "Screenshot" )
        private String screenshot;
        
        
        @JsonProperty( "Trailer" )
        private String trailer;
        
        
        @JsonProperty( "Artwork" )
        private ArtworkInfoList artwork;
        
        /**
         * @return the id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId( Integer id ) {
            this.id = id;
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
         * @return the tagline
         */
        public String getTagline() {
            return tagline;
        }

        /**
         * @param tagline the tagline to set
         */
        public void setTagline( String tagline ) {
            this.tagline = tagline;
        }
        
        /**
         * @return the director
         */
        public String getDirector() {
            return director;
        }

        /**
         * @param director the director to set
         */
        public void setDirector( String director ) {
            this.director = director;
        }
        
        /**
         * @return the studio
         */
        public String getStudio() {
            return studio;
        }

        /**
         * @param studio the studio to set
         */
        public void setStudio( String studio ) {
            this.studio = studio;
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
         * @return the certification
         */
        public String getCertification() {
            return certification;
        }

        /**
         * @param certification the certification to set
         */
        public void setCertification( String certification ) {
            this.certification = certification;
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
         * @return the collectionref
         */
        public Integer getCollectionref() {
            return collectionref;
        }

        /**
         * @param collectionref the collectionref to set
         */
        public void setCollectionref( Integer collectionref ) {
            this.collectionref = collectionref;
        }
        
        /**
         * @return the homePage
         */
        public String getHomePage() {
            return homePage;
        }

        /**
         * @param homePage the homePage to set
         */
        public void setHomePage( String homePage ) {
            this.homePage = homePage;
        }
        
        /**
         * @return the releaseDate
         */
        public org.joda.time.DateTime getReleaseDate() {
            return releaseDate;
        }

        /**
         * @param releaseDate the releaseDate to set
         */
        public void setReleaseDate( org.joda.time.DateTime releaseDate ) {
            this.releaseDate = releaseDate;
        }
        
        /**
         * @return the addDate
         */
        public org.joda.time.DateTime getAddDate() {
            return addDate;
        }

        /**
         * @param addDate the addDate to set
         */
        public void setAddDate( org.joda.time.DateTime addDate ) {
            this.addDate = addDate;
        }
        
        /**
         * @return the userRating
         */
        public Float getUserRating() {
            return userRating;
        }

        /**
         * @param userRating the userRating to set
         */
        public void setUserRating( Float userRating ) {
            this.userRating = userRating;
        }
        
        /**
         * @return the length
         */
        public Integer getLength() {
            return length;
        }

        /**
         * @param length the length to set
         */
        public void setLength( Integer length ) {
            this.length = length;
        }
        
        /**
         * @return the playCount
         */
        public Integer getPlayCount() {
            return playCount;
        }

        /**
         * @param playCount the playCount to set
         */
        public void setPlayCount( Integer playCount ) {
            this.playCount = playCount;
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
         * @return the parentalLevel
         */
        public Integer getParentalLevel() {
            return parentalLevel;
        }

        /**
         * @param parentalLevel the parentalLevel to set
         */
        public void setParentalLevel( Integer parentalLevel ) {
            this.parentalLevel = parentalLevel;
        }
        
        /**
         * @return the visible
         */
        public Boolean isVisible() {
            return visible;
        }

        /**
         * @param visible the visible to set
         */
        public void setVisible( Boolean visible ) {
            this.visible = visible;
        }
        
        /**
         * @return the watched
         */
        public Boolean isWatched() {
            return watched;
        }

        /**
         * @param watched the watched to set
         */
        public void setWatched( Boolean watched ) {
            this.watched = watched;
        }
        
        /**
         * @return the processed
         */
        public Boolean isProcessed() {
            return processed;
        }

        /**
         * @param processed the processed to set
         */
        public void setProcessed( Boolean processed ) {
            this.processed = processed;
        }
        
        /**
         * @return the contentType
         */
        public String getContentType() {
            return contentType;
        }

        /**
         * @param contentType the contentType to set
         */
        public void setContentType( String contentType ) {
            this.contentType = contentType;
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
         * @return the hash
         */
        public String getHash() {
            return hash;
        }

        /**
         * @param hash the hash to set
         */
        public void setHash( String hash ) {
            this.hash = hash;
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
         * @return the coverart
         */
        public String getCoverart() {
            return coverart;
        }

        /**
         * @param coverart the coverart to set
         */
        public void setCoverart( String coverart ) {
            this.coverart = coverart;
        }
        
        /**
         * @return the fanart
         */
        public String getFanart() {
            return fanart;
        }

        /**
         * @param fanart the fanart to set
         */
        public void setFanart( String fanart ) {
            this.fanart = fanart;
        }
        
        /**
         * @return the banner
         */
        public String getBanner() {
            return banner;
        }

        /**
         * @param banner the banner to set
         */
        public void setBanner( String banner ) {
            this.banner = banner;
        }
        
        /**
         * @return the screenshot
         */
        public String getScreenshot() {
            return screenshot;
        }

        /**
         * @param screenshot the screenshot to set
         */
        public void setScreenshot( String screenshot ) {
            this.screenshot = screenshot;
        }
        
        /**
         * @return the trailer
         */
        public String getTrailer() {
            return trailer;
        }

        /**
         * @param trailer the trailer to set
         */
        public void setTrailer( String trailer ) {
            this.trailer = trailer;
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