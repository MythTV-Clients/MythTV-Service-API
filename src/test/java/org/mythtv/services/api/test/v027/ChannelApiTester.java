package org.mythtv.services.api.test.v027;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.v027.ChannelOperations;
import org.mythtv.services.api.v027.beans.ChannelInfo;
import org.mythtv.services.api.v027.beans.ChannelInfoList;
import org.mythtv.services.api.v027.beans.VideoSource;
import org.mythtv.services.api.v027.beans.VideoSourceList;
import org.springframework.http.ResponseEntity;

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

	@Test
	public void testGetChannelInfo() {
		ChannelInfo[] infos = getChannelInfos();
		ResponseEntity<ChannelInfo> result = operations.getChannelInfo(infos[0].getChanId(), ETagInfo.createEmptyETag());
		Assert.assertNotNull(result);
	}

	@Test
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

	@Test
	public void testGetVideoSource() {
		VideoSource[] sources = getVideoSources();
		ResponseEntity<VideoSource> result = operations.getVideoSource(sources[0].getId(), ETagInfo.createEmptyETag());
		Assert.assertNotNull(result);
		VideoSource source = result.getBody();
		Assert.assertNotNull(source);	
	}

	@Test
	public void testGetVideoSourceList() {
		getVideoSources();
	}

	@Ignore
	public void testGetXMLTVIdList() {
		fail("Not yet implemented");
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
