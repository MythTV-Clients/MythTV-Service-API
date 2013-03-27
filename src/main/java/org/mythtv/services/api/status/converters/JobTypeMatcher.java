/**
 * 
 */
package org.mythtv.services.api.status.converters;

import org.mythtv.services.api.status.Job.Type;
import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

/**
 * @author Daniel Frey
 *
 */
public class JobTypeMatcher implements Matcher {

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Matcher#match(java.lang.Class)
	 */
	@Override
	public Transform match( Class type ) throws Exception {
        
		if( type == Type.class ) {
            return new JobTypeTransform();
        }
        
		return null;
	}

}
