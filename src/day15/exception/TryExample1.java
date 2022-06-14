package day15.exception;

public class TryExample1 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        System.out.println("나눗셈 시작");

        // 1. 예외 처리가 필요한 코드( n1, n2가 0일 경우 에러)
        try { // 2. 예외 발생 가능성이 있는 코드를 try로 감싼다
              //    에러가 나지 않으면 코드 실행하고 지나감
              //    에러가 나면 try의 코드는 즉시 중단하고 해당 에러를 매개변수로 가진 catch 코드 실행, 프로그램의 비정상 종료를 막는다
            System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
        } catch (Exception e) { // 3. 처리할 예외에 대한 클래스와 매개변수(보통 e)를 적는다
                                //    무슨 에러가 날지 모른다면 예외의 최상위 클래스 Exception을 적는다
                                //    어떤 상황에서 무슨 에러가 나는지 잘 지켜보고 예외 처리에 쓰자
            //    예외는 헤딩(경험)으로 알아낸다...
            // 4. 예외 발생 시 실행할 코드를 catch에 적는다
            System.out.println("0으로 나눌 수 없습니다. ");
            // 예외 처리 후에(프로그램 정상 종료) 예외 로그를 보고 싶을 때
            e.printStackTrace();
            // 전체로그 말고 예외 원인 메시지만 확인하고 싶을 때
            System.out.println(e.getMessage());
        }

        System.out.println("프로그램 정상 종료");
    }
}
