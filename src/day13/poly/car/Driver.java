package day13.poly.car;

public class Driver {

    public void drive(Car c){
        System.out.println("운전을 시작합니다. ");
        c.run();
    }

    // 리턴 타입이 Car면 자식 타입 모두 반환할 수 있다
    // 리턴 타입이 Object면 모든 타입을 반환할 수 있다.
    public Car buyCar(String carName){
        switch (carName) {
            case "스팅어":
                System.out.println("스팅어를 구매합니다.");
                return new Stinger();
            case "그랜져":
                System.out.println("그랜져를 구매합니다.");
                return new Granduer();
            case "머스탱":
                System.out.println("머스탱를 구매합니다.");
                return new Mustang();
            default:
                System.out.println("판매하지 않는 차종입니다.");
                return null;
        }

        /*
                if(carName.equals("스팅어")){
            System.out.println("스팅어를 구매합니다.");
            return new Stinger();
        } else if(carName.equals("그랜져")){
            System.out.println("그랜져를 구매합니다.");
            return new Granduer();
        } else if(carName.equals("머스탱")){
            System.out.println("머스탱를 구매합니다.");
            return new Mustang();
        } else {
            System.out.println("판매하지 않는 차종입니다.");
            return null;
        }
                 */
    }


}
