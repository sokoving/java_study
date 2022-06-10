package day13.poly.basic;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

/* 
  [object]
     ↑
    [A]
  ↗     ↖
[B]     [C]     B와 C는 상속관계 아님
 ↑       ↑
[D]     [E]
*/


public class Poly {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        
        a = b;

        A x1 = b;
        A x2 = new B();     // 부모 타입은 자식 타입을 쓸 수 있다
        A x3 = c;
        A x4 = new D();    // 자식 객체는 부모 타입을 가질 수 있다
        A x5 = new E();
        
        B y1 = new D();
        C y2 = new E();
        
        Object k1 = new E();
        A k2 = new E();
//      B k3 = new E();  // 상속 관계가 아니면 다형성이 적용되지 않는다
        C k4 = new E();
//      D k5 = new E();
        
//        E k6 = new A(); // 자식 타입은 부모 객체를 쓸 수 없다 
        
    }
}
