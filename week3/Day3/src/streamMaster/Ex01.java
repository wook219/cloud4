package streamMaster;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream(); //list를 데이터 소스로 하는 스트림 생성

        intStream.forEach(System.out::print);
//        intStream.forEach(System.out::print); //최종연산을 수행했기 때문에 다시 스트림을 만들어줘야함
    }
}
