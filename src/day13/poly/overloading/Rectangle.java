package day13.poly.overloading;

public class Rectangle {

    /* 오버로딩
     하나의 클래스에서 같은 이름의 메서드를 여러 개 선언하는 것
     함수를 호출할 때 자동완성되는 모든 게 오버로딩
     생성자도 오버로딩 가능

    오버로딩의 규칙
     - 리턴 타입 : 상관 없다
     - 메서드 이름 : 동일해야 한다
     - 매개변수 : 각 타입, 개수, 순서가 달라야 한다.
     */

    // 정사각형 넓이를 구하는 기능
    // calacArea(int)
    public int calacArea(int len){
        return len * len;
    }

    // 직사각형의 넓이를 구하는 기능
    // calacArea(int, int)
    public int calacArea(int w, int h){
        return w * h;
    }

    // calacArea(int)       >> 매개변수 수와 타입이 동일한 것이 있다
//    public int calacArea(int abced){
//
//    }

    // calacArea(int)       >> 리턴 타입은 상관이 없다
//    public void calacArea(int abced){
//
//    }

    // 시그니처를 맞추면 접근제한자는 상관 없다
    protected double calacArea(double len){
        return len * len;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
