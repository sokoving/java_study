# js와 java의 if문 차이
 - js에서는 if의 조건문으로 truthy한 값이면 다 되지만
 - java에서는 무조건 true / false  논리값이 나와야 한다

# if ~ else
  - else에는 조건식 쓰지 않는다
  
# if ~ else if
  - 다중 분기 조건문 : 좀 더 많은 분기를 만들 때 사용하는 조건문
  - if를 여러 개 쓰는 것과 if에 else if를 중첩하는 것
   + "if"를 여러 개 쓰면 참 거짓과 상관없이 모두 검사
   + else if 중첩이면 참값이 나오면 검사 중단
    - 상위 조건이 하위 조건을 포괄적으로 포함하지 않도록 해야 함  
  - 단점: 코드가 무조건 순차 실행하기 때문에 분기가 많아지면 효율이 안 좋아진다.

# switch ~ case
 - 다중 분기 조건문 : 
 - 분기가 굉장히 많을 때는 효율이 좋다.
 - 논리 연산자를 쓸 수 없다. 
   + 표현 못 하는 조건이 있을 수 있다
