package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class LambdaMain3 {
    public static void main(String[] args) {
        //람다 표현식
        Supplier<List<String>> supplier1 = () -> new ArrayList<>();

        //메서드 참조
        Supplier<List<String>> supplier2 = ArrayList::new;
    }
}
