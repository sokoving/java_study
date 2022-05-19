package day02;

public class Casting3 {
    public static void main(String[] args) {

        // 타입이 다른 데이터의 연산에서는 작은 쪽을 큰 쪽으로 변환한 후 연산을 진행
        int a = 10;
        short b = 30;
        int c = a + b; // a + (int)b

        char d = 'A'; //2byte
        int e = 100; //4byte
        System.out.println(d+e); // int(d) + 100 > 65 + 100 > 65 
        // 주의: 문자열(String) + 숫자(int) = 문자열(String)
        //      단일문자(char) + 숫자(int) = 숫자(int)
        e = 2;
        char f = (char) (d + e); // d + e > int(d) + e > 65 + 2 > (char)67 = C
        System.out.println("f = " + f);

        /*
            int보다 작은 데이터 (byte, short, char) 간의 연산은
            결과가 자동으로 int로 변환되어 처리
            (데이터 오버플로우, 언더플로우 방지)
            byte 범위 : -128 ~ 127 > byte 간의 연산은 범위를 넘어갈 가능성이 크니 int 타입으로 자동 형 변환
         */
        byte b1 = 100;
        byte b2 = 120;
      //byte result = b1 + b2;  // byte + byte > int
        System.out.println('A' + 'B'); //131 : char + char > int
        System.out.println("A" + "B"); //AB  : String + String > String

    }
}
