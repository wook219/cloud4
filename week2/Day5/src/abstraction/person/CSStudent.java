package abstraction.person;

public class CSStudent extends Person implements Programmable{
    String[] techStack = {"C"};

    @Override
    void sayJob() {
        System.out.println("학생입니다.");
    }

    @Override
    public String[] getTechStack() {
        return this.techStack;
    }

    @Override
    public void doProgramming() {
        System.out.println("학생이 프로그램을 만들고 있습니다.");
    }
}
