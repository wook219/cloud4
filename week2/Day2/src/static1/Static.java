package static1;

class Person{
    static String name = "Elice";
    int age = 10;

    static void sayHello(){
        System.out.println("Hello, " + name);
    }

    void sayHello2(){
        System.out.println("Hello, " + name); // 인스턴스 메서드 내에서 static 변수 사용 가능
        System.out.println("age = " + age); // 인스턴스 메서드 내에서 인스턴스 변수 사용 가능

        sayHello(); // 인스턴스 메서드 내에서 static 메서드 사용 가능
    }

    static void printAge(){
//      System.out.println("age = " + age); //static메서드에서 인스턴스 변수 사용 불가.
//      sayHello2(); //static메서드 내에서 인스턴스 메서드 사용 불가.
    }
}

public class Static {
    public static void main(String[] args) {
        System.out.println(Person.name); // 클래스 자체에 참조하여 static변수에 접근 가능.
        Person.sayHello();  // 클래스 자체에 참조하여 static 메서드에 접근 가능.

//        sayHello2(); // 인스턴스메서드는 객체 생성하고 사용해야 하므로 컴파일 에러.

    }
}
