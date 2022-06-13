package day14.abs.car;

public abstract class Car {

    // 가속 기능
    public abstract void accel();
    // 감속기능
    public abstract void breake();
    // 핸들 열선기능                     // 필수 메서드 아니면 abstract 안 붙여도 됨
    public final void heatHandle(){   // final 붙으면 오버라이딩 안 됨(무조건 이대로)
        System.out.println("온도가 10도까지 올라갑니다.");
    }

}
