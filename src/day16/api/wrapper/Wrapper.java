package day16.api.wrapper;

public class Wrapper {
/*     Wrapper class
     기본 타입은 객체가 아님 > 상속, 다형성 안 됨
     기본 타입도 객체의 기능을 쓸 수 있게 객체화한 클래스를 Wrapper 클래스에 넣음
     Byte, Short, Integer, Long, Float, Double, Boolean, Character
     1. String과 같이 new로 객체 생성을 생략하고 선언할 수 있다
     2. 유사 타입끼리 오토 언박싱이 됨
     3. 필드의 초기값이 null이 필요할 때는 Wrapper 클래스로 사용
        그 외에는 기본 타입으로(성능이 조금 더 좋음)
        기본 타입은 null 리턴 못 함
    */


    public static void main(String[] args) {
        int a = 10;
        Integer b = a;
        double c = (double) a;



    }

}
