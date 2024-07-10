package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain2 {
    public static void main(String[] args) {
        //컬렉션에서 stream() 메서드 사용
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Stream<String> listStream = list.stream();

        //배열에서 Arrays.stream(Object[])
        String[] array = {"Dog", "Cat", "Elephant"};
        Stream<String> arrayStream = Arrays.stream(array);

        //정적 메소드 Stream.of()
        Stream<String> ofStream = Stream.of("Java", "Python", "C++");

        //무한 스트림 Stream.iterate()
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n+2).limit(10);

        //무한 스트림 Stream.generate()
        Stream<Double> generateStream = Stream.generate(Math::random).limit(10);
    }
}
