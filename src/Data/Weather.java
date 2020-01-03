package Data;

import org.json.JSONArray;
import org.json.JSONObject;

public class Weather {
    private static String key = "ac5ff354b24c459e87dab4a4959a779e";

    //Responsible for formatting the code into the class WeatherData
    public static WeatherData getWeather() throws Exception {
        String[] lows = new String[7];
        String[] highs = new String[7];
        String[] weatherTypes = new String[7];
        String[] icons = new String[7];
        String currentTemp;
        String pop;
        String visiblity;
        String appTemp;

        //Values on a daily basis
        JSONArray sixteenDayWeather = JSONParse.getDataFromLink("http://api.weatherbit.io/v2.0/forecast/daily?city=Grain%20Valley,MO&key=ac5ff354b24c459e87dab4a4959a779e&units=I").getJSONArray("data");
        for(int i = 0; i < 7; i++) {
            JSONObject daysWeather = sixteenDayWeather.getJSONObject(i);
            lows[i] = String.valueOf(daysWeather.getInt("low_temp"));
            highs[i] = String.valueOf(daysWeather.getInt("high_temp"));
            weatherTypes[i] = daysWeather.getJSONObject("weather").getString("description");
            icons[i] = daysWeather.getJSONObject("weather").getString("icon");
        }
        JSONObject todaysWeather = sixteenDayWeather.getJSONObject(0);
        pop = String.valueOf(todaysWeather.getInt("pop"));
        visiblity = String.valueOf(todaysWeather.getInt("vis"));

        //Current values at the moment
        JSONObject currentWeather = JSONParse.getDataFromLink("http://api.weatherbit.io/v2.0/current?city=Grain%20Valley,MO&key=ac5ff354b24c459e87dab4a4959a779e&units=I").getJSONArray("data").getJSONObject(0);
        currentTemp = String.valueOf(currentWeather.getInt("temp"));
        appTemp = String.valueOf(currentWeather.getInt("app_temp"));

        //Create Object
        WeatherData weatherData = new WeatherData(lows,highs,weatherTypes,icons,currentTemp,pop,visiblity,appTemp);
        return weatherData;
    }

}
