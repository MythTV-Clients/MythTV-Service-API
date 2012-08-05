package com.masdaussel.mythtv.services.api.frontend;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 * @author Thomas G. Kenny Jr
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {

	@JsonProperty("State")
	private State	state;

	// @JsonProperty( "ChapterTimes" )
	// @JsonProperty( "SubtitleTracks" )
	// @JsonProperty( "AudioTracks" )

	public Status() {
	}

	public State getState() {
		return state;
	}

	public void setState(final State s) {
		state = s;
	}

}
