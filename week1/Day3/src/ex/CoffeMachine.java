package ex;

import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("메뉴 번호를 입력해 주세요.");
        int n = scan.nextInt(); //메뉴 번호를 입력 받습니다.

        if(n == 1){
            System.out.println("아메리카노를 선택하셨습니다.");
        }else if(n == 2){
            System.out.println("카페라떼를 선택하셨습니다.");
        }else if(n == 3){
            System.out.println("카푸치노를 선택하셨습니다.");
        }else if(n == 4){
            System.out.println("프라푸치노를 선택하셨습니다.");
        }else{
            System.out.println("다른 번호를 입력해 주세요.");
        }

        System.out.println("이용해주셔서 감사합니다.");
    }
}
