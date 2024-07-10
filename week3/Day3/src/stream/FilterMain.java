package stream;

import java.util.Arrays;
import java.util.List;

public class FilterMain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
