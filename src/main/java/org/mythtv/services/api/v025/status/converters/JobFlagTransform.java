/**
 * 
 */
package org.mythtv.services.api.v025.status.converters;

import org.mythtv.services.api.v025.status.beans.Job.Flag;
import org.simpleframework.xml.transform.Transform;

/**
 * @author Daniel Frey
 *
 */
public class JobFlagTransform implements Transform<Flag> {

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Transform#read(java.lang.String)
	 */
	@Override
	public Flag read( String value ) throws Exception {
		
		try {
			Integer code = Integer.parseInt( value );
			
			return Flag.getValue( code );
		} catch( NumberFormatException e ) { }
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Transform#write(java.lang.Object)
	 */
	@Override
	public String write( Flag value ) throws Exception {
		throw new UnsupportedOperationException( "operation not implemented" );
	}

}
