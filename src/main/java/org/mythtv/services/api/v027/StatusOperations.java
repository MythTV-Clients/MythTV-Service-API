/**
 * 
 */
package org.mythtv.services.api.v027;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.status.beans.BackendStatus;
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
	ResponseEntity<BackendStatus> getStatus( ETagInfo etag ) throws MythServiceApiRuntimeException;
	
}
