/*
 * Copyright (c) 2014 TIKINOU LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mythtv.services.api.v028.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <b>Auto-generated file, do not modify manually !!!!</b>
 *
 * @author Sebastien Astie
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class Input {
    
        
        @JsonProperty( "Id" )
        private Integer id;
        
        
        @JsonProperty( "CardId" )
        private Integer cardId;
        
        
        @JsonProperty( "SourceId" )
        private Integer sourceId;
        
        
        @JsonProperty( "InputName" )
        private String inputName;
        
        
        @JsonProperty( "DisplayName" )
        private String displayName;
        
        
        @JsonProperty( "QuickTune" )
        private Boolean quickTune;
        
        
        @JsonProperty( "RecPriority" )
        private Integer recPriority;
        
        
        @JsonProperty( "ScheduleOrder" )
        private Integer scheduleOrder;
        
        
        @JsonProperty( "LiveTVOrder" )
        private Integer liveTVOrder;
        
        /**
         * @return the id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId( Integer id ) {
            this.id = id;
        }
        
        /**
         * @return the cardId
         */
        public Integer getCardId() {
            return cardId;
        }

        /**
         * @param cardId the cardId to set
         */
        public void setCardId( Integer cardId ) {
            this.cardId = cardId;
        }
        
        /**
         * @return the sourceId
         */
        public Integer getSourceId() {
            return sourceId;
        }

        /**
         * @param sourceId the sourceId to set
         */
        public void setSourceId( Integer sourceId ) {
            this.sourceId = sourceId;
        }
        
        /**
         * @return the inputName
         */
        public String getInputName() {
            return inputName;
        }

        /**
         * @param inputName the inputName to set
         */
        public void setInputName( String inputName ) {
            this.inputName = inputName;
        }
        
        /**
         * @return the displayName
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * @param displayName the displayName to set
         */
        public void setDisplayName( String displayName ) {
            this.displayName = displayName;
        }
        
        /**
         * @return the quickTune
         */
        public Boolean isQuickTune() {
            return quickTune;
        }

        /**
         * @param quickTune the quickTune to set
         */
        public void setQuickTune( Boolean quickTune ) {
            this.quickTune = quickTune;
        }
        
        /**
         * @return the recPriority
         */
        public Integer getRecPriority() {
            return recPriority;
        }

        /**
         * @param recPriority the recPriority to set
         */
        public void setRecPriority( Integer recPriority ) {
            this.recPriority = recPriority;
        }
        
        /**
         * @return the scheduleOrder
         */
        public Integer getScheduleOrder() {
            return scheduleOrder;
        }

        /**
         * @param scheduleOrder the scheduleOrder to set
         */
        public void setScheduleOrder( Integer scheduleOrder ) {
            this.scheduleOrder = scheduleOrder;
        }
        
        /**
         * @return the liveTVOrder
         */
        public Integer getLiveTVOrder() {
            return liveTVOrder;
        }

        /**
         * @param liveTVOrder the liveTVOrder to set
         */
        public void setLiveTVOrder( Integer liveTVOrder ) {
            this.liveTVOrder = liveTVOrder;
        }
        
}