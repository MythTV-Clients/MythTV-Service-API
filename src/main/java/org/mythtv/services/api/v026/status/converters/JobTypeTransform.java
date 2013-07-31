/**
 * 
 */
package org.mythtv.services.api.v026.status.converters;

import org.mythtv.services.api.v026.beans.Job.Type;
import org.simpleframework.xml.transform.Transform;

/**
 * @author Daniel Frey
 *
 */
public class JobTypeTransform implements Transform<Type> {

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Transform#read(java.lang.String)
	 */
	@Override
	public Type read( String value ) throws Exception {
		
		try {
			Integer code = Integer.parseInt( value );
			
			return Type.getValue( code );
		} catch( NumberFormatException e ) { }
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Transform#write(java.lang.Object)
	 */
	@Override
	public String write( Type value ) throws Exception {
		throw new UnsupportedOperationException( "operation not implemented" );
	}

}
