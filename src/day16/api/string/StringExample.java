package day16.api.string;

import utill.Utill;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args) {
        String s = "라면 떡볶이 보쌈 짜장면";
        // 1. 문자열 쪼개기
        // split(); 인수를 기준으로 문자열을 쪼개서 문자열 배열로 반환한다
        // 인수에는 정규 표현식을 넣어야 한다(??)  > 토크나이저 써
        String[] sArr = s.split(" ");
        System.out.println(Arrays.toString(sArr));

        Utill.longLine();

        // 1-1. 문자열을 쪼개 숫자 배열에 넣기
        String n = "1 2 3 4";
        String[] nArr = n.split(" ");

        int[] numbers= new int[nArr.length];
        for (int i = 0; i < nArr.length; i++) {
            numbers[i] = Integer.parseInt(nArr[i]);
        }
        System.out.println(Arrays.toString(numbers));

        Utill.longLine();



        // 2. 문자열 쪼개기
//        StringTokenizer
        String dessert = "마카롱, 푸딩, 아이스크림, 도넛, 티라미수";
        StringTokenizer st = new StringTokenizer(dessert, ", ");
        System.out.println(st.countTokens()); // 4
        System.out.println(st.nextToken());  // poll
        System.out.println(st.countTokens()); // 3
        Utill.shortline();
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        Utill.longLine();

        StringTokenizer st2 = new StringTokenizer(s, " ");
        String[] foods = new String[st2.countTokens()];
        for (int i = 0; st2.hasMoreTokens(); i++) {
            foods[i] = st2.nextToken();
        }
        System.out.println(Arrays.toString(foods));

        // 3. 문자열 결합 연산
        // StringBuilder 써라



    }

}
