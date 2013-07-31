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
package org.mythtv.services.api.v026;

import java.util.logging.Level;

import org.joda.time.DateTime;
import org.mythtv.services.api.BaseMythServicesTemplate;
import org.mythtv.services.api.MythServicesErrorHandler;
import org.mythtv.services.api.converters.JodaDateTimeTransform;
import org.mythtv.services.api.v026.beans.Job.Command;
import org.mythtv.services.api.v026.beans.Job.Flag;
import org.mythtv.services.api.v026.beans.Job.Status;
import org.mythtv.services.api.v026.beans.Job.Type;
import org.mythtv.services.api.v026.impl.CaptureTemplate;
import org.mythtv.services.api.v026.impl.ChannelTemplate;
import org.mythtv.services.api.v026.impl.ContentTemplate;
import org.mythtv.services.api.v026.impl.DvrTemplate;
import org.mythtv.services.api.v026.impl.FrontendTemplate;
import org.mythtv.services.api.v026.impl.GuideTemplate;
import org.mythtv.services.api.v026.impl.MythTemplate;
import org.mythtv.services.api.v026.impl.StatusTemplate;
import org.mythtv.services.api.v026.impl.VideoTemplate;
import org.mythtv.services.api.v026.status.converters.JobCommandTransform;
import org.mythtv.services.api.v026.status.converters.JobFlagTransform;
import org.mythtv.services.api.v026.status.converters.JobStatusTransform;
import org.mythtv.services.api.v026.status.converters.JobTypeTransform;
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
 * @author Sebastien Astie
 */
public class MythServicesTemplate extends BaseMythServicesTemplate implements MythServices {

	private CaptureOperations captureOperations;
	private ChannelOperations channelOperations;
	private ContentOperations contentOperations;
	private DvrOperations dvrOperations;
	private FrontendOperations frontendOperations;
	private GuideOperations guideOperations;
	private MythOperations mythOperations;
	private StatusOperations statusOperations;
	private VideoOperations videoOperations;
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
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.MythServices#captureOperations()
	 */
	@Override
	public CaptureOperations captureOperations() {
		return captureOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.MythServices#channelOperations()
	 */
	@Override
	public ChannelOperations channelOperations() {
		return channelOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.MythServices#contentOperations()
	 */
	@Override
	public ContentOperations contentOperations() {
		return contentOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.MythServices#dvrOperations()
	 */
	@Override
	public DvrOperations dvrOperations() {
		return dvrOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.MythServices#frontendOperations()
	 */
	@Override
	public FrontendOperations frontendOperations() {
		return frontendOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.MythServices#guideOperations()
	 */
	@Override
	public GuideOperations guideOperations() {
		return guideOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.MythServices#mythOperations()
	 */
	@Override
	public MythOperations mythOperations() {
		return mythOperations;
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.MythServices#statusOperations()
	 */
	@Override
	public StatusOperations statusOperations() {
		return statusOperations;
	}
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.MythServices#videoOperations()
	 */
	@Override
	public VideoOperations videoOperations() {
		return videoOperations;
	}
	
	private RestOperations getRestOperations() {
		return restOperations;
	}
	
	private void initSubApis() {
		this.captureOperations = new CaptureTemplate( getRestOperations(), getApiUrlBase() );
		this.channelOperations = new ChannelTemplate( getRestOperations(), getApiUrlBase() );
		this.contentOperations = new ContentTemplate( getRestOperations(), getApiUrlBase() );
		this.dvrOperations = new DvrTemplate( getRestOperations(), getApiUrlBase() );
		this.frontendOperations = new FrontendTemplate( getRestOperations(), getApiUrlBase() );
		this.guideOperations = new GuideTemplate( getRestOperations(), getApiUrlBase() );
		this.mythOperations = new MythTemplate( getRestOperations(), getApiUrlBase() );
		this.statusOperations = new StatusTemplate( getRestOperations(), getApiUrlBase() );
		this.videoOperations = new VideoTemplate( getRestOperations(), getApiUrlBase() );
	}
}
