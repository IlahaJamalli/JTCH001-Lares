package FourthMonth.MentorLessons.Lesson28.Task3;

public class WeatherInfo {
    double temperature;
    int humidity;
    String condition;

    public WeatherInfo(double temperature, int humidity, String condition) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", condition='" + condition + '\'' +
                '}';
    }
}
