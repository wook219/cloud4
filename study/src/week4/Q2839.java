package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 설탕 키로수
        int count = 0; // 봉다리 수

        // 3의 배수와 5의 배수의 합으로 N을 만들 수 있으면 봉다리수 출력, 아니면 -1 출력
        for (int i = 0; i <= 1667; i++) {
            for (int j = 0; j <= 1000; j++) {
                int sum = (3 * i) + (5 * j);

                if(sum == N){
                    if(count == 0){
                        count = i + j;
                    }
                    count = Math.min(count, i + j);
                }
            }
        }

        System.out.println(count != 0 ? count : -1);
    }
}
