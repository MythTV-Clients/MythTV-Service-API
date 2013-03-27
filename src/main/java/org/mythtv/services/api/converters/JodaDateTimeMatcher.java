/**
 * 
 */
package org.mythtv.services.api.converters;

import org.joda.time.DateTime;
import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

/**
 * @author Daniel Frey
 *
 */
public class JodaDateTimeMatcher implements Matcher {

	/* (non-Javadoc)
	 * @see org.simpleframework.xml.transform.Matcher#match(java.lang.Class)
	 */
	@Override
	public Transform match( Class type ) throws Exception {
        if( type == DateTime.class ) {
            return new JodaDateTimeTransform();
        }
        return null;
	}

}
