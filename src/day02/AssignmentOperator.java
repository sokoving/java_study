package day02;

public class AssignmentOperator {
    public static void main(String[] args) {

        // 대입 연산자
        int a = 5;
        System.out.println(a+3); // a == 5
        System.out.println(a+=3); // a == 8

        a += 2; // a = a + 2 == 10
        a *= 4; // a = a * 4 == 40
        a >>= 2; // a = a / (2*2) == 10
        a <<= 4; // a = a * (2*2*2*2) == 160
        System.out.println("a = " + a);
    }
}
