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
package org.mythtv.services.api.test.v026.connect;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.joda.time.DateTime;
import org.mythtv.services.api.converters.JodaDateTimeTransform;
import org.mythtv.services.api.v026.beans.Job.Command;
import org.mythtv.services.api.v026.beans.Job.Flag;
import org.mythtv.services.api.v026.beans.Job.Status;
import org.mythtv.services.api.v026.beans.Job.Type;
import org.mythtv.services.api.v026.status.converters.JobCommandTransform;
import org.mythtv.services.api.v026.status.converters.JobFlagTransform;
import org.mythtv.services.api.v026.status.converters.JobStatusTransform;
import org.mythtv.services.api.v026.status.converters.JobTypeTransform;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;
import org.simpleframework.xml.transform.RegistryMatcher;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriTemplate;
import org.springframework.web.util.UriUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

/**
 * @author Sebastien Astie
 *
 */
public class FakeMythTvRestTemplate implements RestOperations {

	private MythFakeHttpResponseFactory mythResponseFactory;
	
	private List<HttpMessageConverter<?>> messageConverters;
	/**
	 * 
	 */
	public FakeMythTvRestTemplate() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule( new JodaModule() );
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter.setObjectMapper( objectMapper );
		
		RegistryMatcher matchers = new RegistryMatcher();
		matchers.bind( DateTime.class, JodaDateTimeTransform.class );
		matchers.bind( Command.class, JobCommandTransform.class );
		matchers.bind( Flag.class, JobFlagTransform.class );
		matchers.bind( Status.class, JobStatusTransform.class );
		matchers.bind( Type.class, JobTypeTransform.class );
				
		Strategy strategy = new AnnotationStrategy();
		Serializer serializer = new Persister( strategy, matchers );
		
		messageConverters = new ArrayList<HttpMessageConverter<?>>();
		messageConverters.add(new ByteArrayHttpMessageConverter());
		messageConverters.add(new StringHttpMessageConverter());
		messageConverters.add(new ResourceHttpMessageConverter());
		messageConverters.add(mappingJackson2HttpMessageConverter);
		messageConverters.add( new SimpleXmlHttpMessageConverter( serializer ) );
		
		mythResponseFactory = MythFakeHttpResponseFactory.getInstance();
	}

	
	// GET

	public <T> T getForObject(String url, Class<T> responseType, Object... urlVariables) throws RestClientException {
		HttpMessageConverterExtractor<T> responseExtractor =
				new HttpMessageConverterExtractor<T>(responseType, getMessageConverters());
		return execute(url, HttpMethod.GET, null, responseExtractor, urlVariables);
	}

	public <T> T getForObject(String url, Class<T> responseType, Map<String, ?> urlVariables) throws RestClientException {
		HttpMessageConverterExtractor<T> responseExtractor =
				new HttpMessageConverterExtractor<T>(responseType, getMessageConverters());
		return execute(url, HttpMethod.GET, null, responseExtractor, urlVariables);
	}

	public <T> T getForObject(URI url, Class<T> responseType) throws RestClientException {
		HttpMessageConverterExtractor<T> responseExtractor =
				new HttpMessageConverterExtractor<T>(responseType, getMessageConverters());
		return execute(url, HttpMethod.GET, null, responseExtractor);
	}

	public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Object... urlVariables)
			throws RestClientException {
		ResponseEntityResponseExtractor<T> responseExtractor =
				new ResponseEntityResponseExtractor<T>(responseType);
		return execute(url, HttpMethod.GET, null, responseExtractor, urlVariables);
	}

	public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Map<String, ?> urlVariables)
			throws RestClientException {
		ResponseEntityResponseExtractor<T> responseExtractor =
				new ResponseEntityResponseExtractor<T>(responseType);
		return execute(url, HttpMethod.GET, null, responseExtractor, urlVariables);
	}

	public <T> ResponseEntity<T> getForEntity(URI url, Class<T> responseType) throws RestClientException {
		ResponseEntityResponseExtractor<T> responseExtractor =
				new ResponseEntityResponseExtractor<T>(responseType);
		return execute(url, HttpMethod.GET, null, responseExtractor);
	}

	// HEAD

	public HttpHeaders headForHeaders(String url, Object... urlVariables) throws RestClientException {
		return execute(url, HttpMethod.HEAD, null, null, urlVariables);
	}

	public HttpHeaders headForHeaders(String url, Map<String, ?> urlVariables) throws RestClientException {
		return execute(url, HttpMethod.HEAD, null, null, urlVariables);
	}

	public HttpHeaders headForHeaders(URI url) throws RestClientException {
		return execute(url, HttpMethod.HEAD, null, null);
	}

	// POST

	public URI postForLocation(String url, Object request, Object... urlVariables) throws RestClientException {
		HttpHeaders headers = execute(url, HttpMethod.POST, null, null, urlVariables);
		return headers.getLocation();
	}

	public URI postForLocation(String url, Object request, Map<String, ?> urlVariables)
			throws RestClientException {
		HttpHeaders headers = execute(url, HttpMethod.POST, null, null, urlVariables);
		return headers.getLocation();
	}

	public URI postForLocation(URI url, Object request) throws RestClientException {
		HttpHeaders headers = execute(url, HttpMethod.POST, null, null);
		return headers.getLocation();
	}

	public <T> T postForObject(String url, Object request, Class<T> responseType, Object... uriVariables)
			throws RestClientException {
		HttpMessageConverterExtractor<T> responseExtractor =
				new HttpMessageConverterExtractor<T>(responseType, getMessageConverters());
		return execute(url, HttpMethod.POST, null, responseExtractor, uriVariables);
	}

	public <T> T postForObject(String url, Object request, Class<T> responseType, Map<String, ?> uriVariables)
			throws RestClientException {
		HttpMessageConverterExtractor<T> responseExtractor =
				new HttpMessageConverterExtractor<T>(responseType, getMessageConverters());
		return execute(url, HttpMethod.POST, null, responseExtractor, uriVariables);
	}

	public <T> T postForObject(URI url, Object request, Class<T> responseType) throws RestClientException {
		HttpMessageConverterExtractor<T> responseExtractor =
				new HttpMessageConverterExtractor<T>(responseType, getMessageConverters());
		return execute(url, HttpMethod.POST, null, responseExtractor);
	}

	public <T> ResponseEntity<T> postForEntity(String url, Object request, Class<T> responseType, Object... uriVariables)
			throws RestClientException {
		ResponseEntityResponseExtractor<T> responseExtractor =
				new ResponseEntityResponseExtractor<T>(responseType);
		return execute(url, HttpMethod.POST, null, responseExtractor, uriVariables);
	}

	public <T> ResponseEntity<T> postForEntity(String url,
										   Object request,
										   Class<T> responseType,
										   Map<String, ?> uriVariables)
			throws RestClientException {
		ResponseEntityResponseExtractor<T> responseExtractor =
				new ResponseEntityResponseExtractor<T>(responseType);
		return execute(url, HttpMethod.POST, null, responseExtractor, uriVariables);
	}

	public <T> ResponseEntity<T> postForEntity(URI url, Object request, Class<T> responseType) throws RestClientException {
		ResponseEntityResponseExtractor<T> responseExtractor =
				new ResponseEntityResponseExtractor<T>(responseType);
		return execute(url, HttpMethod.POST, null, responseExtractor);
	}

	// PUT

	public void put(String url, Object request, Object... urlVariables) throws RestClientException {
		execute(url, HttpMethod.PUT, null, null, urlVariables);
	}

	public void put(String url, Object request, Map<String, ?> urlVariables) throws RestClientException {
		execute(url, HttpMethod.PUT, null, null, urlVariables);
	}

	public void put(URI url, Object request) throws RestClientException {
		execute(url, HttpMethod.PUT, null, null);
	}

	// DELETE

	public void delete(String url, Object... urlVariables) throws RestClientException {
		execute(url, HttpMethod.DELETE, null, null, urlVariables);
	}

	public void delete(String url, Map<String, ?> urlVariables) throws RestClientException {
		execute(url, HttpMethod.DELETE, null, null, urlVariables);
	}

	public void delete(URI url) throws RestClientException {
		execute(url, HttpMethod.DELETE, null, null);
	}

	// OPTIONS

	public Set<HttpMethod> optionsForAllow(String url, Object... urlVariables) throws RestClientException {
		return null;
	}

	public Set<HttpMethod> optionsForAllow(String url, Map<String, ?> urlVariables) throws RestClientException {
		return null;
	}

	public Set<HttpMethod> optionsForAllow(URI url) throws RestClientException {
		return null;
	}

	// exchange

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method,
			HttpEntity<?> requestEntity, Class<T> responseType, Object... uriVariables) throws RestClientException {
		ResponseEntityResponseExtractor<T> responseExtractor = new ResponseEntityResponseExtractor<T>(responseType);
		return execute(url, method, null, responseExtractor, uriVariables);
	}

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method,
			HttpEntity<?> requestEntity, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
		ResponseEntityResponseExtractor<T> responseExtractor = new ResponseEntityResponseExtractor<T>(responseType);
		return execute(url, method, null, responseExtractor, uriVariables);
	}

	public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity, 
			Class<T> responseType) throws RestClientException {
		ResponseEntityResponseExtractor<T> responseExtractor = new ResponseEntityResponseExtractor<T>(responseType);
		return execute(url, method, null, responseExtractor);
	}

	// general execution

	public <T> T execute(String url, HttpMethod method, RequestCallback requestCallback,
			ResponseExtractor<T> responseExtractor, Object... urlVariables) throws RestClientException {

		UriTemplate uriTemplate = new HttpUrlTemplate(url);
		URI expanded = uriTemplate.expand(urlVariables);
		return doExecute(expanded, method, requestCallback, responseExtractor);
	}

	public <T> T execute(String url, HttpMethod method, RequestCallback requestCallback,
			ResponseExtractor<T> responseExtractor, Map<String, ?> urlVariables) throws RestClientException {

		UriTemplate uriTemplate = new HttpUrlTemplate(url);
		URI expanded = uriTemplate.expand(urlVariables);
		return doExecute(expanded, method, requestCallback, responseExtractor);
	}

	public <T> T execute(URI url, HttpMethod method, RequestCallback requestCallback,
			ResponseExtractor<T> responseExtractor) throws RestClientException {

		return doExecute(url, method, requestCallback, responseExtractor);
	}
	
	/** Returns the message body converters. These converters are used to convert from and to HTTP requests and responses. */
	public List<HttpMessageConverter<?>> getMessageConverters() {
		return this.messageConverters;
	}
	
	/**
	 * Execute the given method on the provided URI. The {@link ClientHttpRequest} is processed using the {@link
	 * RequestCallback}; the response with the {@link ResponseExtractor}.
	 * @param url the fully-expanded URL to connect to
	 * @param method the HTTP method to execute (GET, POST, etc.)
	 * @param requestCallback object that prepares the request (can be <code>null</code>)
	 * @param responseExtractor object that extracts the return value from the response (can be <code>null</code>)
	 * @return an arbitrary object, as returned by the {@link ResponseExtractor}
	 */
	protected <T> T doExecute(URI url, HttpMethod method, RequestCallback requestCallback,
			ResponseExtractor<T> responseExtractor) throws RestClientException {

		MythFakeHttpInputMessage response = null;
		try {
			
			response = mythResponseFactory.getResponseMessage(url);
	
			if (responseExtractor != null) {
				return responseExtractor.extractData(response);
			}
			else {
				return null;
			}
		}
		catch (IOException ex) {
			throw new ResourceAccessException("I/O error: " + ex.getMessage(), ex);
		}
		finally {
			if (response != null) {
				response.close();
			}
		}
	}
	
	private class ResponseEntityResponseExtractor<T> implements ResponseExtractor<ResponseEntity<T>> {

		private final HttpMessageConverterExtractor<T> delegate;

		public ResponseEntityResponseExtractor(Class<T> responseType) {
			if (responseType != null && !Void.class.equals(responseType)) {
				this.delegate = new HttpMessageConverterExtractor<T>(responseType, getMessageConverters());
			} else {
				this.delegate = null;
			}
		}

		public ResponseEntity<T> extractData(ClientHttpResponse response) throws IOException {
			if (delegate != null) {
				T body = delegate.extractData(response);
				return new ResponseEntity<T>(body, response.getHeaders(), response.getStatusCode());
			}
			else {
				return new ResponseEntity<T>(response.getHeaders(), response.getStatusCode());
			}
		}
		
	}
	
	/**
	 * HTTP-specific subclass of UriTemplate, overriding the encode method.
	 */
	private static class HttpUrlTemplate extends UriTemplate {
		
		private static final long serialVersionUID = 1L;

		public HttpUrlTemplate(String uriTemplate) {
			super(uriTemplate);
		}

		@Override
		@SuppressWarnings("deprecation")
		protected URI encodeUri(String uri) {
			try {
				String encoded = UriUtils.encodeHttpUrl(uri, "UTF-8");
				return new URI(encoded);
			}
			catch (UnsupportedEncodingException ex) {
				// should not happen, UTF-8 is always supported
				throw new IllegalStateException(ex);
			}
			catch (URISyntaxException ex) {
				throw new IllegalArgumentException("Could not create HTTP URL from [" + uri + "]: " + ex, ex);
			}
		}
	}

}
