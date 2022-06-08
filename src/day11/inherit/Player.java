package day11.inherit;

// super class : 공통 기능과 속성을 기술
// extends Object는 생략돼 있지만 자동 삽입돼 있다
public class Player extends Object{
    public String name; // 캐릭터 이름
    public int level; // 레벨
    public int hp; // 체력
    public int exp; // 경험치

    public Player(String name){
        System.out.println("플레이어 생성자 호출");
    }

    public void showStatus(){
        System.out.println("=========== Charactor's info ===========");
        System.out.println(" # name: " + name);
        System.out.println(" # level: " + level);
        System.out.println(" # hp: " + hp);
    }
}
