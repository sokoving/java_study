package day12.static_;

import day08.modi.pac2.C;

// static은 절대 변하지 않고 클래스마다 동일값을 사용하는 필드에 붙인다
public class Calculator {
    public String company; //제조사        >> 계산기마다 제조사가 다를 수 있음 >> instance
    public String color; // 색상          >> 계산기마다 색이 다를 수 있음     >> instance
    public static double PI; // 원주율     >> 계산기마다 원주율이 다를 수 없음 >> static!

    // static initializer(정적 초기화자)
    // static의 데이터 초기화를 담당
    // static을 건드린 처음에 한 번 호출됨
    static {
        System.out.println("정적 초기화자 호출");
        PI = 3.14159;
    }


    public Calculator(String company, String color) {
        System.out.println("생성자 호출");
        this.company = company;
        this.color = color;
        PI = 3.14;   // 생성자 안에서 스태틱 필드를 초기화하면 객체를 생성해야 값이 초기화됨
    }

    public void 색을_입히다(String color){     // 색상을 입힐 계산기를 알아야 한다 >> instance
        this.color = color;
    }
    public static double 원의_넓이를_구하다(int r){  // 어느 계산기의 PI든 똑같기 때문에 누구 계산기의 PI지 알 필요 없다 >> static!
        return PI * r * r;
    }

    //////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        double circle1 = Calculator.원의_넓이를_구하다(5);
        System.out.println("원주율 : " + Calculator.PI);


        Calculator sharp = new Calculator("샤프", "검정");
        sharp.색을_입히다("빨강");
        System.out.println("원주율 : " + Calculator.PI);
    }
}
