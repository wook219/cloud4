package ex.Q2;

public class Jobs {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("헬로빗", "Hellobit", 30);
        Archer archer = new Archer("헬로빗", "Hellobit", 30);
        Wizard wizard = new Wizard("헬로빗", "Hellobit", 30);


        warrior.printDashboard();
        archer.printDashboard();
        wizard.printDashboard();
    }
}
