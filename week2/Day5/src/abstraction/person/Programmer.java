package abstraction.person;

public class Programmer extends Person implements Programmable, Debuggable{
    boolean isTired = true;
    String[] techStack = {"Java", "SQL", "Python"};

    @Override
    void sayJob() {
        System.out.println("프로그래머입니다.");
    }

    @Override
    public String[] getTechStack() {
        return this.techStack;
    }

    @Override
    public void doProgramming() {
        System.out.println("프로그래머가 프로그래밍을 하고 있습니다.");
    }

    public void earnMoney(int money){
        System.out.println(money + "원을 벌었습니다.");
    }

    @Override
    public void doDebugging() {
        System.out.println("프로그래머가 디버깅을 합니다.");
    }
}
