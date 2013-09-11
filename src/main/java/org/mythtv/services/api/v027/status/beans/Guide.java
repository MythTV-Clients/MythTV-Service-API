/**
 * 
 */
package org.mythtv.services.api.v027.status.beans;

import org.joda.time.DateTime;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * @author Daniel Frey
 *
 */
@Root( name = "Guide" )
public class Guide {

	@Attribute( required = false )
	private DateTime guideThru;
	
	@Attribute( required = false )
	private String status;
	
	@Attribute( required = false )
	private DateTime next;
	
	@Attribute( required = false )
	private String end;
	
	@Attribute( required = false )
	private int guideDays;
	
	@Attribute( required = false )
	private String start;
	
	@Text( required = false )
	private String comment;
	
	public Guide() { }

	/**
	 * @return the guideThru
	 */
	public DateTime getGuideThru() {
		return guideThru;
	}

	/**
	 * @param guideThru the guideThru to set
	 */
	public void setGuideThru( DateTime guideThru ) {
		this.guideThru = guideThru;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus( String status ) {
		this.status = status;
	}

	/**
	 * @return the next
	 */
	public DateTime getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext( DateTime next ) {
		this.next = next;
	}

	/**
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd( String end ) {
		this.end = end;
	}

	/**
	 * @return the guideDays
	 */
	public int getGuideDays() {
		return guideDays;
	}

	/**
	 * @param guideDays the guideDays to set
	 */
	public void setGuideDays( int guideDays ) {
		this.guideDays = guideDays;
	}

	/**
	 * @return the start
	 */
	public String getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart( String start ) {
		this.start = start;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment( String comment ) {
		this.comment = comment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( "Guide [" );
		if( guideThru != null ) {
			builder.append( "guideThru=" );
			builder.append( guideThru );
			builder.append( ", " );
		}
		if( status != null ) {
			builder.append( "status=" );
			builder.append( status );
			builder.append( ", " );
		}
		if( next != null ) {
			builder.append( "next=" );
			builder.append( next );
			builder.append( ", " );
		}
		if( end != null ) {
			builder.append( "end=" );
			builder.append( end );
			builder.append( ", " );
		}
		builder.append( "guideDays=" );
		builder.append( guideDays );
		builder.append( ", " );
		if( start != null ) {
			builder.append( "start=" );
			builder.append( start );
			builder.append( ", " );
		}
		if( comment != null ) {
			builder.append( "comment=" );
			builder.append( comment );
		}
		builder.append( "]" );
		return builder.toString();
	}
	
}
