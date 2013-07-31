package org.mythtv.services.api.v027;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.ChannelInfo;
import org.mythtv.services.api.v027.beans.ChannelInfoList;
import org.mythtv.services.api.v027.beans.LineupList;
import org.mythtv.services.api.v027.beans.VideoMultiplex;
import org.mythtv.services.api.v027.beans.VideoMultiplexList;
import org.mythtv.services.api.v027.beans.VideoSource;
import org.mythtv.services.api.v027.beans.VideoSourceList;
import org.springframework.http.ResponseEntity;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface ChannelOperations {

    /*
     * POST method
     *
     * @param mplexID
     * @param sourceID
     * @param channelID
     * @param callSign
     * @param channelName
     * @param channelNumber
     * @param serviceID
     * @param aTSCMajorChannel
     * @param aTSCMinorChannel
     * @param useEIT
     * @param visible
     * @param frequencyID
     * @param icon
     * @param format
     * @param xMLTVID
     * @param defaultAuthority
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> addDBChannel(Integer mplexID, Integer sourceID, Integer channelID, String callSign, String channelName, String channelNumber, Integer serviceID, Integer aTSCMajorChannel, Integer aTSCMinorChannel, Boolean useEIT, Boolean visible, String frequencyID, String icon, String format, String xMLTVID, String defaultAuthority) throws MythServiceApiRuntimeException;

    /*
     * POST method
     *
     * @param sourceName
     * @param grabber
     * @param userId
     * @param freqTable
     * @param lineupId
     * @param password
     * @param useEIT
     * @param configPath
     * @param nITId
     * @return ResponseEntity<Integer>
     */
    ResponseEntity<Integer> addVideoSource(String sourceName, String grabber, String userId, String freqTable, String lineupId, String password, Boolean useEIT, String configPath, Integer nITId) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param sourceId
     * @param cardId
     * @param waitForFinish
     * @param etagInfo
     * @return ResponseEntity<Integer>
     */
    ResponseEntity<Integer> fetchChannelsFromSource(Integer sourceId, Integer cardId, Boolean waitForFinish, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param chanID
     * @param etagInfo
     * @return ResponseEntity<ChannelInfo>
     */
    ResponseEntity<ChannelInfo> getChannelInfo(Integer chanID, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param sourceID
     * @param startIndex
     * @param count
     * @param etagInfo
     * @return ResponseEntity<ChannelInfoList>
     */
    ResponseEntity<ChannelInfoList> getChannelInfoList(Integer sourceID, Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param source
     * @param userId
     * @param password
     * @param etagInfo
     * @return ResponseEntity<LineupList>
     */
    ResponseEntity<LineupList> getDDLineupList(String source, String userId, String password, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param mplexID
     * @param etagInfo
     * @return ResponseEntity<VideoMultiplex>
     */
    ResponseEntity<VideoMultiplex> getVideoMultiplex(Integer mplexID, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param sourceID
     * @param startIndex
     * @param count
     * @param etagInfo
     * @return ResponseEntity<VideoMultiplexList>
     */
    ResponseEntity<VideoMultiplexList> getVideoMultiplexList(Integer sourceID, Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param sourceID
     * @param etagInfo
     * @return ResponseEntity<VideoSource>
     */
    ResponseEntity<VideoSource> getVideoSource(Integer sourceID, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param etagInfo
     * @return ResponseEntity<VideoSourceList>
     */
    ResponseEntity<VideoSourceList> getVideoSourceList(ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param sourceID
     * @param etagInfo
     * @return ResponseEntity<String[]>
     */
    ResponseEntity<String[]> getXMLTVIdList(Integer sourceID, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * POST method
     *
     * @param channelID
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> removeDBChannel(Integer channelID) throws MythServiceApiRuntimeException;

    /*
     * POST method
     *
     * @param sourceID
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> removeVideoSource(Integer sourceID) throws MythServiceApiRuntimeException;

    /*
     * POST method
     *
     * @param mplexID
     * @param sourceID
     * @param channelID
     * @param callSign
     * @param channelName
     * @param channelNumber
     * @param serviceID
     * @param aTSCMajorChannel
     * @param aTSCMinorChannel
     * @param useEIT
     * @param visible
     * @param frequencyID
     * @param icon
     * @param format
     * @param xMLTVID
     * @param defaultAuthority
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> updateDBChannel(Integer mplexID, Integer sourceID, Integer channelID, String callSign, String channelName, String channelNumber, Integer serviceID, Integer aTSCMajorChannel, Integer aTSCMinorChannel, Boolean useEIT, Boolean visible, String frequencyID, String icon, String format, String xMLTVID, String defaultAuthority) throws MythServiceApiRuntimeException;

    /*
     * POST method
     *
     * @param sourceID
     * @param sourceName
     * @param grabber
     * @param userId
     * @param freqTable
     * @param lineupId
     * @param password
     * @param useEIT
     * @param configPath
     * @param nITId
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> updateVideoSource(Integer sourceID, String sourceName, String grabber, String userId, String freqTable, String lineupId, String password, Boolean useEIT, String configPath, Integer nITId) throws MythServiceApiRuntimeException;

}