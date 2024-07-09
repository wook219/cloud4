package ex.Q3;

import java.util.Scanner;

public class Waiting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfTickets = sc.nextInt();
        int target = sc.nextInt();

        int[] input = new int[numberOfTickets];
        for (int i = 0; i < numberOfTickets; i++) {
            input[i] = sc.nextInt();
        }

        System.out.println(Person.solution(input, target));
    }
}
