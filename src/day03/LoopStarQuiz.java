package day03;

public class LoopStarQuiz {
    public static void main(String[] args) {
        // 교안 Java 6강 2-4-3 Quiz

        /* 1.       2.      3.      4.      5.          6.
            *     | ***** |     * | ***** |     *     | *********
            **    | ****  |    ** |  **** |    ***    |  *******
            ***   | ***   |   *** |   *** |   *****   |   *****
            ****  | **    |  **** |    ** |  *******  |    ***
            ***** | *     | ***** |     * | ********* |     *
        */
        for (int i = 0; i < 5; i++) {
            //별을 반복해서 찍는코드
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");

        for (int i = 0; i < 5; i++) {
            //별을 반복해서 찍는코드
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================");

        for (int i = 0; i < 5; i++) {
            //공백을 반복해서 찍고
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            //별을 반복해서 찍는코드
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========================");

        for (int i = 0; i < 5; i++) {
            //공백을 반복해서 찍고
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            //별을 반복해서 찍는코드
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
