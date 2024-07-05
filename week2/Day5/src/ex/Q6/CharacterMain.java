package ex.Q6;

public class CharacterMain {
    public static void main(String args[]) {
        Attackable ch1 = new Character("Attackable");
        ItemUsable ch2 = new Character("ItemUsable");
        SkillUsable ch3 = new Warrior("Warrior - SkillUsable");
        SkillUsable ch4 = new Archer("Archer - SkillUsable");
        SkillUsable ch5 = new Wizard("Wizard - SkillUsable");
    }
}
