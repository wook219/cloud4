package src.week1.Day3.ex;

import java.util.Scanner;

public class RunningRank {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("달리기 등 수를 입력하세요.");
        int rank = input.nextInt();

        switch(rank){
            case 1:
                System.out.println("금메달 입니다!");
                break;


            case 2:
                System.out.println("은메달 입니다!");
                break;

            case 3:
                System.out.println("동메달 입니다!");
                break;

            default:
                System.out.println("완주하였습니다!");
                break;
        }
    }
}
