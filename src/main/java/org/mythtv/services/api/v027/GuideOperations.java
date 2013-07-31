package org.mythtv.services.api.v027;

import org.mythtv.services.api.ETagInfo;
import org.mythtv.services.api.MythServiceApiRuntimeException;
import org.mythtv.services.api.v027.beans.Program;
import org.mythtv.services.api.v027.beans.ProgramGuide;
import org.springframework.http.ResponseEntity;

/**
 * @author Sebastien Astie
 */
public interface GuideOperations {

    /*
     * GET method
     *
     * @param chanId
     * @param width
     * @param height
     * @param etagInfo
     * @return ResponseEntity<String>
     */
    ResponseEntity<String> getChannelIcon(Integer chanId, Integer width, Integer height, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param chanId
     * @param startTime
     * @param etagInfo
     * @return ResponseEntity<Program>
     */
    ResponseEntity<Program> getProgramDetails(Integer chanId, org.joda.time.DateTime startTime, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

    /*
     * GET method
     *
     * @param startTime
     * @param endTime
     * @param startChanId
     * @param numChannels
     * @param details
     * @param etagInfo
     * @return ResponseEntity<ProgramGuide>
     */
    ResponseEntity<ProgramGuide> getProgramGuide(org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, Integer startChanId, Integer numChannels, Boolean details, ETagInfo etagInfo) throws MythServiceApiRuntimeException;

}