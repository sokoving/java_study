package datastructure.chap08;

import java.util.Arrays;

public class Search {
    // 선형 탐색
    public static int linearSearch(int[] arr, int target){
        // target의 index를 리턴한다
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    // 이진 탐색 : 정렬되어 있는 배열에서 사용(시험에 많이 나옴, 외우기)
    public static int binarySearch(int[] arr, int target){
        //왼쪽 포인터, 오른쪽 포인터, 중앙 포인터 선언
        int left = 0;
        int right = arr.length-1;
        int mid;

        // target을 못 찾았을 경우 -1 리턴
        while(left <= right){
            // 중앙 인덱스 계산
            mid = (right + left) /2;

            // target이 mid값과 일치 > 찾았다! > 탐색 종료
            if(arr[mid] == target){
                return mid;
            // target이 mid값보다 작을 경우 > right를 mid 왼쪽으로 이동
            } else if (target < arr[mid]) {
                right = mid -1;
            // target이 mid값보다 클 경우 > left를 mid 오른쪽으로 이동
            } else {
                left = mid +1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 7, 11, 12, 27, 49, 53, 68, 72, 91};

        int target = 53;
        System.out.printf("Linear Search(%d's index): %d\n", target, linearSearch(arr, target));
        System.out.printf("Binary Search(%d's index): %d\n", target, binarySearch(arr, target));
        System.out.printf("Binary Search(%d's index): %d\n", 999, binarySearch(arr, 999));


        // 이진탐색 API
        System.out.println(Arrays.binarySearch(arr, 12));
        System.out.println(Arrays.binarySearch(arr, 999));
    }

}
