package com.masdaussel.mythtv.services.api.frontend;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 * @author Thomas G. Kenny Jr
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class State {

	private List<StateStringItem>	states;

	@JsonProperty("CurrentLocation")
	private String					currentLocation;

	public State() {
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	/**
	 * @return the states
	 */
	public List<StateStringItem> getStates() {
		return states;
	}

	public void setCurrentLocation(final String location) {
		currentLocation = location;
	}

	/**
	 * @param states
	 *            the states to set
	 */
	public void setStates(final List<StateStringItem> states) {
		this.states = states;
	}

	// /* (non-Javadoc)
	// * @see java.lang.Object#toString()
	// */
	// @Override
	// public String toString() {
	// StringBuilder builder = new StringBuilder();
	//
	// builder.append( "State [" );
	//
	// if( states != null ) {
	// builder.append( states );
	// }
	//
	// builder.append( "]" );
	//
	// return builder.toString();
	// }

}
