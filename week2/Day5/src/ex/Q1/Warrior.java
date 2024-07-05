package ex.Q1;

class Warrior extends Character {
    Warrior(String name) { super(name); }
    Warrior(String name, int AP) { super(name, AP); }
    Warrior(String name, String nickname) { super(name, nickname); }
    Warrior(String name, String nickname, int AP) { super(name, nickname, AP); }

    private void printSkill(Character target) {
        String skillName = "강타";

        System.out.println(super.getName() + "은(는) " + target.getName() + "에게 용사 스킬 [" + skillName + "]를 사용했습니다!");
        System.out.println("[효과: 공격력의 두 배의 데미지]");
    }

    // printSkill 메서드를 활용하여 useSkill 추상 메서드를 구현하세요.
    public void useSkill(Character target){
        target.setHP(target.getHP() - super.getAP() * 2);
        this.printSkill(target);
    }

    public String toString() {
        String result = "";

        result += "<용사>\n";
        result += super.toString();

        return result;
    }
}

