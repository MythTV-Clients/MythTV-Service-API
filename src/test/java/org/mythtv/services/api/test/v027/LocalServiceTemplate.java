/**
 *  This file is part of MythTV for Android
 * 
 *  MythTV for Android is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV for Android is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV for Android.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/MythTV-Android/MythTV-Service-API/>
 *
 */
package org.mythtv.services.api.test.v027;

import org.mythtv.services.api.test.v027.connect.FakeMythTvRestTemplate;
import org.mythtv.services.api.v027.MythServicesTemplate;
import org.springframework.web.client.RestOperations;

import java.util.logging.Level;

/**
 * @author Sebastien Astie
 *
 */
public class LocalServiceTemplate extends MythServicesTemplate {

	/**
	 * @param apiUrlBase
	 */
	public LocalServiceTemplate( String apiUrlBase ) {
		this( apiUrlBase, Level.INFO );
	}
	
	public LocalServiceTemplate( String apiUrlBase, Level logLevel ) {
		super( apiUrlBase, logLevel );
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.BaseMythServicesTemplate#createRestOperations()
	 */
	protected RestOperations createRestOperations() {
		FakeMythTvRestTemplate rest = new FakeMythTvRestTemplate();
        initMessageConverters( rest.getMessageConverters() );
        return rest;
	}

}
