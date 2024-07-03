package inheritance;

class Person3{
    String name = "Elice";
    int age = 25;
}

class Student2 extends Person3{
    String name = "Chatshire";
    String school = "엘리스 대학교";

    public void printMembers(){
        System.out.println("name : " + name);
        System.out.println("this.name : " + this.name);
        System.out.println("super.name : " + super.name);
    }
}

public class Super extends Person3{
    public static void main(String[] args) {
        Student2 student2 = new Student2();

        student2.printMembers();
    }
}
