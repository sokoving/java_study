package day02;

public class OperatorQuiz {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x + 5 * 3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int z = 5 * y-- + x++ - --y;
        System.out.println("z = " + z);
    }
}
