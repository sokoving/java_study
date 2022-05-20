package day03;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        // while : 선 조건 검사, 후 실행
        // do ~ while : 선 실행, 후 조건 검사

        Scanner sc = new Scanner(System.in);

        int number = 0;
        int total = 0;

        do{
            System.out.println("정수(0입력 시 종료): ");
            number = sc.nextInt();
            total += number;
        } while(number != 0);

        System.out.println("입력값 누적합: "+total);
        sc.close();
    }
}
