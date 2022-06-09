package day12.static_;

public class Main {

    public static void main(String[] args) {

        // 스태틱 필드인 y는 객체 생성 없이
        // 참조만으로 사용할 수 있다.
        System.out.println("y = " + Count.y );
        // Math 클래스이 PI 역시 스태틱 필드라
        // 객체 생성 없이 참조만으로 사용할 수 있다.
        System.out.println("PI = " + Math.PI);

        Count c1 = new Count();
        c1.x = 10;
        c1.x++;

        c1.y = 20;
        c1.y--;

        System.out.println("c1.x: " + c1.x);
        System.out.println("c1.y: " + c1.y);

        Count c2 = new Count();
        c2.x = 200;
        c2.y = 100;

        System.out.println("===================");
        System.out.println("c1.x: " + c1.x);
        System.out.println("c1.y: " + c1.y);

        System.out.println("c2.x: " + c2.x);
        System.out.println("c2.y: " + c2.y);

        System.out.println("===================");

    }

}
