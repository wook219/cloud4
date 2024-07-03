package encapsulation.accessModifier;

class Person{
    public String id;
    private String pwd;
}

public class AccessModifier {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.id);
//        System.out.println(person.pwd); //접근 불가. 데이터 보호
    }
}
