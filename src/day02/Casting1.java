package day02;

public class Casting1 {
    public static void main(String[] args) {

        /*  묵시적 형 변환(promotion)
             1      2       2     4      8       4      8
            byte < short = char < int < long < float < double
                       [→ 형 변환이 일어나는 방향]

            up casting
            작은 크기의 데이터 타입 -> 큰 데이터 타입으로 변환할 때는 자동으로 형 변환
            값의 손실이 일어날 가능성이 없다 > 자동으로 형변환
         */
        byte a = 100; // 1byte 할당
        
        int b = a;  // byte 타입 a가 int 타입으로 자동 형 변환(묵시적)
        System.out.println("b = " + b); // b = 100
        
        double c = b; // int 타입 b가 double 타입으로 자동 형 변환(묵시적)
        System.out.println("c = " + c); // c = 100.0
        
//        int d = c;  // double 타입인 c는 int 타입으로 자동 변환될 수 없다
    }
}
