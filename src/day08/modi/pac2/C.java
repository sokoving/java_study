package day08.modi.pac2;

import day08.modi.pac1.A;
import day08.modi.pac1.B;

public class C {

    void test(){
        A a = new A();
        a.f1 = 10; // f1: public (공용 필드)
//      a.f2 = 20; // f2: default (pac1 전용 필드)
//      a.f3 = 30; // f3: private (pac1.A 전용 필드)

        a.m1(); // m1: public (공용 메서드)
//      a.m2(); // m2: default (pac1 전용 메서드)
//      a.m3(); // m3: private (pac1.A 전용 메서드)

        B b1 = new B("zzz");
//        B b2 = new B(1);  // default
//        B b3 = new B(1.1); // private


    }
}
