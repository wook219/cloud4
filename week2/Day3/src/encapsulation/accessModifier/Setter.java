package encapsulation.accessModifier;
class Person3{
    private String name;
    private int age;
    private String phoneNumber;

    Person3(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this. phoneNumber = phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
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
public class Setter {
    public static void main(String[] args) {
        Person3 person3 = new Person3("wook", 26, "010-1234-5678");

        person3.setName("jin");
        System.out.println(person3.getName());

        person3.setAge(100);
        System.out.println(person3.getAge());

        person3.setPhoneNumber("010-4567-7894");
        System.out.println(person3.getPhoneNumber());
    }
}
