package constructor;

class Person1{
    private String name;
    private int age;

    Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class App {
    public static void main(String[] args) {
        Person1 person1 = new Person1("홍길동", 21);
    }
}
