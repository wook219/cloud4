package streamMaster;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(5,10);
        intStream.limit(5)
                 .forEach(System.out::println);
    }
}
