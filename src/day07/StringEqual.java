package day07;

import java.util.Arrays;
import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        String str1 = "가나다";

        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        sc.close();

        if (str1.equals(str2)) {
            System.out.println("두 문자열이 일치함");
        } else {
            System.out.println("두 문자열이 일치하지 않음");
        }


        /*  String의 메모리 구조
            Stack   |    Heap
             str1  -|--> value[100]
            [100]   |     [150]


         */

    }
}
