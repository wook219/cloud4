package src.week1.Day3.ex;

import java.util.Scanner;

public class GradeCalculating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        if(grade >= 90){
            System.out.println("학점은 A입니다.");
        }else if(grade >= 80){
            System.out.println("학점은 B입니다.");
        }else if(grade >= 70){
            System.out.println("학점은 C입니다.");
        }else if(grade >= 60){
            System.out.println("학점은 D입니다.");
        }else{
            System.out.println("학점은 F입니다.");
        }
    }
}
