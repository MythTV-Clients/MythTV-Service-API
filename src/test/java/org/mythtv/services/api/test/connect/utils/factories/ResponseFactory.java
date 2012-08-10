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

import org.junit.Assert;
import org.mythtv.services.api.test.connect.utils.MythFakeHttpInputMessage;

public abstract class ResponseFactory {

	public abstract MythFakeHttpInputMessage create(URI url);
	protected abstract String getUriPrefix();
	
	public boolean handlesUri(URI uri){
		return uri.getPath().startsWith(getUriPrefix());
	}
	
	protected MythFakeHttpInputMessage unknownOperation(URI url){
		Assert.fail(url.getPath() + " is not set up  for testing locally.");
		return null;
	}
}
