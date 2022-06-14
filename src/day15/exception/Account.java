package day15.exception;

public class Account {

    // throw : 강제 예외 발생시키기

    String owner;
    int balance; // 잔액

    //출금 기능
    public void withdraw(int money) throws Exception {
        if (balance < money) {
            // throw : 유발하다, 발생하다(던지다라는 뜻의 throws와 다름, 새로운 에러를 발생시킨다는 뜻)
            //         시스템적으로 return보다 강력하게 위험을 어필하는 것
            throw new BalanceInsufficientException("잔액 부족!!!");
            // 사용자 정의 예외 클래스 발생
                // 자바 시스템에서는 에러라고 여기지 않지만 개발자는 예외 처리를 해야 할 때 직접 예외 클래스를 만들 수 있다.
                // Exception 대신 사용자 정의 예외 클래스를 정의해 사용하면 호출부에서 멀티 캐치를 사용할 수 있다.
//            return;
        }
        this.balance -= money;
    }
}
