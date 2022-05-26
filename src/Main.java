import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int R = sc.nextInt();
        sc.close();

        for (int k = 0; k < R; k++) {
            for (int j = 0; j < S.length(); j++) {
                for (int i = 0; i < R; i++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
            S = sc.nextLine();
        }


    } // ena class Main
}