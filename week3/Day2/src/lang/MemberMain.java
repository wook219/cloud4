package lang;

class Member{
    public final int AGE;
    public final int HEIGHT;

    public Member(int age, int height){
        AGE = age;
        HEIGHT = height;
    }
}

public class MemberMain {
    public static void main(String[] args) {
        Member elice = new Member(10,100);
        Member cheshire = new Member(10,100);

        System.out.println(elice.equals(cheshire));
    }
}
