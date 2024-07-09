package ex.Q2;

import java.util.Scanner;

public class UseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        scanner.close();

        System.out.println(solution(first, second));
    }

    public static int solution(String first, String second) {
        // 여기에 코드 작성
        first = first.toUpperCase();
        second = second.toUpperCase();
        if(first.contains(second) || second.contains(first)){
            return 1;
        }else{
            return 0;
        }
    }
}
