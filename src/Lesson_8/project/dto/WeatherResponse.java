package Lesson_8.project.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WeatherResponse {
    private static Lesson_8.project.dto.Headline Headline;
    private ArrayList<Lesson_8.project.dto.DailyForecasts> DailyForecasts = new ArrayList<>();

    public WeatherResponse() {
    }

    @JsonGetter("Headline")
    public static Lesson_8.project.dto.Headline getHeadline() {
        return Headline;
    }

    @JsonSetter("Headline")
    public void setHeadline(Lesson_8.project.dto.Headline Headline) {
        this.Headline = Headline;
    }

    @JsonGetter("DailyForecasts")
    public ArrayList<Lesson_8.project.dto.DailyForecasts> getDailyForecasts() {
        return DailyForecasts;
    }

    @JsonSetter("DailyForecasts")
    public void setDailyForecasts(ArrayList<Lesson_8.project.dto.DailyForecasts> DailyForecasts) {
        this.DailyForecasts = DailyForecasts;
    }

    @Override
    public String toString() {
        return "OneDayForecast{" +
                "Headline=" + Headline +
                ", DailyForecasts=" + DailyForecasts +
                '}';
    }

}
