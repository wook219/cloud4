package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxMinMain {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(5, 3, 8, 2, 1);

        Integer max = numbers.max(Comparator.naturalOrder()).orElse(-1);
        System.out.println(max);

        numbers = Stream.of(5, 3, 8, 2, 1); //스트림 재생성
        Integer min = numbers.min(Comparator.naturalOrder()).orElse(-1);
        System.out.println(min);
    }
}
