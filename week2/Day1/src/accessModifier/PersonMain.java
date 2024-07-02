package accessModifier;

class Person{
    public String name;
    protected int age;
    double height;
    private double weight;
}

public class PersonMain {
    public static void main(String[] args) {
        Person wook = new Person();

        //public 접근 가능
        wook.name = "진욱";
        System.out.println(wook.name);

        //protected 접근 가능
        wook.age = 26;
        System.out.println(wook.age);

        //default 접근 가능
        wook.height = 170.1;
        System.out.println(wook.height);

        //private 접근 불가, 컴파일 에러
//        wook.weight = 69;
//        System.out.println(wook.weight);
    }
}
