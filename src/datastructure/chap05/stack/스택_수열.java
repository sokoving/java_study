package datastructure.chap05.stack;

import java.util.Scanner;
import java.util.Stack;

// 백준 1874
public class 스택_수열 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 1~N 까지의 자연수

        // 만들어야 할 수열
//        int[] A = {1, 2, 5, 3, 4};
        int[] A = new int[N];
        for (int i = 0; i < A.length ; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        // 자바 스택 api (java.util.Stack)
        Stack<Integer> stack = new Stack<>();

        int num = 1; // 자연수값 저장

        // 기호를 저장할 빈 문자열
        StringBuilder s = new StringBuilder();

        // 수열 배열에서 값을 하나씩 뽑아서 push, pop 여부 확인
        for (int i = 0; i < A.length; i++) {
            int targetNum = A[i]; // 현재 수열 값
            if (targetNum >= num){ // push인 경우
                while (targetNum >= num){
                    stack.push(num++);
                    s.append("+\n");
                }
                // 마지막에 들어간 수를 pop
                stack.pop();
                s.append("-\n");
            } else {    // pop인 경우
                int n = stack.pop(); // r: 스택에서 제거한 숫자

                // 스택의 가장 위의 수가 현재 구해야 할 수보다 크면
                // 수열 출력이 성립이 안 됨.
                if(n > targetNum){
                    s = new StringBuilder("NO");
                    break;
                }
                s.append("-\n");
            }
        } // end for
        System.out.println(s);
    }
}
