package day11.inherit;

import utill.Utill;

// subclass          super class인 Player를 상속한다
public class Warrior extends Player {

    public int rage; // 분노 게이지

    public Warrior(String name) {
        // super();  // 생략돼 있지만 서브를 생성하기 전에 슈퍼인 플레이어의 "기본" 생성자가 자동으로 호출된다
        super(name);  //  부모 생성자에 매개변수를 줌 > 기본 생성자가 없음 > 명시적으로 호출해서 인수를 줘야 함
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
        this.job = "전사";
    }

    @Override // 오버라이딩 룰 체크
    public void showStatus() {
        // this.showStatus(); // 워리어의 showStatus를 호출(무한반복)
        super.showStatus(); // 부모의 showStatus 호출
        System.out.println(" # rage: " + rage);
    }

    public void fireRush(Player p) {
        Utill.longLine();
        System.out.printf("# %s 님이 %s 님에게 FireRush를 시전했습니다! \n"
                , this.name, p.name);
        int damage = 0;
        if (p instanceof Mage) {
            damage = 20;
        } else if (p instanceof Hunter) {
            damage = 15;
        } else if (p instanceof Warrior) {
            if (p == this) {
                System.out.println("????");
                return;
            } else {
                damage = 10;
            }
        } else {
            System.out.println("뭐지??");
            return;
        }
        p.hp -= damage;
        System.out.printf("%s(%s) 님이 %d의 피해를 입었습니다. \n", p.name, p.job, damage);
        System.out.printf("%s 님의 현재 체력: %d\n", p.name, p.hp);
        Utill.longLine();
    }


}
