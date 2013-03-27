/**
 * 
 */
package org.mythtv.services.api.status;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.springframework.http.ResponseEntity;

/**
 * @author Daniel Frey
 *
 */
public interface StatusOperations {

	/**
	 * - GET
	 * 
	 * @return
	 */
	ResponseEntity<Status> getStatus( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
}
