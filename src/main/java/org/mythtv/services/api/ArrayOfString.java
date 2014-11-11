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
@JsonRootName("StringList")
public class ArrayOfString {
    private String[] value;

    public ArrayOfString(String[] val) {
        value = val;
    }

    public ArrayOfString() {
        value = new String[0];
    }

    /**
     * @return the array
     */
    public String[] getValue() {
        return value;
    }

    /**
     * @param val the array to set
     */
    public void setValue(String[] val) {
        this.value = val;
    }
}