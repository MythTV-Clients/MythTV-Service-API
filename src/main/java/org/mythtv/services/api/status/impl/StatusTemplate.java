/**
 * 
 */
package org.mythtv.services.api.status.impl;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.status.Status;
import org.mythtv.services.api.status.StatusOperations;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 *
 */
public class StatusTemplate extends AbstractStatusOperations implements StatusOperations {

	public enum Endpoint {
		GET_STATUS( "GetStatus" );
		
		private String endpoint;
		
		private Endpoint( String endpoint ) {
			this.endpoint = endpoint;
		}
		
		public String getEndpoint() {
			return endpoint;
		}
		
	}
	
	private final RestOperations restOperations;

	public StatusTemplate( RestOperations restOperations, String apiUrlBase ) {
		super( apiUrlBase );
		this.restOperations = restOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.status.StatusOperations#getStatus()
	 */
	@Override
	public ResponseEntity<Status> getStatus( ETagInfo etag ) throws MythServiceApiRuntimeException {

		ResponseEntity<Status> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_STATUS.getEndpoint() ), HttpMethod.GET, getRequestEntity( etag, MediaType.APPLICATION_XML ), Status.class );

		return responseEntity;
	}

}