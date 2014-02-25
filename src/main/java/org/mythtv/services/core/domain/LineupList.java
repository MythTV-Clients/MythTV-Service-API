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

import org.mythtv.services.core.events.channel.LineupDetails;
import org.mythtv.services.core.events.channel.LineupListDetails;

import java.util.ArrayList;
import java.util.List;

public class LineupList {

        private Lineup[] lineups;

        /**
         * @return the lineups
         */
        public Lineup[] getLineups() {
            return lineups;
        }

        /**
         * @param lineups the lineups to set
         */
        public void setLineups( Lineup[] lineups ) {
            this.lineups = lineups;
        }

    public LineupListDetails toLineupListDetails() {

        LineupListDetails details = new LineupListDetails();

        if( null != lineups && lineups.length > 0 ) {

            List<LineupDetails> lineupDetails = new ArrayList<LineupDetails>();
            for( Lineup lineup : lineups ) {
                lineupDetails.add( lineup.toLineupDetails() );
            }
            details.setLineups( lineupDetails.toArray( new LineupDetails[ lineupDetails.size() ] ) );
        }

        return details;
    }

    public static LineupList fromLineupListDetails( LineupListDetails details ) {

        LineupList lineupList = new LineupList();

        if( null != details.getLineups() && details.getLineups().length > 0 ) {

            List<Lineup> lineups = new ArrayList<Lineup>();
            for( LineupDetails detail : details.getLineups() ) {
                lineups.add( Lineup.fromLineupDetails( detail ) );
            }
            lineupList.setLineups( lineups.toArray( new Lineup[ lineups.size() ] ) );
        }

        return lineupList;
    }

}