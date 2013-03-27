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

import org.mythtv.services.api.capture.CaptureOperations;
import org.mythtv.services.api.capture.impl.CaptureTemplate;
import org.mythtv.services.api.channel.ChannelOperations;
import org.mythtv.services.api.channel.impl.ChannelTemplate;
import org.mythtv.services.api.content.ContentOperations;
import org.mythtv.services.api.content.impl.ContentTemplate;
import org.mythtv.services.api.dvr.DvrOperations;
import org.mythtv.services.api.dvr.impl.DvrTemplate;
import org.mythtv.services.api.frontend.FrontendOperations;
import org.mythtv.services.api.frontend.impl.FrontendTemplate;
import org.mythtv.services.api.guide.GuideOperations;
import org.mythtv.services.api.guide.impl.GuideTemplate;
import org.mythtv.services.api.myth.MythOperations;
import org.mythtv.services.api.myth.impl.MythTemplate;
import org.mythtv.services.api.status.StatusOperations;
import org.mythtv.services.api.status.impl.StatusTemplate;
import org.mythtv.services.api.video.VideoOperations;
import org.mythtv.services.api.video.impl.VideoTemplate;
import org.springframework.web.client.RestOperations;

/**
 * @author Sebastien Astie
 *
 */
public abstract class BaseMythServicesTemplate implements MythServices {

	private final String apiUrlBase;
	private final RestOperations restOperations;

	private CaptureOperations captureOperations;
	private ChannelOperations channelOperations;
	private ContentOperations contentOperations;
	private DvrOperations dvrOperations;
	private FrontendOperations frontendOperations;
	private GuideOperations guideOperations;
	private MythOperations mythOperations;
	private StatusOperations statusOperations;
	private VideoOperations videoOperations;

	public BaseMythServicesTemplate( String apiUrlBase ) {
		this(apiUrlBase, Level.INFO);
	}
	
	public BaseMythServicesTemplate( String apiUrlBase, Level logLevel ) {
		AbstractOperations.setLogLevel(logLevel);
		this.apiUrlBase = apiUrlBase;
		this.restOperations = createRestOperations();
		initSubApis();
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

	// protected helper
	protected abstract RestOperations createRestOperations();
	
	// private helper

	private String getApiUrlBase() {
		return apiUrlBase;
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
