package week1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // main 메소드의 내용은 채점을 위한 코드이므로 수정하지 말아주세요.
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

        //정렬
        for(int k = 0; k < arr.length; k++){
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    int tmp = 0;
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }

        //홀수일 때
        if(arr.length % 2 != 0){
            System.out.println(arr[arr.length / 2]);
        }else{
            //짝수일 때
            int avg = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
            System.out.println(avg);
        }

    }
}
