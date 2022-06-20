# 컬렉션과 배열
- 다수의 객체를 저장해두고 필요할 때마다 꺼내서 사용
- 배열 : 크기가 고정되어 있어 불특정 수의 객체를 저장하는데에 있어 알고리즘을 직접 만들어야 하는 불편함이 있습니다.
- 이 문제를 해결하기 위해 잘 만들어진 자료구조 API 컬렉션을 사용합니다.

## 대표적인 컬렉션 인터페이스
- 컬렉션 API는 java.util패키지로 제공
  + import java.util.*;
- 대표적으로 List, Set, Map 인터페이스가 있다
##  List, Set, Map
```      List    Set    Map
저장순서  있다     없다
값 관리   인덱스   없다    키
중복저장  된다     안된다  키는 중복X, 값은 중복O
인터페이스 컬렉션   컬렉션
```

## List 컬렉션
- 객체를 일렬로 늘어놓은 구조
- 객체를 인덱스로 관리 (배열과 유사)
- 대표적인 구현 클래스는 ArrayList(배열 자료구조 형태), LinkedList, Vector
  + 객체를 모음 저장, 검색, 삭제, 수정 가능
  + 삽입, 삭제는 LinkedList가 빠르고
  + 검색은 ArrayList가 빠르다
- 동일한 주소를 가진 객체를 중복 저장 가능

### 리스트 주요 메서드
#### 객체 추가
- add(E e) 객체를 맨 끝에 추가 (리턴 boolean)
- add(int index, E e) 인덱스에 객체를 추가 (리턴 void)
- set(int index, E e) 인덱스의 객체를 수정 (리턴 E)
#### 객체 검색
- contains(Object o) 객체가 저장된 여부 (리턴 boolean)
- get(int index) 저장된 객체를 반환 (리턴 E)
- isEmpty() 빈 컬렉션인지 확인 (리턴 boolean)
- size() 저장된 객체 수 반환 (리턴 int)
#### 객체 삭제
- clear() 저장된 모든 객체 삭제 (리턴 void)
- remove(int index) 인덱스의 객체 삭제 (리턴 E)
- remove(Object o) 해당 객체를 삭제 (리턴 boolean)

#### 리스트 생성
```
        LinkedList<Object> linkedList = new LinkedList<>(); 
        ArrayList<String> arrayList = new ArrayList<>();
```
#### 초기값을 가진 리스트 생성
```
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 5, 58, 2));
        
        int[] nums = {1, 2, 3, 4}
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(nums));
```
-----------------------------------------------------------------------------------------------------
## Set 컬렉션
- Set 컬렉션은 List와 달리 저장 순서가 유지되지 않고 중복 저장을 허용하지 않습니다.
- 순서가 유지되지 않기 때문에 처음 들어간 물건이 꺼낼땐 처음에 나오지 않을 수도 있다.
- Set 인터페이스의 대표적은 구현 클래스는 HashSet, TreeSet, Hashtable이 있습니다.
- Set은 인덱스가 없습니다.

-----------------------------------------------------------------------------------------------------
## Map 컬렉션
- Map 컬렉션은 키(key)와 값(value)으로 구성된 Entry객체를 저장하는 구조를 가지고 있습니다.
- 여기서 키와 값은 모두 객체입니다. 
- 키는 중복 저장할 수 없지만 값은 중복 저장이 가능합니다. 
- 만약 동일 키로 다른 값을 저장하면 해당 키의 값이 수정됩니다. 
- Map 인터페이스의 대표적인 구현 클래스로는 HashMap, TreeMap, Hashtable, Properties가 