package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "An", "Banana", "Orange", "Kiwi");

        //스트림을 사용한 필터링 및 변환
        List<String> filtered = strings.stream()  // 스트림 생성
                .filter(s -> s.length() > 3)  // 길이가 3보다 큰 요소 필터링 -> 중간 연산
                .map(String::toUpperCase) // 모든 요소를 대문자로 변환 -> 중간 연산
                .collect(Collectors.toList()); // 결과를 리스트로 수집 -> 최종 연산

        System.out.println(filtered);
    }
}
