package day01;

public class VarScope {
    public static void main(String[] args) {

        int num1 = 10, num2 = 20;

        // 블록 안에서 선언된 변수는 블록 밖으로 나가면 참조를 못 하기 때문에 참조하려면 선언과 대입을 분리해 블록 밖으로 뺀다
        int num3;
        // 블록 레벨 스코프 : 블록 레벨에서 선언된 변수는 해당 블록을 벗어나면 메모리에서 자동 삭제됨
        if (true) {
            //int num1;  > 상위 블록에서 이미 선언된 변수는 블록 안에서도 선언 안 됨
            num3 = num1 + num2;
            System.out.println("num3 = " + num3);
            int num4 = 40;
        } // end if
        System.out.println("num3 = " + num3);
        int num4 = 10;  //블록 안에서 선언된 변수는 블록 밖에서는 사라지기 때문에 다시 선언 가능
    } // end main
} // end class
