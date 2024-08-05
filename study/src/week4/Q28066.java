package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q28066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 큐에 들어갈 청설모 마리수
        int K = Integer.parseInt(st.nextToken()); // 첫 번재 청설모 제외 제거될 청설모 수
        int survived = 0;
        //큐 생성
        Queue<Integer> q = new LinkedList<>();

        //큐 초기화
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while(true){
            //큐 내의 남은 수의 개수가 K보다 적거나, 사이즈가 1이면 꺼내고 반복문 종료
            if(q.size() < K || q.size() == 1){
                survived = q.poll();
                break;
            }
            // 뺀 값(큐에서 나갈 순위가 첫번째인 수)을 잠깐 넣어둘 임시 변수 num
            int num = q.poll();

            //(큐에서 나갈 순위가)첫번째인 수를 제외하고 K-1개 만큼 제거
            for (int i = 1; i <= K - 1; i++) {
                q.poll();
            }

            //첫번째 였던 수는 마지막 순위로 올림
            q.offer(num);
        };

        System.out.println(survived);
    }
}
