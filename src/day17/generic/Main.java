package day17.generic;

public class Main {
    public static void main(String[] args) {

        AppleBascket ab = new AppleBascket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBascket bb = new BananaBascket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();

        Basket<Apple> appleBasket = new Basket<>(); // 변수에 타입을 명시했으면 생성자에는 안 써도 됨
        appleBasket.setFruit(new Apple());
//      appleBasket.setFruit(new Banana());
        Apple apple2 = appleBasket.getFruit();

        Basket<Banana> bananaBasket = new Basket<>();
//      bananaBasket.setFruit(new Apple());
        bananaBasket.setFruit(new Banana());
        Banana banana2 = bananaBasket.getFruit();

        // 제네릭 클래스를 쓰면 이젠 과일바구니 클래스를 만들지 않아도 된다
        Grape grape = new Grape();
        Basket<Grape> grapeBasket = new Basket<>();
        grapeBasket.setFruit(grape);
        Grape grape1 = grapeBasket.getFruit();

        // 제네릭 클래스에 사용할 수 있는 타입을 상속으로 제한할 수 있다
        Toy toy = new Toy();
//      Basket<Toy> toyBasket = new Basket<>();



    }
}
