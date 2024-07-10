package stream;

import java.util.stream.Stream;

public class ReduceMain {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Integer sum = numbers.reduce(0, (a ,b) -> a + b);
        System.out.println(sum);
    }
}
