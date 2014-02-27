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
package org.mythtv.services.core.events.video;

import org.joda.time.DateTime;
import org.mythtv.services.core.domain.ArtworkItem;

public class VideoLookupDetails {

        private String title;
        private String subTitle;
        private Integer season;
        private Integer episode;
        private Integer year;
        private String tagline;
        private String description;
        private String certification;
        private String inetref;
        private String collectionref;
        private String homePage;
        private DateTime releaseDate;
        private Float userRating;
        private Integer length;
        private String language;
        private String[] countries;
        private Integer popularity;
        private Integer budget;
        private Integer revenue;
        private String iMDB;
        private String tMSRef;
        private ArtworkItemDetails[] artwork;

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
        public DateTime getReleaseDate() {
            return releaseDate;
        }

        /**
         * @param releaseDate the releaseDate to set
         */
        public void setReleaseDate( DateTime releaseDate ) {
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
        public ArtworkItemDetails[] getArtwork() {
            return artwork;
        }

        /**
         * @param artwork the artwork to set
         */
        public void setArtwork( ArtworkItemDetails[] artwork ) {
            this.artwork = artwork;
        }
        
}