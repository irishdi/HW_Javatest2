package Lesson_8.project;

import Lesson_8.project.entity.WeatherData;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseRepositorySQLiteImpl implements DatabaseRepository {

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    String filename = null;
    String createTableQuery = "CREATE TABLE IF NOT EXISTS weather (\n" +
        "id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
        "city TEXT NOT NULL,\n" +
        "date_time TEXT NOT NULL,\n" +
        "weather_text TEXT NOT NULL,\n" +
        "MIN_temperature REAL NOT NULL,\n" +
            "MAX_temperature REAL NOT NULL,\n" +
        ");";
    String insertWeatherQuery = "INSERT INTO weather (city, date_time, weather_text, MIN_temperature, MAX_temperature) VALUES (?,?,?,?,?)";

    public DatabaseRepositorySQLiteImpl() {
        filename = ApplicationGlobalState.getInstance().getDBFileName();
    }

    private Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + filename);
        return connection;
    }

    public Statement getStatement() throws SQLException{
        Statement statement = getConnection().createStatement();
        return statement;
    }

    public PreparedStatement getPreparedStatement() throws SQLException{
        PreparedStatement preparedStatement = getConnection().prepareStatement(insertWeatherQuery);
        return preparedStatement;
    }

    void createTableIfNotExists() {
        try (Statement statement = getStatement()) {
            statement.executeUpdate(createTableQuery);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public boolean saveWeatherData(WeatherData weatherData) throws SQLException {
        String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();
        try (Connection connection = getConnection();

        PreparedStatement saveWeather = connection.prepareStatement(insertWeatherQuery)) {
            saveWeather.setString(1, weatherData.getCity());
            saveWeather.setString(2, weatherData.getLocalDate());
            saveWeather.setString(3, weatherData.getText());
            saveWeather.setDouble(4, weatherData.getMinTemperature());
            saveWeather.setDouble(5, weatherData.getMaxTemperature());
            return saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("Failure on saving weather object");
    }

    @Override
    public List<WeatherData> getSavedData() throws IOException, SQLException {
        ResultSet result = getConnection().createStatement().executeQuery("SELECT * FROM weather");
        List<WeatherData> weatherDataList = new ArrayList<WeatherData>();
        while (result.next()){
            weatherDataList.add(new WeatherData(result.getString(2), result.getString(3), result.getString(4), result.getDouble(5), result.getDouble(6)));
        }
        return weatherDataList;
    }

    public void closeConnection(){
        try {
            getConnection().close();
            getStatement().close();
            getPreparedStatement().close();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
