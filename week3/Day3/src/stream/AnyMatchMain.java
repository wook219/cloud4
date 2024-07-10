package stream;

import java.util.stream.Stream;

public class AnyMatchMain {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Alice", "Bob", "Charlie", "Dave");
        boolean anyMatch = names.anyMatch(name -> name.startsWith("A"));
        System.out.println(anyMatch);
    }
}
