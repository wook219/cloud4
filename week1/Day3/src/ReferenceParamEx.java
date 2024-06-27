<<<<<<<< HEAD:week1/Day3/src/ReferenceParamEx.java
========
package week1.Day3;

>>>>>>>> 1df66228a84dc2e26799b54b76ba4a8aeaaeaf1d:src/week1/Day3/ReferenceParamEx.java
class Data2{
    int x;
}

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d){
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
