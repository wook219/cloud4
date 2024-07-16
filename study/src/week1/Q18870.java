package week1;

import java.util.*;

public class Q18870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // 1. 좌표를 담을 List를 생성. 좌표를 입력받아 list에 추가
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        //2. 작은수부터 정렬
        List<Integer> sorted = list.stream()
                .sorted()
                .toList();

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

        //5. compression에 맵에 있는 value를 하나씩 꺼내서 넣음
        for (Integer i : list) {
            compression.add(ranking.get(i)); // get() 매개변수 key, 반환타입 value
        }

        //6. System.out.println(compression);으로 출력하니 시간초과 떠서 StringBuilder를 사용해서 출력
        StringBuilder sb = new StringBuilder();

        for (Integer i : compression) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);

//        for (Integer i : compression) {
//            System.out.print(i + " ");
//        }
    }
}
