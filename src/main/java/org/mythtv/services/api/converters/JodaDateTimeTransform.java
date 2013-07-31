/**
 * 
 */
package org.mythtv.services.api.converters;

import java.util.logging.Logger;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.simpleframework.xml.transform.Transform;

/**
 * @author Daniel Frey
 *
 */
public class JodaDateTimeTransform implements Transform<DateTime> {

	private static final String TAG = JodaDateTimeTransform.class.getSimpleName();
	private static final DateTimeFormatter isoFmt =  DateTimeFormat.forPattern( "yyyy-MM-dd'T'HH:mm:ss'Z'" );
	private static final DateTimeFormatter dateFmt =  DateTimeFormat.forPattern( "EEE MM dd yyyy" );
	private static final DateTimeFormatter dateTimeShortFmt =  DateTimeFormat.forPattern( "yyyyMMddHHmmss" );
	
	private final Logger logger;

	public JodaDateTimeTransform() {
		logger = Logger.getLogger( JodaDateTimeTransform.TAG );
	}

	@Override
	public DateTime read( String value ) throws Exception {

		try {			
			return isoFmt.parseDateTime( value ).withZoneRetainFields( DateTimeZone.UTC );
		} catch( Exception e ) {
			//logger.log( Level.WARNING, e.getMessage(), e );
		}

		try {			
			return dateFmt.parseDateTime( value );
		} catch( Exception e ) {
			//logger.log( Level.WARNING, e.getMessage(), e );
		}

		try {			
			return dateTimeShortFmt.parseDateTime( value );
		} catch( Exception e ) {
			//logger.log( Level.WARNING, e.getMessage(), e );
		}

		return null;
	}

	@Override
	public String write( DateTime value ) throws Exception {
		throw new UnsupportedOperationException( "not implemented" );
	}

}
