package org.mythtv.services.api.v027.impl;
import org.mythtv.services.api.AbstractOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
class AbstractDvrOperations extends AbstractOperations {

	public AbstractDvrOperations( String apiUrlBase ) {
		super( apiUrlBase );
	}

	protected String getApiUrlBase() {
		return super.getApiUrlBase() + "Dvr/";
	}

}
