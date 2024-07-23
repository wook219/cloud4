package week2;

import java.io.*;
import java.util.StringTokenizer;

public class Q16439 {
    static int N;
    static int M;
    static int[][] like;
    static boolean[] visit;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        like = new int[N][M];
        visit = new boolean[M];

        // 입력 받은 값 like 배열에 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                like[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(max);
    }

    static void dfs(int start, int depth){
        //3개의 치킨을 고른 상태
        if(depth == 3){
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int temp = 0;
                for (int j = 0; j < M; j++) {
                    //visit[j]가 true면 고른 치킨
                    if(visit[j]){
                        temp = Math.max(temp, like[i][j]);
                    }
                }
                sum += temp;
            }
            //sum과 max를 비교해서 최댓값 도출
            max = Math.max(sum, max);
            return;
        }

        for (int i = start; i < M; i++) {
            //해당 값을 방문하지 않았다면
            if(!visit[i]){
                visit[i] = true; // 해당 값을 방문상태로 변경
                dfs(i + 1, depth + 1); // 다음 자식 값 방문을 위해 depth 1 증가시키면서 재귀 돌림
                //자식값 방문 끝나고 돌아오면 방문값을 방문하지 않은 상태로 변경
                visit[i] = false;
            }
        }
    }
}
