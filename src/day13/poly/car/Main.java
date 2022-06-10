package day13.poly.car;

public class Main {
    public static void main(String[] args) {

        Granduer g1 = new Granduer();   // 자식 타입을 부모 타입 배열에 넣을 때 자동으로 업캐스팅됨
        Car g2 = new Granduer();
        Car g3 = new Granduer();

        Mustang m1 = new Mustang();
        Car m2 = new Mustang();

        Stinger s1 = new Stinger();
        Car s2 = new Stinger();

        Car[] cars = {g1, g2, g3, m1, m2, s1, s2};

        for (Car car : cars) {
            car.run();
        }

        // 모두의 부모인 객체배열을 만들면 모든 타입을 배열에 담을 수 있다
        // 하지만 반복문 돌릴 때 힘드니까 권장 안 함
        Object[] arr = {10, 3.3, "하하호호", new Mustang()};

        System.out.println("========================");

        Driver kim = new Driver();
        kim.drive(m1);
        kim.drive(s1);
        kim.drive(s1);

        System.out.println("========================");

        Car myCar = kim.buyCar("그랜져"); // 타입은 Car, 객체는 Granduer
        myCar.run();    // Granduer가 오버라이딩한 run이 호출됨

        System.out.println("=========== 메서드 체인 =============");
        // 메서드 체인
        // 오른쪽부터 메서드를 실행해 리턴 타입에 다시 메서드를 실행
        kim.buyCar("머스탱").run();
//      kim.buyCar("머스탱").run().dirve();  ruj();이 모이드 타입이라 drive(); 할 수 없음
        new Driver().buyCar("스팅어").run();
        kim.drive(kim.buyCar("스팅어"));

        System.out.println("========== 강제 형변환(다운캐스팅)==============");

        // 자식 객체는 부모와 자식 타입 둘 다 왔다갔다 할 수 있다.
        Mustang mm = new Mustang();
        Car cc = mm; // 업 캐스팅(암묵적)
        mm = (Mustang) cc; // 다운 캐스팅(명시적)

        // mm과 cc는 타입만 다르지 같은 주소를 가지고 있다.
        System.out.println("mm = " + mm);
        System.out.println("cc = " + cc);

        System.out.println("========================");

        // 부모 객체는 자식 타입으로 다운캐스팅 안 된다 (ClassCastException)
        Car ccc = new Car();
//      Mustang mmm = (Mustang) ccc; // 부모 객체의 다운 캐스팅 안 됨.

        System.out.println("========================");
        Mustang myMs = (Mustang)kim.buyCar("머스탱"); // 업 캐스팅 된 걸 다운 캐스팅해놓는 게 편함
//      Stinger mySt = (Stinger)kim.buyCar("머스탱"); // (ClassCastException)
        myMs.run();
        myMs.joinMustangClub();  // msMs는 객체지만 Car 타입이라

        System.out.println("========================");

        CarShop shop = new CarShop();
        int money = shop.sellCar(g1);
        System.out.println("money = " + money);
        int money2 = shop.sellCar(m1);
        System.out.println("money2 = " + money2);
        int money3 = shop.sellCar(s1);
        System.out.println("money3 = " + money3);
        int money4 = shop.sellCar(new Car());
        System.out.println("money4 = " + money4);

        System.out.println("=========== 다운 캐스팅 시에 객체가 무슨 타입인지 반드시 검사하고 변환 =============");
        cast("안녕");
        cast(m1);
        // 문자열 비교를 하는 equals 메서드도 매개변수는 Object로 받지만
        // 인수가 instanceof로 String 객체인지 검사한 뒤에 다운캐스팅을 한다

    } // end main

    public static void cast(Object o){
        if(o instanceof String) {
            String s = (String) o;
            System.out.println("스트링 변환 성공!");
        } else {
            System.out.println("스트링 변환 실패");
        }
    }

}
