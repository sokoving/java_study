package cordingtest.programmers.level1;
//https://programmers.co.kr/learn/courses/30/lessons/86051?language=java
public class 없는수더하기 {
    public static int solution(int... numbers) {
        int answer = -1;
        // 받은 배열 중 0~9 중 없는 숫자 찾아 더하기

        for (int i = 1; i < 10 ; i++) {
            int n = 0;
            for (int number : numbers) {
                if (i == number ){
                    n = 0;
                    break;
                } else {
                    n = i;
                }
            }
            answer += n;
        }

        return ++answer;
    }

    public static void main(String[] args) {
        System.out.println(solution( 2, 3, 4, 5, 6, 7, 8, 9));

    }

}