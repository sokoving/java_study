package day11.inherit;

public class Mage extends Player {

    public int mana; // 마력 게이지

    public Mage(String name){
        super(name);
        this.mana = 100;
    }

    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println(" # mana: " + mana);
    }

    public void blizzard(){
        System.out.println(name + " 님이 눈보라 마법 시전합니다. ");
    }

}
