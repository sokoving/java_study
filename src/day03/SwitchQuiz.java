package day03;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("직급을 입력하세요");
        System.out.println("[사원, 대리, 과장, 차장, 부장]");
        String position = sc.next();
        sc.close();

        switch (position){
            case "사원":
                System.out.printf("%s의 급여는 200만 원입니다", position);
                break;
            case "대리":
                System.out.printf("%s의 급여는 300만 원입니다", position);
                break;
            case "과장":
                System.out.printf("%s의 급여는 400만 원입니다", position);
                break;
            case "차장":
                System.out.printf("%s의 급여는 500만 원입니다", position);
                break;
            case "부장":
                System.out.printf("%s의 급여는 600만 원입니다", position);
                break;
            default:
                System.out.printf("%s은(는) 없는 직급입니다.\n직급을 다시 입력해주세요.", position);
        }// end switch
    }
}
