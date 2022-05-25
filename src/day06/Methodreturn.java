package day06;

import java.util.Arrays;

public class Methodreturn {

    // return 값이 있는 함수 >> 함수 이름 앞에 타입을 밝힌다.
    static int add(int n1, int n2) {
        return n1 + n2;
        // return : 값을 호출부로 돌려주는 동시에 함 수 종료
//      System.out.println("oo");  >> return 다음 코드는 "도달할 수 없는 명령문"이 된다.
    }

    static void callName(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 길어");
            return; // 함수 탈출문 (void 타입은 단독 리턴, 뒤에 값 안 씀)
        }
        System.out.printf(name + "안녕~");
    }

    // return 값이 없는 함수 >> void
    static void showAddResult(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }

    /*
        # 모든 함수의 리턴값은 반드시 1개다
          - 검증 과정에서 값 없이 return 할 때는 null 사용
          - void 함수는 제외, return 단독 사용

        - 5개의 애완동물 이름 목록에서 원하는 숫자를 전달하면
        그 숫자만큼 랜덤으로 애완동물 목록을 뽑아서 리턴하는 함수
     */
    static String[] selectPet(int count) {

        // 매개변수 검증
        if (count < 1 || count > 5){
            return null;        // void 함수가 아니지만 return 값이 없을 때는 null;
        }
        String[] petList = {"멍멍", "짹짹", "찌찍", "꾸러기"};

        String[] selectied = new String[count];
        for (int i = 0; i < count; i++) {
            int rn = (int) (Math.random() * (petList.length));
            selectied[i] = petList[rn];
        }
        return selectied;
    }



    public static void main(String[] args) {

        // return 값이 있는 함수를 호출 > 변수에 값 대입
        System.out.println("=============================");
        // r1 : add 메서드의 retrun 값을 r1에 대입해 사용할 수 있게 한다
        int r1 = add(10, 20);
        System.out.println(r1);

        int r2 = r1 * 3 + r1--;


        // return 값이 없는 함수(void)를 호출 >> 변수에 값 대입 X
        System.out.println("=============================");
//      int r2 = showAddResult(3, 4); // return 값이 없으면 변수 대입 불가

        // void 메서드 > 단독 사용
        System.out.println();
        //            > 인수로 사용 불가
        // add(10, showAddResult(5, 10));

        // double이 리턴되는 메서드 > 변수 대입 가능
        double random = Math.random();

        // 함수 호출 순서
        add(30, add(5, 5));  // 1차 호출
        add(30, 10);  // 2차 호출
        // 40    // 3차 호출
        int r4 = add(add(10, 20), 10);

        System.out.println("=============================");
        callName("짹짹이 \n");
        callName("가가가가가가가");

        System.out.println("=============================");
        String[] selectPet = selectPet(3);
        System.out.println(Arrays.toString(selectPet));

    }
}
