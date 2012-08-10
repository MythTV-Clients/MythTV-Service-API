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
package org.mythtv.services.api.test.connect.utils;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.mythtv.services.api.test.connect.utils.factories.CaptureFactory;
import org.mythtv.services.api.test.connect.utils.factories.ResponseFactory;

public class MythFakeHttpResponseFactory {

	private static MythFakeHttpResponseFactory instance;
	private List<ResponseFactory> factories;

	public static synchronized MythFakeHttpResponseFactory getInstance() {
		if (instance == null)
			instance = new MythFakeHttpResponseFactory();
		return instance;
	}

	private MythFakeHttpResponseFactory() {
		init();
	}

	public MythFakeHttpInputMessage getResponseMessage(URI url) {
		for (ResponseFactory factory : factories) {
			if (factory.handlesUri(url))
				return factory.create(url);
		}
		return null;
	}

	private void init() {
		factories = new ArrayList<ResponseFactory>();
		factories.add(new CaptureFactory());
	}
}
