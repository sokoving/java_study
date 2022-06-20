# 객체배열(Object Array)
- 객체 안에 객체
- 필드를 선언할 때 객체 타입도 가능
- > Account[] accounts;

# 클래스 안에서 자기 클래스 필드 참조
- 지역변수와 필드명이 겹치지 않는다면 생략 가능 
- 근데 명시해 주는 게 좋겠지?
> this.bankName

# 클래스 안에서 다른 클래스 필드 참조
- 접근 가능한 필드를 참조, 참조하기
- 타입을 잘 확인하자
> accounts[i].owner.name,accounts[i].balance


# day09 main 의 자료구조
```  Bank shinhan = new Bank("신한", 10);     Bank woori = new Bank("우리", 20);
 | shinhan |----→|    Bank(100)   |                ┌-------| woori |
 |  (100)  |     | bankname|신한   |                ↓       | (200) |
               ┌ | accounts|(150) |         |    Bank(200)   |
               | | count   |0     |         | bankname|우리   |
               |                          ┌ | accounts|(220) |
               |  (150)                   | | count   |0     |
               └→ [][][][][][][][][][]    |
                                          | (220)
                                          └→ [][][][][][][][][][][][][][][][][][][][]
```
```  Person park = new Person("박영희");     Bank woori = new Bank("우리", 20);
     park.money = 100000;                   kim.money = 5000;
     
        | shinhan |----→|    Bank(100)   |                ┌-------| woori |     ┌→|Person(400) |
        |  (100)  |     | bankname|신한   |                ↓       | (200) |     | |name |김철수 |
                        ┌| accounts|(150) |         |    Bank(200)   |          | |money|5000  |
┌→|Person(300) |        || count   |0     |         | bankname|우리   |          | |myAcc|null  |
| |name |박영희 |        |                          ┌| accounts|(220) |           └--┐
| |money|100000|        |  (150)                   || count   |0     |          | kim |
| |myAcc|null  |        └→ [][][][][][][][][][]    |                            |(400) |
└--┐                                               | (220)
| park |                                           └→ [][][][][][][][][][][][][][][][][][][][]
|(300) |
```
```park.makeAccount(shinhan);               kim.makeAccount(woori);
        | shinhan |----→|    Bank(100)   |                ┌-------| woori |     ┌→|Person(400) |
        |  (100)  |     | bankname|신한   |                ↓       | (200) |     | |name |김철수 |
                        ┌| accounts|(150) |         |    Bank(200)   |          | |money|5000  |
┌→|Person(300) |        || count   |0     |         | bankname|우리   |          | |myAcc|null  |
| |name |박영희 |        |                          ┌| accounts|(220) |           └--┐
| |money|100000|        |  (150)                   || count   |0     |          | kim |
| |myAcc|null  |        └→ [][][][][][][][][][]    |                            |(400) |
└--┐                                               | (220)
| park |                                           └→ [][][][][][][][][][][][][][][][][][][][]
|(300) |
```