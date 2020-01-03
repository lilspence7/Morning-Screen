package Data;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Time {
    // 0 = Year
    // 1 = Month
    // 2 = Day
    // 3 = Hour
    // 4 = Minutes
    // 5 = Half of day

    public static ArrayList<String> getTimeAndDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH mm");
        LocalDateTime now = LocalDateTime.now();
        ArrayList<String> vals = new ArrayList<>();
        for(String val: dtf.format(now).split(" ")) {
            vals.add(val);
        }
        if(Integer.parseInt(vals.get(3)) >= 12) {
            vals.set(3,String.valueOf(Integer.parseInt(vals.get(3))-12));
            vals.add("pm");
        } else {
            vals.add("am");
        }
        return vals;
    }
}
