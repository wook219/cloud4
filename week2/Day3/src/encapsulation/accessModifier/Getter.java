package encapsulation.accessModifier;

class Person2{
    private String name;
    private int age;
    private String phoneNumber;

    Person2(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this. phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}

public class Getter {
    public static void main(String[] args) {
        Person2 person2 = new Person2("wook", 26, "010-1234-5678");

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getPhoneNumber());
    }
}
