package day10.encap;

import day08.modi.pac2.C;

public class Main {
/*    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        //myCar.speed = 50000;
        myCar.setSpeed(10000);
        System.out.println(myCar.getSpeed());
    }
 */

    public static void main(String[] args) {
        Car car = new Car("소나타");

/*      운전자가 이 모든 걸 수동으로 한다면 차가 고장날 가능성이 높아진다!
       //시동 먼저 걸고 > 엔진오일 순환 >  연료를 주입 > 실린더 작동
        car.engineStart();
        car.injectGasoline();   >>
        car.injectOil();
        car.movecylinder();
*/
        // 시동을 걸면 한큐에 된다
        car.engineStart();
        // 운전자가 손을 대면 고장날 수 있는 기능들은 private로 묶어놓고 운전자 말고 enginStart가 제어할 수 있게 한다.

        car.setMode('D');
        car.setSpeed(10);
        car.engineStop();
        car.setSpeed(0);
        car.engineStop();
    }


}
