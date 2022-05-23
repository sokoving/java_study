import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int A = 150;  //sc.nextInt();
        int B = 266;  //sc.nextInt();
        int C = 427;  //sc.nextInt();
        
        int abc = A * B * C; // 17037300
        abc = 1234;
       //abcList
            // 넉넉히 공간 확보
        int[] abcList = new int[10];

            // 각 자릿수 숫자 떼서 데이터 넣기
/*        // 10의 1제곱 자리
        int newData = abc % 10;
        abcList[0] = newData;

        // 10의 2제곱 자리
        newData = (abc / 10) % 10;
        abcList[1] = newData;

        // 10의 3제곱 자리
        newData = (abc / 100) % 10;
        abcList[2] = newData;

        // 10의 4제곱 자리
        newData = (abc / 1000) % 10;
        abcList[3] = newData;*/

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(abcList));

        sc.close();
    } //end main
} // ena class Main
