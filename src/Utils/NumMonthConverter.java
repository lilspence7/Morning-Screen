package Utils;

public class NumMonthConverter {
   public static String convertToMonthName(int num) {
       String[] months = "January February March April May June July August September October November December".split(" ");
       return months[num-1];
   }
}
