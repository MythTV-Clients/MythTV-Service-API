/*
 * Copyright (c) 2014 TIKINOU LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mythtv.services.api;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.mythtv.services.api.converters.ArrayOfStringConverter;

/**
 * @author Sebastien Astie
 */
public class JacksonUtils {
    public static ObjectMapper initObjectMapper() {
        StdDelegatingDeserializer<ArrayOfString> delegatingDeserializer = new StdDelegatingDeserializer<ArrayOfString>(new ArrayOfStringConverter());
        SimpleModule customModule = new SimpleModule("org.mythtv.services.api.module", new Version(1, 0, 0, null, null, null)).addDeserializer(ArrayOfString.class, delegatingDeserializer);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JodaModule());
        objectMapper.registerModule(customModule);
        objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        return objectMapper;
    }
}
