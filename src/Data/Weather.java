package Data;

public class Weather {
    private String key = "ac5ff354b24c459e87dab4a4959a779e";

    public static WeatherData getWeather() {
        String url = String.format("http://api.weatherbit.io/v2.0/forecast/daily?city=Grain Valley,MO&key=%s");
    }
}
