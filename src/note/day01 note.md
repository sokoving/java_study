# JDK(Java Development Kit) 설치
자바 소프트웨어 개발 도구
보통 가장 안정적이라고 평가받는 8버전이나 11버전 설치

# 간단 흐름
1. 소스 코드 작성 >  Hello.java 생성
2. javac(컴파일 명령):  cmd > 코드가 있는 위치 > javac Hello.java > Hello.class 생성
3. java(실행 명령):  cmd > 코드가 있는 위치 > java Hello

# 통합 개발 환경 (인텔리j)
## 플러그인
 +  add to gitignore
 +  Atom Material Icons
 +  korean language Pack
 +  Material Theme UI

## 단축키
+ shift + shift : 검색
+ ctrl + alt + s  : 설정
+ alt + 1 : 프로젝트 열기
+ alt + 1 + 1: 프로젝트 닫기
+ alt + →, ←: 창 이동

- ctrl + alt + l : 줄 맞춤
- ctrl + d  : 줄 복사
- alt + shift + ↑, ↓ :  줄 이동
- ctrl + shift + f10 : 코드 실행

## 나를 살려줄 단축키
- ctrl + alt + v : 자동 변수 선언 완성(타입도 자동 판별)
- alt + ent : 문제 해결 방법을 알려줌

- sout > System.out.println();  (Console.log와 같음)
- soutb > System.out.println("random = " + random); (윗줄 변수 값을 로그에 보여줌)


# 파일 이름은 파스칼 케이스 식별자 규칙을 따른다
- 맨 앞 단어 대문자, 띄어쓰기 대신 대문자
- 숫자로 시작
- 특문은 _ 아니면 $

# js와 달리 API(자동 세미콜론  삽입 기능)이 없어 ; 꼭 붙여야 함

# 들여쓰기, 엔터는 코드와 상관없다

# 주석
/** API Document 주석
* 웹사이트에 올렸을 때
* 자동으로 html태그로 변환되어 
* 코드를 보지 않아도 웹에 나타나는 주석
*/

// 한 줄 주석

/* 블록 주석 */

# public class Comment {
class 블록: 자바 코드의 시작
# public static void main(String[] args) {
main 함수: 함수를 호출해서 실행하는 부분
프로그램의 실행 시작 지점
메인함수가 있어야 프로그램이 실행된다.
}
}
# 변수
1. 전역 변수 없음
   모든 코드는 main 함수 안에서 진행되기 때문에 전역처럼 쓰는 지역변수만 있다.

2. 블록 레벨 스코프
+ 특정 블록 안에서 선언된 변수는 해당 블록을 벗어나면 메모리에서 자동 삭제된다
+ 블록 안에서 선언된 변수를 블록 밖에서 참조하려면 선언과 할당을 분리. 
  - 선언은 블록 위(밖)에서, 할당은 블록 안에서. 
  - 블록 밖 참조 가능

3. 블록 밖에서 선언되어 있는 변수는 블록 안이라도 같은 이름으로 선언 불가.
   블록 안에서 선언된 변수는 블록 밖에선 삭제되기 때문에 중복 가능
