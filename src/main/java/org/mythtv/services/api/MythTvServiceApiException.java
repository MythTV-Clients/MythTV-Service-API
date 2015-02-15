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

/**
 * @author Sebastien Astie
 */
public class MythTvServiceApiException extends RuntimeException {
    public MythTvServiceApiException() {
    }

    public MythTvServiceApiException(String message) {
        super(message);
    }

    public MythTvServiceApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public MythTvServiceApiException(Throwable cause) {
        super(cause);
    }

    public MythTvServiceApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}