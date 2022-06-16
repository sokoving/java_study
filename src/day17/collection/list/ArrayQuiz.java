package day17.collection.list;

import java.util.LinkedList;
import java.util.Scanner;

/*
0. 그만이라고 할 때까지 배열의 초기값을 입력받는다
1. 데이터 추가
2. 데이터 수정 > 번호, 데이터 출력 > 둘 중 어는 것을 입력하든 > 입력받은 데이터로 수정
3. 데이터 삭제
4. 종료
 */
public class ArrayQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> goods = new LinkedList<String>();

        System.out.println("# 좋아하는 것을 모두 입력하세요");
        System.out.println("모두 입력했으면 그만이라고 써주세요");
        while (true) {
            String target = sc.next();
            if (target.equals("그만")) break;
            goods.add(target);
        }

        System.out.println("# 내가 좋아하는 것들");
        System.out.println(goods);
        while (true) {
            System.out.println("1. 데이터 추가");
            System.out.println("2. 데이터 수정");
            System.out.println("3. 데이터 삭제");
            System.out.println("0. 프로그램 종료");
            System.out.println("메뉴 번호 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("# 뭘 더 좋아하세요? : ");
                    String newData = sc.next();
                    break;
                case 2:
//                        modiData();
                    break;
                case 3:
//                    dellData();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("입력을 다시 해 주세요");


            }
        }

    }



    public static void printWithNum(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d. %s\n", (i + 1), list.get(i));
        }
    }

}
