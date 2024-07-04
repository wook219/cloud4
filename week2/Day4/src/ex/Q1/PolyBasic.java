package ex.Q1;

class Fruit {

}

class Banana extends Fruit {

}
public class PolyBasic {
    public static void main(String[] args) {
        Fruit fruit = new Banana();

        System.out.println("상속 계층 관계 활용한 다형성 구현 성공!");
    }
}
