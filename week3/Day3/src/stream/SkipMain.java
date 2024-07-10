package stream;

import java.util.stream.Stream;

public class SkipMain {
    public static void main(String[] args) {
        Stream.of("1", "2", "3", "4", "5")
                .skip(2)
                .forEach(System.out::println);
    }
}
