# 메서드와 함수
  + 함수 : 범용으로 쓸 수 있다 (java에는 없는 개념)
  + 메서드 : 모든 객체가 아닌 특정 객체에서만 쓸 수 있다.
  - 일단은 메서드랑 함수랑 비슷한 거라고 알고 있자

# 메서드의 위치
  + 선언
    - 클래스 안, 메서드 밖
    - 메서드 내부에서 메서드 선언 안 됨
    - public static void main(String[] args) 도 메서드
   > class MethodBasic{ *여기* static void main {} *여기*} 

 + 호출
  + 메서드, 생성자 내부 > *재귀함수 가능*
  + 