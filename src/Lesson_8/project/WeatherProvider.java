package Lesson_8.project;


import Lesson_8.project.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException, SQLException;
}
