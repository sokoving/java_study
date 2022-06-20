# 오류(error)와 예외(Exception)
- 생기면 프로그램 멈추는 건 같음
- 오류는 프로그램 외적인 원인으로 발생
  + 개발자가 대처 불가
- 예외는 프로그램 내적인 원인(코드)으로 발생
  + 예외 처리로 미리 예방

# 예외 처리(Exception Handling)
- 발생 가능성이 있는 오류에 대한 예방 조치(프로그래밍)
- 오류 발생 가능성이 있는 코드에 대한 예외 조치
- 발생한 오류를 해결하는 건 아님 X

## 예외의 종류(예외 클래스)
1. 일반 예외(Exception)
  - 컴파일러 체크 예외 : 코드 문법에 어긋나게 썼을 경우 컴파일러가 검사해서 실행 전에 알려줌
  - 예외 처리 코드가 없다면 컴파일 오류(프로그램 실행X)
2. 실행 예외(Runtime Exception, UnCheckedException)
  - 컴파일과정에서 예외처리 코드를 검사하지 않은 예외
  - 예외 처리를 하지 않았다면 예외 코드를 실행하기 전까지는 정상 작동
3. 예외 클래스
  - 

## 예외 클래스 구조
```
         [Object]
            │
        [Throwable]
    ┌───────┴────────┐
[Error]          [Exception]   
                  ├─[InterruptedException]
                  ├─[IOException]
                  ├─[SQLException]
                  │                       ┌──[SecurityException] : 호출자에게 리소스를 액세스하는 데 필요한 권한이 없을 때 
                  │                       ├──[NullPointerException] : 값이 null인 객체를 참조했을 때
                  └─[Runtime Exception]───┼───[ArrayIndexOutOfBoundsException] : 배열에서 인덱스 범위를 초과하여 사용했을 때
                    [UnCheckedException]  ├───[ClassCastException] : 허용되지 않는 타입 벼노한을 시도할 경우
                                          ├──[NumberFormatException] : 숫자로 변경할 수 없는 문자를 숫자로 변환할 때
                                          └──[ArithmeticException] : 0으로 나눴을 때(산술 연산이 불가할 때)
```

## try - cathch
```
      try { 
          [ 1 ]
      } catch ([ 2 ]) { 
          [ 3 ]
      } catch (InputMismatchException e) {
          [ 4 ] 
      } catch (Exception e){
          [ 5 ] 
      } finally {
          [ 6 ] 
      }
```
1. try
  + 예외 발생 가능성이 있는 코드를 try로 감싼다 
  + 에러가 나지 않으면 > 코드 실행하고 try문이 끝난다.
  + 에러가 나면       > try의 코드는 즉시 중단하고 해당 에러를 매개변수로 가진 catch 코드 실행, 프로그램의 비정상 종료를 막는다

2. 매개변수 e
  + 처리할 예외 클래스와 매개변수(보통 e)를 적는다
  + 무슨 에러가 날지 모른다면 예외의 최상위 클래스 Exception을 적는다
  + 어떤 상황에서 무슨 에러가 나는지 잘 지켜보고 예외 처리에 쓰자
  + 예외는 경험으로 알아낸다...

3. catch
  + 예외 발생 시 실행할 코드를 catch에 적는다
  + e.printStackTrace(); 예외 처리 후에(프로그램 정상 종료) 예외 로그를 보고 싶을 때
  + System.out.println(e.getMessage()); 전체로그 말고 예외 원인 메시지만 확인하고 싶을 때

4. 멀티 캐치
  + try 코드에서 발생할 수 있는 여러 예외를 쓸 수 있다
  + else if처럼 위에서부터 검사해서 내려오기 때문에 상위 타입의 에러일수록 밑에 위치시킨다

5. 기타 등등 캐치
  + 마지막 catch에 예외의 최상위 클래스인 Exception을 적으면 대부분 잡힌다
  + 모든 예외를 catch 처리할 순 없다

6. finally
  + 예외가 발생하든 발생하지 않든 실행할 코드를 적는다
  + 보통 db 후처리를 위한 코드를 적는다
  + 데이터베이스 연결 코드, 네트워크 연결 코드, 하드웨어 장치 연결 코드 등등

## throws (예외 떠넘기기)
> public static int inputInteger(String msg) throws InputMismatchException, Exception
- *메서드* 내부에서 예외가 발생했을 때 메서드를 try-catch문으로 잡아서 처리할 수도 있지만`
- 수많은 예외 상황을 메서드에서 다 처리할 수 없기 때문에
- 경우에 따라서 메서드 호출부로 예외를 떠넘길 수 있다

+ 메서드 뒤에 throws 키워드를 쓰고 예외 클래스 적기
+ 호출부에서 받은 예외를 처리한다.
+ 예외 여러 개를 던질 때는 쉼표로 구분한다

- 호출부에서도 예외를 처리하지 않고 떠넘기면 최초 호출 지점인 main 메서드로 예외가 던져지며
- 메인 메서드에서도 throws로 예외를 던지면 JVM의 예외처리기까지 도달하여 프로그램이 강종됨

+ 주의: 코딩테스트에서 편의상 예외가 나지 않는다는 가정 하에 main에 throws IOException을 하는 것이지 원래는 main에 throws를 붙이면 안 된다.

## throw (강제 예외 발생시키기) / 사용자 정의 예외 클래스
```
    public void withdraw(int money) throws Exception {
        if (balance < money) {
            [1] throw new [2] BalanceInsufficientException("잔액 부족!!!");
           // return;
}
```
1. throw new Exception(); 
  - 새 예외를 유발하다, 발생하다
  - 던지다라는 뜻의 throws와 다름, 새로운 에러를 강제로 발생시킨다는 뜻
  - 시스템적으로 return보다 강력하게 위험을 어필하는 것
2. 사용자 정의 예외 클래스 발생
  - 자바 시스템에서는 에러라고 여기지 않지만 개발자는 예외 처리를 해야 할 때 직접 예외 클래스를 만들 수 있다.
  - Exception 대신 사용자 정의 예외 클래스를 정의해 사용하면 호출부에서 멀티 캐치를 사용할 수 있다.
``` 관례
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
```