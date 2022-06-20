# 제네릭 클래스
- 객체가 생성될 때 타입이 결정됨
- *type safty* : 제네릭 클래스는 타입의 안정성을 제공합니다

## 제네릭 타입(필드 선언)
```
public class Basket<F>{
    private F fruit
}
```
- 특정 타입이 아닌 아무 대문자 하나를 쓴다
- 부모 타입을 쓰면 다형성이 적용돼 사과, 바나나 다 담을 수 있게 된다
- 사과만 담을 바스켓 클래스를 만들기 위해 사용하는 것

## getter : 제네릭 타입을 리턴한다
```
public F getFruit() {
    return fruit;
}
```

## setter : 제네릭 타입을 받는다
```
public void setFruit(F fruit) {
    this.fruit = fruit;
}
```