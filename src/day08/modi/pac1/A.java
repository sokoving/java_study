package day08.modi.pac1;

public class A {
    // 필드 선언 : 접근제한자 + 타입 + 이름
    public int f1;
    int f2;  // 접근제한자 안 쓰면 default 제한
    private int f3;

    // 메서드 선언
    public void m1() {}
    void m2() {} // 접근제한자 안 쓰면 default 제한
    private void m3() {}

    public A(){
        f1 = 10;
        f2 = 20;
        f3 = 30;  // private : class A 안에서만 사용 가능

        m1(); m2(); m3();
    }
    
    B b1 = new B("zzz");
    B b2 = new B(1);
//    B b3 = new B(1.1); private 생성자
    
}
