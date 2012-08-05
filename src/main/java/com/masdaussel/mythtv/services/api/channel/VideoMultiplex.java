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

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class VideoMultiplex {

	@JsonProperty("MplexId")
	private int		multiplexId;

	@JsonProperty("SourceId")
	private int		sourceId;

	@JsonProperty("TransportId")
	private int		transportId;

	@JsonProperty("NetworkId")
	private int		networkId;

	@JsonProperty("Frequency")
	private long	frequency;

	@JsonProperty("Inversion")
	private String	inversion;

	@JsonProperty("SymbolRate")
	private long	symbolRate;

	@JsonProperty("FEC")
	private String	fec;

	@JsonProperty("Polarity")
	private String	polarity;

	@JsonProperty("Modulation")
	private String	modulation;

	@JsonProperty("Bandwidth")
	private String	bandwidth;

	@JsonProperty("LPCodeRate")
	private String	lpCodeRate;

	@JsonProperty("HPCodeRate")
	private String	hpCodeRate;

	@JsonProperty("TransmissionMode")
	private String	transmissionMode;

	@JsonProperty("GuardInterval")
	private String	guardInterval;

	@JsonProperty("Visible")
	private boolean	visible;

	@JsonProperty("Constellation")
	private String	constellation;

	@JsonProperty("Hierarchy")
	private String	hierarchy;

	@JsonProperty("ModulationSystem")
	private String	modulationSystem;

	@JsonProperty("RollOff")
	private String	rollOff;

	@JsonProperty("SIStandard")
	private String	siStandard;

	@JsonProperty("ServiceVersion")
	private int		serviceVersion;

	@JsonProperty("UpdateTimeStamp")
	private Date	updateTimestamp;

	@JsonProperty("DefaultAuthority")
	private String	defaultAuthority;

	public VideoMultiplex() {
	}

	/**
	 * @return the bandwidth
	 */
	public String getBandwidth() {
		return bandwidth;
	}

	/**
	 * @return the constellation
	 */
	public String getConstellation() {
		return constellation;
	}

	/**
	 * @return the defaultAuthority
	 */
	public String getDefaultAuthority() {
		return defaultAuthority;
	}

	/**
	 * @return the fec
	 */
	public String getFec() {
		return fec;
	}

	/**
	 * @return the frequency
	 */
	public long getFrequency() {
		return frequency;
	}

	/**
	 * @return the guardInterval
	 */
	public String getGuardInterval() {
		return guardInterval;
	}

	/**
	 * @return the hierarchy
	 */
	public String getHierarchy() {
		return hierarchy;
	}

	/**
	 * @return the hpCodeRate
	 */
	public String getHpCodeRate() {
		return hpCodeRate;
	}

	/**
	 * @return the inversion
	 */
	public String getInversion() {
		return inversion;
	}

	/**
	 * @return the lpCodeRate
	 */
	public String getLpCodeRate() {
		return lpCodeRate;
	}

	/**
	 * @return the modulation
	 */
	public String getModulation() {
		return modulation;
	}

	/**
	 * @return the modulationSystem
	 */
	public String getModulationSystem() {
		return modulationSystem;
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
	 * @return the polarity
	 */
	public String getPolarity() {
		return polarity;
	}

	/**
	 * @return the rollOff
	 */
	public String getRollOff() {
		return rollOff;
	}

	/**
	 * @return the serviceVersion
	 */
	public int getServiceVersion() {
		return serviceVersion;
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
	 * @return the symbolRate
	 */
	public long getSymbolRate() {
		return symbolRate;
	}

	/**
	 * @return the transmissionMode
	 */
	public String getTransmissionMode() {
		return transmissionMode;
	}

	/**
	 * @return the transportId
	 */
	public int getTransportId() {
		return transportId;
	}

	/**
	 * @return the updateTimestamp
	 */
	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}

	/**
	 * @return the visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * @param bandwidth
	 *            the bandwidth to set
	 */
	public void setBandwidth(final String bandwidth) {
		this.bandwidth = bandwidth;
	}

	/**
	 * @param constellation
	 *            the constellation to set
	 */
	public void setConstellation(final String constellation) {
		this.constellation = constellation;
	}

	/**
	 * @param defaultAuthority
	 *            the defaultAuthority to set
	 */
	public void setDefaultAuthority(final String defaultAuthority) {
		this.defaultAuthority = defaultAuthority;
	}

	/**
	 * @param fec
	 *            the fec to set
	 */
	public void setFec(final String fec) {
		this.fec = fec;
	}

	/**
	 * @param frequency
	 *            the frequency to set
	 */
	public void setFrequency(final long frequency) {
		this.frequency = frequency;
	}

	/**
	 * @param guardInterval
	 *            the guardInterval to set
	 */
	public void setGuardInterval(final String guardInterval) {
		this.guardInterval = guardInterval;
	}

	/**
	 * @param hierarchy
	 *            the hierarchy to set
	 */
	public void setHierarchy(final String hierarchy) {
		this.hierarchy = hierarchy;
	}

	/**
	 * @param hpCodeRate
	 *            the hpCodeRate to set
	 */
	public void setHpCodeRate(final String hpCodeRate) {
		this.hpCodeRate = hpCodeRate;
	}

	/**
	 * @param inversion
	 *            the inversion to set
	 */
	public void setInversion(final String inversion) {
		this.inversion = inversion;
	}

	/**
	 * @param lpCodeRate
	 *            the lpCodeRate to set
	 */
	public void setLpCodeRate(final String lpCodeRate) {
		this.lpCodeRate = lpCodeRate;
	}

	/**
	 * @param modulation
	 *            the modulation to set
	 */
	public void setModulation(final String modulation) {
		this.modulation = modulation;
	}

	/**
	 * @param modulationSystem
	 *            the modulationSystem to set
	 */
	public void setModulationSystem(final String modulationSystem) {
		this.modulationSystem = modulationSystem;
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
	 * @param polarity
	 *            the polarity to set
	 */
	public void setPolarity(final String polarity) {
		this.polarity = polarity;
	}

	/**
	 * @param rollOff
	 *            the rollOff to set
	 */
	public void setRollOff(final String rollOff) {
		this.rollOff = rollOff;
	}

	/**
	 * @param serviceVersion
	 *            the serviceVersion to set
	 */
	public void setServiceVersion(final int serviceVersion) {
		this.serviceVersion = serviceVersion;
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
	 * @param symbolRate
	 *            the symbolRate to set
	 */
	public void setSymbolRate(final long symbolRate) {
		this.symbolRate = symbolRate;
	}

	/**
	 * @param transmissionMode
	 *            the transmissionMode to set
	 */
	public void setTransmissionMode(final String transmissionMode) {
		this.transmissionMode = transmissionMode;
	}

	/**
	 * @param transportId
	 *            the transportId to set
	 */
	public void setTransportId(final int transportId) {
		this.transportId = transportId;
	}

	/**
	 * @param updateTimestamp
	 *            the updateTimestamp to set
	 */
	public void setUpdateTimestamp(final Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	/**
	 * @param visible
	 *            the visible to set
	 */
	public void setVisible(final boolean visible) {
		this.visible = visible;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("VideoMultiplex [multiplexId=");
		builder.append(multiplexId);
		builder.append(", sourceId=");
		builder.append(sourceId);
		builder.append(", transportId=");
		builder.append(transportId);
		builder.append(", networkId=");
		builder.append(networkId);
		builder.append(", frequency=");
		builder.append(frequency);
		builder.append(", ");

		if (inversion != null) {
			builder.append("inversion=");
			builder.append(inversion);
			builder.append(", ");
		}

		builder.append("symbolRate=");
		builder.append(symbolRate);
		builder.append(", ");

		if (fec != null) {
			builder.append("fec=");
			builder.append(fec);
			builder.append(", ");
		}

		if (polarity != null) {
			builder.append("polarity=");
			builder.append(polarity);
			builder.append(", ");
		}

		if (modulation != null) {
			builder.append("modulation=");
			builder.append(modulation);
			builder.append(", ");
		}

		if (bandwidth != null) {
			builder.append("bandwidth=");
			builder.append(bandwidth);
			builder.append(", ");
		}

		if (lpCodeRate != null) {
			builder.append("lpCodeRate=");
			builder.append(lpCodeRate);
			builder.append(", ");
		}

		if (hpCodeRate != null) {
			builder.append("hpCodeRate=");
			builder.append(hpCodeRate);
			builder.append(", ");
		}

		if (transmissionMode != null) {
			builder.append("transmissionMode=");
			builder.append(transmissionMode);
			builder.append(", ");
		}

		if (guardInterval != null) {
			builder.append("guardInterval=");
			builder.append(guardInterval);
			builder.append(", ");
		}

		builder.append("visible=");
		builder.append(visible);
		builder.append(", ");

		if (constellation != null) {
			builder.append("constellation=");
			builder.append(constellation);
			builder.append(", ");
		}

		if (hierarchy != null) {
			builder.append("hierarchy=");
			builder.append(hierarchy);
			builder.append(", ");
		}

		if (modulationSystem != null) {
			builder.append("modulationSystem=");
			builder.append(modulationSystem);
			builder.append(", ");
		}

		if (rollOff != null) {
			builder.append("rollOff=");
			builder.append(rollOff);
			builder.append(", ");
		}

		if (siStandard != null) {
			builder.append("siStandard=");
			builder.append(siStandard);
			builder.append(", ");
		}

		builder.append("serviceVersion=");
		builder.append(serviceVersion);
		builder.append(", ");

		if (updateTimestamp != null) {
			builder.append("updateTimestamp=");
			builder.append(updateTimestamp);
			builder.append(", ");
		}

		if (defaultAuthority != null) {
			builder.append("defaultAuthority=");
			builder.append(defaultAuthority);
		}

		builder.append("]");

		return builder.toString();
	}

}
