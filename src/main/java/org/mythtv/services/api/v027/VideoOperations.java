package org.mythtv.services.api.v027;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.BlurayInfo;
import org.mythtv.services.api.v027.beans.VideoLookupList;
import org.mythtv.services.api.v027.beans.VideoMetadataInfo;
import org.mythtv.services.api.v027.beans.VideoMetadataInfoList;
import org.springframework.http.ResponseEntity;

/**
 * @author Sebastien Astie
 */
public interface VideoOperations {

    /*
     * POST method
     *
     * @param fileName
     * @param hostName
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> addVideo(String fileName, String hostName) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param path
     * @param etagInfo
     * @return ResponseEntity<BlurayInfo>
     */
    ResponseEntity<BlurayInfo> getBluray(String path, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param id
     * @param etagInfo
     * @return ResponseEntity<VideoMetadataInfo>
     */
    ResponseEntity<VideoMetadataInfo> getVideo(Integer id, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param fileName
     * @param etagInfo
     * @return ResponseEntity<VideoMetadataInfo>
     */
    ResponseEntity<VideoMetadataInfo> getVideoByFileName(String fileName, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param descending
     * @param startIndex
     * @param count
     * @param etagInfo
     * @return ResponseEntity<VideoMetadataInfoList>
     */
    ResponseEntity<VideoMetadataInfoList> getVideoList(Boolean descending, Integer startIndex, Integer count, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param title
     * @param subtitle
     * @param inetref
     * @param season
     * @param episode
     * @param grabberType
     * @param allowGeneric
     * @param etagInfo
     * @return ResponseEntity<VideoLookupList>
     */
    ResponseEntity<VideoLookupList> lookupVideo(String title, String subtitle, String inetref, Integer season, Integer episode, String grabberType, Boolean allowGeneric, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * POST method
     *
     * @param id
     * @return ResponseEntity<Boolean>
     */
    ResponseEntity<Boolean> removeVideoFromDB(Integer id) throws MythServiceApiRuntimeException;

}