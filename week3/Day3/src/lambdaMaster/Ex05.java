package lambdaMaster;

import java.util.function.Function;

public class Ex05 {
    public static void main(String[] args) {

        Function<String, Integer> f = (String s) -> Integer.parseInt(s); // 람다식
        System.out.println(f.apply("100") + 200);

        Function<String, Integer> f2 = Integer::parseInt; //메서드 참조. 클래스이름::메서드명
        System.out.println(f2.apply("100") + 200);

    }
}
