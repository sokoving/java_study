# 배열의 선언, 생성, 초기화
+ 선언 : int[];
+ 생성 : arr = new int[5];
+ 초기화
  - arr[0] = 30;
  - arr[1] = arr[0] + 20;
+ 한줄 생성
  - int[] arr = {10, 20, 30, 40};
+ 배열 수정
  - arr = new int[] {1, 2, 3, 4, 5};

# 콘솔 로그
+ System.out.print(arr)
  - [I@5594a1b5 : [I(int 타입 배열) @ (주소)
+ System.out.print(arr.length)
  - 배열의 길이
+ System.out.print(arr[0])
  - 배열 내부값 참조
+ System.out.println(Arrays.toString(arr));
  - 배열 내부값 출력 함수


# 램(RAM)의 구획
+ Stack
  - 상대적으로 좁은 공간(8byte) > 변수 하나 저장
  - 변수에는 Heap 쪽에 저장된 데이터의 대표주소값 저장 (배열 데이터 저장 X)
  - 빨리 찾을 수 있다
  - Stack overflow : 저장할 수 있는 변수값을 초과해서 저장해서 생기는 에러

+ Heap
  - 데이터가 저장된다
  - 상대적으로 넓은 공간

# 배열의 특징
## immutable (고정)
 + 한번 생성된 배열을 크기(길이)를 늘이거나 줄일 수 없다
 + 예를 들어 5개를 저장할 배열을 생성했다면
 + 프로그램 실행 중에 7개로 늘이거나 2개로 줄일 수 없으며
 + 새로운 배열을 생성하여 값을 복사시켜 이동해여 한다.

## homogeneous (동종 모음 구조)
+ 한 배열에는 한 타입의 데이터만 저장(다른 데이터 타입 안 됨)

##  reference type (참조 타입)
+ 변수에 실제 값이 아닌 데이터 객체의 주소값을 저장