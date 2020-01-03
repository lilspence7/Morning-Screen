package Controllers;

import Data.*;
import Utils.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class MorningScreenController implements Initializable {
    @FXML
    Label timeLabel;
    @FXML
    Label halfOfDayLabel;
    @FXML
    Label newsLabel1;
    @FXML
    Label newsLabel2;
    @FXML
    Label newsLabel3;
    @FXML
    Label newsLabel4;
    @FXML
    Label newsLabel5;
    @FXML
    Label verseLabel;
    @FXML
    Label verseReferenceLabel;
    @FXML
    Label tempLabel;
    @FXML
    Label feelsLikeLabel;
    @FXML
    Label tempLabelLowHigh;
    @FXML
    Label precipitationLabel;
    @FXML
    Label visibilityLabel;
    @FXML
    Label dateLabel;
    @FXML
    Label day1Label;
    @FXML
    Label day2Label;
    @FXML
    Label day3Label;
    @FXML
    ImageView day1Image;
    @FXML
    ImageView day2Image;
    @FXML
    ImageView day3Image;
    @FXML
    ImageView currentWeatherImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       ArrayList<String> timeAndDate = null;
       String[] headlines = new String[0];
       WeatherData weatherData = null;
       String[] dailyVerse = new String[0];

        try {
            timeAndDate = Time.getTimeAndDate();
            headlines = shortenNewsData(News.getNewsHeadlines());
            weatherData = Weather.getWeather();
            dailyVerse = Verse.getVerse();
        } catch (Exception e) {
            e.printStackTrace();
        }

        timeLabel.setText(String.format("%s:%s",timeAndDate.get(3),timeAndDate.get(4)));
        halfOfDayLabel.setText(timeAndDate.get(5));
        newsLabel1.setText(headlines[0]);
        newsLabel2.setText(headlines[1]);
        newsLabel3.setText(headlines[2]);
        newsLabel4.setText(headlines[3]);
        newsLabel5.setText(headlines[4]);
        verseLabel.setText(String.format("\"%s\"", dailyVerse[0]));
        verseReferenceLabel.setText(String.format("- %s %s", dailyVerse[1], dailyVerse[2]));
        tempLabel.setText(String.format("%s°",weatherData.getCurrentTemp()));
        feelsLikeLabel.setText(weatherData.getAppTemp());
        tempLabelLowHigh.setText(String.format("%s°-%s°", weatherData.getLows()[0],weatherData.getHighs()[0]));
        precipitationLabel.setText(weatherData.getPop()+"%");
        visibilityLabel.setText(String.format("%s miles",weatherData.getVis()));
        dateLabel.setText(String.format("%s %s, %s",
                NumMonthConverter.convertToMonthName(Integer.parseInt(timeAndDate.get(1))),
                timeAndDate.get(2),
                timeAndDate.get(0)
        ));
        day1Label.setText(String.format("Tommorow %s/%s",weatherData.getLows()[1],weatherData.getHighs()[1]));
        day2Label.setText(String.format("%s %s/%s",
                DayOfMonth.getDayName(
                        Integer.parseInt(timeAndDate.get(0)),
                        Integer.parseInt(timeAndDate.get(1)),
                        Integer.parseInt(timeAndDate.get(2)))+2,
                weatherData.getLows()[2],
                weatherData.getHighs()[2]));
        day3Label.setText(String.format("%s %s/%s",
                DayOfMonth.getDayName(
                        Integer.parseInt(timeAndDate.get(0)),
                        Integer.parseInt(timeAndDate.get(1)),
                        Integer.parseInt(timeAndDate.get(2)))+3,
                weatherData.getLows()[3],
                weatherData.getHighs()[3]));

        Image[] images = new Image[4];
        for(int i = 0; i < 4; i++) {
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(String.format("C://Projects/Morning-Screen/src/Images/%s.png",weatherData.getIcons()[i]));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            images[i] = new Image(inputStream);
        }
        currentWeatherImage.setImage(images[0]);
        day1Image.setImage(images[1]);
        day2Image.setImage(images[2]);
        day3Image.setImage(images[3]);
    }

    private static String[] shortenNewsData(String[] headlines) {
        for(int i = 0; i < 5; i++) {
            if(headlines[i].length() > 58) {
                headlines[i] = headlines[i].substring(0, 59)+"...";
            }
        }
        return headlines;
    }
}
