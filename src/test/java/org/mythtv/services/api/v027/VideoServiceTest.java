/*
 * Copyright (C) 2014, Tikinou LLC
 * All Rights Reserved.  Unpublished.
 * http://www.tikinou.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This software is proprietary and confidential to Tikinou LLC
 * and may not be disclosed to third parties or duplicated or used
 * for any purpose other than the purpose for which it has been provided.
 * Any unauthorized use, duplication or disclosure is prohibited by law
 * and will result in prosecution.
 */

package org.mythtv.services.api.v027;

import org.junit.Assert;

import org.mythtv.services.api.ApiVersion;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythTvApi027Context;
import org.mythtv.services.api.MythTvApiContext;
import org.mythtv.services.api.v027.beans.VideoMetadataInfoList;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class VideoServiceTest {
    private static final String VIDEO_LIST_REQ_ID = "VIDEO_LIST_REQ_ID";
    private VideoService videoService;
    private MythTvApi027Context context;

    @org.junit.Test
    public void testGetVideoList() throws Exception {
        try {
            ETagInfo eTagInfo = context.getEtag(VIDEO_LIST_REQ_ID, true);
            VideoMetadataInfoList list = videoService.getVideoList(null, null, null, eTagInfo, VIDEO_LIST_REQ_ID);
            Assert.assertNotNull(list);
            // at this point the etag from the response is set.
            // this call will cause a Retrofit error to be thrown with a HTTP Kind and a 304 response code which means no data changed
            list = videoService.getVideoList(null, null, null, eTagInfo, VIDEO_LIST_REQ_ID);
        } catch (RetrofitError e){
            int i = e.getResponse().getStatus();
            if(e.getKind() == RetrofitError.Kind.HTTP && i == MythTvApiContext.ETAG_MATCH_HTTP_RESPONSE_CODE)
                return;
            throw e;
        }
    }

    @org.junit.Test
    public void testGetVideoListAsync() throws Exception {
        Callback<VideoMetadataInfoList> callback = new Callback<VideoMetadataInfoList>() {
            @Override
            public void success(VideoMetadataInfoList videoMetadataInfoList, Response response) {
                System.out.println("success");
            }

            @Override
            public void failure(RetrofitError error) {
                System.out.println("fail");
            }
        };
        videoService.getVideoList(null, null, null, null, null, callback);
        Thread.sleep(2000);
    }


    @org.junit.Before
    public void setUp() throws Exception {
        context = (MythTvApi027Context) MythTvApiContext.newBuilder().setHostName("master").setVersion(ApiVersion.v027).build();
        videoService = context.getVideoService();
    }
}