package ex.Q2;

public class Customer {
    int money = 20000;

    // 지시 사항을 참고하여 코드를 작성해 보세요.
    void buyCoffee(Coffee coffee){
        if(money < coffee.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= coffee.price;
        System.out.println("📣: "    + coffee + "를 주문했습니다.");
    }

}
