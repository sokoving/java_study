package day04;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // 배열 특정 인덱스 데이터 삭제 알고리즘 (중간 삭제)
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제 전: " + Arrays.toString(arr));


/*        // 예시: arr[2] (5) 를 삭제한다
        arr[2] = arr[3]; // 1 3 7 7 9 11
        arr[3] = arr[4]; // 1 3 7 9 9 11
        arr[4] = arr[5]; // 1 3 7 9 11 11*/

        // delIdx : 삭제할 대상의 인덱스
        int delIdx = 2;
        // 삭제할 데이터에 그다음 데이터 뒤집어씌우기
        for (int i = delIdx; i < arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }

        // pop
        int[] temp = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;


        // 1 3 7 9 11
        System.out.println("삭제 후: " + Arrays.toString(arr));


    }
}
