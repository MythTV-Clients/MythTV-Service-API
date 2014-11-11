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
package org.mythtv.services.api.v027;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class MythTvApiContext extends com.tikinou.tv.mythtv.api.MythTvApiContext {
    private CaptureService captureService;
    private ChannelService channelService;
    private ContentService contentService;
    private DvrService dvrService;
    private GuideService guideService;
    private MythService mythService;
    private VideoService videoService;


    public MythTvApiContext(String backendHost) {
        super(backendHost);
    }

    public MythTvApiContext(String backendHost, int backendPort) {
        super(backendHost, backendPort);
    }


    public CaptureService getCaptureService() {
        return captureService;
    }
    public ChannelService getChannelService() {
        return channelService;
    }
    public ContentService getContentService() {
        return contentService;
    }
    public DvrService getDvrService() {
        return dvrService;
    }
    public GuideService getGuideService() {
        return guideService;
    }
    public MythService getMythService() {
        return mythService;
    }
    public VideoService getVideoService() {
        return videoService;
    }


    @Override
    protected void initialize() {
        super.initialize();
        captureService = restAdapter.create(CaptureService.class);
        channelService = restAdapter.create(ChannelService.class);
        contentService = restAdapter.create(ContentService.class);
        dvrService = restAdapter.create(DvrService.class);
        guideService = restAdapter.create(GuideService.class);
        mythService = restAdapter.create(MythService.class);
        videoService = restAdapter.create(VideoService.class);

    }
}