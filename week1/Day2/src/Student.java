<<<<<<<< HEAD:week1/Day2/src/Student.java
========
package week1.Day2;

>>>>>>>> 1df66228a84dc2e26799b54b76ba4a8aeaaeaf1d:src/week1/Day2/Student.java
public class Student {
    private int age;
    private double height;
    private char grade;
    private String name;

    Student(int age, double height, char grade, String name){
      this.age = age;
      this.height = height;
      this.grade = grade;
      this.name = name;
    }

    void printStudent(){

        System.out.println(String.format("나이 : %d",age));
        System.out.println(String.format("키 : %d",(int)height)); //명시적 형변환
        System.out.println(String.format("등급 : %s",grade));
        System.out.println("이름은 " + name);
    }
}
