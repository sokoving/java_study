package datastructure.chap09;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// 백준 11047번
public class 동전_0 {
    public static void main(String[] args) {
        // 최소의 동전을 사용해서 K값을 구하려고 한다
        // 가정 : 제일 큰 단위의 동전부터 K에 몇 개가 들어가는지 확인한다
        /* 의사 코드
        N(동전 개수), K(목표 금액)
        A (동전 데이터 배열)
        for (N만큼 반복하기) { A 배열에 저장하기 }

        for (N만큼 역순 반복) {
            if (현재 K보다 동전 가치가 작으면) {
                동전 수 += 목표 금액 / 현재 동전 가치
                목표 금액 = 목표 금액 % 현재 동전 가치
            }
        }
        동전 수 출력
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //동전 단위 개수
        int K = sc.nextInt(); // 목표 금액

        // 동전을 담을 자료구조
        Stack<Integer> A = new Stack<>();

        for (int i = 0; i < N; i++) {
            A.push(sc.nextInt());
        }
        sc.close();

        int answer = 0; // 필요한 동전 수

        while (!A.isEmpty()) {
            int coinAmt = A.pop(); // 꼭대기 동전부터 추출
            if (coinAmt <= K) {
                answer += K / coinAmt;  // 동전 개수 누적
                K %= coinAmt;   // 잔액 갱신
            }
            if (K <= 0) break;
        }


        System.out.println(answer);

    }
}
