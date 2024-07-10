package stream;

import java.util.stream.Stream;

public class LimitMain {
    public static void main(String[] args) {
        Stream.of("A", "B", "C", "D", "E")
                .limit(3)
                .forEach(System.out::println);
    }
}
