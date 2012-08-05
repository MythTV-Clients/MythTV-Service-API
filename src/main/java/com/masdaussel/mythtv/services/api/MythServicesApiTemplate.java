/**
 *  This file is part of MythTV Service API for Java
 * 
 *  MythTV Service API for Java is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV Service API for Java is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV Service API for Java.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/tafypz/MythTV-Service-API.git>
 *
 */
package com.masdaussel.mythtv.services.api;

import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.web.client.RestTemplate;

import com.masdaussel.mythtv.services.api.capture.CaptureOperations;
import com.masdaussel.mythtv.services.api.capture.impl.CaptureTemplate;
import com.masdaussel.mythtv.services.api.channel.ChannelOperations;
import com.masdaussel.mythtv.services.api.channel.impl.ChannelTemplate;
import com.masdaussel.mythtv.services.api.content.ContentOperations;
import com.masdaussel.mythtv.services.api.content.impl.ContentTemplate;
import com.masdaussel.mythtv.services.api.dvr.DvrOperations;
import com.masdaussel.mythtv.services.api.dvr.impl.DvrTemplate;
import com.masdaussel.mythtv.services.api.frontend.FrontendOperations;
import com.masdaussel.mythtv.services.api.frontend.impl.FrontendTemplate;
import com.masdaussel.mythtv.services.api.guide.GuideOperations;
import com.masdaussel.mythtv.services.api.guide.impl.GuideTemplate;
import com.masdaussel.mythtv.services.api.myth.MythOperations;
import com.masdaussel.mythtv.services.api.myth.impl.MythTemplate;
import com.masdaussel.mythtv.services.api.video.VideoOperations;
import com.masdaussel.mythtv.services.api.video.impl.VideoTemplate;

/**
 * @author sebastien
 * 
 */
public class MythServicesApiTemplate implements MythServicesApi {

	private final String		apiUrlBase;
	private final RestTemplate	restTemplate;

	private CaptureOperations	captureOperations;
	private ChannelOperations	channelOperations;
	private ContentOperations	contentOperations;
	private DvrOperations		dvrOperations;
	private FrontendOperations	frontendOperations;
	private GuideOperations		guideOperations;
	private MythOperations		mythOperations;
	private VideoOperations		videoOperations;

	public MythServicesApiTemplate(final String apiUrlBase) {
		this.apiUrlBase = apiUrlBase;

		restTemplate = new RestTemplate(true, ClientHttpRequestFactorySelector.getRequestFactory());
		// restTemplate.setMessageConverters( getMessageConverters() );

		getRestTemplate().setErrorHandler(new MythServicesApiErrorHandler());
		initSubApis();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.MythServicesApi#captureOperations()
	 */
	@Override
	public CaptureOperations captureOperations() {
		return captureOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.MythServicesApi#channelOperations()
	 */
	@Override
	public ChannelOperations channelOperations() {
		return channelOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.MythServicesApi#contentOperations()
	 */
	@Override
	public ContentOperations contentOperations() {
		return contentOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.MythServicesApi#dvrOperations()
	 */
	@Override
	public DvrOperations dvrOperations() {
		return dvrOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.MythServicesApi#frontendOperations()
	 */
	@Override
	public FrontendOperations frontendOperations() {
		return frontendOperations;
	}

	private String getApiUrlBase() {
		return apiUrlBase;
	}

	private RestTemplate getRestTemplate() {
		return restTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.MythServicesApi#guideOperations()
	 */
	@Override
	public GuideOperations guideOperations() {
		return guideOperations;
	}

	// private helper

	private void initSubApis() {
		captureOperations = new CaptureTemplate(getRestTemplate(), getApiUrlBase());
		channelOperations = new ChannelTemplate(getRestTemplate(), getApiUrlBase());
		contentOperations = new ContentTemplate(getRestTemplate(), getApiUrlBase());
		dvrOperations = new DvrTemplate(getRestTemplate(), getApiUrlBase());
		frontendOperations = new FrontendTemplate(getRestTemplate(), getApiUrlBase());
		guideOperations = new GuideTemplate(getRestTemplate(), getApiUrlBase());
		mythOperations = new MythTemplate(getRestTemplate(), getApiUrlBase());
		videoOperations = new VideoTemplate(getRestTemplate(), getApiUrlBase());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.MythServicesApi#mythOperations()
	 */
	@Override
	public MythOperations mythOperations() {
		return mythOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.MythServicesApi#videoOperations()
	 */
	@Override
	public VideoOperations videoOperations() {
		return videoOperations;
	}

}
