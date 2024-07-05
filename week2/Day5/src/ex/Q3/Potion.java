package ex.Q3;

class Potion extends Item {
    // 지시사항에 맞게 Potion 클래스를 작성해 보세요.
    private int amount;
    private String type;

    public Potion(String name, String description, int amount, String type){
        super(name, description);
        this.amount = amount;
        this.type = type;
    }

    @Override
    public void use(Character character){
        if(type.equals("HP")){
            character.setHP(character.getHP() + amount);
        }else if(type.equals("AP")){
            character.setAP(character.getAP() + amount);
        }
    }
}
