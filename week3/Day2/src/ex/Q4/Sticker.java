package ex.Q4;

import java.math.BigInteger;
import java.util.Scanner;

public class Sticker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        scanner.close();

        System.out.println(solution(first, second));
    }

    public static BigInteger solution(String first, String second) {
        // 여기에 코드 작성
        BigInteger big1 = new BigInteger(first);
        BigInteger big2 = new BigInteger(second);

        return big1.multiply(big2);
    }
}
