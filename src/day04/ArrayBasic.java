package day04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {


/*         1. 배열 변수 선언
              int arr;  >> 데이터 1개를 저장하는 변수 생성(4byte)
             int[] : int 배열 타입(int 타입 X)
             int arr[]도 가능하지만 명시성을 위해 int 뒤에 붙임
             선언만 하고 초기화를 하지 않으면 컴파일 에러              */
        int[] arr;

/*         2. 배열 객체 생성
                 new: 데이터 저장할 공간(Heap) 확보 > 동적 할당
                 arr(포인터 변수) = new + 타입(int) + 길이([5])
                       ↑ 실제 숫자 5개가 아니라 5개 중 "첫번째 데이터의 위치 주소"가 저장돼 있는 것  */
        arr = new int [5];
        System.out.println(arr);
/*        [I@5594a1b5         [I > int 배열이
                              @  > at 저장돼 있다
                              5594a1b5 > 이 주소에                */

/*        3. 배열값 초기화 (값 저장)                               */
        arr[0] = 30;
        arr[1] = 99;
        arr[2] = arr[0] + 20; // 50
    //  arr[3] = 66.7;  > int 할당된 공간에 double 할당 불가
        arr[3] = (int) 66.7;  // 명시적 형 변환으로 값 손실 있음 > 66
        arr[4] = 100;
    //  arr[5] = 55; >> 조심: run time Exception(컴파일은 되는데 실행 중에 오류가 남)
                     // ArrayIndexOutOfBoundsException > 할당된 배열 길이를 초과했다.

//        # 배열의 길이: 저장 데이터 개수
//                     초기화를 4개 값만 해도 길이는 5, 초기화를 안 해도 5
        System.out.printf("배열의 길이: %d\n", arr.length);

//        # 배열 내부 값 확인
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("\n=======================\n");

//        # 배열 전용 반복문 (향상된 for: Enhanced for Loop)
//       js : for (let of arr)
        for (int n : arr){
            System.out.printf("%d ", n);
        }
        System.out.print("\n=======================\n");

//        # 배열 내부값 출력 함수
        System.out.print(Arrays.toString(arr));
        System.out.print("\n=======================\n");

//        # 값 목록을 나열하여 배열 생성하기
        int[] numbers = new int[] {10, 20, 30, 40};
        System.out.print(Arrays.toString(numbers));
        System.out.print("\n=======================\n");

//        # 배열 생성 시 
//        String[] foods = new String[] {"사과", "복숭아", "파인애플"};
//                        new String[] 이런 구문은 배열변수 선언 시에만 생략 가능
        String[] foods = {"사과", "복숭아", "파인애플"};
        foods[1] = "수박";
//                        new String[] 배열 수정 시 생략 불가
        foods = new String[] {"짜장면", "탕수육", "짬뽕"};
        System.out.print(Arrays.toString(foods));
        System.out.print("\n=======================\n");

/*        # 배열을 생성만 하고 초기화하지 않는 경우
            > 해당 타입의 기본값으로 자동 초기화됨 (3강 데이터타입 4페이지 참고)

        */
        double[] dArr = new double[3];
//      stack: 8byte    Heap: 24byte (8byte * 3)
//   포인터 변수는 8byte 고정, Heap은 길이와 타입에 따라 변동  
        System.out.println("dArr.length = " + dArr.length);
        System.out.println(Arrays.toString(dArr));

//        # 빈 배열 만들기
        int[] eArr = new int[0];
    }
}
