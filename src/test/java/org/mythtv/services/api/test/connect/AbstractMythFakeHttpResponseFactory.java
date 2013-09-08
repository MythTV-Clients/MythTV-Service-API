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
package org.mythtv.services.api.test.connect;

import org.junit.Assert;
import org.mythtv.services.api.test.v026.connect.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMythFakeHttpResponseFactory {
	protected List<ResponseFactory> factories;

	public AbstractMythFakeHttpResponseFactory() {
		init();
	}

	public AbstractMythFakeHttpInputMessage getResponseMessage(URI url) {
		for (ResponseFactory factory : factories) {
			if (factory.handlesUri(url))
				return factory.create(url);
		}
		Assert.fail("No factory found for this uri: '" + url.getPath() +"'");
		return null;
	}

	protected abstract void init();
}
