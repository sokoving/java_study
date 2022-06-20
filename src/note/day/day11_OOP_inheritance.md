# 상속

## inheritance와 import
- improt는 풀경로를 쓰지 않게 도와주는 것

## 상속의 메모리 구조
```
Warrior w = new Warrior("쩐사");

Player(100)            Warrior(150)         
name  | 쩐사            rage | 0
level | 1              super | (100)
hp    | 50

```

## extends
> public class Subclass extends SuperClass
- 상속은 서브클래스의 기능을 부모클래스로 확장하는 것
- 상속관계는 Subclass *is a* SuperClass 명제가 참이어야 한다.

## 서브클래스를 생성할 때는 슈퍼클래스가 먼저 생성된다
- 서브 생성자의 첫 줄에는 슈퍼의 기본 생성자가 자동 생성된다
- 슈퍼에 기본 생성자가 없다면 서브에서 슈퍼의 생성자에 맞게 인수를 넣어 명시해 줘야 한다

## 참조 가능한 목록 중 굵은 글씨는 해당 클래스의 자체 요소, 아닌 건 상속된 클래스

## 슈퍼클래스의 슈퍼클래스는 Object(extend Object는 생략돼 있다)
```
          [Object]
             │
     ┌────[Player]────┐
     │       │        │       
[Warrior]  [Mage]  [Hunter]
```

## 죽음의 다이아몬드(the Deadly Diamond of Death)
- 다중상속
- 자식의 부모가 여럿인 것
- 기본적으로는 안 된다