/**
 * 
 */
package com.masdaussel.mythtv.services.api.guide;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class ProgramGuideWrapper {

	@JsonProperty("ProgramGuide")
	private ProgramGuide	programGuide;

	public ProgramGuideWrapper() {
	}

	/**
	 * @return the programGuide
	 */
	public ProgramGuide getProgramGuide() {
		return programGuide;
	}

	/**
	 * @param programGuide
	 *            the programGuide to set
	 */
	public void setProgramGuide(final ProgramGuide programGuide) {
		this.programGuide = programGuide;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("ProgramGuideWrapper [");

		if (programGuide != null) {
			builder.append("programGuide=");
			builder.append(programGuide);
		}

		builder.append("]");

		return builder.toString();
	}

}
