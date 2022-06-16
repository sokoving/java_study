package datastructure.chap08;

import java.util.Arrays;

// 백준 1920
public class 수_찾기 {

    public static void main(String[] args) {

        // 배열의 크기
        int N = 5, M = 5;
        // B의 데이터가 A 데이터 중에 있는지?
        long[] A = {4, 1, 5, 2, 3};
        long[] B = {1, 3, 7, 9, 5};

        // 정렬
        Arrays.sort(A);

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        // 정답을 담을 배열
        int[] answers = new int[M];

        // B 전체를 순회
        for (int i = 0; i < M; i++) {
            long target = B[i];
            // A 중에 target이 있으면 1 리턴, 없으면 0 리턴
            answers[i] = search(A, target);
        }
        System.out.println(Arrays.toString(answers));

    }

    private static int search(long[] arr, long target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        // target을 못 찾았을 경우 0 리턴
        while (left <= right) {
            // 중앙 인덱스 계산
            mid = (left + right) / 2;
            //target = arr[mid] > 1 리턴
            if (arr[mid] == target) {
                return 1;
            } else if (target < arr[mid]) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        return 0;
    }

}
