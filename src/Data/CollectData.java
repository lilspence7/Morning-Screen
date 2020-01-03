package Data;

import Data.Time;
import Data.Weather;

import java.util.ArrayList;

public class CollectData {
    public static void main(String[] args) throws Exception {
        ArrayList<String> timeAndDate = Time.getTimeAndDate();
        WeatherData weatherData = Weather.getWeather();
        Verse.getVerse();
        for(String headline: News.getNewsHeadlines()) {
            System.out.println(headline);
        }
    }
}
