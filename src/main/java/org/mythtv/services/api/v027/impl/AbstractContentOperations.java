package org.mythtv.services.api.v027.impl;
import org.mythtv.services.api.AbstractOperations;

/**
 * @author Sebastien Astie
 * 
 */
class AbstractContentOperations extends AbstractOperations {

	public AbstractContentOperations( String apiUrlBase ) {
		super( apiUrlBase );
	}

	protected String getApiUrlBase() {
		return super.getApiUrlBase() + "Content/";
	}

}
