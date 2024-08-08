package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //

        //스택 생성
        Stack<Integer> stack = new Stack<>(); //

        //pop을 한 다음 다시 시작할 숫자
        int start = 0; //

        //출력에 쓸 SB
        StringBuilder sb = new StringBuilder(); //

        while(N > 0){
            int number = Integer.parseInt(br.readLine()); // 수열을 이루는 숫자

            if(number > start){
                for (int i = start + 1; i <= number; i++) {
                    stack.push(i);
                    sb.append("+").append('\n');
                }
                start = number; // 1,2,3,4 까지 진행 후 5부터 다시 쌓아야 하기 때문에 start에 number값 할당
            }
            // 스택의 맨 위의 쌓여 있는 값이 number와 일치 하지 않으면 원하는 수열을 만들 수 없다.
            else if(stack.peek() != number){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
            N--;
        }

        System.out.println(sb);
    }
}
