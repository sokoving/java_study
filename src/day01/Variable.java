package day01;

public class Variable {
    public static void main(String[] args) {
        //변수의 선언(타입 지정)
        int score;

        //변수의 초기화(할당)
        score = 78;
        System.out.println(score);

        // 변수의 선언과 초기화
        int life = 3;

        // 변수 값 변경(재할당)
        life = 5;
        System.out.println(life);

        // 변수값 참조
        int triple = score * 3;
        System.out.println("triple = " + triple);
        
        // 정수  int / 실수 double / 문자열 : String
        String nickname = "짹짹이";
        System.out.println("nickname = " + nickname);
        
        // nickname = 5.5;  > 변수 타입과 다른 값은 저장 불가
        // double score = 3.3; > 같은 범위(scope) 안에선 같은 이름 쓸 수 없음

        String hong = "홍길동";
        int numHun = 100;
        double random = Math.random();

        System.out.println("random = " + random);

    } // end main
} // end class
