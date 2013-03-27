package org.mythtv.services.api.status.converters;

import org.mythtv.services.api.status.Job.Command;
import org.simpleframework.xml.transform.Transform;

/**
 * @author Daniel Frey
 *
 */
public class JobCommandTransform implements Transform<Command> {

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Transform#read(java.lang.String)
	 */
	@Override
	public Command read( String value ) throws Exception {

		try {
			Integer code = Integer.parseInt( value );
			
			return Command.getValue( code );
		} catch( NumberFormatException e ) { }
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Transform#write(java.lang.Object)
	 */
	@Override
	public String write( Command value ) throws Exception {
		throw new UnsupportedOperationException( "operation not implemented" );
	}

}
