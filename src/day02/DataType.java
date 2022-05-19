package day02;

public class DataType {
    public static void main(String[] args) {

        //정수 타입
        byte a = 127;
        short b = 3276;
        int c = 2147483647;
        long d = 2147483678L; // long 타입은 저장 범위가 넓다. 리터럴에 저장되는 값의 타입은 int
        // int 공간에 저장이 안되어서 범위가 벗어났다는 문제가 발생한 것이다.
        // 변수값이 리터럴 기본값 int 의 범위를 벗어난 경우 뒤에 L을 붙여 타입을 바꿔준다.
        System.out.println("d = " + d);


        //실수 타입
        int i;
        double n = 0.0;
        for(i = 0; i < 100; i++){
            n += 0.1;
        }
        System.out.println("n = " + n);
        // 실수의 표현에는 오차가 있을 수 있다
        float f1 = 1.2345678901234F; //4byte
        double d1 = 1.2345678901234; //8byte
        // "float"이 "double"보다 용량을 적게 차지하긴 하지만 굳이 여기서 용량을 아낄 필요는 없다
        // 결론: "double" 써라

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);

        //논리 타입
        boolean b1 = true;
        boolean b2 = false;
        // "java"에는 "js"와 다른게 truthy, falsely 값이 없다
        // TRUE "true" 0 모두 논리값이 아니다
        // true false 예약어 > 변수 안 됨

        //문자 타입
        /* 기본 타입 : char(character)
            2byte  할당, 음수 개념 없음, 한 글자만 저장 가능
            아스키코드 1byte / 유니코드 2byte
            65 > A /  97 > a / 44032 > 가
        */

        char c1 = 'A'; // 홑따옴표 사용, "AB"는 2byte 넘으니까 저장 안 됨
        char c2 = 44032; // 가
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        // 문자열 타입(String)
        /* "String"은 기본 타입이 아니라 "Char"가 모여 있는 "객체 타입"
           용량이 가변적
         */
        String s1 = "hello java";

        // 문자 + 숫자 = 문자
        System.out.println(s1 + 300 + 120); // hello java300120
    }
}