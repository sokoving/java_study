package day02;

public class OperatorQuiz2 {
    public static void main(String[] args) {
        int money = 0;
        String food = (money >= 5000) ? "육개장" : (money == 0) ? "굶어" : "라면";
        System.out.println("food = " + food);

//        if (money >= 5000) {
//            System.out.println("육개장");
//        } else {
//            if (money == 0) {
//                System.out.println("굶어");
//            } else {
//                System.out.println("라면");
//            }
//        }
    }
}
