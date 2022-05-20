package day03;

public class Loop03 {
    public static void main(String[] args) {

        // 중첩 반복문
        apple: for (char upper = 'A' ; upper <= 'Z'; upper++){
            for(char lower = 'a' ; lower <= 'z'; lower++){
                if(lower == 'f') break apple;  // lower가 f면 laber로 감싼 outer for 탈출
                System.out.printf("%c - %c\n", upper, lower);
            } // inner for
        } // outer for

        // break > 가장 가까문 반복문 탈출
        // label: break label > outer for 반복문까지 탈출


    }
}
