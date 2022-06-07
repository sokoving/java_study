# int > long
큰 수가 들어갈 가능성이 있는 변수는 타입을 long으로 해두고 진행한다
답 제출할 때는 다시 형변환 할 것.

# 'a' = 97;
# 'A' = 65;

# 의사 코드(Pseudo-code)
코드 진행을 일단 글로 써보고 구현하기
```
            총합을 저장할 변수;
            for (absolutes배열의 크기만큼) {
                signs배열의 논리값을 확인하여
                absolutes배열의 정수값에 부호를 붙인다음
                총합에 누적
            }
            총합을 리턴;
```
```
        long total = 0;
        for (int i = 0; i < absolutes.length; i++) {
            // 부호가 붙은 원래 숫자
            int n = signs[i] ? absolutes[i] : -absolutes[i];
            total += n;
        }
        return (int) total;
```

# 제시되는 숫자 번호가 인덱스+1 이라면
- 배열의 0번 인덱스에 0을 넣어 숫자 맞추고 문제 풀이