package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

// 백준 1253번 좋다
public class 구간_합_구하기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // good을 체크할 수의 개수
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
//        System.out.println(Arrays.toString(A));
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N-1;
            int target = A[i];
            System.out.println("==================target = " + target);
            while (start < end) {
                if (i == start) {
                    System.out.printf("i(%d) == start(%d)\n", A[i], A[start]);
                    start++;
                } else if (i == end) {
                    System.out.printf("i(%d) == end(%d)\n", A[i], A[end]);
                    end--;
                }
                int sum = A[start] + A[end];
                System.out.println("start = " + A[start] + " | end = " + A[end] + " | sum = " + sum);
                if (target == sum) {
                    answer++;
                    System.out.println("좋다 :  " + target);
                    System.out.println("==================");
                    break;
                } else if(target < sum) {
                    end--;
                } else {
                    start++;
                }
            } // end while
        }

        System.out.println("answer = " + answer);
        /*
        1. target == sum
        >  answer++
        >  반복문 탈출하고 배열의 다음 수를 target으로 정한다

        2. target < sum
        > e--;

        3. target > sum
        > s++;

         */

    }// end main
}
/*


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 개수
        int count = 0; // 좋은 수의 개수

        // 수를 담을 배열
//        long[] A = {-3, -5, 1, 15, 4, 0, 7, 9, -2, 3};
        long[] A = new long[N];

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        sc.close();

        // 배열 정렬
        Arrays.sort(A);

//        System.out.println(Arrays.toString(A));

        // 모든 수를 순회하여 좋은 수인지 판단하기
        for (int i = 0; i < A.length; i++) {
            long target = A[i]; // 좋은 수 판단 타겟 숫자
            int start = 0, end = N - 1; // 포인터 초기화

            // 투 포인터 알고리즘
            while (start < end) {
                // 포인터가 지목한 두 수의 합
                long M = A[start] + A[end];
                if (M == target) { // 일단은 좋은 수
                    // 혹시 지금 나를 포함해서 더한게 아닌가
                    if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    } else {
                        // 내가 아닌 두 수의 합
                        count++;
                        break;
                   }
                } else if (M < target) { // 두 수의 합이 타겟숫자보다 작으면
                    start++; // 타겟숫자에 가까워지려면 스타트가 움직여야 됨.
                } else {
                    end--;
                }
            } // end while
        } // end for

        System.out.println(count);

    }



 */