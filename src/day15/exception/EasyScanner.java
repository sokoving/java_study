package day15.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EasyScanner {
    
/*    throws : 예외 떠넘기기
     메서드 내부에서 예외가 발생했을 때 메서드를 try-catch문으로 잡아서 처리할 수도 있지만
     수많은 예외 상황을 메서드에서 다 처리할 수 없기 때문에
     경우에 따라서 메서드 호출부로 예외를 떠넘길 수 있다
         메서드 뒤에 throws 키워드를 쓰고 예외 클래스 적기(여러 개는 쉼표로 구분)
     호출부에서 받은 예외를 처리한다.
         호출부에서도 예외를 처리하지 않고 떠넘기면 최초 호출 지점인 main 메서드로 예외가 던져지며
         메인 메서드에서도 throws로 예외를 던지면 JVM의 예외처리기까지 도달하여 프로그램이 강종됨
     주의: 코딩테스트에서 편의상 예외가 나지 않는다는 가정 하에
     main에 throws IOException을 하는 것이지
     원래는 main에 throws를 붙이면 안 된다.
 */
    
    private static Scanner sc;
    static {
        sc = new Scanner(System.in);
    }

    // 정수 입력 기능
    public static int inputInteger(String msg) throws InputMismatchException, Exception {
        System.out.print(msg);
        int n = sc.nextInt();
        sc.nextLine();

        return n;
    }

    // 실수 입력 기능
    public static double inputDouble(String msg) throws Exception {
        System.out.print(msg);
        double n = sc.nextDouble();
        sc.nextLine();

        return n;
    }

}
