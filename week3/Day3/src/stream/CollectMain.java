package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMain {
    public static void main(String[] args) {
        Stream<String> fruitStream = Stream.of("Apple", "Banana", "Cherry", "Date");
        List<String> fruitList = fruitStream.collect(Collectors.toList());
        System.out.println(fruitList);
    }
}
