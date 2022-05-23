package day04;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        // 배열 가짜 복사
        String[] foods = {"짜장면", "짬뽕", "탕수육"};
        String[] foodsCopy = foods; 
            // 배열의 데이터를 복사해 사본을 만든 것이 아니라 같은 주소를 이름만 달리 부르고 있는 것
        System.out.println("원본배열 주소: " + foods);
        System.out.println("사본배열 주소: " + foodsCopy);

        foods[1] = "김치";
        foodsCopy[0] = "치즈";
        System.out.println("원본배열: " + Arrays.toString(foods));
        System.out.println("사본배열: " + Arrays.toString(foodsCopy));

        System.out.println("==================================");

        // 배열 복사 알고리즘
        String[] pets = {"멍멍이", "짹짹이", "삐약이"};

        // 1. 원본 배열과 사이즈가 같은 새 배열을 하나 더 생성
        String[] petsCopy = new String[pets.length];

        // 2. 원본 배열에 저장된 값들을 하나하나식 사본 배열로 복사
 /*     petsCopy[0] = pets[0];
        petsCopy[1] = pets[1];
        petsCopy[2] = pets[2];  > for 문으로 ↓ */

        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        System.out.println("원본배열 주소: " + pets);
        System.out.println("사본배열 주소: " + petsCopy);

        System.out.println("원본배열: " + Arrays.toString(pets));
        System.out.println("사본배열: " + Arrays.toString(petsCopy));


    }
}
