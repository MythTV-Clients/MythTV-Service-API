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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

/**
 * @author Sebastien Astie
 * 
 */
public class MythFakeHttpInputMessage implements ClientHttpResponse {
	private FileInputStream stream;
	private HttpHeaders headers;
	/**
	 * 
	 */
	public MythFakeHttpInputMessage(String filePath) {
		headers = new HttpHeaders();
		File f = new File("src/test/resources/responses/" + filePath);
		if(f.exists()){
			headers.setContentLength(f.length());
		}
		filePath = filePath.toLowerCase().trim();
		
		
		if(filePath.endsWith(".json"))
			headers.setContentType(MediaType.APPLICATION_JSON);
		else if(filePath.endsWith(".png"))
			headers.setContentType(MediaType.IMAGE_PNG);
			
		try {
			
			stream = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.http.HttpMessage#getHeaders()
	 */
	@Override
	public HttpHeaders getHeaders() {
		return headers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.http.HttpInputMessage#getBody()
	 */
	@Override
	public InputStream getBody() throws IOException {
		return stream;
	}

	@Override
	public HttpStatus getStatusCode() throws IOException {
		return HttpStatus.OK;
	}

	@Override
	public int getRawStatusCode() throws IOException {
		return HttpStatus.OK.value();
	}

	@Override
	public String getStatusText() throws IOException {
		return HttpStatus.OK.toString();
	}

	@Override
	public void close() {
		try {
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
