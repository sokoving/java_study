package cordingtest.backjoon.bj02_if;

import java.util.Scanner;

public class ifQuiz4 {

    // 백준 조건문 4 사분면 고르기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt();
        sc.close();

        boolean xPos = x >= 0;
        boolean yPos = y >= 0;

        if (xPos && yPos) System.out.println(1);
        else if (!xPos && yPos) System.out.println(2);
        else if (!xPos && !yPos) System.out.println(3);
        else System.out.println(4);

    }
}
