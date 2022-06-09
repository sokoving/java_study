package datastructure.chap03;

import java.util.Arrays;
import java.util.Scanner;

// 백준 1940번
public class 투_포인터_02 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  //[1, 2, 3, 4, 5, 7]

        int N = arr.length; //수의 개수
        int M = 10; // 찾아야 하는 수
        int start = 0;
        int end = arr.length-1;
        int count = 0; // 같은 수를 찾으면 올라간다

        while (start < end) {
            int T = arr[start] + arr[end]; // 두 수를 더한 수
            System.out.printf("start : %d | end : %d | T : %d\n", arr[start], arr[end], T);
            if(M > T){
                start++;
            } else if (M < T){
                end--;
            } else {
                count++;
                System.out.println("count = " + count + "\n===========");
                start++;
                end--;
            }
        }

        /*
        1. 오름차 정렬 - Arrays.sort(배열변수)
        2. s를 첫위치, e를 끝위치에 둔다
        3. 찾는 수보다 합산 수가 작은 경우
          s를 오른쪽으로 한 칸 이동
        4. 찾는 수보다 합산 수가 큰 경우
          e를 왼쪽으로 한 칸 이동
        5. 찾는 수와 합산 수가 같은 경우
         count를 증가시키고 s++, e--;
         */

    }
}
