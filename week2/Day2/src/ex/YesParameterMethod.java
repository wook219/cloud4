package ex;


class Character2 {
    public String name;
    public String nickname;
    public int HP = 100;
    public int AP = 10;
    public String[] inventory = { "물약", "칼", "갑옷" };

    public void printDashboard() {
        System.out.println("====================");
        System.out.println("이름: " + name);
        System.out.println("별명: " + nickname);
        System.out.println("체력: " + HP);
        System.out.println("공격력: " + AP);
        System.out.println("====================");
    }

    public boolean isInventoryEmpty() {
        return inventory.length == 0;
    }

    public void attack(Character2 ch){
        ch.HP -= AP;
        System.out.println(name + "이(가) " + ch.name + "을(를) 일반 공격으로 " + AP + "만큼 데미지를 입혔습니다!");
    }

    public String getNthItemFromInventory(int i){
        return inventory[i];
    }
}

public class YesParameterMethod {
    public static void main(String[] args) {
        Character2 ch1 = new Character2();
        Character2 ch2 = new Character2();

        ch1.name = "헬로빗";
        ch1.nickname = "Hellobit";
        ch1.AP = 30;

        ch2.name = "캐터필러";
        ch2.nickname = "Caterpillar";

        ch2.AP = 50;

        ch1.printDashboard();
        ch2.printDashboard();


        ch1.attack(ch2);
        ch2.attack(ch1);

        ch1.printDashboard();
        ch2.printDashboard();

        System.out.println(ch1.getNthItemFromInventory(1));
        System.out.println(ch2.getNthItemFromInventory(2));
    }
}
