package Lesson_8.project.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Headline {

        @JsonProperty(value = "EffectiveDate")
        private String date;
        @JsonProperty(value = "Text")
        private String Text;
        private String EndDate;

        public Headline() {
        }

        @Override
        public String toString() {
            return "Headline{" +
                    "EffectiveDate='" + date + '\'' +
                    ", Text='" + Text + '\'' +
                    ", EndDate='" + EndDate;
        }

        @JsonGetter("EffectiveDate")
        public String getEffectiveDate() {
            return date;
        }

        @JsonSetter("EffectiveDate")
        public void setEffectiveDate(String effectiveDate) {
            date = effectiveDate;
        }

        @JsonGetter("Text")
        public String getText() {
            return Text;
        }

        @JsonSetter("Text")
        public void setText(String text) {
            Text = text;
        }

        @JsonGetter("EndDate")
        public String getEndDate() {
            return EndDate;
        }

        @JsonSetter("EndDate")
        public void setEndDate(String endDate) {
            EndDate = endDate;
        }


    }

