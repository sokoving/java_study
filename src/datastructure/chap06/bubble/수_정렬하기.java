package datastructure.chap06.bubble;

import java.util.Arrays;

// 백준 2750번
public class 수_정렬하기 {

    public static void main(String[] args) {
        // 배열의 길이
        int N = 5;
        // 정렬할 배열
        int[] arr = {5, 2, 3, 4, 1};


        for (int i = N-1; i>0; i--){
            // 실제 비교
            boolean flag = false; // if문을 통과하면 true로 변경
            for (int j = 0; j < i; j++) {
                if (arr[j]> arr[j+1]){ // 왼쪽이 더 크면 자리 바꿈
                    // swap 알고리즘
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break; // swap이 한 번도 일어나지 않았다면 멈춤
        }

        System.out.println(Arrays.toString(arr));





    }
}
