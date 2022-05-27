package cordingtest.programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12901
public class Solution {
    public static String solution(int a, int b) {
        String answer = "";


        // 월별 일수 배열 index+1 = a
        int[] monthDay = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayDay = 0;
        for (int i = 0; i < a-1 ; i++) {
            dayDay += monthDay[i];
        }
        dayDay += b;

        int dayWeek = dayDay % 7;

        // 요일 배열
        String[] weeks = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        answer = weeks[dayWeek];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12, 31));
    }

}