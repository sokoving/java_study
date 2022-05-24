package day05;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {

        /* Scanner : 입력을 받는 여러 방식 중 하나
         장점 : 쓰기 쉽다
         단점 : 인터프리팅의 과정을 거쳐야 하기 때문에 처리 속도가 느려진다
                next, nextInt, nextDouble 경우 자동 입력되어 있는 /n을 남겨놨다가
                nextLine 입력받을 때 그걸 입력시켜버림 > 무시되고 넘어감
          */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

/*
         next, nextInt, nextDouble >  /n 전까지만 입력받고 나머지는 버퍼에 남겨뒀다가
         nextLine 나타나면 남겨둔 걸 자동 입력시킴
           > nextLine 무시되고 넘어가는 문제가 생김
         해결 방법: nextInt의 잔여 공백을 처리하고 넘어가야 함         */

        sc.nextLine();  // 이거 없으면 어떻게 되는지 확인

        System.out.print("문자열: ");
        String s = sc.nextLine();

        System.out.println("s = " + s);

    }
}
