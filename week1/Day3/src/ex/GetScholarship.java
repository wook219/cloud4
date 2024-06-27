package ex;

import java.util.Scanner;

public class GetScholarship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();//성적을 입력받는 변수 grade

        if(grade >= 70){
            System.out.println("합격입니다.");
            if(grade >= 90){
                System.out.println("장학금도 받을 수 있습니다.");
            }
        }else{
            System.out.println("불합격입니다.");
        }
    }
}
