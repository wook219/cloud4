package stream;

import java.util.Arrays;
import java.util.List;

public class SortedMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Apricot");
        fruits.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
