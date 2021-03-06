package cordingtest.programmers.level1;
//https://programmers.co.kr/learn/courses/30/lessons/12943
public class 콜라츠추측 {
    public static int solution(int num) {

        long n = num;
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

}