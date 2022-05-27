package cordingtest.programmers.level1;
//https://programmers.co.kr/learn/courses/30/lessons/82612
public class 부족한금액계산하기 {
    public static long solution(int price, int money, int count) {
        long answer = -1;

        long total = 0;

        for (int i = 0; i < count ; i++) {
            total += price*(i+1);
        }

       return answer = (total > money) ? total - money : 0;

    }

    public static void main(String[] args) {
        System.out.println(solution(100, 20, 4));
    }

}