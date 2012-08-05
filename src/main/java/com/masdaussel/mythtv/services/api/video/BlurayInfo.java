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

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class BlurayInfo {

	@JsonProperty("Path")
	private String	path;

	@JsonProperty("Title")
	private String	title;

	@JsonProperty("AltTitle")
	private String	altTitle;

	@JsonProperty("DiscLang")
	private String	discLang;

	@JsonProperty("DiscNum")
	private int		discNumber;

	@JsonProperty("TotalDiscNum")
	private int		totalDiscNumber;

	@JsonProperty("TitleCount")
	private int		titleCount;

	@JsonProperty("ThumbCount")
	private int		thumbCount;

	@JsonProperty("ThumbPath")
	private String	thumbPath;

	@JsonProperty("TopMenuSupported")
	private boolean	topMenuSupported;

	@JsonProperty("FirstPlaySupported")
	private boolean	firstPlaySupported;

	@JsonProperty("NumHDMVTitles")
	private int		numberHDMVTitles;

	@JsonProperty("NumBDJTitles")
	private int		numberBDJTitles;

	@JsonProperty("NumUnsupportedTitles")
	private int		numberUnsupportedTitles;

	@JsonProperty("AACSDetected")
	private boolean	aacSDetected;

	@JsonProperty("LibAACSDetected")
	private boolean	libAACSDetected;

	@JsonProperty("AACSHandled")
	private boolean	aacSHandled;

	@JsonProperty("BDPlusDetected")
	private boolean	bdPlusDetected;

	@JsonProperty("LibBDPlusDetected")
	private boolean	libBDPlusDetected;

	@JsonProperty("BDPlusHandled")
	private boolean	bdPlusHandled;

	public BlurayInfo() {
	}

	/**
	 * @return the altTitle
	 */
	public String getAltTitle() {
		return altTitle;
	}

	/**
	 * @return the discLang
	 */
	public String getDiscLang() {
		return discLang;
	}

	/**
	 * @return the discNumber
	 */
	public int getDiscNumber() {
		return discNumber;
	}

	/**
	 * @return the numberBDJTitles
	 */
	public int getNumberBDJTitles() {
		return numberBDJTitles;
	}

	/**
	 * @return the numberHDMVTitles
	 */
	public int getNumberHDMVTitles() {
		return numberHDMVTitles;
	}

	/**
	 * @return the numberUnsupportedTitles
	 */
	public int getNumberUnsupportedTitles() {
		return numberUnsupportedTitles;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @return the thumbCount
	 */
	public int getThumbCount() {
		return thumbCount;
	}

	/**
	 * @return the thumbPath
	 */
	public String getThumbPath() {
		return thumbPath;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the titleCount
	 */
	public int getTitleCount() {
		return titleCount;
	}

	/**
	 * @return the totalDiscNumber
	 */
	public int getTotalDiscNumber() {
		return totalDiscNumber;
	}

	/**
	 * @return the aacSDetected
	 */
	public boolean isAacSDetected() {
		return aacSDetected;
	}

	/**
	 * @return the aacSHandled
	 */
	public boolean isAacSHandled() {
		return aacSHandled;
	}

	/**
	 * @return the bdPlusDetected
	 */
	public boolean isBdPlusDetected() {
		return bdPlusDetected;
	}

	/**
	 * @return the bdPlusHandled
	 */
	public boolean isBdPlusHandled() {
		return bdPlusHandled;
	}

	/**
	 * @return the firstPlaySupported
	 */
	public boolean isFirstPlaySupported() {
		return firstPlaySupported;
	}

	/**
	 * @return the libAACSDetected
	 */
	public boolean isLibAACSDetected() {
		return libAACSDetected;
	}

	/**
	 * @return the libBDPlusDetected
	 */
	public boolean isLibBDPlusDetected() {
		return libBDPlusDetected;
	}

	/**
	 * @return the topMenuSupported
	 */
	public boolean isTopMenuSupported() {
		return topMenuSupported;
	}

	/**
	 * @param aacSDetected
	 *            the aacSDetected to set
	 */
	public void setAacSDetected(final boolean aacSDetected) {
		this.aacSDetected = aacSDetected;
	}

	/**
	 * @param aacSHandled
	 *            the aacSHandled to set
	 */
	public void setAacSHandled(final boolean aacSHandled) {
		this.aacSHandled = aacSHandled;
	}

	/**
	 * @param altTitle
	 *            the altTitle to set
	 */
	public void setAltTitle(final String altTitle) {
		this.altTitle = altTitle;
	}

	/**
	 * @param bdPlusDetected
	 *            the bdPlusDetected to set
	 */
	public void setBdPlusDetected(final boolean bdPlusDetected) {
		this.bdPlusDetected = bdPlusDetected;
	}

	/**
	 * @param bdPlusHandled
	 *            the bdPlusHandled to set
	 */
	public void setBdPlusHandled(final boolean bdPlusHandled) {
		this.bdPlusHandled = bdPlusHandled;
	}

	/**
	 * @param discLang
	 *            the discLang to set
	 */
	public void setDiscLang(final String discLang) {
		this.discLang = discLang;
	}

	/**
	 * @param discNumber
	 *            the discNumber to set
	 */
	public void setDiscNumber(final int discNumber) {
		this.discNumber = discNumber;
	}

	/**
	 * @param firstPlaySupported
	 *            the firstPlaySupported to set
	 */
	public void setFirstPlaySupported(final boolean firstPlaySupported) {
		this.firstPlaySupported = firstPlaySupported;
	}

	/**
	 * @param libAACSDetected
	 *            the libAACSDetected to set
	 */
	public void setLibAACSDetected(final boolean libAACSDetected) {
		this.libAACSDetected = libAACSDetected;
	}

	/**
	 * @param libBDPlusDetected
	 *            the libBDPlusDetected to set
	 */
	public void setLibBDPlusDetected(final boolean libBDPlusDetected) {
		this.libBDPlusDetected = libBDPlusDetected;
	}

	/**
	 * @param numberBDJTitles
	 *            the numberBDJTitles to set
	 */
	public void setNumberBDJTitles(final int numberBDJTitles) {
		this.numberBDJTitles = numberBDJTitles;
	}

	/**
	 * @param numberHDMVTitles
	 *            the numberHDMVTitles to set
	 */
	public void setNumberHDMVTitles(final int numberHDMVTitles) {
		this.numberHDMVTitles = numberHDMVTitles;
	}

	/**
	 * @param numberUnsupportedTitles
	 *            the numberUnsupportedTitles to set
	 */
	public void setNumberUnsupportedTitles(final int numberUnsupportedTitles) {
		this.numberUnsupportedTitles = numberUnsupportedTitles;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(final String path) {
		this.path = path;
	}

	/**
	 * @param thumbCount
	 *            the thumbCount to set
	 */
	public void setThumbCount(final int thumbCount) {
		this.thumbCount = thumbCount;
	}

	/**
	 * @param thumbPath
	 *            the thumbPath to set
	 */
	public void setThumbPath(final String thumbPath) {
		this.thumbPath = thumbPath;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * @param titleCount
	 *            the titleCount to set
	 */
	public void setTitleCount(final int titleCount) {
		this.titleCount = titleCount;
	}

	/**
	 * @param topMenuSupported
	 *            the topMenuSupported to set
	 */
	public void setTopMenuSupported(final boolean topMenuSupported) {
		this.topMenuSupported = topMenuSupported;
	}

	/**
	 * @param totalDiscNumber
	 *            the totalDiscNumber to set
	 */
	public void setTotalDiscNumber(final int totalDiscNumber) {
		this.totalDiscNumber = totalDiscNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("BlurayInfo [");

		if (path != null) {
			builder.append("path=");
			builder.append(path);
			builder.append(", ");
		}

		if (title != null) {
			builder.append("title=");
			builder.append(title);
			builder.append(", ");
		}

		if (altTitle != null) {
			builder.append("altTitle=");
			builder.append(altTitle);
			builder.append(", ");
		}

		if (discLang != null) {
			builder.append("discLang=");
			builder.append(discLang);
			builder.append(", ");
		}

		builder.append("discNumber=");
		builder.append(discNumber);
		builder.append(", totalDiscNumber=");
		builder.append(totalDiscNumber);
		builder.append(", titleCount=");
		builder.append(titleCount);
		builder.append(", thumbCount=");
		builder.append(thumbCount);
		builder.append(", ");

		if (thumbPath != null) {
			builder.append("thumbPath=");
			builder.append(thumbPath);
			builder.append(", ");
		}

		builder.append("topMenuSupported=");
		builder.append(topMenuSupported);
		builder.append(", firstPlaySupported=");
		builder.append(firstPlaySupported);
		builder.append(", numberHDMVTitles=");
		builder.append(numberHDMVTitles);
		builder.append(", numberBDJTitles=");
		builder.append(numberBDJTitles);
		builder.append(", numberUnsupportedTitles=");
		builder.append(numberUnsupportedTitles);
		builder.append(", aacSDetected=");
		builder.append(aacSDetected);
		builder.append(", libAACSDetected=");
		builder.append(libAACSDetected);
		builder.append(", aacSHandled=");
		builder.append(aacSHandled);
		builder.append(", bdPlusDetected=");
		builder.append(bdPlusDetected);
		builder.append(", libBDPlusDetected=");
		builder.append(libBDPlusDetected);
		builder.append(", bdPlusHandled=");
		builder.append(bdPlusHandled);
		builder.append("]");

		return builder.toString();
	}

}
