# tip
##  Scanner
  + 공백을 미포함하는 함수를 썼을 때는 *sc.nextLine();*을 써서
  + 다음 *sc.nextLine();* 에 공백이 자동입력되지 않도록 한다.

  - 엔터를 누르면 다음 코드로 이동하기
  - *sc.nextLine();* 사용

## // end main
  + 블록이 많아지면 괄호가 어디 블록 건지 헷갈린다.
  + 무슨 블록이 닫혔는지 꼬리표 달아줄 것.


# =============게임에 필요한 데이터 설정하기==============
## 1. 게임 참가자 수 (입력받고 맞게 썼는지 검증)
```
while (true) {
    try {
        System.out.print("인원을 입력받는다");

        // 입력을 맞게 했는지 검증
          [ 틀리게 썼을 경우 ]
        if (playerNum < 2 || playerNum > 4) {
            System.out.println("인원 수가 올바르지 않습니다.");
        } 
          [ 맞게 썼을 경우 반복문 탈출 ]
        else {
            break;
        }
          [ 인풋 타입을 다른게 썼을 경우 ]
    } catch (InputMismatchException e) {
        System.out.println("정수로만 써주세요!");
    }
} // end while
```

## 2. 참가자 이름 (이름을 입력받아 배열에 초기화)

## 3. 실탄 개수 (입력받기)

## 4. 실탄 장전 (중복되지 않는 랜덤수를 개수만큼 뽑기)
```
// 성공적으로 장전되었을 때의 카운트
int success = 0; 
while (success < bulletNum) {
    int position = (int) (Math.random() * magazine.length);
    if (!magazine[position]) {
        magazine[position] = true;
        success++;
    }
}
```

# =============게임 시작==============