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
package org.mythtv.services.api.v025.impl;

import org.mythtv.services.api.AbstractOperations;
import org.mythtv.services.api.ArrayOfString;
import org.mythtv.services.api.Bool;
import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.Int;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v025.beans.ChannelInfo;
import org.mythtv.services.api.v025.beans.ChannelInfoList;
import org.mythtv.services.api.v025.beans.LineupList;
import org.mythtv.services.api.v025.beans.VideoMultiplex;
import org.mythtv.services.api.v025.beans.VideoMultiplexList;
import org.mythtv.services.api.v025.beans.VideoSource;
import org.mythtv.services.api.v025.beans.VideoSourceList;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public class ChannelTemplate extends AbstractOperations implements org.mythtv.services.api.v025.ChannelOperations {

    private final RestOperations restOperations;

    public ChannelTemplate( RestOperations restOperations, String apiUrlBase ) {
        super( apiUrlBase + "Channel/" );
        this.restOperations = restOperations;
    }

	@Override
	public ResponseEntity<Bool> addDBChannel(Integer mplexID, Integer sourceID, Integer channelID, String callSign, String channelName, String channelNumber, Integer serviceID, Integer aTSCMajorChannel, Integer aTSCMinorChannel, Boolean useEIT, Boolean visible, String frequencyID, String icon, String format, String xMLTVID, String defaultAuthority) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(mplexID != null)
           		parameters.add( "MplexID", mplexID.toString() );
		if(sourceID != null)
           		parameters.add( "SourceID", sourceID.toString() );
		if(channelID != null)
           		parameters.add( "ChannelID", channelID.toString() );
		if(callSign != null && !callSign.isEmpty())
			parameters.add( "CallSign", callSign );
		if(channelName != null && !channelName.isEmpty())
			parameters.add( "ChannelName", channelName );
		if(channelNumber != null && !channelNumber.isEmpty())
			parameters.add( "ChannelNumber", channelNumber );
		if(serviceID != null)
           		parameters.add( "ServiceID", serviceID.toString() );
		if(aTSCMajorChannel != null)
           		parameters.add( "ATSCMajorChannel", aTSCMajorChannel.toString() );
		if(aTSCMinorChannel != null)
           		parameters.add( "ATSCMinorChannel", aTSCMinorChannel.toString() );
		if(useEIT != null)
           		parameters.add( "UseEIT", useEIT.toString() );
		if(visible != null)
           		parameters.add( "visible", visible.toString() );
		if(frequencyID != null && !frequencyID.isEmpty())
			parameters.add( "FrequencyID", frequencyID );
		if(icon != null && !icon.isEmpty())
			parameters.add( "Icon", icon );
		if(format != null && !format.isEmpty())
			parameters.add( "Format", format );
		if(xMLTVID != null && !xMLTVID.isEmpty())
			parameters.add( "XMLTVID", xMLTVID );
		if(defaultAuthority != null && !defaultAuthority.isEmpty())
			parameters.add( "DefaultAuthority", defaultAuthority );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "AddDBChannel", parameters ), HttpMethod.POST, getRequestEntity(null), Bool.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Int> addVideoSource(String sourceName, String grabber, String userId, String freqTable, String lineupId, String password, Boolean useEIT, String configPath, Integer nITId) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(sourceName != null && !sourceName.isEmpty())
			parameters.add( "SourceName", sourceName );
		if(grabber != null && !grabber.isEmpty())
			parameters.add( "Grabber", grabber );
		if(userId != null && !userId.isEmpty())
			parameters.add( "UserId", userId );
		if(freqTable != null && !freqTable.isEmpty())
			parameters.add( "FreqTable", freqTable );
		if(lineupId != null && !lineupId.isEmpty())
			parameters.add( "LineupId", lineupId );
		if(password != null && !password.isEmpty())
			parameters.add( "Password", password );
		if(useEIT != null)
           		parameters.add( "UseEIT", useEIT.toString() );
		if(configPath != null && !configPath.isEmpty())
			parameters.add( "ConfigPath", configPath );
		if(nITId != null)
           		parameters.add( "NITId", nITId.toString() );
		
		ResponseEntity<Int> responseEntity = restOperations.exchange( buildUri( "AddVideoSource", parameters ), HttpMethod.POST, getRequestEntity(null), Int.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Int> fetchChannelsFromSource(Integer sourceId, Integer cardId, Boolean waitForFinish, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(sourceId != null)
           		parameters.add( "SourceId", sourceId.toString() );
		if(cardId != null)
           		parameters.add( "CardId", cardId.toString() );
		if(waitForFinish != null)
           		parameters.add( "WaitForFinish", waitForFinish.toString() );
		
		ResponseEntity<Int> responseEntity = restOperations.exchange( buildUri( "FetchChannelsFromSource", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), Int.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ChannelInfo> getChannelInfo(Integer chanID, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(chanID != null)
           		parameters.add( "ChanID", chanID.toString() );
		
		ResponseEntity<ChannelInfo> responseEntity = restOperations.exchange( buildUri( "GetChannelInfo", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ChannelInfo.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ChannelInfoList> getChannelInfoList(Integer sourceID, Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(sourceID != null)
           		parameters.add( "SourceID", sourceID.toString() );
		if(startIndex != null)
           		parameters.add( "StartIndex", startIndex.toString() );
		if(count != null)
           		parameters.add( "Count", count.toString() );
		
		ResponseEntity<ChannelInfoList> responseEntity = restOperations.exchange( buildUri( "GetChannelInfoList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ChannelInfoList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<LineupList> getDDLineupList(String source, String userId, String password, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(source != null && !source.isEmpty())
			parameters.add( "Source", source );
		if(userId != null && !userId.isEmpty())
			parameters.add( "UserId", userId );
		if(password != null && !password.isEmpty())
			parameters.add( "Password", password );
		
		ResponseEntity<LineupList> responseEntity = restOperations.exchange( buildUri( "GetDDLineupList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), LineupList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<VideoMultiplex> getVideoMultiplex(Integer mplexID, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(mplexID != null)
           		parameters.add( "MplexID", mplexID.toString() );
		
		ResponseEntity<VideoMultiplex> responseEntity = restOperations.exchange( buildUri( "GetVideoMultiplex", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), VideoMultiplex.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<VideoMultiplexList> getVideoMultiplexList(Integer sourceID, Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(sourceID != null)
           		parameters.add( "SourceID", sourceID.toString() );
		if(startIndex != null)
           		parameters.add( "StartIndex", startIndex.toString() );
		if(count != null)
           		parameters.add( "Count", count.toString() );
		
		ResponseEntity<VideoMultiplexList> responseEntity = restOperations.exchange( buildUri( "GetVideoMultiplexList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), VideoMultiplexList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<VideoSource> getVideoSource(Integer sourceID, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(sourceID != null)
           		parameters.add( "SourceID", sourceID.toString() );
		
		ResponseEntity<VideoSource> responseEntity = restOperations.exchange( buildUri( "GetVideoSource", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), VideoSource.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<VideoSourceList> getVideoSourceList(ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		
		ResponseEntity<VideoSourceList> responseEntity = restOperations.exchange( buildUri( "GetVideoSourceList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), VideoSourceList.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<ArrayOfString> getXMLTVIdList(Integer sourceID, ETagInfo etagInfo) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(sourceID != null)
           		parameters.add( "SourceID", sourceID.toString() );
		
		ResponseEntity<ArrayOfString> responseEntity = restOperations.exchange( buildUri( "GetXMLTVIdList", parameters ), HttpMethod.GET, getRequestEntity(etagInfo), ArrayOfString.class );
		handleResponseEtag( etagInfo, responseEntity.getHeaders() );  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> removeDBChannel(Integer channelID) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(channelID != null)
           		parameters.add( "ChannelID", channelID.toString() );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "RemoveDBChannel", parameters ), HttpMethod.POST, getRequestEntity(null), Bool.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> removeVideoSource(Integer sourceID) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(sourceID != null)
           		parameters.add( "SourceID", sourceID.toString() );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "RemoveVideoSource", parameters ), HttpMethod.POST, getRequestEntity(null), Bool.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> updateDBChannel(Integer mplexID, Integer sourceID, Integer channelID, String callSign, String channelName, String channelNumber, Integer serviceID, Integer aTSCMajorChannel, Integer aTSCMinorChannel, Boolean useEIT, Boolean visible, String frequencyID, String icon, String format, String xMLTVID, String defaultAuthority) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(mplexID != null)
           		parameters.add( "MplexID", mplexID.toString() );
		if(sourceID != null)
           		parameters.add( "SourceID", sourceID.toString() );
		if(channelID != null)
           		parameters.add( "ChannelID", channelID.toString() );
		if(callSign != null && !callSign.isEmpty())
			parameters.add( "CallSign", callSign );
		if(channelName != null && !channelName.isEmpty())
			parameters.add( "ChannelName", channelName );
		if(channelNumber != null && !channelNumber.isEmpty())
			parameters.add( "ChannelNumber", channelNumber );
		if(serviceID != null)
           		parameters.add( "ServiceID", serviceID.toString() );
		if(aTSCMajorChannel != null)
           		parameters.add( "ATSCMajorChannel", aTSCMajorChannel.toString() );
		if(aTSCMinorChannel != null)
           		parameters.add( "ATSCMinorChannel", aTSCMinorChannel.toString() );
		if(useEIT != null)
           		parameters.add( "UseEIT", useEIT.toString() );
		if(visible != null)
           		parameters.add( "visible", visible.toString() );
		if(frequencyID != null && !frequencyID.isEmpty())
			parameters.add( "FrequencyID", frequencyID );
		if(icon != null && !icon.isEmpty())
			parameters.add( "Icon", icon );
		if(format != null && !format.isEmpty())
			parameters.add( "Format", format );
		if(xMLTVID != null && !xMLTVID.isEmpty())
			parameters.add( "XMLTVID", xMLTVID );
		if(defaultAuthority != null && !defaultAuthority.isEmpty())
			parameters.add( "DefaultAuthority", defaultAuthority );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "UpdateDBChannel", parameters ), HttpMethod.POST, getRequestEntity(null), Bool.class );
		  
		return responseEntity;
	}

	@Override
	public ResponseEntity<Bool> updateVideoSource(Integer sourceID, String sourceName, String grabber, String userId, String freqTable, String lineupId, String password, Boolean useEIT, String configPath, Integer nITId) throws MythServiceApiRuntimeException {
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if(sourceID != null)
           		parameters.add( "SourceID", sourceID.toString() );
		if(sourceName != null && !sourceName.isEmpty())
			parameters.add( "SourceName", sourceName );
		if(grabber != null && !grabber.isEmpty())
			parameters.add( "Grabber", grabber );
		if(userId != null && !userId.isEmpty())
			parameters.add( "UserId", userId );
		if(freqTable != null && !freqTable.isEmpty())
			parameters.add( "FreqTable", freqTable );
		if(lineupId != null && !lineupId.isEmpty())
			parameters.add( "LineupId", lineupId );
		if(password != null && !password.isEmpty())
			parameters.add( "Password", password );
		if(useEIT != null)
           		parameters.add( "UseEIT", useEIT.toString() );
		if(configPath != null && !configPath.isEmpty())
			parameters.add( "ConfigPath", configPath );
		if(nITId != null)
           		parameters.add( "NITId", nITId.toString() );
		
		ResponseEntity<Bool> responseEntity = restOperations.exchange( buildUri( "UpdateVideoSource", parameters ), HttpMethod.POST, getRequestEntity(null), Bool.class );
		  
		return responseEntity;
	}


}