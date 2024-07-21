package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15649 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int depth){

        if(depth == M){
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            //해당 값을 방문하지 않았다면
            if(!visit[i]){
                visit[i] = true; // 해당 값을 방문상태로 변경
                arr[depth] = i + 1; // 해당 깊이를 index로 하여 i+1 값 저장
                dfs(depth + 1); // 다음 자식 값 방문을 위해 depth 1 증가시키면서 재귀 돌림

                //자식값 방문 끝나고 돌아오면 방문값을 방문하지 않은 상태로 변경
                visit[i] = false;
            }
        }
    }
}
