/**
 * 
 */
package org.mythtv.services.api.v026.status.converters;

import org.mythtv.services.api.v026.beans.Job.Status;
import org.simpleframework.xml.transform.Transform;

/**
 * @author Daniel Frey
 *
 */
public class JobStatusTransform implements Transform<Status> {

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Transform#read(java.lang.String)
	 */
	@Override
	public Status read( String value ) throws Exception {
		
		try {
			Integer code = Integer.parseInt( value );
			
			return Status.getValue( code );
		} catch( NumberFormatException e ) { }
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Transform#write(java.lang.Object)
	 */
	@Override
	public String write( Status value ) throws Exception {
		throw new UnsupportedOperationException( "operation not implemented" );
	}

}
