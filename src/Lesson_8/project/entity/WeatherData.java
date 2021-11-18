package Lesson_8.project.entity;


public class WeatherData {

    private String city;
    private String localDate;
    private String text;
    private Double minTemperature;
    private Double maxTemperature;

    public WeatherData() {
    }

    public WeatherData(String city, String localDate, String text, Double minTemperature, Double maxTemperature) {
        this.city = city;
        this.localDate = localDate;
        this.text = text;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public String getCity() {
        return city;
    }

    public String getLocalDate() {
        return localDate;
    }

    public String getText() {
        return text;
    }


    public Double getMinTemperature() {
        return minTemperature;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", localDate='" + localDate + '\'' +
                ", text='" + text + '\'' +
                ", minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                '}';
    }
}
