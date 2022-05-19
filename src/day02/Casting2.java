package day02;

public class Casting2 {
    public static void main(String[] args) {
        /* down casting : 하위 타입 변환
         다운캐스팅 시 "값의 손실이 일어날 가능성" 있음 > 자동으로 형변환해주지 않음 > 작업자가 명령해야 함
         int n 데이터 모습  0000 0000 | 0000 0000 | 0000 0011 | 1110 1000
         (byte)n 데이터 모습  1110 1000

         (byte), (int) : 형 변환 연산자 (단항 연산자)

         */
        int n = 1000;
        byte m = (byte)n;  // int 타입을 byte 타입에 넣으려면 1000의 데이터를 깎아내고 넣는다.
        System.out.println("m = " + m);
        
        // 고의로 다운캐스팅을 해 값의 손실을 일으키는 경우
        double k = 5.556;
        int j = (int) k;
        System.out.println("j = " + j); // 실수 k의 소숫점 자리를 버림
        

    }
}
