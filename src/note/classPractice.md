# 1. 사용 데이터
- 데이터 간에 순차적 연관이 있다 > 배열
- 데이터 간에 순차 값을 찾음 > 객체

# 2. 구현 클래스 다이어그램(class Diagram)
## 2-1. 접근제한자 기호
```
+ : public
   해당 클래스, 같은 패키지, 다른 패키지와 하위 클래스
# : protected
    ??(강의 듣고 다시 쓰기)
    해당 클래스, 같은 패키지, 다른 패키지와 하위 클래스
~ : default
    해당 클래스, 같은 패키지까지만(생략 가능)
- : private
    해당 클래스
```

## 2-2. + CUT_LINE : int = 60 (상수) 
- 필드 CUT_LINE은 60으로 고정한다.(상수)
- 상수 이름은 대문자와 언더라인으로 표기
+ public static final int CUT_LINE = 60; 
+ static final을 붙이면 코드를 통해 값 변경 불가

# 기타 용어 설명
## vo
- value object
- 필드가 많은 객체
- 추가해야함


# 주의점

## 메서드 만들면 여러 상황에서 잘 돌아가는지 중간점검하기

## iter에서 null값을 만나면
- iter은 무조건 배열 전체를 순회한다
- 배열에 null이 있는 순간 터짐(nullPointerException)
## nullPointerException

## for문에 메서드 넣으면 돌아갈 때마다 함수 호출함
- 다른 변수에 값 저장하고 쓰기


# 입력 처리를 간단하게 만드는 메서드
```
    private String inputStr(String msg) {
        System.out.printf(msg);
        return sc.next();
    }

    private int inputInt(String msg) {
        System.out.printf(msg);
        return sc.nextInt();
    }
```

# 클래스마다 부여된 역할이 있다
- 역할에 맞는 일을 하게 하자
- Member > 멤버 데이터 저장
- MemberController > 멤버 데이터 조작
- MemberMenu > 출력을 담당

# 프로그램 종료 시에는 
```
System.out.println("프로그램을 종료합니다.");
System.exit(0); // 프로세스 종료
break;

아니면 return;
```