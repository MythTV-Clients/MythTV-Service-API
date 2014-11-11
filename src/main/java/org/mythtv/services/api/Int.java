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
@JsonRootName("int")
public class Int {

    private Integer value;

    public Int(String val) {
        try {
            value = Integer.parseInt(val);
        } catch (Exception e) {
            value = 0;
        }
    }

    public Int() {
        value = 0;
    }

    /**
     * @return the integer
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @param integer the integer to set
     */
    public void setValue(Integer integer) {
        this.value = integer;
    }
}
