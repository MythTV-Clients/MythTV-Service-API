/**
 * 
 */
package org.mythtv.services.api.v026.beans;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * @author Daniel Frey
 *
 */
@Root( name = "Load" )
public class Load {

	@Attribute( name = "avg1" )
	private String averageOne;
	
	@Attribute( name = "avg2" )
	private String averageTwo;
	
	@Attribute( name = "avg3" )
	private String averageThree;
	
	public Load() { }

	/**
	 * @return the averageOne
	 */
	public String getAverageOne() {
		return averageOne;
	}

	/**
	 * @param averageOne the averageOne to set
	 */
	public void setAverageOne( String averageOne ) {
		this.averageOne = averageOne;
	}

	/**
	 * @return the averageTwo
	 */
	public String getAverageTwo() {
		return averageTwo;
	}

	/**
	 * @param averageTwo the averageTwo to set
	 */
	public void setAverageTwo( String averageTwo ) {
		this.averageTwo = averageTwo;
	}

	/**
	 * @return the averageThree
	 */
	public String getAverageThree() {
		return averageThree;
	}

	/**
	 * @param averageThree the averageThree to set
	 */
	public void setAverageThree( String averageThree ) {
		this.averageThree = averageThree;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( "Load [averageOne=" );
		builder.append( averageOne );
		builder.append( ", averageTwo=" );
		builder.append( averageTwo );
		builder.append( ", averageThree=" );
		builder.append( averageThree );
		builder.append( "]" );
		return builder.toString();
	}
	
}
