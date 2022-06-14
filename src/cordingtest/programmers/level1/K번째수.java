package cordingtest.programmers.level1;

import day08.modi.pac2.C;
import utill.Utill;

import java.util.Arrays;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // 2차원 배열을 반복하여 결과를 하나씩 추출
        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0]-1;  //배열 슬라이싱 시작 인덱스
            int b = commands[i][1];   // 배열 슬라이싱 끝 인덱스
            int c = commands[i][2];

            // 배열 슬라이싱
            int[] sliceArr = new int[b-a];
            int idx = 0;
            for (int l = a; l < b ; l++) {
                sliceArr[idx++] = array[l];
            }
/*            for (int j = 0; j < b-a; j++) {
                sliceArr[j] = array[j+a];
            }
*/

            // 오름차 정렬
            Arrays.sort(sliceArr);

            System.out.println(Arrays.toString(sliceArr) + " " + commands[i][2] + "번째 수 ");

            answer[i] = sliceArr[c-1];

        }
        Utill.shortline();
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {6, 7, 1}};

        solution(array, commands);
    }
}