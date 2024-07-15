package streamMaster;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex07 {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

        //flatMap으로 하나의 스트림으로 변환
        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);

        strStream.map(String::toLowerCase) // 스트림의 요소를 모두 소문자로 변경
                .distinct() // 중복제거
                .sorted() //정렬
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try"
        };


        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) // 하나 이상의 공백으로 잘라서 단어를 스트림의 요소 변호나
                .map(String::toLowerCase) //스트림의 요소를 소문자로 변환
                .distinct() // 중복제거
                .sorted() // 정렬
                .forEach(System.out::println);

    }
}
