package org.mythtv.services.api.v027;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.ArtworkInfoList;
import org.mythtv.services.api.v027.beans.LiveStreamInfo;
import org.mythtv.services.api.v027.beans.LiveStreamInfoList;
import org.springframework.http.ResponseEntity;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
public interface ContentOperations {

    /*
     * GET method
     *
     * @param storageGroup
     * @param fileName
     * @param hostName
     * @param maxSegments
     * @param width
     * @param height
     * @param bitrate
     * @param audioBitrate
     * @param sampleRate
     * @param etagInfo
     * @return ResponseEntity<LiveStreamInfo>
     */
    ResponseEntity<LiveStreamInfo> addLiveStream(String storageGroup, String fileName, String hostName, Integer maxSegments, Integer width, Integer height, Integer bitrate, Integer audioBitrate, Integer sampleRate, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param chanId
     * @param startTime
     * @param maxSegments
     * @param width
     * @param height
     * @param bitrate
     * @param audioBitrate
     * @param sampleRate
     * @param etagInfo
     * @return ResponseEntity<LiveStreamInfo>
     */
    ResponseEntity<LiveStreamInfo> addRecordingLiveStream(Integer chanId, org.joda.time.DateTime startTime, Integer maxSegments, Integer width, Integer height, Integer bitrate, Integer audioBitrate, Integer sampleRate, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param id
     * @param maxSegments
     * @param width
     * @param height
     * @param bitrate
     * @param audioBitrate
     * @param sampleRate
     * @param etagInfo
     * @return ResponseEntity<LiveStreamInfo>
     */
    ResponseEntity<LiveStreamInfo> addVideoLiveStream(Integer id, Integer maxSegments, Integer width, Integer height, Integer bitrate, Integer audioBitrate, Integer sampleRate, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * POST method
     *
     * @param uRL
     * @param storageGroup
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> downloadFile(String uRL, String storageGroup) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param id
     * @param width
     * @param height
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getAlbumArt(Integer id, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param storageGroup
     * @param fileName
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getFile(String storageGroup, String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param storageGroup
     * @param etagInfo
     * @return ResponseEntity<String[]>
     */
    ResponseEntity<String[]> getFileList(String storageGroup, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param storageGroup
     * @param fileName
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getHash(String storageGroup, String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param storageGroup
     * @param fileName
     * @param width
     * @param height
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getImageFile(String storageGroup, String fileName, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param id
     * @param etagInfo
     * @return ResponseEntity<LiveStreamInfo>
     */
    ResponseEntity<LiveStreamInfo> getLiveStream(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param fileName
     * @param etagInfo
     * @return ResponseEntity<LiveStreamInfoList>
     */
    ResponseEntity<LiveStreamInfoList> getLiveStreamList(String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param id
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getMusic(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param chanId
     * @param startTime
     * @param width
     * @param height
     * @param secsIn
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getPreviewImage(Integer chanId, org.joda.time.DateTime startTime, Integer width, Integer height, Integer secsIn, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param inetref
     * @param season
     * @param etagInfo
     * @return ResponseEntity<ArtworkInfoList>
     */
    ResponseEntity<ArtworkInfoList> getProgramArtworkList(String inetref, Integer season, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param chanId
     * @param startTime
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getRecording(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param type
     * @param inetref
     * @param season
     * @param width
     * @param height
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getRecordingArtwork(String type, String inetref, Integer season, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param chanId
     * @param startTime
     * @param etagInfo
     * @return ResponseEntity<ArtworkInfoList>
     */
    ResponseEntity<ArtworkInfoList> getRecordingArtworkList(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param id
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getVideo(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param type
     * @param id
     * @param width
     * @param height
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getVideoArtwork(String type, Integer id, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param id
     * @param etagInfo
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> removeLiveStream(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param id
     * @param etagInfo
     * @return ResponseEntity<LiveStreamInfo>
     */
    ResponseEntity<LiveStreamInfo> stopLiveStream(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

}