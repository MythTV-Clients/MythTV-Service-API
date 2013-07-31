package org.mythtv.services.api.v027.impl;
import org.mythtv.services.api.AbstractOperations;

/**
 * @author Sebastien Astie
 * 
 */
class AbstractMythOperations extends AbstractOperations {

	public AbstractMythOperations( String apiUrlBase ) {
		super( apiUrlBase );
	}

	protected String getApiUrlBase() {
		return super.getApiUrlBase() + "Myth/";
	}

}
