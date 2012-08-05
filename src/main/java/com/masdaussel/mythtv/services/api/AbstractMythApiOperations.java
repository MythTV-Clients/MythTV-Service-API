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

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.logging.Logger;

import org.springframework.http.ContentCodingType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @author sebastien
 * 
 */
public abstract class AbstractMythApiOperations {

	private static final String									TAG					= AbstractMythApiOperations.class.getSimpleName();

	protected static final SimpleDateFormat						sdf					= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	private final String										apiUrlBase;

	private final HttpEntity<?>									requestEntity;

	private final Logger										logger;

	private static final LinkedMultiValueMap<String, String>	EMPTY_PARAMETERS	= new LinkedMultiValueMap<String, String>();

	/**
	 * @param apiUrlBase
	 */
	public AbstractMythApiOperations(final String apiUrlBase) {
		this.apiUrlBase = apiUrlBase;
		logger = Logger.getLogger(AbstractMythApiOperations.TAG);

		final HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		requestHeaders.setAcceptEncoding(Collections.singletonList(ContentCodingType.GZIP));

		requestEntity = new HttpEntity<Object>(requestHeaders);
	}

	/**
	 * @param path
	 * @return
	 */
	protected URI buildUri(final String path) {
		logger.info(buildUri(path, AbstractMythApiOperations.EMPTY_PARAMETERS).toString());

		return buildUri(path, AbstractMythApiOperations.EMPTY_PARAMETERS);
	}

	/**
	 * @param path
	 * @param parameters
	 * @return
	 */
	protected URI buildUri(final String path, final MultiValueMap<String, String> parameters) {
		logger.fine("URI : " + URIBuilder.fromUri(getApiUrlBase() + path).queryParams(parameters).build());

		return URIBuilder.fromUri(getApiUrlBase() + path).queryParams(parameters).build();
	}

	/**
	 * @param path
	 * @param parameterName
	 * @param parameterValue
	 * @return
	 */
	protected URI buildUri(final String path, final String parameterName, final String parameterValue) {
		final MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.set(parameterName, parameterValue);

		return buildUri(path, parameters);
	}

	/**
	 * @return
	 */
	protected String getApiUrlBase() {
		return apiUrlBase;
	}

	/**
	 * @return the requestEntity
	 */
	protected HttpEntity<?> getRequestEntity() {
		return requestEntity;
	}

}
