package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class LambdaMain1 {
    public static void main(String[] args) {
        //컬렉션 요소 처리
        List<String> items = Arrays.asList("사과", "바나나", "체리", "대추");
        items.forEach(item -> System.out.println(item));

        //쓰레드 생성
        new Thread(() -> System.out.println("새로운 쓰레드 실행")).start();

        //컬렉션 필터링
        List<String> fruits = Arrays.asList("사과", "바나나", "체리", "대추");
        fruits.stream()
                .filter(fruit -> fruit.startsWith("바"))
                .forEach(System.out::println);

        //이벤트 리스너
        JButton button = new JButton("클릭");
        button.addActionListener(e -> System.out.println("버튼이 클릭되었습니다."));
    }
}
