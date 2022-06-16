package day17.collection.list;

import java.util.*;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tvxqs= {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        List<String > tvxq = new ArrayList<>(Arrays.asList(tvxqs));
//        LinkedList<String> tvxq = new LinkedList<>(Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"));

        /*
        tvxq 배열에 target 없다 > "target"은(는) 없는 이름입니다.
        tvxq 배열에 target 있다 > "target"의 별명을 변경합니다.
         */

        System.out.println("* 변경 전 정보: " + tvxq);
        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요. ");
            System.out.print(">> ");
            // target : 찾을 이름 / index : 타겟의 인덱스를 반환할 것
            String target = sc.next();

            // 타겟이 배열에 있다면
            if (tvxq.contains(target)){
                System.out.printf("%s의 별명을 변경합니다.\n", target);
                System.out.print(">> ");
                String newName = sc.next();
                tvxq.set(tvxq.indexOf(target), newName);
                 break;
            }
            // 타겟이 배열에 없다면
            else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", target);
            } // end if



        }// end while

        System.out.println("변경 완료!!");
        System.out.println("* 변경 후 정보: " + tvxq);

        sc.close();


    }
}
