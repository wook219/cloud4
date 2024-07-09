package time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime startTime = LocalTime.of(14, 0 ,0);
        LocalTime endTime = LocalTime.of(17,13,47);

        Duration duration = Duration.between(startTime,endTime);

        System.out.println(duration);
        System.out.println(ChronoUnit.SECONDS.between(startTime,endTime));
    }
}
