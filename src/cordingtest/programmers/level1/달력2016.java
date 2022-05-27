package cordingtest.programmers.level1;
//https://programmers.co.kr/learn/courses/30/lessons/12901
public class 달력2016 {
    public static String solution(int a, int b) {
        String answer = "";

        /* 1년을 일수로만 따져서 계산해보기
        목 : 0, 7, 14, 21, 28, 35 ... 7로 나누면 나머지 0
        금 : 1, 8, 15, 22, 29, 36 ...  7로 나누면 나머지 1
        토 : 2, 9, 16, 23, 30, 37 ...  7로 나누면 나머지 2
        일 : 3, 10, 17, 24, 31, 38 ...  7로 나누면 나머지 3
        월 : 4, 11, 18, 25, 32, 39 ...  7로 나누면 나머지 4
        화 : 5, 12, 19, 26, 33, 40 ...  7로 나누면 나머지 5
        수 : 6, 13, 20, 27, 34, 41 ...  7로 나누면 나머지 6

        월별 일수
        1   2   3   4   5   6   7   8   9   10  11  12
        31  28  31  30  31  30  31  31  30  31  30  31

        5월 24일을 일수로 변환 : 31+28+31+30+24 = 145 >> 145 % 7 == 5 >> 화요일
         */

        // 월별 일수 배열 index+1 = a
        int[] monthDays = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day365 = 0;
        for (int i = 0; i < a-1 ; i++) {
            day365 += monthDays[i];
        }
        day365 += b;

        int dayWeek = day365 % 7;

        // 요일 배열
        String[] weeks = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        answer = weeks[dayWeek];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12, 31));
    }

}