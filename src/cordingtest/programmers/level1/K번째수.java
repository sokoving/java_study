package cordingtest.programmers.level1;

import utill.Utill;

import java.util.Arrays;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            int[] temp = new int[j-i+1];
            int idx = 0;
            for (int l = i-1; l < j ; l++) {
                temp[idx++] = array[l];
            }

            Arrays.sort(temp);

            System.out.println(Arrays.toString(temp));

            answer[a] = temp[k-1];

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