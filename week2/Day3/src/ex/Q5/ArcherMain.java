package ex.Q5;

public class ArcherMain {
    public static void main(String[] args) {
        Archer archer = new Archer("체셔");
        Wizard wizard = new Wizard("도도새");

        System.out.println(archer);
        System.out.println(wizard);

        archer.attack(wizard);
        archer.attack(wizard);
        System.out.println(wizard);
    }
}
