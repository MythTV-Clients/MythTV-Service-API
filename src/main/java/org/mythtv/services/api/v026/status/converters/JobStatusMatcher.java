/**
 * 
 */
package org.mythtv.services.api.v026.status.converters;

import org.mythtv.services.api.v026.beans.Job.Status;
import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

/**
 * @author Daniel Frey
 *
 */
public class JobStatusMatcher implements Matcher {

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Matcher#match(java.lang.Class)
	 */
	@Override
	public Transform match( Class type ) throws Exception {
        
		if( type == Status.class ) {
            return new JobStatusTransform();
        }
        
		return null;
	}

}
