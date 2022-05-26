package day07;

public class FieldVariable {

    static int a; // a: field

    /*    # 변수의 초기화
        지역변수(int b)는 반드시 초기화가 되어 있어야 참조가 가능하다.
        필드(int a)는 초기화를 하지 않아도 자동으로 각 타입의 기본값으로 초기화된다.
        매개변수는(int c) 메서드 호출 시 강제로 값이 대입(초기화)됨으로 따로 초기화할 필요가 없다.

        필드 a > Heap에 저장(초기값 0), 생성자 함수를 호출해야 참조 가능
        변수 b > stark에 저장
        매개변수 c > stack에 저장 (초기값 null)
     */
    static void m1(int c) { // c: parameter
        int b = 1; // local variable : 초기화를 해야 참조 가능
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {

        FieldVariable fv = new FieldVariable();
        m1(10); // 매개변수는 호출할 때 대입(초기화)됨
    }
}