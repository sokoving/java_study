package day11.inherit;

// super class : 공통 기능과 속성을 기술
// extends Object는 생략돼 있지만 자동 삽입돼 있다
public class Player extends Object{
    public String name; // 캐릭터 이름
    public String job; // 캐릭터 직업
    public int level; // 레벨
    public int hp; // 체력
    public int exp; // 경험치

    public Player(String name)
    {
        this.name = name;
        this.hp = 50;
    }

    public void showStatus(){
        System.out.println("=========== Charactor's info ===========");
        System.out.println(" # name: " + name);
        System.out.println(" # level: " + level);
        System.out.println(" # hp: " + hp);
    }

    public static void showHp(Player... p){
        System.out.println("========================");
        for (Player player : p) {
            System.out.printf("%s(%s) HP : %d\n", player.name, player.job, player.hp);
        }
        System.out.println("========================");
    }
}
