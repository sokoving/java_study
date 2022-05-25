package day06;

import java.util.Arrays;

public class MethodPractice {

    // push (배열의 마지막 위치에 데이터 추가하는 메서드)
    static void push(String newFood) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
    }

    // pop (배열의 마직막 데이터 삭제하는 메서드)
    static void pop() {
        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < foods.length - 1; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
    }

    // printFoods (배열 내부데이터 출력 메서드)
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // indexOf (매개변수의 인덱스 번호를 리턴하는 메서드)
    static int indexOf(String targetFood) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(targetFood)) {
                return i;
            }
        }
        return -1;
    }

    // remove (매개변수를 배열에서 삭제하는 메서드)
    static void remove(String targetFood) {
        //삭제할 음식의 인덱스 반환
        int targetIdx = indexOf(targetFood);
        // 음식이 배열에 있다면
        // if(!include(targetFood)) 가능
        if (targetIdx > -1) {
            // targetIdx부터 하나씩 덮어씌우기
            for (int i = targetIdx; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }
            pop();
        } else {  // 음식이 배열에 없다면
            System.out.println("존재하지 않는 음식명입니다.");
            return;
        }
    }

    // include (매개변수를 발견하면 true, 못 하면 false 리턴)
    static boolean include(String targetFood) {
        return indexOf(targetFood) != -1;
/*
        if (indexOf(targetFood) > -1 ) {
            return true;
        } else {
            return false;
        }
*/
    }

    // insert (targetIdx 자리에 targetFood 삽입)
    static void insert(int targetIdx, String targetFood){
        String[] temp = new String[foods.length+1];

        // idx 0~targetIdx
        for (int i = 0; i < targetIdx; i++) {
            temp[i] = foods[i];
        }
        // idx targetIdx
        temp[targetIdx] = targetFood;
        // idx targetIdx~foods.length
        for (int i = targetIdx; i< foods.length; i++){
            temp[i+1] = foods[i];
        }
        foods = temp;
    }

    // modify (targetIdx 자리의 데이터를 targetFood로 수정)
    static void modify(int targetIdx, String targetFood) {
        foods[targetIdx] = targetFood;
    }

    // clear (foods 배열 데이터 전체 삭제)
    static void clear() {
        foods = new String[0];
    }


    // 지역변수를 전역변수처럼 쓰기(java에는 전역변수 없지만 이렇게 하면 전역처럼 쓸 수 있다)
    static String[] foods = {"떡볶이", "치킨", "파스타"};

    ////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        //push
        System.out.println("=======");
        push("라면");
        push("김치찌개");
        printFoods();

        //indexOf
        System.out.println("=======");
        //idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타");
        System.out.println("idx = " + idx);
        //idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        System.out.println("idx2 = " + idx2);
        //idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");
        System.out.println("idx3 = " + idx3);
        printFoods();

        // remove
        System.out.println("=======");
        remove("김치찌개");
        printFoods();

        // include
        System.out.println("=======");
        boolean flag = include("파스타");
        System.out.println("flag = " + flag);
        boolean flag2 = include("양념치킨");
        System.out.println("flag2 = " + flag2);

        // insert
        System.out.println("=======");
        insert(3, "파인애플");
        printFoods();

        // modify
        System.out.println("=======");
        modify(4, "닭갈비");
        printFoods();

        // clear
        System.out.println("=======");
        clear();
        printFoods();
    }
}
