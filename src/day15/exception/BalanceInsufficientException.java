package day15.exception;

// 사용자 정의 예외 클래스
// 자바 시스템에서는 에러라고 여기지 않지만 개발자는 예외 처리를 해야 할 때 직접 예외 클래스를 만들 수 있다.
// 0. 클래스 이름 뒤에 Exception을 붙여 짓는다.
// 1. Exception 클래스를 상속받는다
public class BalanceInsufficientException extends Exception{
    // 2. 기본 생성자를 만든다
    public BalanceInsufficientException(){}
    // 3. 에러 메세지를 받는 생성자도 만든다
    public BalanceInsufficientException(String message){
        super(message);
    }
}
