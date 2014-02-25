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
package org.mythtv.services.core.domain;

import org.joda.time.DateTime;
import org.mythtv.services.core.events.dvr.ArtworkInfoDetails;
import org.mythtv.services.core.events.dvr.ProgramDetails;
import org.mythtv.services.core.events.dvr.ProgramListDetails;

import java.util.ArrayList;
import java.util.List;

public class ProgramList {

        private Integer startIndex;
        private Integer count;
        private Integer totalAvailable;
        private DateTime asOf;
        private String version;
        private String protoVer;
        private Program[] programs;

        /**
         * @return the startIndex
         */
        public Integer getStartIndex() {
            return startIndex;
        }

        /**
         * @param startIndex the startIndex to set
         */
        public void setStartIndex( Integer startIndex ) {
            this.startIndex = startIndex;
        }

        /**
         * @return the count
         */
        public Integer getCount() {
            return count;
        }

        /**
         * @param count the count to set
         */
        public void setCount( Integer count ) {
            this.count = count;
        }

        /**
         * @return the totalAvailable
         */
        public Integer getTotalAvailable() {
            return totalAvailable;
        }

        /**
         * @param totalAvailable the totalAvailable to set
         */
        public void setTotalAvailable( Integer totalAvailable ) {
            this.totalAvailable = totalAvailable;
        }

        /**
         * @return the asOf
         */
        public DateTime getAsOf() {
            return asOf;
        }

        /**
         * @param asOf the asOf to set
         */
        public void setAsOf( DateTime asOf ) {
            this.asOf = asOf;
        }

        /**
         * @return the version
         */
        public String getVersion() {
            return version;
        }

        /**
         * @param version the version to set
         */
        public void setVersion( String version ) {
            this.version = version;
        }

        /**
         * @return the protoVer
         */
        public String getProtoVer() {
            return protoVer;
        }

        /**
         * @param protoVer the protoVer to set
         */
        public void setProtoVer( String protoVer ) {
            this.protoVer = protoVer;
        }

        /**
         * @return the programs
         */
        public Program[] getPrograms() {
            return programs;
        }

        /**
         * @param programs the programs to set
         */
        public void setPrograms( Program[] programs ) {
            this.programs = programs;
        }

    public ProgramListDetails toProgramListDetails() {

        ProgramListDetails details = new ProgramListDetails();
        details.setStartIndex( startIndex );
        details.setCount( count );
        details.setTotalAvailable( totalAvailable );
        details.setAsOf( asOf );
        details.setProtoVer( protoVer );
        details.setVersion( version );

        if( null != programs && programs.length > 0 ) {

            List<ProgramDetails> programDetails = new ArrayList<ProgramDetails>();
            for( Program program : programs ) {
                programDetails.add(program.toProgramDetails());
            }
            details.setPrograms(programDetails.toArray(new ProgramDetails[programDetails.size()]));
        }

        return details;
    }

    public static ProgramList fromProgramListDetails( ProgramListDetails details ) {

        ProgramList programList = new ProgramList();
        programList.setStartIndex( details.getStartIndex() );
        programList.setCount( details.getCount() );
        programList.setTotalAvailable( details.getTotalAvailable() );
        programList.setAsOf( details.getAsOf() );
        programList.setProtoVer( details.getProtoVer() );
        programList.setVersion( details.getVersion() );

        if( null != details.getPrograms() && details.getPrograms().length > 0 ) {

            List<Program> programs = new ArrayList<Program>();
            for( ProgramDetails detail : details.getPrograms() ) {
                programs.add( Program.fromProgramDetails( detail ) );
            }
            programList.setPrograms( programs.toArray( new Program[ programs.size() ] ) );
        }

        return programList;
    }

}