<<<<<<<< HEAD:week1/Day3/src/SwitchMain.java
========
package week1.Day3;

>>>>>>>> 1df66228a84dc2e26799b54b76ba4a8aeaaeaf1d:src/week1/Day3/SwitchMain.java
public class SwitchMain {
    public static void main(String[] args) {
        char memberGrade = 'A';
        switch (memberGrade){
            case 'A':
                System.out.println("우수 회원");
                break;
            case 'B':
                System.out.println("정회원");
                break;
            default:
                System.out.println("준회원");
        }

        /*
        switch(조건 변수){
            case 조건값:
                조건 값에 맞는 동작 수행
                break;
            case 다른 조건값:
                다른 조건 값에 맞는 동작 수행
                break;
            default:
                모든 조건에 맞지 않는 경우 실행
         */
    }
}
