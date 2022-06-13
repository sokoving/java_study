package datastructure.chap06.insertion;

import java.util.Arrays;
import java.util.Scanner;

//백준 11399
public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 돈 뽑을 사람 수
        int N = sc.nextInt();
        // 사람당 돈 뽑는 시간 수 배열
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // 삽입할 항목 타게팅 루프
        for (int i = 1; i < arr.length ; i++) {
            // 삽입할 항목 빼놓기
            int temp = arr[i];

            int j = i; // 삽입할 위치 인덱스
            // 삽입할 위치 탐색
            while (j > 0 && arr[j-1] >= temp){  // 삽입할 항목보다 큰 값들은 오른쪽으로 이동
                arr[j] = arr[j-1];
                j--;
            }
            // 탐색한 위치에 삽입
            arr[j] = temp;
        }

//        System.out.println(Arrays.toString(arr));

        // 합배열 만들기
        int[] sumArr = new int[N];
        sumArr[0] = arr[0];
        for (int i = 1; i < N; i++) {
            sumArr[i] = sumArr[i-1] + arr[i];
        }

        System.out.println(Arrays.toString(sumArr));

        // 정답
        int answer = 0;
        for (int i : sumArr) {
            answer += i;
        }
        System.out.println(answer);


    }
}
