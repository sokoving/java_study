package datastructure.chap06.insertion;

import utill.Utill;

import java.util.Arrays;

public class InsertionSort {

    // 삽입 정렬 알고리즘
    public static void sort(int[] arr){
        // 삽입할 항목 타게팅 루프
        for (int i = 1; i < arr.length ; i++) {
            // 삽입할 항목 빼놓기
            int temp = arr[i];
            System.out.println("temp = " + temp);

            int j = i; // 삽입할 위치 인덱스
            // 삽입할 위치 탐색
            while (j > 0 && arr[j-1] >= temp){  // 삽입할 항목보다 큰 값들은 오른쪽으로 이동
                System.out.println(Arrays.toString(arr));
                arr[j] = arr[j-1];
                j--;
            }
            // 탐색한 위치에 삽입
            arr[j] = temp;
            Utill.longLine();
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void main(String[] args) {


        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr); // qjqmf wjdfuf
        System.out.println("정렬 후 : " + Arrays.toString(arr));

    }
}
