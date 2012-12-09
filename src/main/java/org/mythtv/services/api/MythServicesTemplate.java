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
package org.mythtv.services.api;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

/**
 * @author Daniel Frey
 * 
 */
public class MythServicesTemplate extends BaseMythServicesTemplate {

	public MythServicesTemplate( String apiUrlBase ) {
		super(apiUrlBase);
	}
	
	@Override
	protected RestOperations createRestOperations() {
		RestTemplate rest = new RestTemplate( true );
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule( new JodaModule() );
		
		for( HttpMessageConverter messageConverter : rest.getMessageConverters() ) {
			if( messageConverter instanceof MappingJackson2HttpMessageConverter ) {
				MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = (MappingJackson2HttpMessageConverter) messageConverter;
				mappingJackson2HttpMessageConverter.setObjectMapper( objectMapper );
			}
		
		}
		
		rest.setErrorHandler( new MythServicesErrorHandler() );
		return rest;
	}
}
