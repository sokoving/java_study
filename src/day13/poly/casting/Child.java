package day13.poly.casting;

import day08.modi.pac2.C;

public class Child extends Parent{
    
    @Override
    public void m2(){
        System.out.println("오버라이딩 된 2번 메서드");
    }
    
//    @Override (차일드의 독립적인 메서드)
    public void m3(){
        System.out.println("자식의 3번 메서드");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();
        parent.m2();     // 오버라이딩되지 않은 부모 메서드 호출
//      parent.m3();    // 자식은 부모 메서드 쓸 수 있지만, 부모는 자식 메서드 못 씀
        System.out.println("=====================");
        Child child = new Child();
        child.m1();     // 부모의 메서드 호출
        child.m2();     // 오버라이드된 자식 메서드 호출
        child.m3();
        System.out.println("=====================");
        Parent pChild = new Child();
        pChild.m1();
        pChild.m2();    // 오버라이딩 된 자식 메서드 쓸 수 있음
//        pChild.m3();  // 자식을 부모 타입으로 업캐스팅하면 자식 오리지널 메서드 못 씀
        ((Child)pChild).m3();  // 한시적으로 자식 타입으로 다운캐스팅
//        pChild.m3();
    }
}
