package week1;

import java.util.*;
import java.util.stream.Collectors;

public class Q18870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // 1. List를 생성해서 좌표들을 입력받음
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        //2. 작은수부터 정렬
        List<Integer> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());

        // 3. map을 이용해서 정렬된 리스트의 값을 꺼내서 하나씩 순위를 매김.
        // 단, 중복된 값이 들어있을 경우 수행하지 않음.
        Map<Integer, Integer> ranking = new HashMap<>();
        int rank = 0;

        for (int i = 0; i < sorted.size(); i++) {
            int num = sorted.get(i);
            if(!ranking.containsKey(num)){
                ranking.put(num, rank);
                rank++;
            }
        }

        //4. 좌표 압축을 적용한 결과를 담을 List compression생성
        List<Integer> compression =  new ArrayList<>();

        //5. compression에 맵에 있는 값을 하나씩 꺼내서 넣음
        for (Integer i : list) {
            compression.add(ranking.get(i));
        }

        //6. sout으로 출력하니 시간초과 떠서 StringBuilder를 사용해서 출력
        StringBuilder sb = new StringBuilder();

        for (Integer i : compression) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
