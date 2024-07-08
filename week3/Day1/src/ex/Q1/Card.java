package ex.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> deck = new ArrayList<>(20);

        for(int i = 1; i <= 20; i++){
            deck.add(i);
        }

        while(true){
            int N = scanner.nextInt();

            if(N == -1){
                System.out.println(deck);
                break;
            }else{
                int card = deck.remove(N - 1);
                deck.add(card);
            }
        }
    }
}
