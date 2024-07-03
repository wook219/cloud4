package inheritance;

import java.util.Arrays;

class Person1{
    public String name = "wook";
    public int age = 20;

    public void introduce(){
        System.out.println("My name is " + name + " and I'm " + age + "years old.");
    }
}

class Programmer extends Person1{
    public boolean isTired = true;
    public String[] availableLang = {"Java", "Javascript", "SQL"};

    public void doProgramming(){
        System.out.println(name + "은(는) " + Arrays.toString(availableLang) + "을 사용할 수 있습니다.");
    }
}

public class App {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();

        programmer1.introduce();
        programmer1.doProgramming();
    }
}
