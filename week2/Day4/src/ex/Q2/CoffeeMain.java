package ex.Q2;

public class CoffeeMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Coffee americano = new Americano();
        Coffee caffeLatte = new CaffeLatte();

        customer.buyCoffee(americano);
        customer.buyCoffee(caffeLatte);

        System.out.println("💵: 현재 남은 잔액은 " + customer.money + "원 입니다.");
    }
}
