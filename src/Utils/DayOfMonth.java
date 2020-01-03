package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DayOfMonth {
    public static String getDayName(int year, int month, int day) {
        Date date = (new GregorianCalendar(year, month, day)).getTime();
        System.out.println(new SimpleDateFormat("EEEE").format(date));//TEST
        return new SimpleDateFormat("EEEE").format(date);
    }
}
