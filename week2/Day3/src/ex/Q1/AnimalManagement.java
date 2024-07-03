package ex.Q1;

class Animal{
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

class Mammal extends Animal{
    String furColor;

    public Mammal(String name, int age, String furColor){
        super(name,age);
        this.furColor = furColor;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("털 색깔 : " + furColor);
    }

}
public class AnimalManagement {
    public static void main(String[] args) {
        Animal animal = new Animal("Tiger", 5);
        Mammal mammal = new Mammal("Panda", 3, "Black and White");

        animal.printDetails();
        mammal.printDetails();
    }
}
