package time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate lastChristmas = LocalDate.of(2022, 12, 15);
        LocalDate today = LocalDate.now();

        Period period = Period.between(lastChristmas, today);
        System.out.println(period);

        long datePassed = ChronoUnit.DAYS.between(lastChristmas, today);

        System.out.println("today = " + today);
        System.out.println(datePassed + " day passed from last christmas");
    }
}
