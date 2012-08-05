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
package com.masdaussel.mythtv.services.api.frontend.impl;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.masdaussel.mythtv.services.api.frontend.FrontendActionList;
import com.masdaussel.mythtv.services.api.frontend.FrontendOperations;
import com.masdaussel.mythtv.services.api.frontend.FrontendStatus;
import com.masdaussel.mythtv.services.api.utils.Bool;

/**
 * @author sebastien
 * 
 */
public class FrontendTemplate extends AbstractFrontendOperations implements FrontendOperations {

	private final RestTemplate	restTemplate;

	public FrontendTemplate(final RestTemplate restTemplate, final String apiUrlBase) {
		super(apiUrlBase);
		this.restTemplate = restTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.frontend.FrontendOperations#getActionList
	 * (java.lang.String)
	 */
	@Override
	public FrontendActionList getActionList(final String frontedApiUrlBase) {

		final ResponseEntity<FrontendActionList> responseEntity = restTemplate.exchange(buildUri(frontedApiUrlBase + "/Frontend/GetActionList"),
				HttpMethod.GET, getRequestEntity(), FrontendActionList.class);
		final FrontendActionList frontendActionList = responseEntity.getBody();

		return frontendActionList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.frontend.FrontendOperations#getStatus
	 * (java.lang.String)
	 */
	@Override
	public FrontendStatus getStatus(final String frontedApiUrlBase) {

		final ResponseEntity<FrontendStatus> responseEntity = restTemplate.exchange(frontedApiUrlBase + "/Frontend/GetStatus", HttpMethod.GET,
				getRequestEntity(), FrontendStatus.class);
		final FrontendStatus frontendStatus = responseEntity.getBody();

		return frontendStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.frontend.FrontendOperations#sendAction
	 * (java.lang.String, java.lang.String, java.lang.String, int, int)
	 */
	@Override
	public boolean sendAction(final String frontedApiUrlBase, final String action, final String file, final int width, final int height) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Action", action);
		if (null != file)
			parameters.add("File", file);
		if ((width > 0) && (height > 0)) {
			parameters.add("Width", "" + width);
			parameters.add("Height", "" + height);
		}

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri(frontedApiUrlBase + "/Frontend/SendAction", parameters), HttpMethod.GET,
				getRequestEntity(), Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.masdaussel.mythtv.services.api.frontend.FrontendOperations#sendMessage
	 * (java.lang.String, java.lang.String)
	 */
	@Override
	public boolean sendMessage(final String frontedApiUrlBase, final String message) {

		final LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("Message", message);

		final ResponseEntity<Bool> responseEntity = restTemplate.exchange(buildUri(frontedApiUrlBase + "/Frontend/SendMessage", parameters), HttpMethod.GET,
				getRequestEntity(), Bool.class);
		final Bool bool = responseEntity.getBody();

		return bool.getBool();
	}

}
