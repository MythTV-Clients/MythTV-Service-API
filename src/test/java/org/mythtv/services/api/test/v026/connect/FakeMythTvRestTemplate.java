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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.joda.time.DateTime;
import org.mythtv.services.api.converters.JodaDateTimeTransform;
import org.mythtv.services.api.test.connect.AbstractFakeMythTvRestTemplate;
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
import org.springframework.web.client.*;
import org.springframework.web.util.UriTemplate;
import org.springframework.web.util.UriUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Sebastien Astie
 *
 */
public class FakeMythTvRestTemplate extends AbstractFakeMythTvRestTemplate{
    @Override
    protected RegistryMatcher setupMatchers() {
        RegistryMatcher matchers = new RegistryMatcher();
        matchers.bind( DateTime.class, JodaDateTimeTransform.class );
        matchers.bind( Command.class, JobCommandTransform.class );
        matchers.bind( Flag.class, JobFlagTransform.class );
        matchers.bind( Status.class, JobStatusTransform.class );
        matchers.bind( Type.class, JobTypeTransform.class );
        return matchers;
    }

    @Override
    protected MythFakeHttpResponseFactory getMythResponseFactory() {
        return new MythFakeHttpResponseFactory();
    }
}
