package day13.poly.car;

public class CarShop {

    // 차를 매수하는 기능
    public int sellCar(Car car){
        // 일단 카를 받았는데 무슨 객체인지 어떻게 알아?
        if (car instanceof Granduer){  // 내가 받은 car가 Granduer 인스턴스 객체야?
            return 2000;
        } else if (car instanceof Mustang) {
            return 3000;
        } else if (car instanceof Stinger){
            return 3100;
        } else {
            return 0;
        }
    }

}
