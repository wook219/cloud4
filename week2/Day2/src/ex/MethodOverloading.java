package ex;
class Character3 {
    // 멤버 변수 선언 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
    public String name;
    public String nickname;
    public int HP;
    public int AP;
    public String[] inventory = { "물약", "칼", "갑옷" };

    Character3(String name, String nickname, int AP) {
        this.name = name;
        this.nickname = nickname;
        this.HP = 100;
        this.AP = AP;
    }

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

    public void attack(Character3 target) {
        target.HP -= AP;
        System.out.println(name + "이(가) " + target.name + "을(를) 일반 공격으로 " + AP + "만큼 데미지를 입혔습니다!");
    }

    public String getNthItemFromInventory(int n) {
        return inventory[n];
    }

    // 여기에 메서드를 작성해 주세요.
    public void increaseStat(){
        HP += 10;
        System.out.println(name + "의 HP가 10만큼 증가했습니다.");
    }

    public void increaseStat(int amount){
        HP += amount;
        System.out.println(name + "의 HP가 " + amount + "만큼 증가했습니다.");
    }

    public void increaseStat(int amount, String stat){
        if(stat.equals("HP")){
            HP += amount;
            System.out.println(name + "의 HP가 " + amount + "만큼 증가했습니다.");
        }else if(stat.equals("AP")){
            AP += amount;
            System.out.println(name + "의 AP가 " + amount + "만큼 증가했습니다.");
        }else{
            System.out.println("유효하지 않은 스탯입니다.");
        }
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Character3 ch = new Character3("헬로빗", "Hellobit", 30);

        ch.printDashboard();
        ch.increaseStat();

        ch.printDashboard();
        ch.increaseStat(30);

        ch.printDashboard();
        ch.increaseStat(10, "HP");

        ch.printDashboard();
        ch.increaseStat(10, "AP");

        ch.printDashboard();
    }
}
