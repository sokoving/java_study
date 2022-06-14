package day15.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 예외 처리
public class TryExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 여러 코드에서 여러 예외가 발생할 수 있을 때
        try {
            System.out.print("정수1 : ");
            int n1 = sc.nextInt(); // warning (InputMismatchException)

            System.out.print("정수2 : ");
            int n2 = sc.nextInt(); // warning (InputMismatchException)

            int div = n1 / n2; // warning (ArithmeticException)
            System.out.println("div = " + div);
            sc = null;
            sc.close(); // warning : sc가 null이면 NullPointerException
// 멀티 캐치 처리
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안 됩니다.");
        } catch (InputMismatchException e) {
            System.out.println("정수로만 입력해 주세요");
        } catch (NullPointerException e) {
            System.out.println("객체 초기화를 확인하세요");
// 기타등등 처리: 예상하지 못한 예외는 맨 마지막에 Exception으로 잡아준다
            // 상위 타입의 에러일수록 밑에 위치
        } catch (Exception e){
            System.out.println("알 수 없는 예외 발생, 관리자에게 문의하세요");
        }


        System.out.println("프로그램 정상 종료");

        
    }
}
