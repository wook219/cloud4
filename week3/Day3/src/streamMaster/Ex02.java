package streamMaster;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {

        String[] strArr = {"a","b","c","d"};
        Stream<String> strStream = Stream.of(strArr);
        strStream.forEach(System.out::println);

        Stream<String> strStream2 = Arrays.stream(strArr);
        strStream2.forEach(System.out::println);

        Integer[] intArr = {1,2,3,4,5};
        Stream<Integer> intStream = Arrays.stream(intArr);
        intStream.forEach(System.out::println);
       // System.out.println(intStream.count());
       // System.out.println(intStream.average());
       // System.out.println(intStream.sum());
    }
}
