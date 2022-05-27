package day08.modi.pac1;

public class B {

    // 오버로딩 조건: 매개변수의 타입, 순서, 개수가 달라야 함
    public B(String a) {}
    B(int b) {}
    private B(double e) {}  // 타입이 다르다
    B(int c, int d) {}      // 개수가 다르다
    B(int e, String f) {}  
    B(String f, int e) {}  // 순서가 다르다
    
//    B(String b) {}  >  매개변수의 타입, 개수가 같다
//    B(int e, int f) {} > 매개변수의 타입, 개수, 순서가 같다

    //    B b1 = new B();  > 생성자가 선언돼 있을 때는 기본 생성자가 자동 생성 안 됨
    B b1 = new B("zzz");
    B b2 = new B(100);
    B b3 = new B(5.5);


    void test() {
        A a = new A();
        a.f1 = 10; // f1 : public (공용 필드)
        a.f2 = 20; // f2 : defalt (pac1 전용 필드)
//      a.f3 = 30; // f3 : private (A 전용 필드)

        a.m1();
        a.m2();
//      a.m3(); // m3 : A 전용 메서드
    }
}
