package day02;

public class Randomexample {
    public static void main(String[] args) {

        //난수 생성 (0.0 ~ 1)
        double rn = Math.random();
        System.out.println("rn = " + rn);
        
        // 1 이상 10 이하의 랜덤 정수
        /*
            Math.random()               -> 0.0 <= ~ < 1.0
            Math.random() *10           -> 0.0 <= ~ < 10.0
            (int)(Math.random() *10)    -> 0 <= ~ < 10
            (int)(Math.random() *10) +1 -> 1 <= ~ < 11
         */

        int num = (int)(Math.random() * 10) + 1;
        /*     대입 단항    참조       2항   2항
                5   3     ( 1         2 )  4
        */
        int num2 = (int)Math.random() * 10 + 1;
        /*     대입 단항    참조       2항   2항
                5   2      1          3    4
         */
    }
}
