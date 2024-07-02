package ex;

class Cafe2 {
    // 멤버 변수 선언 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
    public String menu;
    public int price;

    // 여기에 생성자 메서드를 작성해주세요.
    Cafe2(String menu, int price){
        this.menu = menu;
        this.price = price;
    }

    Cafe2(String menu){
        this(menu,3000);
    }

    public void printMenuInfo() {
        System.out.println(menu + "은 " + price + "원입니다.");
    }
}
public class UsesThis {
    public static void main(String[] args) {
        Cafe2 cafe = new Cafe2("아이스크림");
        Cafe2 cafe2 = new Cafe2("아이스크림", 3000);

        cafe.printMenuInfo();
        cafe2.printMenuInfo();
    }
}
