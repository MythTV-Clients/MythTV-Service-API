package org.mythtv.services.api.v027.impl;
import org.mythtv.services.api.AbstractOperations;

/**
 * @author Sebastien Astie
 * 
 */
class AbstractChannelOperations extends AbstractOperations {

	public AbstractChannelOperations( String apiUrlBase ) {
		super( apiUrlBase );
	}

	protected String getApiUrlBase() {
		return super.getApiUrlBase() + "Channel/";
	}

}
