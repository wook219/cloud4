package ex;

class Character1 {
    public String name;
    public String nickname;
    public int HP = 100;
    public int AP = 0;
    public String[] inventory = { "물약", "칼", "갑옷" };

    public void printDashboard(){
        System.out.println("====================");
        System.out.println("이름: " + name);
        System.out.println("별명: " + nickname);
        System.out.println("체력: " + HP);
        System.out.println("공격력: " + AP);
        System.out.println("====================");
    }

    public boolean isInventoryEmpty(){
        return inventory.length == 0;
    }
}

public class NoParameterMethod {
    public static void main(String[] args) {
        Character1 ch = new Character1();

        ch.name = "헬로빗";
        ch.nickname = "Hellobit";

        ch.printDashboard();
        System.out.println(ch.isInventoryEmpty());
    }
}
