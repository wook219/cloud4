package util;

import java.util.Calendar;

public class CalendarMain {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getCalendarType());

        Calendar lastChristmas = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        System.out.println("----------Last Christmas----------");
        lastChristmas.set(2024, Calendar.DECEMBER, 25);

        System.out.println("today = " + today.get(Calendar.YEAR) + "." + (today.get(Calendar.MONTH)+1) + "." + today.get(Calendar.DATE));

        long datePassed = (today.getTimeInMillis() - lastChristmas.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        System.out.println(datePassed + " days passed from last christmas.");
    }
}
