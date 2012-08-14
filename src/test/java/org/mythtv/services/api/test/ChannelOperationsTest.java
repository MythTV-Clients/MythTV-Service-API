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
package org.mythtv.services.api.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mythtv.services.api.channel.ChannelInfo;
import org.mythtv.services.api.channel.ChannelInfoList;
import org.mythtv.services.api.channel.ChannelInfoWrapper;
import org.mythtv.services.api.channel.ChannelOperations;
import org.mythtv.services.api.channel.Lineup;
import org.mythtv.services.api.channel.VideoMultiplex;
import org.mythtv.services.api.channel.VideoMultiplexWrapper;
import org.mythtv.services.api.channel.VideoSource;
import org.mythtv.services.api.channel.VideoSourceWrapper;
import org.springframework.http.ResponseEntity;

/**
 * @author sebastien
 *
 */
public class ChannelOperationsTest extends BaseMythtvServiceApiTester {

	private ChannelOperations operations;
	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		operations = api.channelOperations();
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#addDBChannel(int, int, int, java.lang.String, java.lang.String, java.lang.String, int, int, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	public void testAddDBChannel() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#addVideoSource(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int)}.
	 */
	public void testAddVideoSource() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#fetchChannelsFromSource(int, int, boolean)}.
	 */
	@Test
	public void testFetchChannelsFromSource() {
		int val = operations.fetchChannelsFromSource(1, 2, true);
		Assert.assertEquals(358, val);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfo(int)}.
	 */
	@Test
	public void testGetChannelInfo() {
		ChannelInfoWrapper info = operations.getChannelInfo(1021);
		Assert.assertNotNull(info);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfoList(int, int, int)}.
	 */
	@Test
	public void testGetChannelInfoListIntIntInt() {
		List<ChannelInfo> list = operations.getChannelInfoList(1, 1, 10);
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
		
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfoListResponseEntity(int, int, int)}.
	 */
	@Test
	public void testGetChannelInfoListResponseEntityIntIntInt() {
		ResponseEntity<ChannelInfoList> list = operations.getChannelInfoListResponseEntity(1, 1, 10);
		Assert.assertNotNull(list);
		Assert.assertNotNull(list.getBody().getChannelInfos());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfoList()}.
	 */
	@Test
	public void testGetChannelInfoList() {
		List<ChannelInfo> list = operations.getChannelInfoList();
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfoListResponseEntity()}.
	 */
	@Test
	public void testGetChannelInfoListResponseEntity() {
		ResponseEntity<ChannelInfoList> list = operations.getChannelInfoListResponseEntity();
		Assert.assertNotNull(list);
		Assert.assertNotNull(list.getBody().getChannelInfos());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getDDLineupList(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetDDLineupList() {
		List<Lineup> list = operations.getDDLineupList("SchedulesDirect", "user", "password");
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getVideoMultiplex(int)}.
	 */
	@Test
	public void testGetVideoMultiplex() {
		List<VideoMultiplex> list = operations.getVideoMultiplexList(1, 0, 10);
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
		VideoMultiplexWrapper mplex = operations.getVideoMultiplex(list.get(0).getMultiplexId());
		Assert.assertNotNull(mplex);
		Assert.assertNotNull(mplex.getVideoMultiplex());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getVideoMultiplexList(int, int, int)}.
	 */
	@Test
	public void testGetVideoMultiplexList() {
		List<VideoMultiplex> list = operations.getVideoMultiplexList(1, 0, 10);
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getVideoSource(int)}.
	 */
	@Test
	public void testGetVideoSource() {
		List<VideoSource> list = operations.getVideoSourceList();
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
		VideoSourceWrapper source = operations.getVideoSource(list.get(0).getId());
		Assert.assertNotNull(source);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getVideoSourceList()}.
	 */
	@Test
	public void testGetVideoSourceList() {
		List<VideoSource> list = operations.getVideoSourceList();
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getXmltvIdList(int)}.
	 */
	@Test
	public void testGetXmltvIdList() {
		List<VideoSource> list = operations.getVideoSourceList();
		Assert.assertNotNull(list);
		Assert.assertFalse(list.isEmpty());
		List<String> ids = operations.getXmltvIdList(list.get(0).getId());
		Assert.assertNotNull(ids);
		Assert.assertFalse(ids.isEmpty());
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#removeDBChannel(int)}.
	 */
	public void testRemoveDBChannel() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#removeVideoSource(int)}.
	 */
	public void testRemoveVideoSource() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#updateDBChannel(int, int, int, java.lang.String, java.lang.String, java.lang.String, int, int, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	public void testUpdateDBChannel() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#updateVideoSource(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int)}.
	 */
	public void testUpdateVideoSource() {
		fail("Not yet implemented"); // TODO
	}

}
