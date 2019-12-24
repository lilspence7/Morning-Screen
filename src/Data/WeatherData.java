package Data;

public class WeatherData {
    private String[] lows;
    private String[] highs;
    private String[] weatherTypes;
    private String currentTemp;
    private String pop;
    private String vis;

    public WeatherData (String[] lows, String[] highs, String[] weatherTypes, String currentTemp, String pop, String vis) {
        this.lows = lows;
        this.highs = highs;
        this.weatherTypes = weatherTypes;
        this.currentTemp = currentTemp;
        this.pop = pop;
        this.vis = vis;
    }

    public String[] getLows() {
        return lows;
    }

    public void setLows(String[] lows) {
        this.lows = lows;
    }

    public String[] getHighs() {
        return highs;
    }

    public void setHighs(String[] highs) {
        this.highs = highs;
    }

    public String[] getWeatherTypes() {
        return weatherTypes;
    }

    public void setWeatherTypes(String[] weatherTypes) {
        this.weatherTypes = weatherTypes;
    }

    public String getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(String currentTemp) {
        this.currentTemp = currentTemp;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }
}
