package FourthMonth.MentorLessons.Lesson28.Task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CityWeatherSystem system=new CityWeatherSystem();
        system.addCityWeather("Paris", new WeatherInfo(23, 59, "Cloudy"));
        system.addCityWeather("New York", new WeatherInfo(25.5, 60, "Sunny"));
        system.addCityWeather("Tokyo", new WeatherInfo(28, 86, "Clear"));

        system.updateCityWeather("Los Angeles", new WeatherInfo(32.0, 55, "Clear"));
        system.removeCityWeather("Tokyo");
        system.displayAllCitiesWeather();

    }
}
