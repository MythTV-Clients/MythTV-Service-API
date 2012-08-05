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

import org.codehaus.jackson.annotate.JsonProperty;

import com.masdaussel.mythtv.services.api.content.ArtworkInfoList;

/**
 * @author sebastien
 * 
 */
public class VideoMetadataInfo {

	@JsonProperty("Id")
	private int				id;

	@JsonProperty("Title")
	private String			title;

	@JsonProperty("SubTitle")
	private String			subTitle;

	@JsonProperty("Tagline")
	private String			tagline;

	@JsonProperty("Director")
	private String			director;

	@JsonProperty("Studio")
	private String			studio;

	@JsonProperty("Description")
	private String			description;

	@JsonProperty("Certification")
	private String			certification;

	@JsonProperty("Inetref")
	private String			inetref;

	@JsonProperty("Collectionref")
	private int				collectionReference;

	@JsonProperty("HomePage")
	private String			homePage;

	@JsonProperty("ReleaseDate")
	private Date			releaseDate;

	@JsonProperty("AddDate")
	private Date			addDate;

	@JsonProperty("UserRating")
	private float			userRating;

	@JsonProperty("Length")
	private int				length;

	@JsonProperty("PlayCount")
	private int				playCount;

	@JsonProperty("Season")
	private int				season;

	@JsonProperty("Episode")
	private int				episode;

	@JsonProperty("ParentalLevel")
	private int				parentalLevel;

	@JsonProperty("Visible")
	private boolean			visible;

	@JsonProperty("Watched")
	private boolean			watched;

	@JsonProperty("Processed")
	private boolean			processed;

	@JsonProperty("ContentType")
	private String			contentType;

	@JsonProperty("FileName")
	private String			fileName;

	@JsonProperty("Hash")
	private String			hash;

	@JsonProperty("HostName")
	private String			hostname;

	@JsonProperty("Coverart")
	private String			coverart;

	@JsonProperty("Fanart")
	private String			fanart;

	@JsonProperty("Banner")
	private String			banner;

	@JsonProperty("Screenshot")
	private String			screenshot;

	@JsonProperty("Trailer")
	private String			trailer;

	@JsonProperty("Artwork")
	private ArtworkInfoList	artwork;

	public VideoMetadataInfo() {
	}

	/**
	 * @return the addDate
	 */
	public Date getAddDate() {
		return addDate;
	}

	/**
	 * @return the artwork
	 */
	public ArtworkInfoList getArtwork() {
		return artwork;
	}

	/**
	 * @return the banner
	 */
	public String getBanner() {
		return banner;
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
	public int getCollectionReference() {
		return collectionReference;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @return the coverart
	 */
	public String getCoverart() {
		return coverart;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @return the episode
	 */
	public int getEpisode() {
		return episode;
	}

	/**
	 * @return the fanart
	 */
	public String getFanart() {
		return fanart;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @return the hash
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * @return the homePage
	 */
	public String getHomePage() {
		return homePage;
	}

	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the inetref
	 */
	public String getInetref() {
		return inetref;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return the parentalLevel
	 */
	public int getParentalLevel() {
		return parentalLevel;
	}

	/**
	 * @return the playCount
	 */
	public int getPlayCount() {
		return playCount;
	}

	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @return the screenshot
	 */
	public String getScreenshot() {
		return screenshot;
	}

	/**
	 * @return the season
	 */
	public int getSeason() {
		return season;
	}

	/**
	 * @return the studio
	 */
	public String getStudio() {
		return studio;
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
	 * @return the trailer
	 */
	public String getTrailer() {
		return trailer;
	}

	/**
	 * @return the userRating
	 */
	public float getUserRating() {
		return userRating;
	}

	/**
	 * @return the processed
	 */
	public boolean isProcessed() {
		return processed;
	}

	/**
	 * @return the visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * @return the watched
	 */
	public boolean isWatched() {
		return watched;
	}

	/**
	 * @param addDate
	 *            the addDate to set
	 */
	public void setAddDate(final Date addDate) {
		this.addDate = addDate;
	}

	/**
	 * @param artwork
	 *            the artwork to set
	 */
	public void setArtwork(final ArtworkInfoList artwork) {
		this.artwork = artwork;
	}

	/**
	 * @param banner
	 *            the banner to set
	 */
	public void setBanner(final String banner) {
		this.banner = banner;
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
	public void setCollectionReference(final int collectionReference) {
		this.collectionReference = collectionReference;
	}

	/**
	 * @param contentType
	 *            the contentType to set
	 */
	public void setContentType(final String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @param coverart
	 *            the coverart to set
	 */
	public void setCoverart(final String coverart) {
		this.coverart = coverart;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @param director
	 *            the director to set
	 */
	public void setDirector(final String director) {
		this.director = director;
	}

	/**
	 * @param episode
	 *            the episode to set
	 */
	public void setEpisode(final int episode) {
		this.episode = episode;
	}

	/**
	 * @param fanart
	 *            the fanart to set
	 */
	public void setFanart(final String fanart) {
		this.fanart = fanart;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(final String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @param hash
	 *            the hash to set
	 */
	public void setHash(final String hash) {
		this.hash = hash;
	}

	/**
	 * @param homePage
	 *            the homePage to set
	 */
	public void setHomePage(final String homePage) {
		this.homePage = homePage;
	}

	/**
	 * @param hostname
	 *            the hostname to set
	 */
	public void setHostname(final String hostname) {
		this.hostname = hostname;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @param inetref
	 *            the inetref to set
	 */
	public void setInetref(final String inetref) {
		this.inetref = inetref;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(final int length) {
		this.length = length;
	}

	/**
	 * @param parentalLevel
	 *            the parentalLevel to set
	 */
	public void setParentalLevel(final int parentalLevel) {
		this.parentalLevel = parentalLevel;
	}

	/**
	 * @param playCount
	 *            the playCount to set
	 */
	public void setPlayCount(final int playCount) {
		this.playCount = playCount;
	}

	/**
	 * @param processed
	 *            the processed to set
	 */
	public void setProcessed(final boolean processed) {
		this.processed = processed;
	}

	/**
	 * @param releaseDate
	 *            the releaseDate to set
	 */
	public void setReleaseDate(final Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @param screenshot
	 *            the screenshot to set
	 */
	public void setScreenshot(final String screenshot) {
		this.screenshot = screenshot;
	}

	/**
	 * @param season
	 *            the season to set
	 */
	public void setSeason(final int season) {
		this.season = season;
	}

	/**
	 * @param studio
	 *            the studio to set
	 */
	public void setStudio(final String studio) {
		this.studio = studio;
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
	 * @param trailer
	 *            the trailer to set
	 */
	public void setTrailer(final String trailer) {
		this.trailer = trailer;
	}

	/**
	 * @param userRating
	 *            the userRating to set
	 */
	public void setUserRating(final float userRating) {
		this.userRating = userRating;
	}

	/**
	 * @param visible
	 *            the visible to set
	 */
	public void setVisible(final boolean visible) {
		this.visible = visible;
	}

	/**
	 * @param watched
	 *            the watched to set
	 */
	public void setWatched(final boolean watched) {
		this.watched = watched;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("VideoMetadataInfo [id=");
		builder.append(id);
		builder.append(", ");

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

		if (tagline != null) {
			builder.append("tagline=");
			builder.append(tagline);
			builder.append(", ");
		}

		if (director != null) {
			builder.append("director=");
			builder.append(director);
			builder.append(", ");
		}

		if (studio != null) {
			builder.append("studio=");
			builder.append(studio);
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

		if (inetref != null) {
			builder.append("inetref=");
			builder.append(inetref);
			builder.append(", ");
		}

		builder.append("collectionReference=");
		builder.append(collectionReference);

		builder.append(", ");

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

		if (addDate != null) {
			builder.append("addDate=");
			builder.append(addDate);
			builder.append(", ");
		}

		builder.append("userRating=");
		builder.append(userRating);
		builder.append(", length=");
		builder.append(length);
		builder.append(", playCount=");
		builder.append(playCount);
		builder.append(", season=");
		builder.append(season);
		builder.append(", episode=");
		builder.append(episode);
		builder.append(", parentalLevel=");
		builder.append(parentalLevel);
		builder.append(", visible=");
		builder.append(visible);
		builder.append(", watched=");
		builder.append(watched);
		builder.append(", processed=");
		builder.append(processed);
		builder.append(", ");

		if (contentType != null) {
			builder.append("contentType=");
			builder.append(contentType);
			builder.append(", ");
		}

		if (fileName != null) {
			builder.append("fileName=");
			builder.append(fileName);
			builder.append(", ");
		}

		if (hash != null) {
			builder.append("hash=");
			builder.append(hash);
			builder.append(", ");
		}

		if (hostname != null) {
			builder.append("hostname=");
			builder.append(hostname);
			builder.append(", ");
		}

		if (coverart != null) {
			builder.append("coverart=");
			builder.append(coverart);
			builder.append(", ");
		}

		if (fanart != null) {
			builder.append("fanart=");
			builder.append(fanart);
			builder.append(", ");
		}

		if (banner != null) {
			builder.append("banner=");
			builder.append(banner);
			builder.append(", ");
		}

		if (screenshot != null) {
			builder.append("screenshot=");
			builder.append(screenshot);
			builder.append(", ");
		}

		if (trailer != null) {
			builder.append("trailer=");
			builder.append(trailer);
			builder.append(", ");
		}

		if (artwork != null) {
			builder.append("artwork=");
			builder.append(artwork);
		}

		builder.append("]");

		return builder.toString();
	}

}
