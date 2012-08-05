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

/**
 * @author sebastien
 * 
 */
public class CardInput {

	private int		cardId;
	private int		sourceId;
	private String	inputName;
	private String	externalCommand;
	private String	changerDevice;
	private String	changerModel;
	private String	Hosthame;
	private String	tuneChannel;
	private String	startChannel;
	private String	displayName;
	private boolean	dishnetEIT;
	private int		recordingPriority;
	private int		quicktune;
	private int		schedOrder;
	private int		liveTVOrder;

	public CardInput() {
	}

	/**
	 * @return the cardId
	 */
	public int getCardId() {
		return cardId;
	}

	/**
	 * @return the changerDevice
	 */
	public String getChangerDevice() {
		return changerDevice;
	}

	/**
	 * @return the changerModel
	 */
	public String getChangerModel() {
		return changerModel;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @return the externalCommand
	 */
	public String getExternalCommand() {
		return externalCommand;
	}

	/**
	 * @return the hosthame
	 */
	public String getHosthame() {
		return Hosthame;
	}

	/**
	 * @return the inputName
	 */
	public String getInputName() {
		return inputName;
	}

	/**
	 * @return the liveTVOrder
	 */
	public int getLiveTVOrder() {
		return liveTVOrder;
	}

	/**
	 * @return the quicktune
	 */
	public int getQuicktune() {
		return quicktune;
	}

	/**
	 * @return the recordingPriority
	 */
	public int getRecordingPriority() {
		return recordingPriority;
	}

	/**
	 * @return the schedOrder
	 */
	public int getSchedOrder() {
		return schedOrder;
	}

	/**
	 * @return the sourceId
	 */
	public int getSourceId() {
		return sourceId;
	}

	/**
	 * @return the startChannel
	 */
	public String getStartChannel() {
		return startChannel;
	}

	/**
	 * @return the tuneChannel
	 */
	public String getTuneChannel() {
		return tuneChannel;
	}

	/**
	 * @return the dishnetEIT
	 */
	public boolean isDishnetEIT() {
		return dishnetEIT;
	}

	/**
	 * @param cardId
	 *            the cardId to set
	 */
	public void setCardId(final int cardId) {
		this.cardId = cardId;
	}

	/**
	 * @param changerDevice
	 *            the changerDevice to set
	 */
	public void setChangerDevice(final String changerDevice) {
		this.changerDevice = changerDevice;
	}

	/**
	 * @param changerModel
	 *            the changerModel to set
	 */
	public void setChangerModel(final String changerModel) {
		this.changerModel = changerModel;
	}

	/**
	 * @param dishnetEIT
	 *            the dishnetEIT to set
	 */
	public void setDishnetEIT(final boolean dishnetEIT) {
		this.dishnetEIT = dishnetEIT;
	}

	/**
	 * @param displayName
	 *            the displayName to set
	 */
	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @param externalCommand
	 *            the externalCommand to set
	 */
	public void setExternalCommand(final String externalCommand) {
		this.externalCommand = externalCommand;
	}

	/**
	 * @param hosthame
	 *            the hosthame to set
	 */
	public void setHosthame(final String hosthame) {
		Hosthame = hosthame;
	}

	/**
	 * @param inputName
	 *            the inputName to set
	 */
	public void setInputName(final String inputName) {
		this.inputName = inputName;
	}

	/**
	 * @param liveTVOrder
	 *            the liveTVOrder to set
	 */
	public void setLiveTVOrder(final int liveTVOrder) {
		this.liveTVOrder = liveTVOrder;
	}

	/**
	 * @param quicktune
	 *            the quicktune to set
	 */
	public void setQuicktune(final int quicktune) {
		this.quicktune = quicktune;
	}

	/**
	 * @param recordingPriority
	 *            the recordingPriority to set
	 */
	public void setRecordingPriority(final int recordingPriority) {
		this.recordingPriority = recordingPriority;
	}

	/**
	 * @param schedOrder
	 *            the schedOrder to set
	 */
	public void setSchedOrder(final int schedOrder) {
		this.schedOrder = schedOrder;
	}

	/**
	 * @param sourceId
	 *            the sourceId to set
	 */
	public void setSourceId(final int sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * @param startChannel
	 *            the startChannel to set
	 */
	public void setStartChannel(final String startChannel) {
		this.startChannel = startChannel;
	}

	/**
	 * @param tuneChannel
	 *            the tuneChannel to set
	 */
	public void setTuneChannel(final String tuneChannel) {
		this.tuneChannel = tuneChannel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		final StringBuilder builder = new StringBuilder();
		builder.append("CardInput [cardId=");
		builder.append(cardId);
		builder.append(", sourceId=");
		builder.append(sourceId);
		builder.append(", ");

		if (inputName != null) {
			builder.append("inputName=");
			builder.append(inputName);
			builder.append(", ");
		}

		if (externalCommand != null) {
			builder.append("externalCommand=");
			builder.append(externalCommand);
			builder.append(", ");
		}

		if (changerDevice != null) {
			builder.append("changerDevice=");
			builder.append(changerDevice);
			builder.append(", ");
		}

		if (changerModel != null) {
			builder.append("changerModel=");
			builder.append(changerModel);
			builder.append(", ");
		}

		if (Hosthame != null) {
			builder.append("Hosthame=");
			builder.append(Hosthame);
			builder.append(", ");
		}

		if (tuneChannel != null) {
			builder.append("tuneChannel=");
			builder.append(tuneChannel);
			builder.append(", ");
		}

		if (startChannel != null) {
			builder.append("startChannel=");
			builder.append(startChannel);
			builder.append(", ");
		}

		if (displayName != null) {
			builder.append("displayName=");
			builder.append(displayName);
			builder.append(", ");
		}

		builder.append("dishnetEIT=");
		builder.append(dishnetEIT);
		builder.append(", recordingPriority=");
		builder.append(recordingPriority);
		builder.append(", quicktune=");
		builder.append(quicktune);
		builder.append(", schedOrder=");
		builder.append(schedOrder);
		builder.append(", liveTVOrder=");
		builder.append(liveTVOrder);
		builder.append("]");

		return builder.toString();
	}

}
