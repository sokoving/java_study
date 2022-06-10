package day13.poly;

import day11.inherit.*;
import utill.Utill;

public class PlayerQuiz {
    public static void main(String[] args) {
        Mage m = new Mage("아이스킹");
        Mage m2 = new Mage("아이스퀸");
        Warrior w = new Warrior("제이크");
        Warrior w2 = new Warrior("레몬백작");
        Hunter h = new Hunter("핀");

        m.blizzard(m, m2, w2, h);
        w.fireRush(w2);
        w2.fireRush(w);


        Player.showHp(m, m2, w, w2, h);

    }
}
