# 선형 탐색
- 선형 탐색(Linear Search)은 순차 탐색이라고도 하며, 이러한 탐색방법은 흔히 주어진
  자료에서 처음부터 탐색키에 해당하는 레코드를 순차적으로 비교하여 찾는 가장
  단순한 방법입니다.
- 선형 탐색은 특히 정렬되지 않은 리스트와 같이 자료들이 특별히 조직화 되어 있지
  않은 구조에서 가장 적합합니다.
- 일반적으로 선형 탐색의 탐색 시간은 O(N)입니다. 최악의 경우 찾고자 하는 자료가
  존재하지 않거나 맨 마지막에 있는 경우 N번의 비교가 필요하기 때문입니다.
- 선형 탐색의 최대 단점은 시간이 너무 오래 걸린다는 것이고, 장점은 굉장히 간단해서
  프로그래밍하기 쉬우며 단순한 자료구조로도 가능하다는 것입니다

# 이진 탐색
- *이진탐색 알고리즘을 이용한 문제가 많이 나오니 알고리즘 통째로 외우기*
- 이진 탐색(Binary Search)은 정렬되어 있는 자료들의 집합에서 특정한 자료를
  찾고자 할 때 사용되는 매우 빠른 탐색 알고리즘입니다.
- 이진 탐색은 선형 탐색과는 달리 자료를 정렬이라는 방법으로 조직하기 때문에
  탐색은 간단하지만, 새로운 데이터의 삽입이나 삭제 시에 자료구조의 정렬을
  깨뜨리지 않아야 하는 어려움이 존재합니다.
- 이진 탐색은 분할 후 정복 알고리즘을 사용합니다. 이 알고리즘은 크기를 절반씩
  나누어 해결해가는 방법이기 때문에 실행시간은 log의 성질을 가집니다.
- 이진 탐색의 탐색 시간은 O(logN)의 시간 복잡도를 가집니다