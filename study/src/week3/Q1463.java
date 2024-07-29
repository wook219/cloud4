package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1463 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        dp[0] = 0;
        dp[1] = 0;

        System.out.println(cal(N));
    }

    static int cal(int N){

        if(dp[N] == null){
            //3,2로 나누어 떨어 지는 경우
            if(N % 6 == 0){
                dp[N] = Math.min(cal(N-1), Math.min(cal(N / 3), cal(N / 2))) + 1;
            }
            //3으로만 나누어 떨어 지는 경우
            else if(N % 3 == 0){
                dp[N] = Math.min(cal(N / 3), cal(N-1)) + 1;
            }
            //3으로만 나누어 떨어 지는 경우
            else if(N % 2 == 0){
                dp[N] = Math.min(cal(N / 2), cal(N-1)) + 1;
            }
            //나누어 떨어지지 않을 경우
            else{
                dp[N] = cal(N - 1) + 1;
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[N];
    }
}
