package day15.exception;

public class EasyScannerMain {
    public static void main(String[] args){

        try {
            int n = EasyScanner.inputInteger("정수 : ");
            double d =  EasyScanner.inputDouble("실수 : ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
