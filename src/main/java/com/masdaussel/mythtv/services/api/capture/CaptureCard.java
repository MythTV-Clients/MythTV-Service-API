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
package com.masdaussel.mythtv.services.api.capture;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class CaptureCard {

	@JsonProperty("CardId")
	private int		cardId;

	@JsonProperty("VideoDevice")
	private String	videoDevice;

	@JsonProperty("AudioDevice")
	private String	audioDevice;

	@JsonProperty("VBIDevice")
	private String	vbiDevice;

	@JsonProperty("CardType")
	private String	cardType;

	@JsonProperty("AudioRateLimit")
	private int		audioRateLimit;

	@JsonProperty("HostName")
	private String	hostName;

	@JsonProperty("DVBSWFilter")
	private int		dvbSwFilter;

	@JsonProperty("DVBSatType")
	private int		dvbSatType;

	@JsonProperty("DVBWaitForSeqStart")
	private boolean	dvbWaitForSeqStart;

	@JsonProperty("SkipBTAudio")
	private boolean	skipBtAudio;

	@JsonProperty("DVBOnDemand")
	private boolean	dvbOnDemand;

	@JsonProperty("DVBDiSEqCType")
	private int		dvbDiSEqCType;

	@JsonProperty("FirewireSpeed")
	private int		firewireSpeed;

	@JsonProperty("FirewireModel")
	private String	firewireModel;

	@JsonProperty("FirewireConnection")
	private int		firewireConnection;

	@JsonProperty("SignalTimeout")
	private int		signalTimeout;

	@JsonProperty("ChannelTimeout")
	private int		channelTimeout;

	@JsonProperty("DVBTuningDelay")
	private int		dvbTuningDelay;

	@JsonProperty("Contrast")
	private int		contrast;

	@JsonProperty("Brightness")
	private int		brightness;

	@JsonProperty("Colour")
	private int		colour;

	@JsonProperty("Hue")
	private int		hue;

	@JsonProperty("DiSEqCId")
	private int		diSEqCId;

	@JsonProperty("DVBEITScan")
	private boolean	dvbEitScan;

	/**
	 * 
	 */
	public CaptureCard() {
	}

	/**
	 * @param cardId
	 * @param videoDevice
	 * @param audioDevice
	 * @param vbiDevice
	 * @param cardType
	 * @param audioRateLimit
	 * @param hostName
	 * @param dvbSwFilter
	 * @param dvbSatType
	 * @param dvbWaitForSeqStart
	 * @param skipBtAudio
	 * @param dvbOnDemand
	 * @param dvbDiSEqCType
	 * @param firewireSpeed
	 * @param firewireModel
	 * @param firewireConnection
	 * @param signalTimeout
	 * @param channelTimeout
	 * @param dvbTuningDelay
	 * @param contrast
	 * @param brightness
	 * @param colour
	 * @param hue
	 * @param diSEqCId
	 * @param dvbEitScan
	 */
	public CaptureCard(final int cardId, final String videoDevice, final String audioDevice, final String vbiDevice, final String cardType,
			final Integer audioRateLimit, final String hostName, final Integer dvbSwFilter, final Integer dvbSatType, final Boolean dvbWaitForSeqStart,
			final Boolean skipBtAudio, final Boolean dvbOnDemand, final Integer dvbDiSEqCType, final Integer firewireSpeed, final String firewireModel,
			final Integer firewireConnection, final Integer signalTimeout, final Integer channelTimeout, final Integer dvbTuningDelay, final Integer contrast,
			final Integer brightness, final Integer colour, final Integer hue, final Integer diSEqCId, final Boolean dvbEitScan) {
		this.cardId = cardId;
		this.videoDevice = videoDevice;
		this.audioDevice = audioDevice;
		this.vbiDevice = vbiDevice;
		this.cardType = cardType;
		this.audioRateLimit = audioRateLimit;
		this.hostName = hostName;
		this.dvbSwFilter = dvbSwFilter;
		this.dvbSatType = dvbSatType;
		this.dvbWaitForSeqStart = dvbWaitForSeqStart;
		this.skipBtAudio = skipBtAudio;
		this.dvbOnDemand = dvbOnDemand;
		this.dvbDiSEqCType = dvbDiSEqCType;
		this.firewireSpeed = firewireSpeed;
		this.firewireModel = firewireModel;
		this.firewireConnection = firewireConnection;
		this.signalTimeout = signalTimeout;
		this.channelTimeout = channelTimeout;
		this.dvbTuningDelay = dvbTuningDelay;
		this.contrast = contrast;
		this.brightness = brightness;
		this.colour = colour;
		this.hue = hue;
		this.diSEqCId = diSEqCId;
		this.dvbEitScan = dvbEitScan;
	}

	/**
	 * @return the audioDevice
	 */
	public String getAudioDevice() {
		return audioDevice;
	}

	/**
	 * @return the audioRateLimit
	 */
	public Integer getAudioRateLimit() {
		return audioRateLimit;
	}

	/**
	 * @return the brightness
	 */
	public Integer getBrightness() {
		return brightness;
	}

	/**
	 * @return the cardId
	 */
	public int getCardId() {
		return cardId;
	}

	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * @return the channelTimeout
	 */
	public Integer getChannelTimeout() {
		return channelTimeout;
	}

	/**
	 * @return the colour
	 */
	public Integer getColour() {
		return colour;
	}

	/**
	 * @return the contrast
	 */
	public Integer getContrast() {
		return contrast;
	}

	/**
	 * @return the diSEqCId
	 */
	public Integer getDiSEqCId() {
		return diSEqCId;
	}

	/**
	 * @return the dvbDiSEqCType
	 */
	public Integer getDvbDiSEqCType() {
		return dvbDiSEqCType;
	}

	/**
	 * @return the dvbEitScan
	 */
	public Boolean getDvbEitScan() {
		return dvbEitScan;
	}

	/**
	 * @return the dvbOnDemand
	 */
	public Boolean getDvbOnDemand() {
		return dvbOnDemand;
	}

	/**
	 * @return the dvbSatType
	 */
	public Integer getDvbSatType() {
		return dvbSatType;
	}

	/**
	 * @return the dvbSwFilter
	 */
	public Integer getDvbSwFilter() {
		return dvbSwFilter;
	}

	/**
	 * @return the dvbTuningDelay
	 */
	public Integer getDvbTuningDelay() {
		return dvbTuningDelay;
	}

	/**
	 * @return the dvbWaitForSeqStart
	 */
	public Boolean getDvbWaitForSeqStart() {
		return dvbWaitForSeqStart;
	}

	/**
	 * @return the firewireConnection
	 */
	public Integer getFirewireConnection() {
		return firewireConnection;
	}

	/**
	 * @return the firewireModel
	 */
	public String getFirewireModel() {
		return firewireModel;
	}

	/**
	 * @return the firewireSpeed
	 */
	public Integer getFirewireSpeed() {
		return firewireSpeed;
	}

	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * @return the hue
	 */
	public Integer getHue() {
		return hue;
	}

	/**
	 * @return the signalTimeout
	 */
	public Integer getSignalTimeout() {
		return signalTimeout;
	}

	/**
	 * @return the skipBtAudio
	 */
	public Boolean getSkipBtAudio() {
		return skipBtAudio;
	}

	/**
	 * @return the vbiDevice
	 */
	public String getVbiDevice() {
		return vbiDevice;
	}

	/**
	 * @return the videoDevice
	 */
	public String getVideoDevice() {
		return videoDevice;
	}

	/**
	 * @param audioDevice
	 *            the audioDevice to set
	 */
	public void setAudioDevice(final String audioDevice) {
		this.audioDevice = audioDevice;
	}

	/**
	 * @param audioRateLimit
	 *            the audioRateLimit to set
	 */
	public void setAudioRateLimit(final Integer audioRateLimit) {
		this.audioRateLimit = audioRateLimit;
	}

	/**
	 * @param brightness
	 *            the brightness to set
	 */
	public void setBrightness(final Integer brightness) {
		this.brightness = brightness;
	}

	/**
	 * @param cardId
	 *            the cardId to set
	 */
	public void setCardId(final int cardId) {
		this.cardId = cardId;
	}

	/**
	 * @param cardType
	 *            the cardType to set
	 */
	public void setCardType(final String cardType) {
		this.cardType = cardType;
	}

	/**
	 * @param channelTimeout
	 *            the channelTimeout to set
	 */
	public void setChannelTimeout(final Integer channelTimeout) {
		this.channelTimeout = channelTimeout;
	}

	/**
	 * @param colour
	 *            the colour to set
	 */
	public void setColour(final Integer colour) {
		this.colour = colour;
	}

	/**
	 * @param contrast
	 *            the contrast to set
	 */
	public void setContrast(final Integer contrast) {
		this.contrast = contrast;
	}

	/**
	 * @param diSEqCId
	 *            the diSEqCId to set
	 */
	public void setDiSEqCId(final Integer diSEqCId) {
		this.diSEqCId = diSEqCId;
	}

	/**
	 * @param dvbDiSEqCType
	 *            the dvbDiSEqCType to set
	 */
	public void setDvbDiSEqCType(final Integer dvbDiSEqCType) {
		this.dvbDiSEqCType = dvbDiSEqCType;
	}

	/**
	 * @param dvbEitScan
	 *            the dvbEitScan to set
	 */
	public void setDvbEitScan(final Boolean dvbEitScan) {
		this.dvbEitScan = dvbEitScan;
	}

	/**
	 * @param dvbOnDemand
	 *            the dvbOnDemand to set
	 */
	public void setDvbOnDemand(final Boolean dvbOnDemand) {
		this.dvbOnDemand = dvbOnDemand;
	}

	/**
	 * @param dvbSatType
	 *            the dvbSatType to set
	 */
	public void setDvbSatType(final Integer dvbSatType) {
		this.dvbSatType = dvbSatType;
	}

	/**
	 * @param dvbSwFilter
	 *            the dvbSwFilter to set
	 */
	public void setDvbSwFilter(final Integer dvbSwFilter) {
		this.dvbSwFilter = dvbSwFilter;
	}

	/**
	 * @param dvbTuningDelay
	 *            the dvbTuningDelay to set
	 */
	public void setDvbTuningDelay(final Integer dvbTuningDelay) {
		this.dvbTuningDelay = dvbTuningDelay;
	}

	/**
	 * @param dvbWaitForSeqStart
	 *            the dvbWaitForSeqStart to set
	 */
	public void setDvbWaitForSeqStart(final Boolean dvbWaitForSeqStart) {
		this.dvbWaitForSeqStart = dvbWaitForSeqStart;
	}

	/**
	 * @param firewireConnection
	 *            the firewireConnection to set
	 */
	public void setFirewireConnection(final Integer firewireConnection) {
		this.firewireConnection = firewireConnection;
	}

	/**
	 * @param firewireModel
	 *            the firewireModel to set
	 */
	public void setFirewireModel(final String firewireModel) {
		this.firewireModel = firewireModel;
	}

	/**
	 * @param firewireSpeed
	 *            the firewireSpeed to set
	 */
	public void setFirewireSpeed(final Integer firewireSpeed) {
		this.firewireSpeed = firewireSpeed;
	}

	/**
	 * @param hostName
	 *            the hostName to set
	 */
	public void setHostName(final String hostName) {
		this.hostName = hostName;
	}

	/**
	 * @param hue
	 *            the hue to set
	 */
	public void setHue(final Integer hue) {
		this.hue = hue;
	}

	/**
	 * @param signalTimeout
	 *            the signalTimeout to set
	 */
	public void setSignalTimeout(final Integer signalTimeout) {
		this.signalTimeout = signalTimeout;
	}

	/**
	 * @param skipBtAudio
	 *            the skipBtAudio to set
	 */
	public void setSkipBtAudio(final Boolean skipBtAudio) {
		this.skipBtAudio = skipBtAudio;
	}

	/**
	 * @param vbiDevice
	 *            the vbiDevice to set
	 */
	public void setVbiDevice(final String vbiDevice) {
		this.vbiDevice = vbiDevice;
	}

	/**
	 * @param videoDevice
	 *            the videoDevice to set
	 */
	public void setVideoDevice(final String videoDevice) {
		this.videoDevice = videoDevice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("CaptureCard [");

		builder.append("cardId=").append(cardId).append(", ");

		if (videoDevice != null) {
			builder.append("videoDevice=");
			builder.append(videoDevice);
			builder.append(", ");
		}

		if (audioDevice != null) {
			builder.append("audioDevice=");
			builder.append(audioDevice);
			builder.append(", ");
		}

		if (vbiDevice != null) {
			builder.append("vbiDevice=");
			builder.append(vbiDevice);
			builder.append(", ");
		}

		if (cardType != null) {
			builder.append("cardType=");
			builder.append(cardType);
			builder.append(", ");
		}

		builder.append("audioRateLimit=").append(audioRateLimit).append(", ");

		if (hostName != null) {
			builder.append("hostName=");
			builder.append(hostName);
			builder.append(", ");
		}

		builder.append("dvbSwFilter=").append(dvbSwFilter).append(", ");
		builder.append("dvbSatType=").append(dvbSatType).append(", ");
		builder.append("dvbWaitForSeqStart=").append(dvbWaitForSeqStart).append(", ");
		builder.append("skipBtAudio=").append(skipBtAudio).append(", ");
		builder.append("dvbOnDemand=").append(dvbOnDemand).append(", ");
		builder.append("dvbDiSEqCType=").append(dvbDiSEqCType).append(", ");
		builder.append("firewireSpeed=").append(firewireSpeed).append(", ");
		builder.append("firewireModel=").append(firewireModel).append(", ");
		builder.append("firewireConnection=").append(firewireConnection).append(", ");
		builder.append("signalTimeout=").append(signalTimeout).append(", ");
		builder.append("channelTimeout=").append(channelTimeout).append(", ");
		builder.append("dvbTuningDelay=").append(dvbTuningDelay).append(", ");
		builder.append("contrast=").append(contrast).append(", ");
		builder.append("brightness=").append(brightness).append(", ");
		builder.append("colour=").append(colour).append(", ");
		builder.append("hue=").append(hue).append(", ");
		builder.append("diSEqCId=").append(diSEqCId).append(", ");
		builder.append("dvbEitScan=").append(dvbEitScan);

		builder.append("]");

		return builder.toString();
	}

}
