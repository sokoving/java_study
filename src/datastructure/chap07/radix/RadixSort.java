package datastructure.chap07.radix;

import utill.Utill;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 기수 정렬 : 각 자릿수끼리 비교해서 큐 배열에 넣는다
public class RadixSort {


    public static void sort(int[] arr) {

        // 최대 자릿수 구하기
        int digit = 0;
        for (int n : arr) {
            int leng = String.valueOf(n).length();
            if ( leng > digit) {
                digit = leng;
            }
        }
//        System.out.println("digit = " + digit);

        // 각 자릿수 숫자에 맞는 큐 10개 생성
        Queue<Integer>[] queues = new Queue[10];
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new LinkedList<>(); // 인덱스 번호와 동일한 숫자가 들어간다
        }

        /*
            1회차 루프에서는 (i == 0) 각 숫자의 1의 자릿수를 뽑아서
            위치에 맞는 큐에 삽입해야 함
            2회차 루프에서는 (i == 1) 각 숫자의 10의 자릿수를 뽑아서
            위치에 맞는 큐에 삽입해야 함
         */

        // 자릿수 for
        for (int i = 0; i < digit; i++) {
            /*
            753일 경우
            i = 0 > n = 3     i = 1 > n = 5     i = 2 > n = 7
             */
            for (int j = 0; j < arr.length; j++) {
                //  10^i번째 자릿수 뜯어서
                int n = arr[j] / (int)Math.pow(10, i) % 10;
                // 해당 큐에 넣기
                queues[n].add(arr[j]);
            }// end inner for(arr)
            int k = 0; // 배열 저장 위치 인덱스
            for (Queue<Integer> q : queues) {
                while (!q.isEmpty()){  // 큐가 빌 때까지
                    arr[k++] = q.poll(); // 뽑아서 배열에 새로 넣고 인덱스++ 한다
                }
            }
//            System.out.println(Arrays.toString(arr));

        } // end outer for(digit)


    }

    public static void main(String[] args) {
        int[] arr = {753, 427, 458, 422, 1990, 220, 125, 332, 329,  660, 123, 122, 123456};


        System.out.println(Arrays.toString(arr));
        sort(arr);
        Utill.longLine();
        System.out.println(Arrays.toString(arr));

    }

}
