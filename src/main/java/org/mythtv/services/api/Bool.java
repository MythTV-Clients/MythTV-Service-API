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

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Sebastien Astie
 */
@JsonRootName("bool")
public class Bool {

    private Boolean value;

    public Bool(String val) {
        value = Boolean.parseBoolean(val);
    }

    public Bool() {
        value = Boolean.FALSE;
    }

    /**
     * @return the bool
     */
    public Boolean getValue() {
        return value;
    }

    /**
     * @param bool the bool to set
     */
    public void setBool(Boolean bool) {
        this.value = bool;
    }
}