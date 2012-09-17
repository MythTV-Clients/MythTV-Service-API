/**
 * 
 */
package org.mythtv.services.api.guide;

import org.mythtv.services.api.dvr.Program;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sebastien Astie
 *
 */
public class ProgramWrapper {

	@JsonProperty( "Program" )
	private Program program;
	
	public ProgramWrapper() { }

	/**
	 * @return the program
	 */
	public Program getProgram() {
		return program;
	}

	/**
	 * @param program the program to set
	 */
	public void setProgram( Program program ) {
		this.program = program;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append( "ProgramWrapper [" );
		
		if( program != null ) {
			builder.append( "program=" );
			builder.append( program );
		}
		
		builder.append( "]" );
	
		return builder.toString();
	}
	
}
