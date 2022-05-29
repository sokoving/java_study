# 1. 패키지
- 패키지로 체계적으로 관리하기 위함(폴더)
  + 패키지 경로를 늘리면 클래스를 식별하기 편하다(?)
## 1-1. 클래스가 이름이라면 패키지는 성
- class User의 풀네임은 app.myuser.User 인 셈
- app.myuser.User != app.benuser.User
- 한 패키지에 동일 이름의 클래스는 생성할 수 없다.
## 1-2. 패키지의 이름 규칙
- 숫자로 시작 X
- $나 _ 제외 특수문자 사용 X
- 모두 소문자로 적을 것(클래스명과 구분)

# 2. import문
> import app.myuser.User;
- 다른 패키지에 있는 클래스를 사용할 때 쓴다
  + import 대신 패키지 경로를 포함한 풀경로를 쓸 수도 있다
  > app.myuser.User user = new app.myuser.User();
- 위치는 클래스 위
- 특정 패키지의 클래스를 여러 개 사용한다면 *을 쓴다
> import app.myuser.*;

# 3. 접근제한자(Access Modifier)
- 라이브러리 클래스는 대부분 외부 클래스에서 접근할 것을 상정하고 설계함
  + 접근할 수 있는 외부 클래스를 지정할 필요가 있다
- 클래스와 클래스의 구성요소(필드, 생성자, 메서드)에 붙일 수 있다

## 3-1. 접근제한자의 종류와 제한대상
```
+ public : 범용(거의 모든 클래스) 
           Same Class, Same Package, Other Package&Subclass, Other Package(Universe)
# protected : ??(강의 듣고 다시 쓰기)
            Same Class, Same Package, Other Package&Subclass
~ default : 같은 패키지까지만(생략 가능)
           Same Class, Same Package 
- private : 해당 클래스에서만
           Same Class 
```
## 3-2 클래스에 접근제한자를 붙이기(defalt)
- 클래스에 붙인 접근제한자는 안의 모든 요소에 일괄적으로 부여된다.
- public과 default 두 가지만 가능
- 필드, 생성자, 메서드에 public이 붙어 있어도 적용 X
- 세부적으로 조정하기 위해서는 데이터에 개별적으로 붙여야 한다.