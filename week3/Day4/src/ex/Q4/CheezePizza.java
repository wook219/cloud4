package ex.Q4;

public class CheezePizza {
    public static void main(String[] args) {
        Order order = new Order();
        try {
            order.orderCheesePizza(1200);
        } catch (ExcessiveCheeseException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDetails());
        }
    }
}
