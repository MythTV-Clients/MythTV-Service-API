/**
 * 
 */
package org.mythtv.services.api.v025.status.converters;

import org.mythtv.services.api.v025.status.beans.Job.Flag;
import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

/**
 * @author Daniel Frey
 *
 */
public class JobFlagMatcher implements Matcher {

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Matcher#match(java.lang.Class)
	 */
	@Override
	public Transform match( Class type ) throws Exception {
        
		if( type == Flag.class ) {
            return new JobFlagTransform();
        }
        
		return null;
	}

}
