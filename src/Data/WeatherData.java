package Data;

public class WeatherData {
    private String[] lows;
    private String[] highs;
    private String[] weatherTypes;
    private String[] icons;
    private String currentTemp;
    private String pop;
    private String vis;
    private String appTemp;


    public WeatherData (String[] lows, String[] highs, String[] weatherTypes, String[] icons, String currentTemp, String pop, String vis, String appTemp) {
        this.lows = lows;
        this.highs = highs;
        this.weatherTypes = weatherTypes;
        this.icons = icons;
        this.currentTemp = currentTemp;
        this.pop = pop;
        this.vis = vis;
        this.appTemp = appTemp;
    }

    public String getAppTemp() {
        return appTemp;
    }

    public void setAppTemp(String appTemp) {
        this.appTemp = appTemp;
    }

    public String[] getIcons() {
        return icons;
    }

    public void setIcons(String[] icons) {
        this.icons = icons;
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
