package week1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        solution(matrix);
    }

    public static void solution(int[][] matrix) {
        // 여기에 코드를 작성해주세요.
        int leftStart = 0;
        int rightStart = 0;

        //좌측 상단에서 우측 하단으로 뻗는 대각선
        for(int i = 0; i < matrix.length; i++){
            for(int k = 0; k < matrix[i].length; k++){
                if(i == k){
                    leftStart += matrix[i][k];
                }
            }
        }

        //우측 상단에서 좌측 하단으로 뻗는 대각선
        for(int i = 0; i < matrix.length; i++){
            rightStart += matrix[i][matrix.length -i -1];
        }

        System.out.println(leftStart > rightStart ? leftStart : rightStart);
    }
}
