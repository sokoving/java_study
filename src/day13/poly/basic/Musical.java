package day13.poly.basic;

class 배우{};
class 장동건 extends 배우 {};
class 원빈 extends 배우{};

public class Musical {

//    장동건 주인공;  // 주인공이 장동건 타입이면 원빈은 주인공이 될 수 없다
    배우 주인공;     // 주인공이 배우 타입이면
                   // 배우 클래스의 자식 클래스인 장동건, 원빈 둘다 주인공이 될 수 있다.

    void changActor(){
        주인공 = new 원빈();
    }

}
