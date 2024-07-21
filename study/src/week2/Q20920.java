package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Q20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        //나오는 횟수 map에 초기화
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.length() >= M)
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        //스트림으로 map 가공
        List<String> sorted = map.entrySet().stream() //map의 엔트리를 스트림으로 변환
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed() // 단어의 출현 횟수 내림차순
                        .thenComparing(entry -> entry.getKey().length(), Comparator.reverseOrder()) // 단어 길이 내림차순
                        .thenComparing(Map.Entry::getKey)) // 알파벳 순
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (String s : sorted) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
