package Data;

import Data.Time;

import java.util.ArrayList;

public class CollectData {
    public static void main(String[] args) {
        ArrayList<String> timeAndDate = Time.getTimeAndDate();
        for (int i = 0; i < 6; i++) {
            System.out.println(i + " = " + timeAndDate.get(i));
        }
    }
}
