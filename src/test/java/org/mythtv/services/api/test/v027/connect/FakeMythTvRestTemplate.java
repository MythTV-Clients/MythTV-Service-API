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
package org.mythtv.services.api.test.v027.connect;

import org.joda.time.DateTime;
import org.mythtv.services.api.converters.JodaDateTimeTransform;
import org.mythtv.services.api.test.connect.AbstractFakeMythTvRestTemplate;
import org.mythtv.services.api.v027.status.beans.Job;
import org.mythtv.services.api.v027.status.converters.JobCommandTransform;
import org.mythtv.services.api.v027.status.converters.JobFlagTransform;
import org.mythtv.services.api.v027.status.converters.JobStatusTransform;
import org.mythtv.services.api.v027.status.converters.JobTypeTransform;
import org.simpleframework.xml.transform.RegistryMatcher;

/**
 * @author Sebastien Astie
 *
 */
public class FakeMythTvRestTemplate extends AbstractFakeMythTvRestTemplate{
    @Override
    protected RegistryMatcher setupMatchers() {
        RegistryMatcher matchers = new RegistryMatcher();
        matchers.bind( DateTime.class, JodaDateTimeTransform.class );
        matchers.bind( Job.Command.class, JobCommandTransform.class );
        matchers.bind( Job.Flag.class, JobFlagTransform.class );
        matchers.bind( Job.Status.class, JobStatusTransform.class );
        matchers.bind( Job.Type.class, JobTypeTransform.class );
        return matchers;
    }

    @Override
    protected MythFakeHttpResponseFactory getMythResponseFactory() {
        return new MythFakeHttpResponseFactory();
    }
}
