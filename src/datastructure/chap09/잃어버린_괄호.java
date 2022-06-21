package datastructure.chap09;

import java.util.*;

// 백준 1541번
public class 잃어버린_괄호 {
    public static void main(String[] args) {

        /*
       식의 조건
        1. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있다
        2. 가장 처음과 마지막 문자는 숫자이다.
        3. 연속해서 두 개 이상의 연산자가 나타나지 않는다
        4. 숫자 최대 자릿수는 5
        5. 수는 0으로 시작할 수 있다.
        6. 입력으로 주어지는 식의 길이는 50보다 작거나 같다.

        식에 괄호를 쳐서 최솟값을 만들어라

        덧셈 부분을 전부 괄호를 쳐서 먼저 계산 후
        뺄셈을 진행하면 최소값을 얻4을 수 있을 것이다
         */

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // - 기준으로 s를 자른다
        StringTokenizer st = new StringTokenizer(s, "-");

/*       자른 토큰의 각각의 합을 add한다
        Queue<Integer> tempList = new LinkedList<>();

        while (st.hasMoreTokens()){
            StringTokenizer tempSt = new StringTokenizer(st.nextToken(), "+");
            int tempSum = 0;
            while (tempSt.hasMoreTokens()){
                tempSum += Integer.parseInt(tempSt.nextToken());
            }
            tempList.add(tempSum);
        }

        int answer = tempList.poll();

        while (!tempList.isEmpty()){
              answer += (tempList.poll() * -1);
        }
 */
        // 첫 수는 더하고 그 이후부터는 뺀다
        int answer = 0;
        for (int i = 0; st.hasMoreTokens(); i++) {
            StringTokenizer tempSt = new StringTokenizer(st.nextToken(), "+");
            int tempSum = 0;
            while (tempSt.hasMoreTokens()) {
                tempSum += Integer.parseInt(tempSt.nextToken());
            }
            if (i == 0){
                answer += tempSum;
            } else {
                answer -= tempSum;
            }

        }


        System.out.println(answer);









    }
}
