package lambdaMaster;

public class Ex01 {
    public static void main(String[] args) {
//      Object obj = (a, b) -> a > b ? a : b; 람다식. 익명객체. 아래의 식과 동일한 의미다. 하지만 아래의 식은 자바란 언어의 특성상 모든 메서드는 객체 안에 있어야 해서 익명객체에 넣어준 것이다.
        Object obj = new Object(){
            int max(int a, int b){
                return a > b ? a : b;
            }
        };

//        int value = obj.max(3,5); Object객체에는 max라는 메서드가 없기 때문에 사용할 수 없다. 함수형 인터페이스를 이용해야 한다.
    }
}
