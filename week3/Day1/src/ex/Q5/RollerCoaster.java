package ex.Q5;

import java.util.LinkedList;
import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        int firstNum;
        int secondNum;

        while((firstNum = scanner.nextInt()) >= 0){

            if(firstNum == 0){
                secondNum = scanner.nextInt();
                list.add(secondNum);
            }else if(firstNum == 1){
                secondNum = scanner.nextInt();
                list.addFirst(secondNum);
            }else if(firstNum == 2){
                list.remove();
            }

        }

        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
