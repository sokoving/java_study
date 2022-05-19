package day02;

import java.io.IOException;
import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) throws IOException {
//        int inputData = System.in.read();  >> 콘솔에 입력한 내용을
//        System.out.println(inputData); >> 무언가의 코드로 변환해 콘솔에 출력한다

        // 스캐너 api 사용
        Scanner sc = new Scanner(System.in);

        /* 스캐너의 함수들
            - next(): 문자열을 입력받을 때, 공백은 처리 불가(공백 전까지만 반환)
            - nextLine(): 문자열 입력, 공백 포함
            - nextInt(): 정수를 입력
            - nextDouble(): 실수를 입력
         */
        //문자열 입력받기
        // String name = sc.nextLine();  멍멍이와 야옹이 > 멍멍이와
        System.out.print("이름: ");
        String name = sc.nextLine();  // 멍멍이와 야옹이 > 멍멍이와 야옹이
        System.out.println("name = " + name);

        //숫자 입력받기
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.println("age + 10 = " + (age + 10));
        
        // 스캐너 메모리 해제 - 작업자가 해제하지 않으면 계속 돌아가서 메모리 낭비
        // 숫자 입력받기 전에 해제하면 숫자 입력 안 됨
        sc.close(); 
    }
}
