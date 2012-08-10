package org.mythtv.services.api.test.connect.utils.factories;

import java.net.URI;

import org.mythtv.services.api.test.connect.utils.MythFakeHttpInputMessage;

public abstract class ResponseFactory {
	
	public boolean handlesUri(URI uri){
		return uri.getPath().startsWith(getUriPrefix());
	}
	
	public abstract MythFakeHttpInputMessage create(URI url);
	protected abstract String getUriPrefix();
}
