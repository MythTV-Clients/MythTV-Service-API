package org.mythtv.services.api.test.connect.utils;

import java.net.URI;

import org.mythtv.services.api.test.connect.utils.factories.CaptureFactory;

public class MythFakeHttpResponseFactory {

	public static MythFakeHttpInputMessage createMessage(URI url){
		if(url.getPath().startsWith("/Capture/")){
			return CaptureFactory.create(url);
		}
		return null;
	}

}
