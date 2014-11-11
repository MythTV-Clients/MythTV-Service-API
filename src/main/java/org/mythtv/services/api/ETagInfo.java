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

import com.google.common.base.Strings;

/**
 * @author Sebastien Astie
 */
public class ETagInfo {
    private String eTag;

    private boolean newETag;

    public ETagInfo(String eTag) {
        this.eTag = Strings.nullToEmpty(eTag);
        newETag = false;
    }

    public static ETagInfo createEmptyETag() {
        return new ETagInfo("");
    }

    public String getETag() {
        return eTag;
    }

    public void setETag(String eTag) {
        if (Strings.isNullOrEmpty(this.eTag)) {
            if (Strings.isNullOrEmpty(eTag)) {
                newETag = false;
            } else {
                this.eTag = eTag;
                newETag = true;
            }
        } else {
            if (!this.eTag.equals(eTag)) {
                this.eTag = eTag;
                newETag = true;
            } else {
                newETag = false;
            }
        }
    }

    public boolean isEmptyEtag() {
        return Strings.isNullOrEmpty(eTag);
    }

    public boolean isNewDataEtag() {
        return newETag;
    }

    @Override
    public String toString() {
        return eTag;
    }
}
