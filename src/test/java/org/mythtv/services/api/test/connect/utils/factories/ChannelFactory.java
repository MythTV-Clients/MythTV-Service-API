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
package org.mythtv.services.api.test.connect.utils.factories;

import java.net.URI;

import org.mythtv.services.api.test.connect.utils.MythFakeHttpInputMessage;

/**
 * @author sebastien
 *
 */
public class ChannelFactory extends ResponseFactory {
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.connect.utils.factories.ResponseFactory#create(java.net.URI)
	 */
	@Override
	public MythFakeHttpInputMessage create(URI url) {
		if(url.getPath().endsWith("/GetVideoSourceList")){
			return new MythFakeHttpInputMessage("channel/GetVideoSourceList.json");
		} else if (url.getPath().endsWith("/GetVideoSource")){
			return new MythFakeHttpInputMessage("channel/GetVideoSource.json");
		} else if (url.getPath().endsWith("/GetXMLTVIdList")){
			return new MythFakeHttpInputMessage("channel/GetXMLTVIdList.json");
		} else if (url.getPath().endsWith("/FetchChannelsFromSource")){
			return new MythFakeHttpInputMessage("channel/FetchChannelsFromSource.json");
		} else if (url.getPath().endsWith("/GetChannelInfoList")){
			return new MythFakeHttpInputMessage("channel/GetChannelInfoList.json");
		} else if (url.getPath().endsWith("/GetChannelInfo")){
			return new MythFakeHttpInputMessage("channel/GetChannelInfo.json");
		} else if (url.getPath().endsWith("/GetVideoMultiplexList")){
			return new MythFakeHttpInputMessage("channel/GetVideoMultiplexList.json");
		} else if (url.getPath().endsWith("/GetVideoMultiplex")){
			return new MythFakeHttpInputMessage("channel/GetVideoMultiplex.json");
		} else if (url.getPath().endsWith("/GetDDLineupList")){
			return new MythFakeHttpInputMessage("channel/GetDDLineupList.json");
		}
		return unknownOperation(url);
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.connect.utils.factories.ResponseFactory#getUriPrefix()
	 */
	@Override
	protected String getUriPrefix() {
		return "/Channel/";
	}
}
