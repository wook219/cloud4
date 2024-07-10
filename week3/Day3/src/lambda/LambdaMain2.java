package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaMain2 {
    public static void main(String[] args) {
        //람다 표현식
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println(number));

        //메서드 참조
        numbers.forEach(System.out::println);

        //람다 표현식
        List<String> strings = Arrays.asList("a", "b", "c");
        strings.forEach(s -> System.out.println(s.toUpperCase()));

        //메서드 참조
        strings.forEach(String::toUpperCase);
    }
}
