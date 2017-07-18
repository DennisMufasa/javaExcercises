package trials;

import java.util.Calendar;

public class Calender {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
       int month = cal.get(Calendar.MONTH);
        int week = cal.get(Calendar.WEEK_OF_MONTH);
        int day = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("The year is " + year +"and the month is"+month);

    }

}
