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
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v026.ChannelOperations;
import org.mythtv.services.api.v026.Int;
import org.mythtv.services.api.v026.StringList;
import org.mythtv.services.api.v026.beans.*;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.fail;

/**
 * @author sebastien
 * 
 */
public class ChannelOperationsTest extends BaseMythtvServiceApiTester {

	private ChannelOperations operations;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mythtv.services.api.test.BaseMythtvServiceApiTester#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		operations = api.channelOperations();
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#addDBChannel(int, int, int, java.lang.String, java.lang.String, java.lang.String, int, int, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Ignore
	public void testAddDBChannel() {
		fail( "Not yet implemented" ); // TODO
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#addVideoSource(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int)}
	 * .
	 */
	@Ignore
	public void testAddVideoSource() {
		fail( "Not yet implemented" ); // TODO
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#fetchChannelsFromSource(int, int, boolean)}
	 * .
	 * 
	 * @throws MythServiceApiRuntimeException
	 */
	@Test
	public void testFetchChannelsFromSource() throws MythServiceApiRuntimeException {
		ResponseEntity<Int> responseEntity = operations.fetchChannelsFromSource( 1, 2, true, ETagInfo.createEmptyETag() );
		Assert.assertEquals( 358, responseEntity.getBody().getInteger().intValue() );
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#getChannelInfo(int)}
	 * .
	 */
	@Test
	public void testGetChannelInfo() throws MythServiceApiRuntimeException {
		ResponseEntity<ChannelInfoWrapper> info = operations.getChannelInfo( 1021, ETagInfo.createEmptyETag() );
		Assert.assertNotNull( info.getBody() );
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#getChannelInfoList(int, int, int)}
	 * .
	 */
	@Test
	public void testGetChannelInfoListIntIntInt() throws MythServiceApiRuntimeException {
		ResponseEntity<ChannelInfoList> list = operations.getChannelInfoList( 1, 1, 10, ETagInfo.createEmptyETag() );
		Assert.assertNotNull( list.getBody() );
		Assert.assertFalse( list.getBody().getChannelInfos().getChannelInfos().isEmpty() );

	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#getChannelInfoList()}
	 * .
	 */
	@Test
	public void testGetChannelInfoList() throws MythServiceApiRuntimeException {
		ResponseEntity<ChannelInfoList> list = operations.getChannelInfoList( ETagInfo.createEmptyETag() );
		Assert.assertNotNull( list.getBody() );
		Assert.assertFalse( list.getBody().getChannelInfos().getChannelInfos().isEmpty() );
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#getDDLineupList(java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testGetDDLineupList() throws MythServiceApiRuntimeException {
		ResponseEntity<LineupList> list = operations.getDDLineupList( "SchedulesDirect", "user", "password", ETagInfo.createEmptyETag() );
		Assert.assertNotNull( list );
		Assert.assertFalse( list.getBody().getLineups().getLineups().isEmpty() );
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#getVideoMultiplex(int)}
	 * .
	 */
	@Test
	public void testGetVideoMultiplex() throws MythServiceApiRuntimeException {
		ResponseEntity<VideoMultiplexList> list = operations.getVideoMultiplexList( 1, 0, 10, ETagInfo.createEmptyETag() );
		Assert.assertNotNull( list.getBody() );
		Assert.assertFalse( list.getBody().getVideoMultiplexes().getVideoMultiplexes().isEmpty() );
		ResponseEntity<VideoMultiplexWrapper> mplex = operations.getVideoMultiplex( list.getBody().getVideoMultiplexes().getVideoMultiplexes().get( 0 ).getMultiplexId(), ETagInfo.createEmptyETag() );
		Assert.assertNotNull( mplex.getBody() );
		Assert.assertNotNull( mplex.getBody().getVideoMultiplex() );
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#getVideoMultiplexList(int, int, int)}
	 * .
	 */
	@Test
	public void testGetVideoMultiplexList() throws MythServiceApiRuntimeException {
		ResponseEntity<VideoMultiplexList> list = operations.getVideoMultiplexList( 1, 0, 10, ETagInfo.createEmptyETag() );
		Assert.assertNotNull( list.getBody() );
		Assert.assertFalse( list.getBody().getVideoMultiplexes().getVideoMultiplexes().isEmpty() );
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#getVideoSource(int)}
	 * .
	 */
	@Test
	public void testGetVideoSource() throws MythServiceApiRuntimeException {
		ResponseEntity<VideoSourceList> list = operations.getVideoSourceList( ETagInfo.createEmptyETag() );
		Assert.assertNotNull( list.getBody() );
		Assert.assertFalse( list.getBody().getVideoSources().getVideoSources().isEmpty() );
		ResponseEntity<VideoSourceWrapper> source = operations.getVideoSource( list.getBody().getVideoSources().getVideoSources().get( 0 ).getId(), ETagInfo.createEmptyETag() );
		Assert.assertNotNull( source.getBody() );
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#getVideoSourceList()}
	 * .
	 */
	@Test
	public void testGetVideoSourceList() throws MythServiceApiRuntimeException {
		ResponseEntity<VideoSourceList> list = operations.getVideoSourceList( ETagInfo.createEmptyETag() );
		Assert.assertNotNull( list.getBody() );
		Assert.assertFalse( list.getBody().getVideoSources().getVideoSources().isEmpty() );
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#getXmltvIdList(int)}
	 * .
	 */
	@Test
	public void testGetXmltvIdList() throws MythServiceApiRuntimeException {
		ResponseEntity<VideoSourceList> list = operations.getVideoSourceList( ETagInfo.createEmptyETag() );
		Assert.assertNotNull( list.getBody() );
		Assert.assertFalse( list.getBody().getVideoSources().getVideoSources().isEmpty() );
		ResponseEntity<StringList> ids = operations.getXmltvIdList( list.getBody().getVideoSources().getVideoSources().get( 0 ).getId(), ETagInfo.createEmptyETag() );
		Assert.assertNotNull( ids.getBody() );
		Assert.assertTrue( ids.getBody().getStringList().length > 0 );
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#removeDBChannel(int)}
	 * .
	 */
	@Ignore
	public void testRemoveDBChannel() {
		fail( "Not yet implemented" ); // TODO
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#removeVideoSource(int)}
	 * .
	 */
	@Ignore
	public void testRemoveVideoSource() {
		fail( "Not yet implemented" ); // TODO
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#updateDBChannel(int, int, int, java.lang.String, java.lang.String, java.lang.String, int, int, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Ignore
	public void testUpdateDBChannel() {
		fail( "Not yet implemented" ); // TODO
	}

	/**
	 * Test method for
	 * {@link org.mythtv.services.api.v026.impl.ChannelTemplate#updateVideoSource(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int)}
	 * .
	 */
	@Ignore
	public void testUpdateVideoSource() {
		fail( "Not yet implemented" ); // TODO
	}

}
