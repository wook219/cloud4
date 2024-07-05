package abstraction.person;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        System.out.println("programmer.isTired = " + programmer.isTired);
        programmer.sayJob();

        String[] stacks = programmer.getTechStack();

        System.out.print("프로그래머의 기술 스택 : ");
        for (String stack : stacks) {
            System.out.print(stack + " ");
        }
        System.out.println();

        programmer.doProgramming();
        programmer.earnMoney(100000000);
        programmer.doDebugging();

        System.out.println();
        CSStudent csStudent = new CSStudent();
        String[] studentTechStack = csStudent.getTechStack();
        System.out.println("학생의 기술 스택 : " + Arrays.toString(studentTechStack));
    }
}
