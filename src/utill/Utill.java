package utill;

import java.util.Scanner;

public class Utill {

    public static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static String intputS(String msg){
        System.out.print(msg);
        return sc.nextLine();
    }



    public static void shortline(){

        System.out.println("=================");
    }
    public static void longLine() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
    }

    public static void msgLine(String msg){
        System.out.printf("\n============== %s ==============\n", msg);
    }

}