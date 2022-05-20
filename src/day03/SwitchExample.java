package day03;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);


        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 입력하세요 ]");
        System.out.print(">> ");
        String season = sc.next();
        sc.close();
         */

        // switch 괄호 안에는 "정수형" 또는 "문자형" 변수를 씁니다 (실수형 X)
        // 변수: 분기를 나눌 데이터가 있는 변수
        String season = "봄";
        switch (season){
            // case: switch 변수에 들어갈 경우의 수 값들을 배치
            //      단 "상수"나 "리터럴"만 가능 (변수 X)
            case "봄":
            case "spring":
                // 현재 케이스에서 실행할 코드 작성
                System.out.println("봄에는 여의도로 가보세요~");
                break; // 코드가 밑으로 흘러가는 것을 방지
            case "여름":  // 코드를 의도적으로 흘려보내서 동일한 결과 출력
            case "summer":
                System.out.println("여름에는 낙산으로 가보세요~");
                break;
            case "가을":
            case "fall":
                System.out.println("가을에는 춘천로 가보세요~");
                break;
            case "겨울":
            case "winter":
                System.out.println("겨울에는 홍천으로 가보세요~");
                break;
            // else 기능
            default:
                System.out.println("봄, 여름, 가을, 겨울 중에 입력하세요");
                //더 이상 흘러갈 코드가 없으니 break;는 선택 사항
        }


//        switch로 구간 만들기 > 몫을 구하는 나누기 활용
//        int point = sc.nextInt();
        int point = 60;

        switch (point/10){
            case 10: case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }



    }
}
