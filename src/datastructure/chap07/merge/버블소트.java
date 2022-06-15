package datastructure.chap07.merge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 1517번 : 진짜 버블소트로 정렬하면 시간초과...
public class 버블소트 {



    //버블소트 중 스왑은 타겟의 오른쪽에 타겟보다 작은 수가 있을 때 일어난다
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(A));

        int swap = 0;
        // 타겟을 정하는 for
        for (int i = 0; i < N - 1; i++) {
            // 타겟과 타겟의 오른쪽에 있는 수를 비교하는 for
            for (int j = i+1; j < N; j++) {
//                System.out.printf("arr[%d](%d) > arr[%d](%d) : %b\n", i, arr[i], j, arr[j] , arr[i] > arr[j] );
                if (A[i] > A[j]) {
                    swap++;
                }
            }
        }
        System.out.println(swap);

    }


}