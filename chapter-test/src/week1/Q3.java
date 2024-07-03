package week1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        solution(arr);
    }

    public static void solution(int[] arr) {
        // 여기에 코드를 작성해주세요.
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                sum += arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                System.out.println(sum / arr[i]);
            }
        }
    }
}
