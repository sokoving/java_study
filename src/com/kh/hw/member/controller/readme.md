# Member Method
## 멤버의 정보를 문자열로 리턴하는 메서드
- public String inform()


# MemberController Method

기본 생성자: 3명 정보를 초기화

## 실제로 배열에 저장되어 있는 회원객체의 숫자를 세는 메서드
- public int existMemberNum()
- @return 실제 저장된 회원의 수

## 실제로 배열에 저장되어 있는 회원객체의 숫자를 세는 메서드
- public int existMemberNum()

## 아이디를 통해 회원배열에서 특정 회원이 저장된 인덱스를 알려주는 기능
- public int findIndexById(String id)

## 아이디 중복을 체크하는 메서드
- public boolean checkId(String inputId)

## 멤버 배열 리턴 메서드
- public Member[] printAll()

## 회원정보를 배열 m에 저장하는 메서드
- public void insertMember(String id, String name, String password
  , String email, char gender, int age)

## 아이디를 입력하면 해당 회원 객체를 리턴
- public Member searchId(String inputId)

## 이름을 입력하면 해당 회원 정보를 모두 리턴
- public Member[] searchName(String name)

# (아직) 회원의 비밀번호를 변경하는 메소드
- public boolean updatePassword(String id, String newPassword)

# (아직) 회원의 이름을 변경하는 메소드
- public boolean updateName(String id, String newName)
- 
# (아직) 회원의 이메일을 수정하는 메소드
- public boolean updateEmail(String id, String newEmail)

# (아직) 회원정보 하나를 삭제하는 메서드
- public boolean delete(String id)

# (아직) 회원정보 전체 삭제
- public void delete