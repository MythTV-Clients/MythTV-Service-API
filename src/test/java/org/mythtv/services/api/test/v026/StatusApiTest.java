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
package org.mythtv.services.api.test.v026;

import org.junit.Assert;
import org.junit.Test;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v026.StatusOperations;
import org.mythtv.services.api.v026.status.beans.BackendStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author Sebastien Astie
 */
public class StatusApiTest extends BaseApiTester {
    private StatusOperations operations;

    @Override
    protected void prepareOperations() {
        operations = mythservices.statusOperations();
    }

    @Test
    public void testGetStatus() throws Exception {
        ResponseEntity<BackendStatus> status = operations.getStatus( ETagInfo.createEmptyETag() );
        Assert.assertNotNull( status.getBody() );
    }

}