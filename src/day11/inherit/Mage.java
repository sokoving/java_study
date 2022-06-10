package day11.inherit;

import utill.Utill;

public class Mage extends Player {

    public int mana; // 마력 게이지

    public Mage(String name) {
        super(name);
        this.job = "마법사";
        this.mana = 100;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println(" # mana: " + mana);
    }

    public void blizzard(Player... p) {
        Utill.longLine();
        System.out.printf("# %s 님 눈보라 시전!!!\n", this.name);
        for (Player target : p) {
            if (target == this) {
                System.out.println("?????");
                continue;
            } else {
                // 10~ 15 범위로 상대의 hp를 깎고
                int damage = (int) ((Math.random() * 6) + 10);
                target.hp -= damage;
                System.out.printf("%s 님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                        , target.name, damage, target.hp);
            }
        }
        Utill.longLine();
    }

}
