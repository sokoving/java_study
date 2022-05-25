import java.util.Arrays;

public class Test {
    //생성자 n과 n의 각 자릿수를 더한 수를 만드는 함수
    static int d(int n) {
        // totalN = 자릿수를 더해서 저장할 변수
        int totalN = n;
        while (n > 0) {
            totalN += n % 10;
            n /= 10;
        }
        return totalN;
    }

    // 1부터 10000 사이의 수 중에 int 배열에 없는 수 찾아 출력
    static void printAnswer(int[] numbers) {
        System.out.println("함수 시작");

        for (int n = 1; n <= 10; n++) {

            boolean self = true;
            for (int number : numbers) {
                if (n == number) {
                    System.out.println(n + "> 셀프넘버가 아님");
                    self = false;
                    break;
                }
            }
            if (self) System.out.println(n + "> 셀프넘버임");

        }
        System.out.println("함수 끝");
    }

    public static void main(String[] args) {

        // 1부터 9999까지의 수를 생성자로 해서 결과값 내고 배열에 저장
        int[] ds = new int[10];
        for (int i = 1; i <= 10; i++) {
            ds[i - 1] = d(i);
        }
        
        System.out.println(Arrays.toString(ds));
        // 1~9999 중 배열에 없는 수 출력하기
        printAnswer(ds);


    }
} // ena class Main
