package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChainingMain {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Stream", "Operations", "Java", "Lambda", "Filter", "Collect");

        List<String> result = words.stream() // 스트림 생성
                // 중간 연산1 : 길이가 5보다 큰 문자열 필터링
                .filter(word -> word.length() > 5)
                // 중간 연산2 : 남은 문자열을 대문자로 변환
                .map(String::toUpperCase)
                // 최종 연산 : 결과를 리스트로 수집
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
