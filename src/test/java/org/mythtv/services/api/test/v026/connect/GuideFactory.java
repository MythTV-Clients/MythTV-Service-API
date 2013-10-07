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
package org.mythtv.services.api.test.v026.connect;

import org.mythtv.services.api.test.connect.AbstractMythFakeHttpInputMessage;
import org.mythtv.services.api.test.connect.ResponseFactory;

import java.net.URI;

/**
 * @author Sebastien Astie
 *
 */
public class GuideFactory extends ResponseFactory {

	
	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.connect.utils.factories.ResponseFactory#create(java.net.URI)
	 */
	@Override
	public AbstractMythFakeHttpInputMessage create(URI url) {
		if(url.getPath().endsWith("/GetChannelIcon")){
			return new MythFakeHttpInputMessage("guide/GetChannelIcon.png");
		} else if (url.getPath().endsWith("/GetProgramGuide")){
			return new MythFakeHttpInputMessage("guide/GetProgramGuide.json");
		} else if (url.getPath().endsWith("/GetProgramDetails")) {
			return new MythFakeHttpInputMessage("guide/GetProgramDetails.json");
		}
		return unknownOperation(url);
	}

	/* (non-Javadoc)
	 * @see org.mythtv.services.api.test.connect.utils.factories.ResponseFactory#getUriPrefix()
	 */
	@Override
	protected String getUriPrefix() {
		return "/Guide/";
	}
}
