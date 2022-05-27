package day08.player;

public class Player {

    //필드
    String name; //닉네임
    int level;   //레벨
    int hp;      //체력


    //생성자
// 필드와 매개변수 이름이 같다면 필드에 this로 자기 참조를 해서 구분짓는다
//              이름이 다름다면 굳이 안 써도 알아서 넣어서 컴파일됨

    Player(){
        // this() 자기 생성자 호출, "맨 첫줄"에 쓴다 (오버로딩 할 때 편하다)
        this("이름 없음");
        System.out.println("1번 생성자 호출");
//        this.name = "이름 없음";
//        this.level = 1;
//        this.hp = 50;
    }

    Player(String name){
        this(name, 1, 50);
        System.out.println("2번 생성자 호출");
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
    }

    Player(String name, int level, int hp){
        System.out.println("3번 생성자 호출");
        this.name = name;  // this.name > 필드 / name > 매개변수
        this.level = level;
        this.hp = hp;
    }


    //메서드
    // 매개변수 Player this가 자동 삽입돼 참조한 객체를 알아서 인수를 받는다
    void attack(Player this, Player target){
//        System.out.println("target = " + target);
//        System.out.println("this = " + this);

        // 출력 메세지: x가 y를 공격한다
        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);

        // 상대방의 체력을 10 낮추고 나의 체력을 5 회복하고 싶다
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("%s의 체력: %d, %s의 체력: %d\n", this.name, this.hp, target.name, target.hp);

        // 나는 나를 때리지 못한다
        if(this == target){
            System.out.println("자해는 권장되지 않습니다. ");
            return;
        }
    }

    //캐릭터 정보 출력 메서드
    void info(){
        System.out.printf("이름: %s, 레벨: %d, 체력: %d", this.name, this.level, this.hp);
    }



}
