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
import org.mythtv.services.api.channel.ChannelOperations;
import org.mythtv.services.api.channel.VideoSource;
import org.mythtv.services.api.channel.VideoSourceWrapper;

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
		fail("Not yet implemented"); // TODO
		//operations.fetchChannelsFromSource(sourceId, cardId, waitForFinish);
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfo(int)}.
	 */
	@Test
	public void testGetChannelInfo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfoList(int, int, int)}.
	 */
	@Test
	public void testGetChannelInfoListIntIntInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfoListResponseEntity(int, int, int)}.
	 */
	@Test
	public void testGetChannelInfoListResponseEntityIntIntInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfoList()}.
	 */
	@Test
	public void testGetChannelInfoList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getChannelInfoListResponseEntity()}.
	 */
	@Test
	public void testGetChannelInfoListResponseEntity() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getDDLineupList(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetDDLineupList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getVideoMultiplex(int)}.
	 */
	@Test
	public void testGetVideoMultiplex() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.mythtv.services.api.channel.impl.ChannelTemplate#getVideoMultiplexList(int, int, int)}.
	 */
	@Test
	public void testGetVideoMultiplexList() {
		fail("Not yet implemented"); // TODO
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
		fail("Not yet implemented"); // TODO
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
