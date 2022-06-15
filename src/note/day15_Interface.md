# 인터페이스와 클래스
- 둘 다 규격을 정하는 문서임
- 구현 클래스가 인터페이스를 구현할 때는 implements 키워드 사용
  + 상속이랑 비슷하긴 함
- 근데 필드를 쓰려면 추상클래스를 만들어서 상속받아야 함
  + 인터페이스는 다중 상속이 가능.
- 추상클래스 상속과 인터페이스를 사용하면 쉽게 클래스를 만들 수 있다

## 인터페이스 선언
> public interface Pet
  + class 대신 interface 키워드 넣기
> public static final String PLAY_GROUND = "애완동물 카페";
  + 상수만 선언 가능 (인스턴스 필드 선언 안 됨) 
  + 자동으로 static final을 삽입 처리
> public abstract void play();
  + 추상 메서드
  + 자동으로 abstract 삽입
>  public static void m1()
  + 정적 메서드(객체 생성 없이도 사용 가능)
> default void m2(){};
  + 디폴트 메서드(자바 8 이후)
  + 디폴트 메서드는 오버라이딩 안 해도 컴파일러 오류 없음
  + 유지보수 때 추상메서드를 추가할 경우 우선 디폴트 메서드로 선언한 뒤
  + 임플리먼트한 클래스에 오버라이딩 작업 후 추상 메서드로 바꾸는 방법을 씀
     - 추상 메서드를 선언하면 임플리먼트한 클래스에 전부 컴파일러 오류 뜸

## 인터페이스 사용
- public class BullDog implements Pet 
  + 인터페이스의 규격을 사용할 클래스 선언 뒤에 implements 키워드 사용
  + 인터페이스를 implemts한 클래스는 인터페이스의 추상메서드들을 모두 오버라이딩 해야 함 