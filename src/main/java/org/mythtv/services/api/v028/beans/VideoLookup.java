/*
 * Copyright (c) 2014 TIKINOU LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mythtv.services.api.v028.beans;

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
public class VideoLookup {
    
        
        @JsonProperty( "Title" )
        private String title;
        
        
        @JsonProperty( "SubTitle" )
        private String subTitle;
        
        
        @JsonProperty( "Season" )
        private Integer season;
        
        
        @JsonProperty( "Episode" )
        private Integer episode;
        
        
        @JsonProperty( "Year" )
        private Integer year;
        
        
        @JsonProperty( "Tagline" )
        private String tagline;
        
        
        @JsonProperty( "Description" )
        private String description;
        
        
        @JsonProperty( "Certification" )
        private String certification;
        
        
        @JsonProperty( "Inetref" )
        private String inetref;
        
        
        @JsonProperty( "Collectionref" )
        private String collectionref;
        
        
        @JsonProperty( "HomePage" )
        private String homePage;
        
        @JsonSerialize( using = DateTimeSerializer.class )
        @JsonProperty( "ReleaseDate" )
        private org.joda.time.DateTime releaseDate;
        
        
        @JsonProperty( "UserRating" )
        private Float userRating;
        
        
        @JsonProperty( "Length" )
        private Integer length;
        
        
        @JsonProperty( "Language" )
        private String language;
        
        
        @JsonProperty( "Countries" )
        private String[] countries;
        
        
        @JsonProperty( "Popularity" )
        private Integer popularity;
        
        
        @JsonProperty( "Budget" )
        private Integer budget;
        
        
        @JsonProperty( "Revenue" )
        private Integer revenue;
        
        
        @JsonProperty( "IMDB" )
        private String iMDB;
        
        
        @JsonProperty( "TMSRef" )
        private String tMSRef;
        
        
        @JsonProperty( "Artwork" )
        private ArtworkItem[] artwork;
        
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
         * @return the year
         */
        public Integer getYear() {
            return year;
        }

        /**
         * @param year the year to set
         */
        public void setYear( Integer year ) {
            this.year = year;
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
        public String getCollectionref() {
            return collectionref;
        }

        /**
         * @param collectionref the collectionref to set
         */
        public void setCollectionref( String collectionref ) {
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
         * @return the language
         */
        public String getLanguage() {
            return language;
        }

        /**
         * @param language the language to set
         */
        public void setLanguage( String language ) {
            this.language = language;
        }
        
        /**
         * @return the countries
         */
        public String[] getCountries() {
            return countries;
        }

        /**
         * @param countries the countries to set
         */
        public void setCountries( String[] countries ) {
            this.countries = countries;
        }
        
        /**
         * @return the popularity
         */
        public Integer getPopularity() {
            return popularity;
        }

        /**
         * @param popularity the popularity to set
         */
        public void setPopularity( Integer popularity ) {
            this.popularity = popularity;
        }
        
        /**
         * @return the budget
         */
        public Integer getBudget() {
            return budget;
        }

        /**
         * @param budget the budget to set
         */
        public void setBudget( Integer budget ) {
            this.budget = budget;
        }
        
        /**
         * @return the revenue
         */
        public Integer getRevenue() {
            return revenue;
        }

        /**
         * @param revenue the revenue to set
         */
        public void setRevenue( Integer revenue ) {
            this.revenue = revenue;
        }
        
        /**
         * @return the iMDB
         */
        public String getIMDB() {
            return iMDB;
        }

        /**
         * @param iMDB the iMDB to set
         */
        public void setIMDB( String iMDB ) {
            this.iMDB = iMDB;
        }
        
        /**
         * @return the tMSRef
         */
        public String getTMSRef() {
            return tMSRef;
        }

        /**
         * @param tMSRef the tMSRef to set
         */
        public void setTMSRef( String tMSRef ) {
            this.tMSRef = tMSRef;
        }
        
        /**
         * @return the artwork
         */
        public ArtworkItem[] getArtwork() {
            return artwork;
        }

        /**
         * @param artwork the artwork to set
         */
        public void setArtwork( ArtworkItem[] artwork ) {
            this.artwork = artwork;
        }
        
}