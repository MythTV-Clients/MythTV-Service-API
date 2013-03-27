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

import java.util.logging.Level;

import org.joda.time.DateTime;
import org.mythtv.services.api.converters.JodaDateTimeTransform;
import org.mythtv.services.api.status.Job.Command;
import org.mythtv.services.api.status.Job.Flag;
import org.mythtv.services.api.status.Job.Status;
import org.mythtv.services.api.status.Job.Type;
import org.mythtv.services.api.status.converters.JobCommandTransform;
import org.mythtv.services.api.status.converters.JobFlagTransform;
import org.mythtv.services.api.status.converters.JobStatusTransform;
import org.mythtv.services.api.status.converters.JobTypeTransform;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;
import org.simpleframework.xml.transform.RegistryMatcher;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
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
	
	public MythServicesTemplate( String apiUrlBase, Level logLevel) {
		super(apiUrlBase, logLevel);
	}
	
	@Override
	protected RestOperations createRestOperations() {
		RestTemplate rest = new RestTemplate( true );
		
		for( HttpMessageConverter messageConverter : rest.getMessageConverters() ) {

			if( messageConverter instanceof MappingJackson2HttpMessageConverter ) {
				
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.registerModule( new JodaModule() );
				
				MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = (MappingJackson2HttpMessageConverter) messageConverter;
				mappingJackson2HttpMessageConverter.setObjectMapper( objectMapper );
			}
		
			if( messageConverter instanceof SimpleXmlHttpMessageConverter ) {

				RegistryMatcher matchers = new RegistryMatcher();
				matchers.bind( DateTime.class, JodaDateTimeTransform.class );
				matchers.bind( Command.class, JobCommandTransform.class );
				matchers.bind( Flag.class, JobFlagTransform.class );
				matchers.bind( Status.class, JobStatusTransform.class );
				matchers.bind( Type.class, JobTypeTransform.class );
						
				Strategy strategy = new AnnotationStrategy();
				Serializer serializer = new Persister( strategy, matchers );

				SimpleXmlHttpMessageConverter simpleXmlHttpMessageConverter = (SimpleXmlHttpMessageConverter) messageConverter;
				simpleXmlHttpMessageConverter.setSerializer( serializer );
			}
		}
		
		rest.setErrorHandler( new MythServicesErrorHandler() );
		return rest;
	}
}
