package day04;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        // 배열 짭복사
/*      String[] pets = {"멍멍이", "짹짹이", "삐약이"};
        String[] petsCopy = pets; // 배열의 사본 X, 데이터 주소를 복사 > 데이터 동기화돼 있음
        System.out.println("원본배열 주소: " + pets);
        System.out.println("사본배열 주소: " + petsCopy);

        pets[1] = "어흥이";
        petsCopy[0] = "어흥이";
        System.out.println("원본배열: " + Arrays.toString(pets));
        System.out.println("사본배열: " + Arrays.toString(petsCopy));*/

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

        // sout
        System.out.println("원본배열 주소: " + pets);
        System.out.println("사본배열 주소: " + petsCopy);

        System.out.println("원본배열: " + Arrays.toString(pets));
        System.out.println("사본배열: " + Arrays.toString(petsCopy));



    }
}
