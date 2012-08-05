/**
 *  This file is part of MythTV Service API for Java
 * 
 *  MythTV Service API for Java is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV Service API for Java is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV Service API for Java.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/tafypz/MythTV-Service-API.git>
 *
 */
package com.masdaussel.mythtv.services.api.video;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class VideoLookup {

	@JsonProperty("Title")
	private String				title;

	@JsonProperty("SubTitle")
	private String				subTitle;

	@JsonProperty("Season")
	private int					season;

	@JsonProperty("Episode")
	private int					episode;

	@JsonProperty("Year")
	private int					year;

	@JsonProperty("Tagline")
	private String				tagline;

	@JsonProperty("Description")
	private String				description;

	@JsonProperty("Certification")
	private String				certification;

	@JsonProperty("Inetref")
	private String				inetReference;

	@JsonProperty("Collectionref")
	private String				collectionReference;

	@JsonProperty("HomePage")
	private String				homePage;

	@JsonProperty("ReleaseDate")
	private Date				releaseDate;

	@JsonProperty("UserRating")
	private float				userRating;

	@JsonProperty("Length")
	private int					length;

	@JsonProperty("Language")
	private String				language;

	@JsonProperty("Countries")
	private List<String>		countries;

	@JsonProperty("Popularity")
	private int					popularity;

	@JsonProperty("Budget")
	private int					budget;

	@JsonProperty("Revenue")
	private int					revenue;

	@JsonProperty("IMDB")
	private String				imdb;

	@JsonProperty("TMSRef")
	private String				tmsReference;

	@JsonProperty("Artwork")
	private List<ArtworkItem>	artworks;

	public VideoLookup() {
	}

	/**
	 * @return the artworks
	 */
	public List<ArtworkItem> getArtworks() {
		return artworks;
	}

	/**
	 * @return the budget
	 */
	public int getBudget() {
		return budget;
	}

	/**
	 * @return the certification
	 */
	public String getCertification() {
		return certification;
	}

	/**
	 * @return the collectionReference
	 */
	public String getCollectionReference() {
		return collectionReference;
	}

	/**
	 * @return the countries
	 */
	public List<String> getCountries() {
		return countries;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the episode
	 */
	public int getEpisode() {
		return episode;
	}

	/**
	 * @return the homePage
	 */
	public String getHomePage() {
		return homePage;
	}

	/**
	 * @return the imdb
	 */
	public String getImdb() {
		return imdb;
	}

	/**
	 * @return the inetReference
	 */
	public String getInetReference() {
		return inetReference;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return the popularity
	 */
	public int getPopularity() {
		return popularity;
	}

	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @return the revenue
	 */
	public int getRevenue() {
		return revenue;
	}

	/**
	 * @return the season
	 */
	public int getSeason() {
		return season;
	}

	/**
	 * @return the subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}

	/**
	 * @return the tagline
	 */
	public String getTagline() {
		return tagline;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the tmsReference
	 */
	public String getTmsReference() {
		return tmsReference;
	}

	/**
	 * @return the userRating
	 */
	public float getUserRating() {
		return userRating;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param artworks
	 *            the artworks to set
	 */
	public void setArtworks(final List<ArtworkItem> artworks) {
		this.artworks = artworks;
	}

	/**
	 * @param budget
	 *            the budget to set
	 */
	public void setBudget(final int budget) {
		this.budget = budget;
	}

	/**
	 * @param certification
	 *            the certification to set
	 */
	public void setCertification(final String certification) {
		this.certification = certification;
	}

	/**
	 * @param collectionReference
	 *            the collectionReference to set
	 */
	public void setCollectionReference(final String collectionReference) {
		this.collectionReference = collectionReference;
	}

	/**
	 * @param countries
	 *            the countries to set
	 */
	public void setCountries(final List<String> countries) {
		this.countries = countries;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @param episode
	 *            the episode to set
	 */
	public void setEpisode(final int episode) {
		this.episode = episode;
	}

	/**
	 * @param homePage
	 *            the homePage to set
	 */
	public void setHomePage(final String homePage) {
		this.homePage = homePage;
	}

	/**
	 * @param imdb
	 *            the imdb to set
	 */
	public void setImdb(final String imdb) {
		this.imdb = imdb;
	}

	/**
	 * @param inetReference
	 *            the inetReference to set
	 */
	public void setInetReference(final String inetReference) {
		this.inetReference = inetReference;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(final String language) {
		this.language = language;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(final int length) {
		this.length = length;
	}

	/**
	 * @param popularity
	 *            the popularity to set
	 */
	public void setPopularity(final int popularity) {
		this.popularity = popularity;
	}

	/**
	 * @param releaseDate
	 *            the releaseDate to set
	 */
	public void setReleaseDate(final Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @param revenue
	 *            the revenue to set
	 */
	public void setRevenue(final int revenue) {
		this.revenue = revenue;
	}

	/**
	 * @param season
	 *            the season to set
	 */
	public void setSeason(final int season) {
		this.season = season;
	}

	/**
	 * @param subTitle
	 *            the subTitle to set
	 */
	public void setSubTitle(final String subTitle) {
		this.subTitle = subTitle;
	}

	/**
	 * @param tagline
	 *            the tagline to set
	 */
	public void setTagline(final String tagline) {
		this.tagline = tagline;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * @param tmsReference
	 *            the tmsReference to set
	 */
	public void setTmsReference(final String tmsReference) {
		this.tmsReference = tmsReference;
	}

	/**
	 * @param userRating
	 *            the userRating to set
	 */
	public void setUserRating(final float userRating) {
		this.userRating = userRating;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(final int year) {
		this.year = year;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("VideoLookup [");

		if (title != null) {
			builder.append("title=");
			builder.append(title);
			builder.append(", ");
		}

		if (subTitle != null) {
			builder.append("subTitle=");
			builder.append(subTitle);
			builder.append(", ");
		}

		builder.append("season=");
		builder.append(season);
		builder.append(", episode=");
		builder.append(episode);
		builder.append(", year=");
		builder.append(year);
		builder.append(", ");

		if (tagline != null) {
			builder.append("tagline=");
			builder.append(tagline);
			builder.append(", ");
		}

		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}

		if (certification != null) {
			builder.append("certification=");
			builder.append(certification);
			builder.append(", ");
		}

		if (inetReference != null) {
			builder.append("inetReference=");
			builder.append(inetReference);
			builder.append(", ");
		}

		if (collectionReference != null) {
			builder.append("collectionReference=");
			builder.append(collectionReference);
			builder.append(", ");
		}

		if (homePage != null) {
			builder.append("homePage=");
			builder.append(homePage);
			builder.append(", ");
		}

		if (releaseDate != null) {
			builder.append("releaseDate=");
			builder.append(releaseDate);
			builder.append(", ");
		}

		builder.append("userRating=");
		builder.append(userRating);
		builder.append(", length=");
		builder.append(length);
		builder.append(", ");

		if (language != null) {
			builder.append("language=");
			builder.append(language);
			builder.append(", ");
		}

		if (countries != null) {
			builder.append("countries=");
			builder.append(countries);
			builder.append(", ");
		}

		builder.append("popularity=");
		builder.append(popularity);
		builder.append(", budget=");
		builder.append(budget);
		builder.append(", revenue=");
		builder.append(revenue);
		builder.append(", ");

		if (imdb != null) {
			builder.append("imdb=");
			builder.append(imdb);
			builder.append(", ");
		}

		if (tmsReference != null) {
			builder.append("tmsReference=");
			builder.append(tmsReference);
			builder.append(", ");
		}

		if (artworks != null) {
			builder.append("artworks=");
			builder.append(artworks);
		}

		builder.append("]");

		return builder.toString();
	}

}
