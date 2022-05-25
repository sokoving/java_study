package day06;
/*
 메서드 선언 위치
   클래스(class MethodBasic) 안, 메서드(static void main) 밖
   메서드 내부에서 다시 메서드 선언 안 됨
     > main 메서드 안에서 메서드 선언 안 됨)

 메서드 호출 위치
   메서드, 생성자 내부
    > 재귀함수 가능
*/
public class MethodBasic {
    // 메서드 선언은 여기서 (클래스 MethodBasic 안, Main 메서드 밖) 

    // 1~x 까지의 누적합을 구해서 리턴하는 함수

    // static > 나중에
    // js의 function 자리에 리턴되는 값의 타입을 적는다.
    //매개변수에는 타입을 같이 적는다
    static int calcTotal (int x) {
        System.out.println("메서드 호출!");
        int total = 0;
        for (int i = 1; i <= x;  i++){
            total += i;
        }
        return  total;
    }

    public static void main(String[] args) {  // main 도 메서드

        // 1 ~ x 범위의 누적합 구해서 리턴하는 메서드 
        calcTotal(10); // 메서드(main) 내부에서 호출한다
                         // 인수는 함수 선언할 때 썼던 매개변수 타입과 동일하게 
//      calcTotal(10.33);   > 안 됨
        calcTotal((int)10.33);

        System.out.println(calcTotal(10) == 55);

    } // end main method
}
