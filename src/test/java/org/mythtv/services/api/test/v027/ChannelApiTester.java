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
package org.mythtv.services.api.test.v027;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.ArrayOfString;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v027.ChannelOperations;
import org.mythtv.services.api.v027.beans.ChannelInfo;
import org.mythtv.services.api.v027.beans.ChannelInfoList;
import org.mythtv.services.api.v027.beans.VideoSource;
import org.mythtv.services.api.v027.beans.VideoSourceList;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ChannelApiTester extends BaseApiTester{
	private ChannelOperations operations;

	@Override
	protected void prepareOperations() {
		operations = mythservices.channelOperations();
	}

	@Ignore
	public void testAddDBChannel() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testAddVideoSource() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testFetchChannelsFromSource() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testGetChannelInfo() {
		ChannelInfo[] infos = getChannelInfos();
		ResponseEntity<ChannelInfo> result = operations.getChannelInfo(infos[0].getChanId(), ETagInfo.createEmptyETag());
		Assert.assertNotNull(result);
	}

	@Ignore
	public void testGetChannelInfoList() {
		getChannelInfos();
	}

	@Ignore
	public void testGetDDLineupList() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testGetVideoMultiplex() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testGetVideoMultiplexList() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testGetVideoSource() {
		VideoSource[] sources = getVideoSources();
		ResponseEntity<VideoSource> result = operations.getVideoSource(sources[0].getId(), ETagInfo.createEmptyETag());
		Assert.assertNotNull(result);
		VideoSource source = result.getBody();
		Assert.assertNotNull(source);	
	}

	@Ignore
	public void testGetVideoSourceList() {
		getVideoSources();
	}

	@Test
	public void testGetXMLTVIdList() throws IOException {
        ResponseEntity<ArrayOfString> xmltvIdList = operations.getXMLTVIdList(1, ETagInfo.createEmptyETag());
        assertNotNull(xmltvIdList);
    }

	@Ignore
	public void testRemoveDBChannel() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testRemoveVideoSource() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testUpdateDBChannel() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testUpdateVideoSource() {
		fail("Not yet implemented");
	}

	private VideoSource[] getVideoSources(){
		ResponseEntity<VideoSourceList> res = operations.getVideoSourceList(ETagInfo.createEmptyETag());
		Assert.assertNotNull(res);
		VideoSourceList list = res.getBody();
		Assert.assertNotNull(list);
		VideoSource[] sources = list.getVideoSources();
		Assert.assertNotNull(sources);
		Assert.assertTrue(sources.length > 0);
		return sources;
	}
	
	private ChannelInfo[] getChannelInfos(){
		VideoSource[] sources = getVideoSources();
		ResponseEntity<ChannelInfoList> list2 = operations.getChannelInfoList(sources[0].getId(), null, null, ETagInfo.createEmptyETag());
		Assert.assertNotNull(list2);
		ChannelInfoList list3 = list2.getBody();
		Assert.assertNotNull(list3);
		ChannelInfo[] channels = list3.getChannelInfos();
		Assert.assertNotNull(channels);
		Assert.assertTrue(channels.length > 0);
		return channels;
	}
}
