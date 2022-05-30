# this : 나
- 클래스 내부에서 자신을 참조할 때 씀
- js에서도 this 사용 가능
- 파이썬에서는 self라고 한다(매개변수 자동 삽입 안 됨)

## 지역변수와 겹치지 않는다면 생략 가능
- 하지만 명시하는 게 좋겠죵?

## 멤버 : 클래스의 구성요소(필드, 생성자, 메서드)
## 인스턴스 멤버 : 객체 생성을 해야 사용할 수 있는 멤버

## 생성자에서 this()
- 초기화할 필드와 값으로 쓸 매개변수 이름이 같다면 필드에 this로 자기 참조를 해서 구분짓는다
  + 이름이 다르다면 굳이 안 써도 알아서 넣어서 컴파일됨
```
    Player(){
        this("이름 없음");  > this() 자기 생성자 호출, "맨 첫줄"에 쓴다 (오버로딩 할 때 편하다)
    }
    Player(String name){
        this(name, 1, 50);
    }
    Player(String name, int level, int hp){
        this.name = name;
        this.level = level;
        this.hp = hp;
    }
```

## 메서드에서 this.
- 매개변수에 Player this가 자동 삽입돼(생략됨) 참조한 객체를 알아서 인수를 받는다
```
   void attack(Player this, Player target){
        // 상대방의 체력을 10 낮추고 나의 체력을 5 회복
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("%s의 체력: %d, %s의 체력: %d\n", this.name, this.hp, target.name, target.hp);

        // 나는 나를 때리지 못한다
        if(this == target){
            System.out.println("자해는 권장되지 않습니다. ");
            return;
        }
    }
```
 
