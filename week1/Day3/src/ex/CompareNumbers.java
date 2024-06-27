package ex;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A > B){
            System.out.println("A가 더 큽니다.");
        }else if(B > A){
            System.out.println("B가 더 큽니다.");
        }else{
            System.out.println("크기가 같습니다.");
        }
    }
}
