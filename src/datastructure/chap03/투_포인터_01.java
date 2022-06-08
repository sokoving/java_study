package datastructure.chap03;

import java.util.Scanner;

// 백준 2018번
public class 투_포인터_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 찾아야 하는 부분합
        int[] arr = new int[N]; // 배열 생성
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int start = 0, end = 0; // 시작 포인터와 끝 포인터, 인덱스를 저장한다
        int M = arr[start]; // 부분합을 저장
        int count = 0; // M이 N이 되는 경우의 수

        // 투 포인터 : M과 N의 대소비교
        while (end < N) {
//            System.out.printf("start: %d | end: %d | M: %d | N: %d\n",start, end, M, N);
            if (M == N){
                count++;  // 원하는 합을 발견할 때 경우의 수(count) 증가
//                System.out.println("count = " + count + "\n============");
                end++;
                if (end < N ) M += arr[end];
            } else if (M > N) {
                M -= arr[start];
                start++;
            } else {
                end++;
                M += arr[end];
            }
        } // end while

        System.out.println(count);
    }
}
