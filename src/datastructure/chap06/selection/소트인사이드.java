package datastructure.chap06.selection;

import java.util.*;

//백준 1427번
public class 소트인사이드 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] A = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt("" + str.charAt(i));
        }

        for (int i = 0; i < A.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] > A[max]) {
                    max = j;
                }
            }
            int temp = A[i];
            A[i] = A[max];
            A[max] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }




/*

        Scanner sc = new Scanner(System.in);
        // 배열할 숫자
        int N = sc.nextInt();
        sc.close();
        // N을 떼서 배열에 넣기
        int length = (int)(Math.log10(N)+1);
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            int temp = N % 10;
            arr[i] = temp;
            N /= 10;
        }


        // 선택 정렬
        for (int i = 0; i < length-1; i++) {
            int min = i;
            // 최솟값 찾기
            for (int j = i+1; j < length; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        int answer = 0;
        for (int i : arr) {
            answer += i;
            answer *= 10;
        }
        answer /= 10;

        System.out.println(answer);

*/

    }
}
