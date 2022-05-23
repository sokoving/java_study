package day04;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        // 배열 역순 정렬
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("reverse 전: "+ Arrays.toString(arr));
            // 0번과 6번, 1번과 5번, 2번과 4번 자리를 맞바꿈

/*       int temp;
        temp = arr[0];          temp = arr[1];        temp = arr[2];
        arr[0] = arr[6];        arr[1] = arr[5];      arr[2] = arr[4];
        arr[6]= temp;           arr[6] = temp;        arr[4] = temp;     */

        for (int i = 0; i < arr.length / 2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }


        System.out.println("reverse 후: "+ Arrays.toString(arr));



    }
}