package inheritance;

class Person4{
    String name;
    int age;

    Person4(String name){
        this.name = name;
    }

    Person4(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student3 extends Person4{
    String school;

    Student3(String name, int age, String school){
        super(name, age);
        this.school = school;
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Student3 student3 = new Student3("wook",26,"elice university");

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.school);
    }
}
