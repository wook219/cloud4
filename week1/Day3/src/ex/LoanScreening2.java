package ex;

import java.util.Scanner;

public class LoanScreening2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isAdult = scanner.nextBoolean();

        double monthlyIncome = scanner.nextDouble();

        int creditScore = scanner.nextInt();

        boolean isApproved = isAdult && (monthlyIncome >= 170) && (creditScore >= 650);

        if(isApproved == true){
            System.out.println("축하합니다! 대출이 승인되었습니다.");
        }else if(isAdult != true){
            System.out.println("대출을 받으려면 성인이어야 합니다.");
        }else if(monthlyIncome < 170){
            System.out.println("월 수입이 대출 승인 기준에 미치지 못합니다.");
        }else if(creditScore < 650){
            System.out.println("신용 점수가 대출 승인 기준에 미치지 못합니다.");
        }else{
            System.out.println("대출 승인에 필요한 조건을 만족하지 못했습니다.");
        }
    }
}
