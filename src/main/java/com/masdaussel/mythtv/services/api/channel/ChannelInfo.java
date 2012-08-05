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
package com.masdaussel.mythtv.services.api.channel;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.masdaussel.mythtv.services.api.dvr.Program;

/**
 * @author sebastien
 * 
 */
public class ChannelInfo {

	@JsonProperty("ChanId")
	private String			channelId;

	@JsonProperty("ChanNum")
	private String			channelNumber;

	@JsonProperty("CallSign")
	private String			callSign;

	@JsonProperty("IconURL")
	private String			iconUrl;

	@JsonProperty("ChannelName")
	private String			channelName;

	@JsonProperty("MplexId")
	private int				multiplexId;

	@JsonProperty("TransportId")
	private int				transportId;

	@JsonProperty("ServiceId")
	private int				serviceId;

	@JsonProperty("NetworkId")
	private int				networkId;

	@JsonProperty("ATSCMajorChan")
	private int				atscMajorChannel;

	@JsonProperty("ATSCMinorChan")
	private int				atscMinorChannel;

	@JsonProperty("Format")
	private String			format;

	@JsonProperty("Modulation")
	private String			modulation;

	@JsonProperty("Frequency")
	private int				frequency;

	@JsonProperty("FrequencyId")
	private String			frequencyId;

	@JsonProperty("FrequencyTable")
	private String			frequenceTable;

	@JsonProperty("FineTune")
	private int				fineTune;

	@JsonProperty("SIStandard")
	private String			siStandard;

	@JsonProperty("ChanFilters")
	private String			channelFilters;

	@JsonProperty("SourceId")
	private int				sourceId;

	@JsonProperty("InputId")
	private int				inputId;

	@JsonProperty("CommFree")
	private int				commercialFree;

	@JsonProperty("UseEIT")
	private boolean			useEit;

	@JsonProperty("Visible")
	private boolean			visable;

	@JsonProperty("XMLTVID")
	private String			xmltvId;

	@JsonProperty("DefaultAuth")
	private String			defaultAuth;

	@JsonProperty("Programs")
	private List<Program>	programs;

	public ChannelInfo() {
	}

	/**
	 * @return the atscMajorChannel
	 */
	public int getAtscMajorChannel() {
		return atscMajorChannel;
	}

	/**
	 * @return the atscMinorChannel
	 */
	public int getAtscMinorChannel() {
		return atscMinorChannel;
	}

	/**
	 * @return the callSign
	 */
	public String getCallSign() {
		return callSign;
	}

	/**
	 * @return the channelFilters
	 */
	public String getChannelFilters() {
		return channelFilters;
	}

	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * @return the channelName
	 */
	public String getChannelName() {
		return channelName;
	}

	/**
	 * @return the channelNumber
	 */
	public String getChannelNumber() {
		return channelNumber;
	}

	/**
	 * @return the commercialFree
	 */
	public int getCommercialFree() {
		return commercialFree;
	}

	/**
	 * @return the defaultAuth
	 */
	public String getDefaultAuth() {
		return defaultAuth;
	}

	/**
	 * @return the fineTune
	 */
	public int getFineTune() {
		return fineTune;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @return the frequenceTable
	 */
	public String getFrequenceTable() {
		return frequenceTable;
	}

	/**
	 * @return the frequency
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * @return the frequencyId
	 */
	public String getFrequencyId() {
		return frequencyId;
	}

	/**
	 * @return the iconUrl
	 */
	public String getIconUrl() {
		return iconUrl;
	}

	/**
	 * @return the inputId
	 */
	public int getInputId() {
		return inputId;
	}

	/**
	 * @return the modulation
	 */
	public String getModulation() {
		return modulation;
	}

	/**
	 * @return the multiplexId
	 */
	public int getMultiplexId() {
		return multiplexId;
	}

	/**
	 * @return the networkId
	 */
	public int getNetworkId() {
		return networkId;
	}

	/**
	 * @return the programs
	 */
	public List<Program> getPrograms() {
		return programs;
	}

	/**
	 * @return the serviceId
	 */
	public int getServiceId() {
		return serviceId;
	}

	/**
	 * @return the siStandard
	 */
	public String getSiStandard() {
		return siStandard;
	}

	/**
	 * @return the sourceId
	 */
	public int getSourceId() {
		return sourceId;
	}

	/**
	 * @return the transportId
	 */
	public int getTransportId() {
		return transportId;
	}

	/**
	 * @return the xmltvId
	 */
	public String getXmltvId() {
		return xmltvId;
	}

	/**
	 * @return the useEit
	 */
	public boolean isUseEit() {
		return useEit;
	}

	/**
	 * @return the visable
	 */
	public boolean isVisable() {
		return visable;
	}

	/**
	 * @param atscMajorChannel
	 *            the atscMajorChannel to set
	 */
	public void setAtscMajorChannel(final int atscMajorChannel) {
		this.atscMajorChannel = atscMajorChannel;
	}

	/**
	 * @param atscMinorChannel
	 *            the atscMinorChannel to set
	 */
	public void setAtscMinorChannel(final int atscMinorChannel) {
		this.atscMinorChannel = atscMinorChannel;
	}

	/**
	 * @param callSign
	 *            the callSign to set
	 */
	public void setCallSign(final String callSign) {
		this.callSign = callSign;
	}

	/**
	 * @param channelFilters
	 *            the channelFilters to set
	 */
	public void setChannelFilters(final String channelFilters) {
		this.channelFilters = channelFilters;
	}

	/**
	 * @param channelId
	 *            the channelId to set
	 */
	public void setChannelId(final String channelId) {
		this.channelId = channelId;
	}

	/**
	 * @param channelName
	 *            the channelName to set
	 */
	public void setChannelName(final String channelName) {
		this.channelName = channelName;
	}

	/**
	 * @param channelNumber
	 *            the channelNumber to set
	 */
	public void setChannelNumber(final String channelNumber) {
		this.channelNumber = channelNumber;
	}

	/**
	 * @param commercialFree
	 *            the commercialFree to set
	 */
	public void setCommercialFree(final int commercialFree) {
		this.commercialFree = commercialFree;
	}

	/**
	 * @param defaultAuth
	 *            the defaultAuth to set
	 */
	public void setDefaultAuth(final String defaultAuth) {
		this.defaultAuth = defaultAuth;
	}

	/**
	 * @param fineTune
	 *            the fineTune to set
	 */
	public void setFineTune(final int fineTune) {
		this.fineTune = fineTune;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(final String format) {
		this.format = format;
	}

	/**
	 * @param frequenceTable
	 *            the frequenceTable to set
	 */
	public void setFrequenceTable(final String frequenceTable) {
		this.frequenceTable = frequenceTable;
	}

	/**
	 * @param frequency
	 *            the frequency to set
	 */
	public void setFrequency(final int frequency) {
		this.frequency = frequency;
	}

	/**
	 * @param frequencyId
	 *            the frequencyId to set
	 */
	public void setFrequencyId(final String frequencyId) {
		this.frequencyId = frequencyId;
	}

	/**
	 * @param iconUrl
	 *            the iconUrl to set
	 */
	public void setIconUrl(final String iconUrl) {
		this.iconUrl = iconUrl;
	}

	/**
	 * @param inputId
	 *            the inputId to set
	 */
	public void setInputId(final int inputId) {
		this.inputId = inputId;
	}

	/**
	 * @param modulation
	 *            the modulation to set
	 */
	public void setModulation(final String modulation) {
		this.modulation = modulation;
	}

	/**
	 * @param multiplexId
	 *            the multiplexId to set
	 */
	public void setMultiplexId(final int multiplexId) {
		this.multiplexId = multiplexId;
	}

	/**
	 * @param networkId
	 *            the networkId to set
	 */
	public void setNetworkId(final int networkId) {
		this.networkId = networkId;
	}

	/**
	 * @param programs
	 *            the programs to set
	 */
	public void setPrograms(final List<Program> programs) {
		this.programs = programs;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(final int serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @param siStandard
	 *            the siStandard to set
	 */
	public void setSiStandard(final String siStandard) {
		this.siStandard = siStandard;
	}

	/**
	 * @param sourceId
	 *            the sourceId to set
	 */
	public void setSourceId(final int sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * @param transportId
	 *            the transportId to set
	 */
	public void setTransportId(final int transportId) {
		this.transportId = transportId;
	}

	/**
	 * @param useEit
	 *            the useEit to set
	 */
	public void setUseEit(final boolean useEit) {
		this.useEit = useEit;
	}

	/**
	 * @param visable
	 *            the visable to set
	 */
	public void setVisable(final boolean visable) {
		this.visable = visable;
	}

	/**
	 * @param xmltvId
	 *            the xmltvId to set
	 */
	public void setXmltvId(final String xmltvId) {
		this.xmltvId = xmltvId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("Channel [");

		if (channelId != null) {
			builder.append("channelId=");
			builder.append(channelId);
			builder.append(", ");
		}

		if (channelNumber != null) {
			builder.append("channelNumber=");
			builder.append(channelNumber);
			builder.append(", ");
		}

		if (callSign != null) {
			builder.append("callSign=");
			builder.append(callSign);
			builder.append(", ");
		}

		if (iconUrl != null) {
			builder.append("iconUrl=");
			builder.append(iconUrl);
			builder.append(", ");
		}

		if (channelName != null) {
			builder.append("channelName=");
			builder.append(channelName);
			builder.append(", ");
		}

		builder.append("multiplexId=");
		builder.append(multiplexId);
		builder.append(", transportId=");
		builder.append(transportId);
		builder.append(", serviceId=");
		builder.append(serviceId);
		builder.append(", networkId=");
		builder.append(networkId);
		builder.append(", atscMajorChannel=");
		builder.append(atscMajorChannel);
		builder.append(", atscMinorChannel=");
		builder.append(atscMinorChannel);
		builder.append(", ");

		if (format != null) {
			builder.append("format=");
			builder.append(format);
			builder.append(", ");
		}

		if (modulation != null) {
			builder.append("modulation=");
			builder.append(modulation);
			builder.append(", ");
		}

		builder.append("frequency=");
		builder.append(frequency);
		builder.append(", ");

		if (frequencyId != null) {
			builder.append("frequencyId=");
			builder.append(frequencyId);
			builder.append(", ");
		}

		if (frequenceTable != null) {
			builder.append("frequenceTable=");
			builder.append(frequenceTable);
			builder.append(", ");
		}

		builder.append("fineTune=");
		builder.append(fineTune);
		builder.append(", ");

		if (siStandard != null) {
			builder.append("siStandard=");
			builder.append(siStandard);
			builder.append(", ");
		}

		if (channelFilters != null) {
			builder.append("channelFilters=");
			builder.append(channelFilters);
			builder.append(", ");
		}

		builder.append("sourceId=");
		builder.append(sourceId);
		builder.append(", inputId=");
		builder.append(inputId);
		builder.append(", commercialFree=");
		builder.append(commercialFree);
		builder.append(", useEit=");
		builder.append(useEit);
		builder.append(", visable=");
		builder.append(visable);
		builder.append(", ");

		if (xmltvId != null) {
			builder.append("xmltvId=");
			builder.append(xmltvId);
			builder.append(", ");
		}

		if (defaultAuth != null) {
			builder.append("defaultAuth=");
			builder.append(defaultAuth);
			builder.append(", ");
		}

		if (programs != null) {
			builder.append("programs=");
			builder.append(programs);
		}

		builder.append("]");

		return builder.toString();
	}

}
