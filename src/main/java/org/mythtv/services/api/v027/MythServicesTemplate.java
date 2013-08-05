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
package org.mythtv.services.api.v027;

import java.util.logging.Level;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import org.joda.time.DateTime;
import org.mythtv.services.api.ArrayOfString;
import org.mythtv.services.api.BaseMythServicesTemplate;
import org.mythtv.services.api.MythServicesErrorHandler;
import org.mythtv.services.api.converters.JodaDateTimeTransform;
import org.mythtv.services.api.converters.ArrayOfStringConverter;
import org.mythtv.services.api.v027.impl.CaptureTemplate;
import org.mythtv.services.api.v027.impl.ChannelTemplate;
import org.mythtv.services.api.v027.impl.ContentTemplate;
import org.mythtv.services.api.v027.impl.DvrTemplate;
import org.mythtv.services.api.v027.impl.GuideTemplate;
import org.mythtv.services.api.v027.impl.MythTemplate;
import org.mythtv.services.api.v027.impl.VideoTemplate;
import org.mythtv.services.api.v027.impl.FrontendTemplate;
import org.mythtv.services.api.v027.impl.StatusTemplate;
import org.mythtv.services.api.v027.status.beans.Job.Command;
import org.mythtv.services.api.v027.status.beans.Job.Flag;
import org.mythtv.services.api.v027.status.beans.Job.Status;
import org.mythtv.services.api.v027.status.beans.Job.Type;
import org.mythtv.services.api.v027.status.converters.JobCommandTransform;
import org.mythtv.services.api.v027.status.converters.JobFlagTransform;
import org.mythtv.services.api.v027.status.converters.JobStatusTransform;
import org.mythtv.services.api.v027.status.converters.JobTypeTransform;
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

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class MythServicesTemplate extends BaseMythServicesTemplate implements MythServices {

	private CaptureOperations captureOperations;
	private ChannelOperations channelOperations;
	private ContentOperations contentOperations;
	private DvrOperations dvrOperations;
	private GuideOperations guideOperations;
	private MythOperations mythOperations;
	private VideoOperations videoOperations;
	private FrontendOperations frontendOperations;
	private StatusOperations statusOperations;
	protected final RestOperations restOperations;
	
	public MythServicesTemplate( String apiUrlBase ) {
		this(apiUrlBase, Level.INFO);
	}
	
	public MythServicesTemplate( String apiUrlBase, Level logLevel) {
		super(apiUrlBase, logLevel);
		this.restOperations = createRestOperations();
		initSubApis();

	}
	
	protected RestOperations createRestOperations() {
		RestTemplate rest = new RestTemplate( true );
		
		for( HttpMessageConverter<?> messageConverter : rest.getMessageConverters() ) {

			if( messageConverter instanceof MappingJackson2HttpMessageConverter ) {
                StdDelegatingDeserializer<ArrayOfString> delegatingDeserializer = new StdDelegatingDeserializer<ArrayOfString>(new ArrayOfStringConverter());
                SimpleModule customModule = new SimpleModule("org.mythtv.service.api.module", new Version(1, 0, 0, null, null, null)).addDeserializer(ArrayOfString.class, delegatingDeserializer);

                ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.registerModule( new JodaModule() );
                objectMapper.registerModule(customModule);
				objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
				
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


	/*
	 * Capture Operations
	 * @return an instance of a class implementing CaptureOperations
	 */
	@Override
	public CaptureOperations captureOperations() {
		return captureOperations;
	}

	/*
	 * Channel Operations
	 * @return an instance of a class implementing ChannelOperations
	 */
	@Override
	public ChannelOperations channelOperations() {
		return channelOperations;
	}

	/*
	 * Content Operations
	 * @return an instance of a class implementing ContentOperations
	 */
	@Override
	public ContentOperations contentOperations() {
		return contentOperations;
	}

	/*
	 * Dvr Operations
	 * @return an instance of a class implementing DvrOperations
	 */
	@Override
	public DvrOperations dvrOperations() {
		return dvrOperations;
	}

	/*
	 * Guide Operations
	 * @return an instance of a class implementing GuideOperations
	 */
	@Override
	public GuideOperations guideOperations() {
		return guideOperations;
	}

	/*
	 * Myth Operations
	 * @return an instance of a class implementing MythOperations
	 */
	@Override
	public MythOperations mythOperations() {
		return mythOperations;
	}

	/*
	 * Video Operations
	 * @return an instance of a class implementing VideoOperations
	 */
	@Override
	public VideoOperations videoOperations() {
		return videoOperations;
	}

	/*
	 * Frontend Operations
	 * @return an instance of a class implementing FrontendOperations
	 */
	@Override
	public FrontendOperations frontendOperations() {
		return frontendOperations;
	}

	/*
	 * Status Operations
	 * @return an instance of a class implementing StatusOperations
	 */
	@Override
	public StatusOperations statusOperations() {
		return statusOperations;
	}

	private RestOperations getRestOperations() {
		return restOperations;
	}
	
	private void initSubApis() {
		this.captureOperations = new CaptureTemplate( getRestOperations(), getApiUrlBase() );
		this.channelOperations = new ChannelTemplate( getRestOperations(), getApiUrlBase() );
		this.contentOperations = new ContentTemplate( getRestOperations(), getApiUrlBase() );
		this.dvrOperations = new DvrTemplate( getRestOperations(), getApiUrlBase() );
		this.guideOperations = new GuideTemplate( getRestOperations(), getApiUrlBase() );
		this.mythOperations = new MythTemplate( getRestOperations(), getApiUrlBase() );
		this.videoOperations = new VideoTemplate( getRestOperations(), getApiUrlBase() );
		this.frontendOperations = new FrontendTemplate( getRestOperations(), getApiUrlBase() );
		this.statusOperations = new StatusTemplate( getRestOperations(), getApiUrlBase() );
	}

}