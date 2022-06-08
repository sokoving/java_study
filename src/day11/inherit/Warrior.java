package day11.inherit;

// subclass          super class인 Player를 상속한다
public class Warrior extends Player {

    public int rage; // 분노 게이지

    public Warrior(String name){
        // super();  // 생략돼 있지만 서브를 생성하기 전에 슈퍼인 플레이어의 "기본" 생성자가 자동으로 호출된다
        super(name);  //  부모 생성자에 매개변수를 줌 > 기본 생성자가 없음 > 명시적으로 호출해서 인수를 줘야 함
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
        System.out.println("워리어 생성자 호출");
    }

    @Override // 오버라이딩 룰 체크
    public void showStatus(){
        // this.showStatus(); // 워리어의 showStatus를 호출(무한반복)
        super.showStatus(); // 부모의 showStatus 호출
        System.out.println(" # rage: " + rage);
    }

    public void rush(){
        System.out.println(name + " 님이 돌진합니다. ");
    }


}
