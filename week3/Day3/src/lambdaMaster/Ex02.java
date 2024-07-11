package lambdaMaster;

public class Ex02 {
    public static void main(String[] args) {
//        MyFunction f = new MyFunction(){
//            public int max(int a, int b){   //오버라이딩
//                return a > b ? a : b;
//            }
//        };

        // 람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction f = (a, b) -> a > b ? a : b;

        int value = f.max(3,5);
        System.out.println("value = " + value);
    }
}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 한다.
interface MyFunction{
    public abstract int max(int a, int b);
}
