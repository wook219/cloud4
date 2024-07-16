package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1541 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        // 1. 정수를 잘라서 보관할 list 생성
        List<String> list = new ArrayList<>();

        // 2. 2. 정수와 부호를 구분해서 저장하기 위해 사용할 sb 생성
        StringBuilder sb = new StringBuilder();

        //3. sb에 한글자씩 검사하며 sb에 추가. 특정조건을 만족하면 sb를 list에 추가하고 sb를 비워줌.
        //특정 조건 : 부호를 만났을 때
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){ // isDigit(Char ch) -> 숫자인지 아닌지. 숫자면 true
                sb.append(ch);
            }else{
                list.add(sb.toString());
                sb.setLength(0); // StringBuilder 값 비우기. delete
                sb.append(ch);
                list.add(sb.toString());
                sb.setLength(0);
            }

            // 마지막 값 추가
            if(i == str.length() - 1){
                list.add(sb.toString());
            }
        }

//    -> list에 부호와 정수가 구분되어 저장되어 있음.

        int min = 0; // 출력할 최솟값
        boolean minus = false; // 첫번째 -를 만났을 때 바꿔 줄 boolean값

        // 첫번째 -를 만나면 그 뒤로는 모든 값을 뺀다.
        for (int i = 0; i < list.size(); i++) {
            //1. list값을 하나씩 꺼내서 검사
            String element = list.get(i);

            if(element.equals("-")){
                minus = true;
            }else if(element.equals("+")){

            }else{ //숫자일 때
                if(minus){
                    min -= Integer.parseInt(element);
                }else{
                    min += Integer.parseInt(element);
                }
            }
        }

        System.out.println(min);
    }
}
