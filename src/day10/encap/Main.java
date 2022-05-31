package day10.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        //myCar.speed = 50000;
        myCar.setSpeed(10000);
        System.out.println(myCar.getSpeed());

    }
}
