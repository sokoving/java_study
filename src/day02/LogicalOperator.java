package day02;

public class LogicalOperator {
    public static void main(String[] args) {

        //산술연산자
        // (js) 몫을 구하는 ** 연산자 없음
        // 정수의 / > 몫,  %  > 나머지

        //관계연산자
        // (js) 완전동등 연산자 === 없음
        // 동등비교 == (주소값??)

        //논리연산자
        /* 주의 1
            js 논리값에는 truthy, falsely 가 있어서
            "hello" & "java"  == true 되지만
            JAVA 는 그런 거 없다.
            논리값은 오직 true 와 false 둘 뿐
         */
        /* 주의 2 연산 결과는 같지만
                 단축평가는 우항을 연산 안 할 수 있기 때문에
                 필요에 따라 골라 쓰자
            논리연산자 &, |          단축평가 &&, ||
            좌항, 우항 모두 연산      좌항에서 전체 논리 결과가 편명날 경우
                                   [false && 와 true ||]
                                   좌항만 연산
        */

        boolean t = true, f = false;
        System.out.println(t | t);
        System.out.println(t | f);
        System.out.println(f | t);
        System.out.println(f | f);

        System.out.println("===============");

        int x = 10, y = 20;

        boolean result1 = (x != 10) && (++y == 21);
        boolean result2 = (x == 10) || (++y == 21);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("===============");

        // 논리 반전 (!) - 단항 연산자
        System.out.println(!t);  // false

        //결합 연산자 (?)
        System.out.println("안녕" + "하세요");

        //비트 연산자
    }
}
