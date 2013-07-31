package org.mythtv.services.api.v027.impl;
import org.mythtv.services.api.AbstractOperations;

/**
 * @author Sebastien Astie
 * 
 */
class AbstractGuideOperations extends AbstractOperations {

	public AbstractGuideOperations( String apiUrlBase ) {
		super( apiUrlBase );
	}

	protected String getApiUrlBase() {
		return super.getApiUrlBase() + "Guide/";
	}

}
