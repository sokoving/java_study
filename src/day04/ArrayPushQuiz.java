package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {

        // 그만이라고 입력할 때까지 음식 입력받아 foodList에 저장하기
        Scanner sc = new Scanner(System.in);

        //빈 배열
        String[] foodList = new String[0];
//        String[] foodList = {}; 같은 거

    /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드

            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
     */


        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요");

        while (true) {
            String newData = sc.next();

            // 1. "그만"을 입력하면 반복문 종료
            if (newData.equals("그만")) break;

            // 2-1. 원본배열보다 길이가 1 더 긴 새로운 배열 생성
            String[] temp = new String[foodList.length + 1];

            // 2-2. 원본 배열의 데이터를 새로운 배열에 복사
            for (int i = 0; i < foodList.length; i++) {
                temp[i] = foodList[i];
            }

            // 3. temp 마지막에 추가 데이터 넣기
            temp[temp.length - 1] = newData;

            // 4. foodList 주소를 temp 주소로 바꾸고 temp 비우기
            foodList = temp;
//          temp = null;   > 반복문이 새로 시작되면 새로운 주소가 입력되니 굳이 비울 필요 없음

        } // end while
        System.out.println("먹고 싶은 음식 리스트: " + Arrays.toString(foodList));


        sc.close();


    }
}
