# 1. 알고리즘 기초 (dataStructur 패키지 참고)

## 시간복잡도를 표기하는 방법
- 원하는 결과까지 얼마나 걸리는지에 따라 나눔
  + 빅-오메가(best case): 최선일 때 연산 횟수를 표기
  + 빅-세타(average case): 평균일 때 연산 횟수 표기
  + 빅-오(worst case): 최악일 때 연산 횟수 표기
```
int findNUmber = (Math.random() * 100);
for (int i = 0; i < 100; i++{
  if (i == findNumber) return i;
 }
 빅-오메가 표기법에서 시간 복잡도는 1번
 빅-세타 표기법에서 시간 복잡도는 2/N번(50번)
 빅-오 표기법에서 시간 복작도는 N번(100번)
```


## 빅-오 표기법
- 알고리즘에서는 빅-오 표기법을 기준으로 코드 작성
- 최악의 상황을 염두에 두고 알고리즘 구성

## 빅-오 표기법 특징
 - N은 엄청나게 크다고 가정하기 때문에 자잘한 건 무시한다
 - 상수항 무시 : 
 - 영향력 없는 항 무시 : 

## 시간 제한 1초 > 일반적으로 1억 번 연산 이내
시간 제한 0.5초 > 일반적으로 5천만 번 연산 이내


# 2. 배열과 리스트
- 둘 다 여러 데이터를 관리할 때 쓰지만
- 데이터간 순번이 중요하면 리스트, 아니면 배열
## 2-1. 배열
- 메모리의 연속 공간에 값이 채워져 있는 형태의 자료구조
  + 따로따로 떨어져 있는 데이터보다 연산 속도가 빠르다.
```배열의 구조
[2][3][5][6][9]
```
### 장점
- 장점
  + 인덱스를 사용하여 특정 값에 바로 접근
  + *순회, 탐색 속도가 빠르다*
- 단점
  + 배열에 데이터를 삽입, 수정, 삭제 속도가 느리다
  + 데이터를 동적 변동시키려면 다른 데이터들도 값을 옮기는 과정 필요


## 2-2. 리스트

## java api로 사용하기
강의 교안 22강 컬렉션 2. List 인터페이스 참고

- 값과 다음 노드 주소를 가지고 있는 노도를  연결한 자료구조
- 순서가 중요한 데이터를 리스트로 관리한다
 ``` 리스트의 구조
[header|100]─┐     ┌────────┐  
        [값1(100)|200] [값2(200)|null]
         data    nextNodeAddress
 ```
### 감시 노드(SENTINEL-NODE)

### 장점
데이터의 추가, 제거, 삽입, 수정 속도가 배열보다 빠르다
(길이 신경 안 써도 됨)

### 2-2-1. 단방향 연결 리스트
- 각 포인터는 다음 노드의 포인터 하나만을 가지고 

### 2-2-2. 양방향 연결 리스트

## 1. 구간 합
### 1-1. 핵심이론
```         0   1  2   3  4  5   
int[] A = {15, 13, 10, 7, 3, 12};
int[] S = {15, 28, 38, 45, 48, 60};
```
- 합배열을 미리 구해서 인덱싱을 통해 값을 찾는다
### 1-2. 합배열 S를  만드는 공식
S[i] = S[i-1] + A[i];

