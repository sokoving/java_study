package day11.inherit;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior("키보드워리어");
        Mage m = new Mage("번개팡썬더");
        Hunter h = new Hunter("멍멍이와냥꾼");

        w.level = 10;

        w.showStatus();
        m.showStatus();
        h.showStatus();

//        w.rush();

        m.blizzard();

        w.exp = 50;
        m.exp = 100;
        h.exp = 70;
    }
}
