
//클래스 선언
class Person{
    //필드 선언 초기화도 동시에 가능
    public String name;
    protected int age;
    double height;
    private double weight;
}

public class CreateInstanceMain {
    public static void main(String[] args) {
        Person wook = new Person(); // new 키워드를 통해 인스턴스 생성

        wook.name = "wook"; // 필드 접근
        System.out.println(wook.name); // 출력
    }
}
