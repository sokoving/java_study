package day12.static_;

public class Count {

    public int x;           // 인스턴스 필드(동적 필드)
    // 객체를 생성해야 참조 가능 (Count c = new Count();  c.x; )
    // 생성한 객체만큼 메모리 생성
    public static int y;    // 스태틱 필드(정적 필드)
    // 객체 생성 없이도 클래스를 통해 참조 가능 (Count.y)
    // 객체를 몇 개 생성하든 메모리가 하나 생성된다

    // 인스턴스 메서드(동적 메서드)
    public void m1() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

    /* 스태틱 메서드(정적 메서드)
         static 블록(메서드, 정적 초기화)에서는 static 필드만 참조 가능
         static 블록은 this를 사용할 수 없음.
             >> 스태틱 메서드는 객체 생성 없이 사용 가능
             >> this가 누군지 모르는 생태로 호출될 수 있음
         인스턴스 필드를 참조하고 싶으면
             >> 매개변수에 담든지
             >> 안에서 객체 생성을 하든지 해서
             >> 누구의 인스턴스 필드인지 명시할 것*/
    public static void m2(Count cc) {
//      System.out.println("x = " + x);  // x는 사실 this.x
        System.out.println("x = " + cc.x);
        System.out.println("y = " + y);
    }
}
