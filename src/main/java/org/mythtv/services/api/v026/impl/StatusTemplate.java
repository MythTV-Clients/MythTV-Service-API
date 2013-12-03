/**
 * 
 */
package org.mythtv.services.api.v026.impl;

import org.mythtv.services.api.AbstractOperations;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.StatusOperations;
import org.mythtv.services.api.v026.status.beans.BackendStatus;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;

/**
 * @author Daniel Frey
 * @author Sebastien Astie
 *
 */
public class StatusTemplate extends AbstractOperations implements StatusOperations {
    
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
		super( apiUrlBase + "Status/" );
		this.restOperations = restOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.status.StatusOperations#getStatus()
	 */
	@Override
	public ResponseEntity<BackendStatus> getStatus( ETagInfo etag ) throws MythServiceApiRuntimeException {

		try {
			ResponseEntity<BackendStatus> responseEntity = restOperations.exchange( buildUri( Endpoint.GET_STATUS.getEndpoint() ), HttpMethod.GET, getRequestEntity( etag, MediaType.APPLICATION_XML ), BackendStatus.class );

			return responseEntity;
		} catch( Exception e ) {
			throw new MythServiceApiRuntimeException( e );
		}
		
	}

}
