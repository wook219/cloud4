package inheritance;

import java.util.Arrays;

class Person2{
    protected String name;
    protected int age;

    public void introduce(){
        System.out.println("My name is " + name + " and I'm " + age + "years old.");
    }
}

class Student extends Person2{
    private String school;

    @Override
    public void introduce(){
        System.out.println("My name is " + name + " and I'm " + age + "years old.");
        System.out.println("저는 " + school + "에 다니고 있습니다.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

    }
}
