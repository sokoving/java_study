package day05;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        // 2차원 배열
        int[][] scores = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {333, 44, 55}
        };

        // 2차원 배열의 값
        System.out.println(Arrays.toString(scores));
        // [[I@5594a1b5, [I@6a5fc7f7, [I@3b6eb2ec, [I@1e643faf] > 1차원 배열 첫번째 요소가 저장된 주소
        // 2차원 배열의 모든 값 보기
        System.out.println(Arrays.deepToString((scores)));


        // 2차원 배열 scores 길이
        System.out.println(scores.length); // 4
        // scores[1]의 길이
        System.out.println(scores[1].length);  //3

        // scores의 타입
        System.out.println(scores.getClass()); // class [[I / int[][] / 2차원 정수 배열
        // scores[1]의 타입
        System.out.println(scores[1].getClass()); // class [I / int[] / 정수 배열

        //2차원 배열에서 값 참조
        System.out.println(scores[1][2]); // 60

        // 데이터 수정


        System.out.println("================");
        // 반복문 처리
        //   arr에는 1차원 배열이 나온다
        for (int[] arr : scores) {
            // n에는 정수 하나가 나온다
            for (int n : arr) {
                System.out.printf("%-3d ", n);
            }
            System.out.println();
        }
        System.out.println("================");
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%-4d ", scores[i][j]);
            }
            System.out.println();
        }

        System.out.println("================");
        // 배열 생성문으로 2차원 빈 배열 만들기 (3 X 5 > 길이 5의 )
        int[][] arr2d = new int[3][5];
        arr2d[1][3] = 50;
        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.printf("%-4d", anInt);
            }
            System.out.println();
        }


        // 3차원 (2차원 배열을 묶는다)
        int[][][] arr3d = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                },
                {
                        {9, 10},
                        {11, 12}
                }
        };
        System.out.println(arr3d.length);  // 길이 3
        System.out.println(arr3d.getClass()); // 타입 class [[[I

        // 3차원 배열의 값
        System.out.println(Arrays.toString(arr3d));
                // [[[I@13a57a3b, [[I@7ca48474, [[I@337d0578] > 2차원 배열 첫번째 요소가 저장된 주소
        // 2차원 배열의 값
        System.out.println(Arrays.toString(arr3d[0]));
                // [[I@59e84876, [I@61a485d2] > 1차원 배열 첫번째 요소가 저장된 주소

        //4 X 5 X 6 3차원 빈 배열
        int[][][] arr3d_2 = new int[2][3][4];
        // 3차원 배열의 모든 값 보기
        System.out.println(Arrays.deepToString(arr3d_2));


    }
}
