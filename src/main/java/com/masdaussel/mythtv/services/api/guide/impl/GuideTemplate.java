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
package com.masdaussel.mythtv.services.api.guide.impl;

import java.util.Date;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.masdaussel.mythtv.services.api.AbstractMythApiOperations;
import com.masdaussel.mythtv.services.api.dvr.Program;
import com.masdaussel.mythtv.services.api.guide.GuideOperations;
import com.masdaussel.mythtv.services.api.guide.ProgramGuideWrapper;

/**
 * @author sebastien
 * 
 */
public class GuideTemplate extends AbstractGuideOperations implements GuideOperations {

	private final RestTemplate	restTemplate;

	public GuideTemplate(final RestTemplate restTemplate, final String apiUrlBase) {
		super(apiUrlBase);
		this.restTemplate = restTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.guide.GuideOperations#getChannelIcon
	 * (int, int, int)
	 */
	@Override
	public String getChannelIcon(final int channelId, final int width, final int height) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);

		if (width > 0)
			parameters.add("Width", "" + width);

		if (height > 0)
			parameters.add("Height", "" + height);

		final ResponseEntity<String> responseEntity = restTemplate.exchange(buildUri("GetChannelIcon", parameters), HttpMethod.GET, getRequestEntity(),
				String.class);
		final String icon = responseEntity.getBody();

		return icon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.guide.GuideOperations#getProgramDetails
	 * (int, java.util.Date)
	 */
	@Override
	public Program getProgramDetails(final int channelId, final Date startTime) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("ChanId", "" + channelId);

		if (null != startTime)
			parameters.add("StartTime", AbstractMythApiOperations.sdf.format(startTime));

		final ResponseEntity<Program> responseEntity = restTemplate.exchange(buildUri("GetProgramDetails", parameters), HttpMethod.GET, getRequestEntity(),
				Program.class);
		final Program program = responseEntity.getBody();

		return program;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.guide.GuideOperations#getProgramGuide
	 * (java.util.Date, java.util.Date, int, int, boolean)
	 */
	@Override
	public ProgramGuideWrapper getProgramGuide(final Date start, final Date end, final int startChannelId, final int numberOfChannels, final boolean details) {

		final ResponseEntity<ProgramGuideWrapper> responseEntity = getProgramGuideResponseEntity(start, end, startChannelId, numberOfChannels, details);
		final ProgramGuideWrapper programGuide = responseEntity.getBody();

		return programGuide;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masdaussel.mythtv.services.api.guide.GuideOperations#
	 * getProgramGuideResponseEntity(java.util.Date, java.util.Date, int, int,
	 * boolean)
	 */
	@Override
	public ResponseEntity<ProgramGuideWrapper> getProgramGuideResponseEntity(final Date start, final Date end, final int startChannelId,
			final int numberOfChannels, final boolean details) {
		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("StartTime", AbstractMythApiOperations.sdf.format(start));
		parameters.add("EndTime", AbstractMythApiOperations.sdf.format(end));

		if (startChannelId > 0)
			parameters.add("StartChanId", "" + startChannelId);

		if (numberOfChannels > 0)
			parameters.add("NumChannels", "" + numberOfChannels);

		if (details)
			parameters.add("Details", Boolean.toString(details));

		return restTemplate.exchange(buildUri("GetProgramGuide", parameters), HttpMethod.GET, getRequestEntity(), ProgramGuideWrapper.class);
	}

}
