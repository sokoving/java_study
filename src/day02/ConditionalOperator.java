package day02;

public class ConditionalOperator {
    public static void main(String[] args) {
        // 조건 연산자 - 3항 연산자
        int x = -3;

        // (1항) 논리형 조건식 ? (2항) 참일 경우 : (3항) 거짓일 경우;
        int abs = (x >= 0) ? x : -x;
        // x의 절대값을 구하는 조건식 (x가 양수면 그대로 반환, 음수면 양수로 바꿔서 반환)
        System.out.println("절대값: " + abs);  // 3

        // 위 조건 연산을 if로 바꾸면 이렇게
        int abso;
        if (x>=0) {
            abso = x;
        } else {
            abso = -x;
        }

    }
}
