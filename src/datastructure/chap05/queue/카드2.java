package datastructure.chap05.queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준 2164번
public class 카드2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // 큐 생성
        Queue<Integer> que = new LinkedList<>();

        // 큐에 데이터 넣기
        for (int i = 1; i <= N; i++) {
            que.add(i);
        }

        // 정답을 넣을 수
        int answer;

        while (que.size() > 1) {
            // 첫번째 버리고 두번째를 버린 뒤 맨 뒤에 넣기
            que.poll();
            int dellQ = que.poll();
            que.add(dellQ);
        }

        answer = que.poll();
        System.out.println(answer);

    }
}
