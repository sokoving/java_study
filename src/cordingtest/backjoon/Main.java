package cordingtest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 정렬의 길이
        int N = Integer.parseInt(bf.readLine());
        // 버블소트를 수행할 수열
        int[] arr = {3, 2, 1};
        int swapCount = 0;


        // 범위를 정하는 for
        for (int i = arr.length-1; i > 0; i--) {
            boolean flag = false;
            // 실제 비교
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                    flag = true;
                }
            }
            if (!flag) break;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("swapCount = " + swapCount);


    }
}
