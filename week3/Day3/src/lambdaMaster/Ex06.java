package lambdaMaster;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex06 {
    public static void main(String[] args) {
        //Supplier : 입력x 출력o
        Supplier<MyClass> s1 = () -> new MyClass(); //람다식
        System.out.println(s1.get());

        Supplier<MyClass> s2 = MyClass::new; // 메서드 참조. 클래스이름::new -> 객체 생성
        System.out.println(s2.get());

        Function<Integer, MyClass> s3 = (i) -> new MyClass(i); //람다식

        Function<Integer, MyClass> s4 = MyClass::new; // 메서드 참조.
        System.out.println(s4.apply(1000));
        System.out.println(s4.apply(100).iv);

        Function<Integer, int[]> s5 = (i) -> new int[i]; //람다식으로 배열 생성
        System.out.println(s5.apply(10));
        System.out.println(s5.apply(100).length);

        Function<Integer, int[]> s6 = int[]::new; //메서드 참조로 배열 생성
        System.out.println(s6.apply(1000));
        System.out.println(s6.apply(10000).length);
    }
}

class MyClass{
    int iv;

    MyClass(){

    }

    MyClass(int iv){
        this.iv = iv;
    }
}
