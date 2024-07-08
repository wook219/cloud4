package ex.Q2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Working {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int workCnt = 0;
        Set set = new HashSet();

        for(int i = 0; i < n; i++){
            String work = scanner.nextLine();
            if(set.add(work)){
                workCnt++;
            }
        }

        System.out.println(workCnt);
    }
}
