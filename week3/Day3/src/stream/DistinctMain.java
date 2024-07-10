package stream;

import java.util.stream.Stream;

public class DistinctMain {
    public static void main(String[] args) {
        Stream.of("Apple", "Banana", "Apple", "Mango", "Banana")
                .distinct()
                .forEach(System.out::println);
    }
}
