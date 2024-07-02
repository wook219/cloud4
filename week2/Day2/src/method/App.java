package method;

class Person{
    private String name = "이름";

    public String setNameAndReturn(String name){
        //구현 내용
        this.name = name;

        return this.name;
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();

        System.out.println(person1.setNameAndReturn("Elice"));
    }
}
