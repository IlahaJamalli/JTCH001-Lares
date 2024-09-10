package FourthMonth.MentorLessons.Lesson28.Task3;

import java.util.HashMap;
import java.util.Map;

public class CityWeatherSystem {
    Map<String, WeatherInfo> info;

    public CityWeatherSystem() {
        this.info = new HashMap<String, WeatherInfo>();
    }
    public void addCityWeather(String city, WeatherInfo weatherInfo){
        info.put(city, weatherInfo);
    }

    public void removeCityWeather(String city){
        info.remove(city);
    }

    public void updateCityWeather(String city, WeatherInfo weatherInfo){
        info.put(city, weatherInfo);
    }

    public void getCityWeather(String city){
        info.get(city);
    }
    public void displayAllCitiesWeather(){
       for (Map.Entry<String, WeatherInfo> entry : info.entrySet()){
           System.out.println(entry.getKey());
           System.out.println(entry.getValue());
       }
    }

}
