package stream;

import java.util.stream.Stream;

public class CountMain {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C", "D");
        long count = stream.count();
        System.out.println(count);
    }
}
