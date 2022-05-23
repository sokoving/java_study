package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArratyInsert {
    public static void main(String[] args) {

        int[] arr = {50, 150, 200, 250, 300};
        int delTarget = 100;  // 신규 삽입 데이터
        int delIdx = 1; // 삽입 위치
        System.out.println("삽입 전: " + Arrays.toString(arr));

        // 1. arr 길이보다 1 더 긴 임시 배열 만들기
        int[] temp = new int[arr.length+1];

        // 2. temp에 arr 전부 복사;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 끝 데이터부터 뒤로 한 칸씩 밀기
/*      temp[5] = temp[4];
        temp[4] = temp[3];
        temp[3] = temp[2];
        temp[2] = temp[1];  */
        for (int i = temp.length-1; i > delIdx ; i--) {
            temp[i] = temp[i-1];
        }

        // 4. 신규 데이터 삽입
        temp[delIdx] = delTarget;

        System.out.println("temp: "+Arrays.toString((temp)));

        // 5. 주소 변경
        arr = temp;
        temp = null;

        // 50, 100, 150, 200, 250, 300
        System.out.println("삽입 후: " + Arrays.toString(arr));
    }
}
