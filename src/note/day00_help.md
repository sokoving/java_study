# 나를 살려줄 단축키
 + ctrl + alt + v : 자동 변수 선언 완성(타입도 자동 판별)
 + ctrl + alt + t : 드래그한 범위를 감싸는 문 만들기
 
 + alt + ent : 문제 해결 방법을 알려줌
   - 블록으로 감싼 영역을 루프로 바꿀 수 있음
  
 + sout : System.out.println();
  - Console.log와 같음

 + soutv : System.out.println("random = " + random);
  - (윗줄 변수 값을 로그에 보여줌)

 + souf : System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anniversary); 
  - printf() > js의 `${}`와 같은 기능 <br>
  - 포맷 지정자
    + %d : 10진수 정수
      - %-4d : 4자리를 점유하며 출력한다(칸 맞춤, 탭과 비슷)
    + %f: 실수
      - %.3f: 소수점 3자리까지 출력
      - % 쓰려면 %%
    + %s: 문자열
    + %c: 단일문자
  - 쉼표(,) 뒤에 전달할 인수(변수)를 순서대로 쓴다.

+ iter : 강화된 for문

# Scanner
 
## package 와 public class 사이에 
+ import java.util.Scanner;

## 스캐너 api 사용
+ Scanner sc = new Scanner(System.in);

## 스캐너의 함수들
 + sc.next(): 문자열을 입력받을 때, 공백 미포함 (공백 전까지만 반환)
 + sc.nextLine(): 문자열 입력, 공백 포함
 + sc.nextInt(): 정수를 입력, 공백 미포함 (공백 전까지만 반환)
 + sc.nextDouble(): 실수를 입력

## 스캐너 메모리 해제
 + sc.close(); 


# 단축키
+ shift + shift : 통합검색(파일이름도 검색 됨)
+ ctrl + e : 최근에 열어봤던 파일 목록
+ ctrl + alt + s  : 설정
+ alt + 1 : 프로젝트 열기
+ alt + 1 + 1: 프로젝트 닫기
+ alt + →, ←: 창 이동

- ctrl + alt + l : 줄 맞춤
- ctrl + d  : 줄 복사
- alt + shift + ↑, ↓ :  줄 이동
+ ctrl + shift + ↑ : 위 문에 중첩시키기
+ 
- ctrl + shift + f10 : 코드 실행

+ ctrl + shift + / : 블록 주석

# 문자열 특정 단일문자 취득
String s = "OOXXXOOXX"; <br>
// 문자열 특정 단일문자 취득 <br>
System.out.println(s.charAt(0)); <br>
System.out.println(s.charAt(2)); <br><br>

// 문자열 길이 구하기 <br>
System.out.println(s.length()); <br>

