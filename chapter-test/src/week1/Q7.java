package week1;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solution(n);
    }

    public static void solution(int N) {
        // 여기에 코드를 작성해주세요.
        int sumCount = 0;

        for(int i = 1; i <= N; i++){
            int sum = 0;

            for(int k = i; k <= N; k++){
                sum += k;
                if(sum == N){
                    sumCount++;
                    break;
                }
            }
        }
        System.out.println(sumCount);
    }
}
