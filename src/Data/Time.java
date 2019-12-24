package Data;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Time {
    public static ArrayList<String> getTimeAndDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH mm");
        LocalDateTime now = LocalDateTime.now();
        ArrayList<String> vals = new ArrayList<>();
        for(String val: dtf.format(now).split(" ")) {
            vals.add(val);
        }
        if(Integer.parseInt(vals.get(3)) >= 12) {
            vals.set(3,String.valueOf(Integer.parseInt(vals.get(3))-12));
            vals.add("PM");
        } else {
            vals.add("AM");
        }
        return vals;
    }
}
