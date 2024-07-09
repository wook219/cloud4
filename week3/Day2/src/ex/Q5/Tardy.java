package ex.Q5;

import java.time.LocalTime;
import java.util.Scanner;

public class Tardy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();

        LocalTime time = LocalTime.of(hour, minute, second);
        time = time.plusMinutes(N);

        System.out.println(time.toString());
    }
}
