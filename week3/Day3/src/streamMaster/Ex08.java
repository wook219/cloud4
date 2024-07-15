package streamMaster;

import java.util.Optional;

public class Ex08 {
    public static void main(String[] args) {

        Optional<String> opt = null; //OK. 에러 안남, 하지만 바람직하지 않다.
        Optional<String> opt2 = Optional.empty(); // OK. 권장
        Optional<String> opt3 = Optional.of("abc"); // OK. 권장

        System.out.println("opt = " + opt);
        System.out.println("opt2 = " + opt2);

        String str = "";

        str = opt2.orElse("Empty"); // Optional에 저장된 값이 null이면 ""반환
        System.out.println("str = " + str);

        str = opt3.orElse("Empty"); // Optional에 저장된 값이 null이면 ""반환
        System.out.println(str);
    }
}
