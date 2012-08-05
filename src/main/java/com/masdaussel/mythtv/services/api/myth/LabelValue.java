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
package com.masdaussel.mythtv.services.api.myth;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class LabelValue {

	@JsonProperty("Label")
	private String	label;

	@JsonProperty("Value")
	private String	value;

	@JsonProperty("Description")
	private String	description;

	@JsonProperty("Active")
	private boolean	active;

	@JsonProperty("Selected")
	private boolean	selected;

	public LabelValue() {
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @return the selected
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(final boolean active) {
		this.active = active;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(final String label) {
		this.label = label;
	}

	/**
	 * @param selected
	 *            the selected to set
	 */
	public void setSelected(final boolean selected) {
		this.selected = selected;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(final String value) {
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("LabelValue [");

		if (label != null) {
			builder.append("label=");
			builder.append(label);
			builder.append(", ");
		}

		if (value != null) {
			builder.append("value=");
			builder.append(value);
			builder.append(", ");
		}

		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}

		builder.append("active=");
		builder.append(active);
		builder.append(", selected=");
		builder.append(selected);
		builder.append("]");

		return builder.toString();
	}

}
