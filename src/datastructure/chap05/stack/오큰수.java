package datastructure.chap05.stack;

import java.util.Arrays;
import java.util.Scanner;

public class 오큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
//        int[] arr = {9, 5, 4, 8};    // 오큰수를 구할 수열
        int[] ans = new int[N];      // 오큰수를 넣을 수열
        for (int i = 0; i < N; i++) {
            ans[i] = -1;
        }
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if(arr[i] < arr[j]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ans[i]);
            if(i != N-1) System.out.print(" ");
        }

    }
}
