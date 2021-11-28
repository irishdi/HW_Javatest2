package Lesson_8.project;

import Lesson_8.project.entity.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface DatabaseRepository {

    boolean saveWeatherData(WeatherData weatherData) throws SQLException;
    List<WeatherData> getSavedData() throws IOException, SQLException;

}
