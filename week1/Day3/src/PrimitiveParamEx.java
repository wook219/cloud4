<<<<<<<< HEAD:week1/Day3/src/PrimitiveParamEx.java
========
package week1.Day3;

import javax.xml.crypto.Data;

>>>>>>>> 1df66228a84dc2e26799b54b76ba4a8aeaaeaf1d:src/week1/Day3/PrimitiveParamEx.java
class Data1{
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x){
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
