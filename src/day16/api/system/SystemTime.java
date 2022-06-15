package day16.api.system;

import java.util.Arrays;
import java.util.Date;

public class SystemTime {
    public static void main(String[] args) {

        // 현재 시간 읽기
        long now = System.currentTimeMillis();
        System.out.println("now = " + now);
        // currentTimeMillis()은 유닉스 시간을 리턴한다
        // 유닉스시간(에포크 타임)
            // 1970년도 1월 1일 00시를 기준으로 현재까지 지나온 시간을 초로 표현

        Date date = new Date(now);
        System.out.println("date = " + date);   // 오늘 날짜, 시간
        date = new Date(now + (5 * 24 * 60 * 60 * 1000)); // 5일 뒤 날짜, 시간
        System.out.println("date = " + date);
        date = new Date(now - (3 * 24 * 60 * 60 * 1000)); // 3일 전 날짜, 시간
        System.out.println("date = " + date);

        System.out.println("===============================");
        int[] arr = new int[200000];
        int idx = 0;
        for (int i = arr.length -1; i >= 0; i--){
            arr[idx++] = i+1;
        }
        // 정렬 알고리즘 시간 테스트
        long start = System.currentTimeMillis();

//        BubbleSort.sort(arr); // 버블 정렬
//        SelectionSort.sort(arr); // 선택 정렬
//        RadixSort.sort(arr); // 기수 정렬
        Arrays.sort(arr); // 퀵정렬

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}
