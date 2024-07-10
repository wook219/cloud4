package ex.Q1;

@FunctionalInterface
interface EliceFunctionalInterface {
    void accept(int x);
}

public class LambdaMain {
    public static void main(String[] args) {
        // 익명 객체
        EliceFunctionalInterface example = new EliceFunctionalInterface() {
            @Override
            public void accept(int x) {
                int result = x * 5;
                System.out.println(result);
            }
        };

        // 지시 사항에 따라 코드를 작성해 주세요.
        EliceFunctionalInterface example2 = x ->  System.out.println(x * 5);

        example.accept(5);
    }
}
